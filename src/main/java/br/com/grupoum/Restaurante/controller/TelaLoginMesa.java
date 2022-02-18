package br.com.grupoum.Restaurante.controller;

import br.com.grupoum.Restaurante.RestauranteApplication;
import br.com.grupoum.Restaurante.model.entities.Funcionario;
import br.com.grupoum.Restaurante.model.entities.Gerente;
import br.com.grupoum.Restaurante.model.entities.Mesa;
import br.com.grupoum.Restaurante.model.entities.Produto;
import br.com.grupoum.Restaurante.model.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TelaLoginMesa {

	@Autowired
	MesaService service;

	@Autowired
	ProdutoService produtoService;

	
	@GetMapping("/tela-login-mesa")
	public String telaLoginMesa(ModelMap model) {
		String numero = "";
		String senha = "";
		model.addAttribute("numero", numero);
		model.addAttribute("senha", senha);
		return "tela-login-mesa"; // Joga pro user o html Tela Login + Model
	}

	@PostMapping(value = "/logarmesa")
	public String fazerLogin(String numero, String senha, ModelMap model){
		System.out.println("Numero: "+numero);
		System.out.println("Senha: "+senha);
		Mesa mesa = service.findMesaByLogin(Integer.valueOf(numero));
		if(mesa != null){
			if(mesa.getSenha().equals(senha)){
				ArrayList<Produto> lista = produtoService.findAllProdutos();
				model.addAttribute("lista",lista);
				return "/inicio-cardapio";
			}
		}
		return "redirect:/tela-login-mesa";
	}

	@GetMapping(value = "/cardapio")
	public String cardapio(ArrayList<Produto> lista){
		for(Produto prod : lista){
			System.out.println(prod.getNomeProduto());
		}
		return "cardapio";

	}

}
