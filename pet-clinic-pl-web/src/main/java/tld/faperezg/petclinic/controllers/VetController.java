package tld.faperezg.petclinic.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tld.faperezg.petclinic.model.Vet;
import tld.faperezg.petclinic.services.VetService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class VetController {

	private final VetService vetService;

	public VetController (VetService vetService) {
		this.vetService = vetService;
	}

	@GetMapping (path = { "/vets", "/vets/index", "/vets/index.html" }, produces = { MediaType.TEXT_HTML_VALUE })
	public String showIndexPage (Model model) {
		List<Vet> vets = this.vetService.findAll ().stream ()
			.sorted (Comparator.comparing (Vet::getId))
			.collect (Collectors.toList ());
		model.addAttribute ("vets", vets);
		return "vets/index";
	}

}
