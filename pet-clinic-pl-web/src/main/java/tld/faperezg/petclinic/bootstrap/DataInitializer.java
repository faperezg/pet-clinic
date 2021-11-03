package tld.faperezg.petclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import tld.faperezg.petclinic.model.Owner;
import tld.faperezg.petclinic.model.Vet;
import tld.faperezg.petclinic.services.OwnerService;
import tld.faperezg.petclinic.services.VetService;

public class DataInitializer implements CommandLineRunner {

	private final OwnerService ownerService;

	private final VetService vetService;

	@Autowired
	public DataInitializer (OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run (String... args) {
		Owner homero = new Owner ();
		homero.setFirstName ("Homero");
		homero.setLastName ("Simpson");

		this.ownerService.save (homero);

		Owner lisa = new Owner ();
		lisa.setFirstName ("Lisa");
		lisa.setLastName ("Simpson");

		this.ownerService.save (lisa);

		Vet hibbert = new Vet ();
		hibbert.setFirstName ("Julius");
		hibbert.setLastName ("Hibbert");

		this.vetService.save (hibbert);

		System.out.printf ("Loaded %d owners%n", this.ownerService.findAll ().size ());
		System.out.printf ("Loaded %d vets%n", this.vetService.findAll ().size ());
	}

}
