package com.Yggdrasil.HelpUs.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yggdrasil.HelpUs.entities.Pessoa;
import com.Yggdrasil.HelpUs.repositories.PerssoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PerssoaRepository repo;

	public Pessoa buscar(Integer id) {
		Optional<Pessoa> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public Pessoa salvar(Pessoa pessoa) {
		return repo.save(pessoa);
	}
}
