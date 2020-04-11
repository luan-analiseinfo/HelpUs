package com.Yggdrasil.HelpUs.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Yggdrasil.HelpUs.entities.Client;
import com.Yggdrasil.HelpUs.entities.Person;


@RestController
@RequestMapping(value = "/pessoas")
public class PersonResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Person> listar() {
	
		List<Person> lista = new ArrayList<>();
		
		Person p1 = new Client();
		p1.setId(1);
		p1.setName("Goku");
		p1.setEmail("sayajin@live.com");
		
		Person p2 = new Client();
		p1.setId(2);
		p1.setName("Vegeta");
		p1.setEmail("principe@live.com");
		
		Person p3 = new Client();
		p1.setId(3);
		p1.setName("CUririm");
		p1.setEmail("otario@live.com");
		
		Person p4 = new Client();
		p1.setId(4);
		p1.setName("Piculo");
		p1.setEmail("mochila@live.com");
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		
		
		return lista;
	}
}
