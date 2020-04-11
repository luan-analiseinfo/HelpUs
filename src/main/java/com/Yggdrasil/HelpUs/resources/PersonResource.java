package com.Yggdrasil.HelpUs.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoas")
public class PersonResource {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST OK";
	}
}
