package com.Yggdrasil.HelpUs.converters;

public interface Converter<E,D> {
	
	public E toEntity(D dto);
	public D toDto(E entidade);
	
}
