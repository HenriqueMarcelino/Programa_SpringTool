package com.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivo")
public class Objetivos {
	
	@GetMapping
	public String Objetivo () {
		return "Meu obejtivo dessa semana é fazer bastante exercicios no STS para ficar féra!!! ";
		
	}

}
