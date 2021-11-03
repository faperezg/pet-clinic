package tld.faperezg.petclinic.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tld.faperezg.petclinic.model.Owner;
import tld.faperezg.petclinic.services.OwnerService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController (OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@GetMapping (path = { "/owners", "/owners/index", "/owners/index.html" }, produces = { MediaType.TEXT_HTML_VALUE })
	public String showIndexPage (Model model) {
		List<Owner> owners = this.ownerService.findAll ().stream ()
			.sorted (Comparator.comparing (Owner::getId))
			.collect (Collectors.toList ());
		model.addAttribute ("owners", owners);
		return "owners/index";
	}

}
