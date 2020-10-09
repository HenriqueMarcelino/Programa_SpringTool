package org.minhalojadegame.repository;


import java.util.List;

import org.minhalojadegame.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<CategoriaModel, Long>{
	
	public List<CategoriaModel> findByDescricao(String descricao);

	

}
