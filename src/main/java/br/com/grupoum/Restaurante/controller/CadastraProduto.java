package br.com.grupoum.Restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastraProduto {
	
	@GetMapping("/cadastra-produto")
	public String cadastraProduto() {
		
		return "cadastra-produto";
	}
	

}
