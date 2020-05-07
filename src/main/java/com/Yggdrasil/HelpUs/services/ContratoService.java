package com.Yggdrasil.HelpUs.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yggdrasil.HelpUs.entities.Contrato;
import com.Yggdrasil.HelpUs.repositories.ContratoRepository;

@Service
public class ContratoService {

	@Autowired
	ContratoRepository repo;
	
	public Contrato buscar(Integer id) {
		Optional<Contrato> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public Contrato salvar(Contrato contrato) {
		return repo.save(contrato);
	}
}
