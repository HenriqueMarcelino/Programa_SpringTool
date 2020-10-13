package com.api.produtoralf.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Produto")
public class ProdutoModelo {

	private int codigo;
	private String nome;
	private double valor;

	// Get ands Setters

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	public int getCodigo() {
		return codigo;
	}

	@Column
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Column
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
