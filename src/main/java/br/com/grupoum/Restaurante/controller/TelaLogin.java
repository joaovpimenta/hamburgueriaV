package br.com.grupoum.Restaurante.controller;

import br.com.grupoum.Restaurante.RestauranteApplication;
import br.com.grupoum.Restaurante.model.entities.Funcionario;
import br.com.grupoum.Restaurante.model.entities.Gerente;
import br.com.grupoum.Restaurante.model.entities.Produto;
import br.com.grupoum.Restaurante.model.services.FuncionarioService;
import br.com.grupoum.Restaurante.model.services.GerenteService;
import br.com.grupoum.Restaurante.model.services.LoginService;
import br.com.grupoum.Restaurante.model.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;

@Controller
public class TelaLogin {

	@Autowired
	FuncionarioService funcionarioService;

	@Autowired
	GerenteService gerenteService;

	@Autowired
	LoginService loginService;

	@Autowired
	ProdutoService produtoService;
	
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
		if(!loginService.verifyAccountByLogin(login)){
			return "redirect:/tela-login";
		}
		Funcionario funcionario = funcionarioService.findFuncionarioByLogin(login);
		Gerente gerente = gerenteService.findGerenteByLogin(login);
		if(funcionario != null){
			if(funcionario.getSenha().equals(senha)){
				RestauranteApplication.pessoaLogada = funcionario;
				RestauranteApplication.nivel = 1;
				return "redirect:/cardapio";
			}
		}
		if(gerente != null){
			if(gerente.getSenha().equals(senha)){
				RestauranteApplication.pessoaLogada = funcionario;
				RestauranteApplication.nivel = 2;
				return "redirect:/cardapio";
			}
		}
		return "redirect:/tela-login";
	}

}
