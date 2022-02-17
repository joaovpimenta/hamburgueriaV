package br.com.grupoum.Restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FechamentoCaixa {
	
	
	@GetMapping("/fechamento-caixa")
	public String fechamentoCaixa() {
		
		return "fechamento-caixa";
	}

}
