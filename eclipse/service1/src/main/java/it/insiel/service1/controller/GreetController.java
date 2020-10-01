package it.insiel.service1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	
	@Value("${person.name}")
	public String name;
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello " + name;
	}
}
