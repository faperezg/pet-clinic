package tld.faperezg.petclinic.services;

import tld.faperezg.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

	Set<Owner> findAll ();

	Owner findById (Long ownerId);

	void save (Owner owner);

}
