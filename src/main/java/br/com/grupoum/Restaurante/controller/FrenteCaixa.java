package br.com.grupoum.Restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrenteCaixa {
	
	@GetMapping("/frente-caixa")
	public String frenteCaixa() {
		
		return "frente-caixa";
	}

}
