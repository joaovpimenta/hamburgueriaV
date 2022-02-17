package br.com.grupoum.Restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
   
	@GetMapping("/home")
	public String home() {
		
		//TODO Mudar depois que outras página existirem
		return "tela-login";
	}
	
	

}
