package com.Yggdrasil.HelpUs.resources;

import org.springframework.http.ResponseEntity;

public interface ApiREST<D>{
	ResponseEntity<?> find(Integer id);
	ResponseEntity<?> findPaginated(Integer page, Integer qtd);
	ResponseEntity<?> save(D d);
	ResponseEntity<?> update(Integer id, D objDTO);
	ResponseEntity<?> delete(Integer id);
	
}
