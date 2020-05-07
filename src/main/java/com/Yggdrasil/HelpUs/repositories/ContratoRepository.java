package com.Yggdrasil.HelpUs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Yggdrasil.HelpUs.entities.Contrato;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Integer>{

}
