package com.minhalojadegame.global.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Usuario")
//@CrossOrigin("*")
public class UsuarioModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nome;

	@Column
	private String email;

	@Column
	@JsonIgnoreProperties({ "senha" })
	private long senha;

	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getSenha() {
		return senha;
	}

	public void setSenha(long senha) {
		this.senha = senha;
	}

}
