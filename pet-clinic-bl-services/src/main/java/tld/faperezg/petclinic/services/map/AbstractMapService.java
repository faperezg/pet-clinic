package tld.faperezg.petclinic.services.map;

import tld.faperezg.petclinic.model.BaseModel;
import tld.faperezg.petclinic.services.ServiceException;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseModel> {

	protected final Map<Long, T> map = new HashMap<> ();

	private Long getNextId () {
		Set<Long> ids = map.keySet ();
		return !ids.isEmpty () ? Collections.max (ids) + 1 : 1L;
	}

	protected void delete (T object) {
		map.entrySet ().removeIf (entry -> entry.getValue ().equals (object));
	}

	protected void deleteById (Long id) {
		map.remove (id);
	}

	protected Set<T> findAll () {
		return new HashSet<> (this.map.values ());
	}

	protected T findById (Long id) {
		return this.map.get (id);
	}

	protected void save (T object) {
		if (object == null) {
			throw new ServiceException ("Object cannot be null");
		}

		if (object.getId () == null) {
			object.setId (this.getNextId ());
		}

		map.put (object.getId (), object);
	}

}
