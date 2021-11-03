package tld.faperezg.petclinic.services;

import tld.faperezg.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

	Set<Vet> findAll ();

	Vet findById (Long vetId);

	void save (Vet vet);

}
