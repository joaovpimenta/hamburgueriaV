package br.com.grupoum.Restaurante.controller;

import br.com.grupoum.Restaurante.model.entities.Cliente;
import br.com.grupoum.Restaurante.model.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TelaLogin {

	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/tela-login")
	public String telaLogin(ModelMap model) {
		String login = "";
		String senha = "";
		model.addAttribute("login", login);
		model.addAttribute("senha", senha);
		return "tela-login"; // Joga pro user o html Tela Login + Model
	}

	@PostMapping(value = "/logar")
	public String fazerLogin(String login, String senha){
		System.out.println("Login:"+login);
		System.out.println(senha);
		Cliente cliente = clienteService.findClienteByLogin(login);
		if(cliente != null){
			if(cliente.getSenha().equals(senha)){
				return "redirect:/cardapio";
			}
		}
		return "redirect:/tela-login";
	}

}
