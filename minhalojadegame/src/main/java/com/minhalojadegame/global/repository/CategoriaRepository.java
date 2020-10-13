package com.minhalojadegame.global.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhalojadegame.global.model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

	public List<CategoriaModel> findByNome(String nome);

	public List<CategoriaModel> findByDescricao(String descricao);

}