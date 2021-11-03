package tld.faperezg.petclinic.services.map;

import tld.faperezg.petclinic.model.Vet;
import tld.faperezg.petclinic.services.VetService;

import java.util.Set;

public class MapVetService extends AbstractMapService<Vet> implements VetService {

	@Override
	public void delete (Vet object) {
		super.delete (object);
	}

	@Override
	public void deleteById (Long id) {
		super.deleteById (id);
	}

	@Override
	public Set<Vet> findAll () {
		return super.findAll ();
	}

	@Override
	public Vet findById (Long id) {
		return super.findById (id);
	}

	@Override
	public void save (Vet object) {
		super.save (object);
	}

}
