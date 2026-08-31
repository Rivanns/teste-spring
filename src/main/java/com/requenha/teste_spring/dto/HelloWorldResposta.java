package com.requenha.teste_spring.dto;

public class HelloWorldResposta {
	
	private String mensagem;
	
	public HelloWorldResposta(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem (String mensagem) {
		this.mensagem = mensagem;
	}
}
