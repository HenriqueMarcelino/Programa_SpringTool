package Produto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.minhalojadegame.model.CategoriaModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "Produtos_Jogos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;

	@Column
	public String nome;

	@Column
	public String DescricaoTitulo;

	@Column
	public double valor;
	
	@ManyToOne 
	@JsonIgnoreProperties("Produto")
	@Column
	public CategoriaModel categoria;

	// Getters and Setters

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

	public String getClassificacao() {
		return DescricaoTitulo;
	}

	public void setClassificacao(String classificacao) {
		this.DescricaoTitulo = classificacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
