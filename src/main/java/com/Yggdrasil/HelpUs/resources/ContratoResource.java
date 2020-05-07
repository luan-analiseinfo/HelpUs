package com.Yggdrasil.HelpUs.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Yggdrasil.HelpUs.entities.Contrato;
import com.Yggdrasil.HelpUs.services.ContratoService;

@RestController
@RequestMapping(value = "/contratos")
public class ContratoResource {
	
	@Autowired
	private ContratoService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		Contrato obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
}