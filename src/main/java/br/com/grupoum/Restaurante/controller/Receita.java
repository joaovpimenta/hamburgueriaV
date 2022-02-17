package br.com.grupoum.Restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Receita {
	
	
	@GetMapping("/receita")
	public String receita() {
		
		return "receita";
	}

}
