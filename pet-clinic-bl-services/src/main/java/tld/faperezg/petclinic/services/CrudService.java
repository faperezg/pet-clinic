package tld.faperezg.petclinic.services;

import java.util.Set;

public interface CrudService<T, E> {

	void delete (T object);

	void deleteById (E id);

	Set<T> findAll ();

	T findById (E id);

	void save (T object);

}
