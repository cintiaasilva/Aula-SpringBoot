package br.com.bandtec.agendadeobjetivos.domain;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.bandtec.agendadeobjetivos.controller.Credenciais;

@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue
	private Long id;
	
	@Embedded
	private Credenciais credenciais;
	
	private String nome;
	private Integer idade;
	
	@OneToMany(mappedBy = "usuario")
	private List<Objetivo> objetivos;
	
	public Usuario(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
}
