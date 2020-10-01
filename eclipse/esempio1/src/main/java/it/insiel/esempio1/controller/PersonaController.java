package it.insiel.esempio1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import it.insiel.esempio1.model.Persona;
import it.insiel.esempio1.repository.PersonaRepository;

@RestController
@RequestMapping("/persone")
public class PersonaController {

	@Autowired
	private PersonaRepository repo;
	
	@GetMapping
	public Iterable<Persona> list() {
		return repo.findAll();
	}
	
	@GetMapping("/{email}")
	public Persona list(@PathVariable String email) {
		return repo.findById(email)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	
	
}
