package br.com.bandtec.zoomzinho;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Livro {
	
	@JsonProperty
	private String nome;
	
	@JsonProperty
	private String tema;
	
	public Livro(String nome, String tema) {
		this.nome = nome;
		this.tema = tema;
	}

	public String getTema() {
		return tema;
	}
}
