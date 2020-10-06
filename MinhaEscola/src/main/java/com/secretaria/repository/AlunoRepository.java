package com.secretaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.secretaria.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	

}
