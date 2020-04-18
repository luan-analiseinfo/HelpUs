package com.Yggdrasil.HelpUs.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Yggdrasil.HelpUs.entities.Person;
import com.Yggdrasil.HelpUs.services.PersonService;


@RestController
@RequestMapping(value = "/pessoas")
public class PersonResource {

	@Autowired
	private PersonService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Person obj = service.buscar(id);
		System.out.println(obj.getName());
	
		return ResponseEntity.ok().body(obj);	
   }
}	
