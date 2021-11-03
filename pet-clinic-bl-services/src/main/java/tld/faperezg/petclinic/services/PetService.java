package tld.faperezg.petclinic.services;

import tld.faperezg.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

	Set<Pet> findAll ();

	Pet findById (Long petId);

	void save (Pet pet);

}
