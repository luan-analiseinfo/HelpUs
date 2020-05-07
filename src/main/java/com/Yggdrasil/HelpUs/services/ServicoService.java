package com.Yggdrasil.HelpUs.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yggdrasil.HelpUs.entities.Servico;
import com.Yggdrasil.HelpUs.repositories.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	public ServicoRepository repo;
	
	public Servico buscar(Integer id) {
		Optional<Servico> obj = repo.findById(id);
		return obj.orElseThrow(null);
	}
	
	public Servico salvar(Servico servico) {
		return repo.save(servico);
	}
}
