package com.Yggdrasil.HelpUs.converters;

public interface Converter<E,D> {
	
	public E toEntidade(D dto);
	public D toDto(E entidade);
	
}
