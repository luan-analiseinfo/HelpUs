package com.Yggdrasil.HelpUs.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yggdrasil.HelpUs.entities.Contract;
import com.Yggdrasil.HelpUs.repositories.ContractRepository;

@Service
public class ContractService {

	@Autowired
	ContractRepository repo;
	
	public Contract buscar(Integer id) {
		Optional<Contract> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
