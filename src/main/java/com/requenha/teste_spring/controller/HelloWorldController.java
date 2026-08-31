package com.requenha.teste_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.requenha.teste_spring.dto.HelloWorldResposta;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello/{nome}/{idade}")
    public HelloWorldResposta helloWorld(@PathVariable String nome, @PathVariable int idade) {
    	return new HelloWorldResposta("Hello, " + nome + " you are " + idade + " years old.");
    }
	
	@GetMapping("/goodbye")
	public String goodbyeWorld() {
		return "Goodbye Spring =[";
	}
	
}
