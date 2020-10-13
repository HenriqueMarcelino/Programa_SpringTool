package com.api.produtoralf.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.produtoralf.modelo.ProdutoModelo;

public interface ProdutoRepository extends CrudRepository<ProdutoModelo, Integer>{
	
	//Listar todos os produtos 
	
	List<ProdutoModelo>findAll();
	
	//Pesquisar por codigo

	ProdutoModelo findByCodigo(int codigo);
	
	// Remover produto

	void delete(ProdutoModelo produto); 
	
	// Cadastrar / Alterar produto

	ProdutoModelo save(ProdutoModelo produto);
}
