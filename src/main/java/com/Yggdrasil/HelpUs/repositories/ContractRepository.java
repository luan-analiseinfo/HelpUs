package com.Yggdrasil.HelpUs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Yggdrasil.HelpUs.entities.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer>{

}
