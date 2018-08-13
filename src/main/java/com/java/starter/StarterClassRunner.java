package com.java.starter;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StarterClassRunner implements CommandLineRunner{

	private final StarterRepository repository;

	public StarterClassRunner(StarterRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("hello", "hi" ,"May day", "swag").forEach(name -> 
				 repository.save(new StarterClass(name)));
		repository.findAll().forEach(System.out::println);
	}
	
	
}
