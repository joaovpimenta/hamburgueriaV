package br.com.grupoum.Restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelaLogin {
	
	
	@GetMapping("/tela-login")
	public String telaLogin() {
		
		return "tela-login";
	}

}
