package com.Yggdrasil.HelpUs.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Calendar dataInicio;
	private Calendar datafim;
	private Double valor;
	private Person contratante;
	private Person contratado;
	
	@ElementCollection	
	private List<String> termosDeContrato;
	
	public Contract() {
	}

	public Contract(Integer id, Calendar dataInicio, Calendar datafim, Double valor, Person contratante,
			Person contratado) {
		super();
		this.id = id;
		this.dataInicio = dataInicio;
		this.datafim = datafim;
		this.valor = valor;
		this.contratante = contratante;
		this.contratado = contratado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDatafim() {
		return datafim;
	}

	public void setDatafim(Calendar datafim) {
		this.datafim = datafim;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Person getContratante() {
		return contratante;
	}

	public void setContratante(Person contratante) {
		this.contratante = contratante;
	}

	public Person getContratado() {
		return contratado;
	}

	public void setContratado(Person contratado) {
		this.contratado = contratado;
	}

	public List<String> getTermosDeContrato() {
		return termosDeContrato;
	}

	public void setTermosDeContrato(List<String> termosDeContrato) {
		this.termosDeContrato = termosDeContrato;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Contract other = (Contract) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
