package com.requenha.teste_spring.dto;

public class HelloWorldRequisicao {
	
	private String nome;
	private int idade;

	public HelloWorldRequisicao() {}
	
	public HelloWorldRequisicao(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
