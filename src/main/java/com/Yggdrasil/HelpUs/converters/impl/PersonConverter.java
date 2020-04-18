package com.Yggdrasil.HelpUs.converters.impl;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import com.Yggdrasil.HelpUs.PersonDTO;
import com.Yggdrasil.HelpUs.converters.Converter;
import com.Yggdrasil.HelpUs.entities.Person;

public class PersonConverter implements Converter<Person, PersonDTO>{

	@Override
	public Person toEntidade(PersonDTO dto) {
		Person p = new Person();
		try {
			BeanUtils.copyProperties(p, dto);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public PersonDTO toDto(Person entidade) {
		PersonDTO dto = new PersonDTO();
		try {
			BeanUtils.copyProperties(entidade, dto);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return dto;


	}

}
