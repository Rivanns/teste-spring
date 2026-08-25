package com.requenha.teste_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
    public String helloWorld() {
    	return "Hello Spring :)";
    }
	
	@GetMapping("/goodbye")
	public String goodbyeWorld() {
		return "Goodbye Spring =[";
	}
	
}
