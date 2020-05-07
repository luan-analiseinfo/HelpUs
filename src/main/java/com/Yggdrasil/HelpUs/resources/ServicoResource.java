package com.Yggdrasil.HelpUs.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Yggdrasil.HelpUs.entities.Servico;
import com.Yggdrasil.HelpUs.services.ServicoService;

@RestController
@RequestMapping(value = "/servicos")
public class ServicoResource {
	
	@Autowired
	public ServicoService service;
	
	public ResponseEntity<?> find(@PathVariable Integer id){
		Servico  obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		}

}
