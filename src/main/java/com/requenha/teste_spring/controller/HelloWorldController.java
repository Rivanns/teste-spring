package com.requenha.teste_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello/{nome}")
    public String helloWorld(@PathVariable String nome) {
    	return "Hello, " + nome;
    }
	
	@GetMapping("/goodbye")
	public String goodbyeWorld() {
		return "Goodbye Spring =[";
	}
	
}
