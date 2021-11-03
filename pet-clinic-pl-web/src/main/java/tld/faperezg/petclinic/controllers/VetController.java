package tld.faperezg.petclinic.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

	@GetMapping (path = { "/vets", "/vets/index", "/vets/index.html" }, produces = { MediaType.TEXT_HTML_VALUE })
	public String showIndexPage () {
		return "vets/index";
	}
}
