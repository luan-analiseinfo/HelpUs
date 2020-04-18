package com.Yggdrasil.HelpUs.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yggdrasil.HelpUs.entities.Person;
import com.Yggdrasil.HelpUs.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repo;

	public Person buscar(Integer id) {
		Optional<Person> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public Person save(Person pessoa) {
		return repo.save(pessoa);
	}
}
