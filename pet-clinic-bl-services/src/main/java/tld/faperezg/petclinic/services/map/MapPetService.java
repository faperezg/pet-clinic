package tld.faperezg.petclinic.services.map;

import tld.faperezg.petclinic.model.Pet;
import tld.faperezg.petclinic.services.CrudService;

import java.util.Set;

public class MapPetService extends AbstractMapService<Pet> implements CrudService<Pet, Long> {

	@Override
	public void delete (Pet object) {
		super.delete (object);
	}

	@Override
	public void deleteById (Long id) {
		super.deleteById (id);
	}

	@Override
	public Set<Pet> findAll () {
		return super.findAll ();
	}

	@Override
	public Pet findById (Long id) {
		return super.findById (id);
	}

	@Override
	public void save (Pet object) {
		super.save (object);
	}

}
