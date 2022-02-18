package br.com.grupoum.Restaurante.controller;

import br.com.grupoum.Restaurante.RestauranteApplication;
import br.com.grupoum.Restaurante.model.entities.Mesa;
import br.com.grupoum.Restaurante.model.services.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class MesaDisponivel {

	@Autowired
	MesaService service;
	
	
	@GetMapping("/mesas")
	public String mesaDisponivel(ModelMap model) {
		if(RestauranteApplication.nivel != 2){
			return "redirect:/tela-login";
		}
		ArrayList<Mesa> lista1 = (ArrayList<Mesa>) service.findAllMesas();
		ArrayList<Mesa> lista = new ArrayList<>();
		for(Mesa mesa : lista1){
			if(mesa.getStatus()){
				lista.add(mesa);
			}
		}
		String mesanumero = "";
		model.addAttribute("lista", lista);
		model.addAttribute("mesa", mesanumero);
		return "telagerente";
	}

	@GetMapping("/funcionario")
	public String funcionarioDisponivel(ModelMap model) {
		if(RestauranteApplication.nivel != 1){
			return "redirect:/tela-login";
		}
		ArrayList<Mesa> lista1 = (ArrayList<Mesa>) service.findAllMesas();
		ArrayList<Mesa> lista = new ArrayList<>();
		for(Mesa mesa : lista1){
			if(mesa.getStatus()){
				lista.add(mesa);
			}
		}
		String mesanumero = "";
		model.addAttribute("lista", lista);
		model.addAttribute("mesa", mesanumero);
		return "telafuncionario";
	}

	@PostMapping(value = "/dcmesa")
	public String dcMesa(String mesa){
		Mesa mesa1 = service.findMesaByLogin(Integer.valueOf(mesa));

		if(mesa1 != null && mesa1.getStatus()){
			mesa1.setStatus(false);
			service.createMesa(mesa1);
		}
		if(RestauranteApplication.nivel == 1){
			return "redirect:/funcionario";
		}
		return "redirect:/mesas";
	}

}
