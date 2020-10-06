package com.secretaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secretaria.model.Aluno;
import com.secretaria.repository.AlunoRepository;

@RestController
@RequestMapping("/Aluno")
@CrossOrigin("*")
public class AlunoController {

	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> FindAllAluno(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno>FindByIdAluno(@PathVariable long id){
	return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	
	}
	
	@PostMapping
	public Aluno create(@RequestBody Aluno aluno) {
		return repository.save(aluno);
	}
	
	@PutMapping
	
	public Aluno update(@RequestBody Aluno aluno) {
		return repository.save(aluno);
	}
	
	@DeleteMapping
	public String delete(@RequestBody Aluno aluno) {
		repository.delete(aluno);
		return "Aluno deletado";
	}
	
	@DeleteMapping("/{id}")
	public String delete2(@PathVariable Long id) {
		repository.deleteById(id);
		return "Aluno deletado";
	}
	
}
