package com.Yggdrasil.HelpUs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Yggdrasil.HelpUs.entities.Pessoa;

@Repository
public interface PerssoaRepository extends JpaRepository<Pessoa, Integer>{

}
