package br.com.grupoum.Restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GestaoRestaurante {
	
	@GetMapping("/gestao-restaurante")
	public String gestaoRestaurante() {
		
		return "gestao-restaurante";
	}

}
