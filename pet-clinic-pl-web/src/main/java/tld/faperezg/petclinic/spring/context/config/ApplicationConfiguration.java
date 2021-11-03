package tld.faperezg.petclinic.spring.context.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import tld.faperezg.petclinic.bootstrap.DataInitializer;
import tld.faperezg.petclinic.services.OwnerService;
import tld.faperezg.petclinic.services.PetService;
import tld.faperezg.petclinic.services.VetService;
import tld.faperezg.petclinic.services.map.MapOwnerService;
import tld.faperezg.petclinic.services.map.MapPetService;
import tld.faperezg.petclinic.services.map.MapVetService;

@Configuration
public class ApplicationConfiguration {

	@Bean ("ownerService")
	@Profile ({ "dev", "default" })
	public OwnerService mapOwnerService () {
		return new MapOwnerService ();
	}

	@Bean ("vetService")
	@Profile ({ "dev", "default" })
	public VetService mapVetService () {
		return new MapVetService ();
	}

	@Bean ("petService")
	@Profile ({ "dev", "default" })
	public PetService mapPetService () {
		return new MapPetService ();
	}

	@Bean
	@Profile ({ "dev", "default" })
	public DataInitializer dataInitializer (OwnerService ownerService, VetService vetService) {
		return new DataInitializer (ownerService, vetService);
	}

}
