package com.requenha.teste_spring.service;

import org.springframework.stereotype.Service;

import com.requenha.teste_spring.dto.HelloWorldRequisicao;
import com.requenha.teste_spring.dto.HelloWorldResposta;

@Service
public class HelloWorldService {
	
	public HelloWorldResposta helloWorld(HelloWorldRequisicao requisicao) {
		return new HelloWorldResposta("Hello, these are your informations:", requisicao.getNome(), requisicao.getIdade());
	}	
}
