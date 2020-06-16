package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teste")
public class TesteController {
	
	private static int valor = 1;
	
	@GetMapping
	public ResponseEntity<String> testeGet() {
		++valor;		
		return ResponseEntity.ok("Valor atual: " + valor);
	}

}
