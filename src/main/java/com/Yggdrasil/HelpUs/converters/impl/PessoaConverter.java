package com.Yggdrasil.HelpUs.converters.impl;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import com.Yggdrasil.HelpUs.PersonDTO;
import com.Yggdrasil.HelpUs.converters.Converter;
import com.Yggdrasil.HelpUs.entities.Pessoa;

public class PessoaConverter implements Converter<Pessoa, PersonDTO>{

	@Override
	public Pessoa toEntity(PersonDTO dto) {
		Pessoa p = new Pessoa();
		try {
			BeanUtils.copyProperties(p, dto);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public PersonDTO toDto(Pessoa entidade) {
		PersonDTO dto = new PersonDTO();
		try {
			BeanUtils.copyProperties(entidade, dto);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return dto;


	}

}
