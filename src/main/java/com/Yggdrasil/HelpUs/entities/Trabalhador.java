package com.Yggdrasil.HelpUs.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Trabalhador extends Pessoa {
	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<Servico> servicos;

	public Trabalhador(List<Servico> servicos) {
		super();
	}
	
	
	
}
