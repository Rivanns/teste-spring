package com.requenha.teste_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello/{nome}/{idade}")
    public String helloWorld(@PathVariable String nome, @PathVariable int idade) {
    	return "Hello, " + nome + " you are " + idade + " years old.";
    }
	
	@GetMapping("/goodbye")
	public String goodbyeWorld() {
		return "Goodbye Spring =[";
	}
	
}
