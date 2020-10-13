package com.minhalojadegame.global.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhalojadegame.global.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
	
	public List<UsuarioModel> findByNome(String nome);

	
}
