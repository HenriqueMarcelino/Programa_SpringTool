package com.api.produtoralf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.produtoralf.modelo.ProdutoModelo;
import com.api.produtoralf.repository.ProdutoRepository;

@RestController
@RequestMapping("/api")
public class ProdutoController {

	// Ações
	@Autowired
	private ProdutoRepository acoes;

	// Listar Produtos
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public @ResponseBody List<ProdutoModelo> listar() {
		return acoes.findAll();

	}

	// Cadastrar Produtos
	public @ResponseBody ProdutoModelo cadastrar(@RequestBody ProdutoModelo produto) {
		return acoes.save(produto);

	}

}