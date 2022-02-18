package br.com.grupoum.Restaurante.controller;

import br.com.grupoum.Restaurante.RestauranteApplication;
import br.com.grupoum.Restaurante.model.entities.Produto;
import br.com.grupoum.Restaurante.model.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;

@Controller
public class CadastraProduto {

	@Autowired
	private ProdutoService service;
	
	@GetMapping("/cadastraproduto")
	public String cadastraProduto(ModelMap model) {
		if(RestauranteApplication.nivel != 2){
			return "redirect:/tela-login";
		}
		String nome = "";
		String preco = "";
		model.addAttribute("nome", nome);
		model.addAttribute("preco", preco);
		
		return "cadastrarproduto";
	}

	@PostMapping("/cadastroproduto")
	public String cadastrarProduto(String nome, String preco){
		Produto produto = new Produto();
		produto.setNomeProduto(nome);
		Double precototal = Double.valueOf(preco);
		produto.setValor(new BigDecimal(precototal));
		service.createProduto(produto);
		return "redirect:/mesas";
	}
	

}
