package com.java.starter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {
	
	private StarterRepository repository;

	public StarterController(StarterRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/good-starter") 
	public Collection<StarterClass> goodStarter() {
		return repository.findAll().stream()
                .filter(this::isGreat)
                .map(b -> {
//                	Map<String,String> m = new HashMap<>();
//                	m.put("id", b.getId().toString());
//                	m.put("name", b.getName());
//                	return m;
                }).collect(Collectors.toList());
	}
	
	 private boolean isGreat(StarterClass starter) {
	        return !starter.getName().equals("Budweiser") &&
	                !starter.getName().equals("Coors Light") &&
	                !starter.getName().equals("PBR");
	    }
}
