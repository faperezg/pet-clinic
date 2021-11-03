package tld.faperezg.petclinic.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping (path = { "", "/", "index", "index.html" }, produces = { MediaType.TEXT_HTML_VALUE })
	public String showIndexPage () {
		return "index";
	}

}
