package tld.faperezg.petclinic.services.map;

import tld.faperezg.petclinic.model.Owner;
import tld.faperezg.petclinic.services.CrudService;

import java.util.Set;

public class MapOwnerService extends AbstractMapService<Owner> implements CrudService<Owner, Long> {

	@Override
	public void delete (Owner object) {
		super.delete (object);
	}

	@Override
	public void deleteById (Long id) {
		super.deleteById (id);
	}

	@Override
	public Set<Owner> findAll () {
		return super.findAll ();
	}

	@Override
	public Owner findById (Long id) {
		return super.findById (id);
	}

	@Override
	public void save (Owner object) {
		super.save (object);
	}

}
