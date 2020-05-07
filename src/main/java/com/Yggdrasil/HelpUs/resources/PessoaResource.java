package com.Yggdrasil.HelpUs.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Yggdrasil.HelpUs.PersonDTO;
import com.Yggdrasil.HelpUs.converters.impl.PessoaConverter;
import com.Yggdrasil.HelpUs.entities.Pessoa;
import com.Yggdrasil.HelpUs.exceptions.NotImplementation;
import com.Yggdrasil.HelpUs.services.PessoaService;




@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource implements ApiREST<PersonDTO>{

	@Autowired
	private PessoaService service;
	

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Pessoa obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);	
   }
	
	@Override
	@RequestMapping(value="/page/{page}/qtd/{qtd}", method=RequestMethod.GET)
	public ResponseEntity<?> findPaginated(@PathVariable Integer page,@PathVariable Integer qtd) {
		throw new NotImplementation();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody PersonDTO pessoaDTO) {
		PessoaConverter converter = new PessoaConverter();
		Pessoa pessoa = converter.toEntity(pessoaDTO);
		Pessoa obj = service.salvar(pessoa);
		return ResponseEntity.ok().body(obj);	
   }


	@Override
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<?> update(@PathVariable Integer id,@RequestBody PersonDTO dtoDTO) {
		throw new NotImplementation();
	}


	@Override
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<?> delete(Integer id) {
		throw new NotImplementation();
	}
}	
