package com.requenha.teste_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.requenha.teste_spring.dto.HelloWorldRequisicao;
import com.requenha.teste_spring.dto.HelloWorldResposta;

@RestController
public class HelloWorldController {
	
	@PostMapping("/hello")
    public HelloWorldResposta helloWorld(@RequestBody HelloWorldRequisicao requisicao) {
		return new HelloWorldResposta("Hello, these are your informations:", requisicao.getNome(), requisicao.getIdade());
    }
	
	@GetMapping("/goodbye")
	public String goodbyeWorld() {
		return "Goodbye Spring =[";
	}
	
}
