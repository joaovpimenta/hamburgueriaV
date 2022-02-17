package br.com.grupoum.Restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MesaDisponivel {
	
	
	@GetMapping("/mesa-disponivel")
	public String mesaDisponivel() {
		
		
		return "mesa-disponivel";
	}

}
