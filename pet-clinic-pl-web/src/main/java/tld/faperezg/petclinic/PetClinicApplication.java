package tld.faperezg.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tld.faperezg.petclinic.spring.context.config.ApplicationConfiguration;

@SpringBootApplication (scanBasePackageClasses = ApplicationConfiguration.class)
public class PetClinicApplication {

	public static void main (String[] args) {
		SpringApplication.run (PetClinicApplication.class, args);
	}

}
