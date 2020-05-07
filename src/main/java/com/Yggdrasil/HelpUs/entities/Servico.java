package com.Yggdrasil.HelpUs.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Servico implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@OneToOne
	private Contrato contrato;
	@OneToOne
	private Cliente cliente;
	private Trabalhador trabalhador;
	private Calendar date;
	private Double valor;
	
	public Servico () {
	}

	public Servico(Integer id, Contrato contrato, Cliente cliente,Trabalhador trabalhador, Calendar date, Integer valor) {
		super();
		Id = id;
		this.contrato = contrato;
		this.cliente = (Cliente) contrato.getContratante();
		this.trabalhador = (Trabalhador) contrato.getContratado();
		this.date = contrato.getDataInicio();
		this.valor = contrato.getValor();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Contrato getContract() {
		return contrato;
	}

	public void setContract(Contrato contrato) {
		this.contrato = contrato;
	}

	public Cliente getClient() {
		return cliente;
	}

	public void setClient(Cliente cliente) {
		this.cliente = cliente;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Trabalhador getWorker() {
		return trabalhador;
	}

	public void setWorker(Trabalhador trabalhador) {
		this.trabalhador = trabalhador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	
	
	
}
