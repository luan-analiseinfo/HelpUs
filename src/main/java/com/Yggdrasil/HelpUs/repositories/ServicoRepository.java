package com.Yggdrasil.HelpUs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Yggdrasil.HelpUs.entities.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer>{

}
