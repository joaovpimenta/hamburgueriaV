package br.com.grupoum.Restaurante.controller;

import br.com.grupoum.Restaurante.model.entities.Mesa;
import br.com.grupoum.Restaurante.model.services.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MesaDisponivel {

	@Autowired
	MesaService service;
	
	
	@GetMapping("/mesas")
	public String mesaDisponivel(ModelMap model) {
		ArrayList<Mesa> lista1 = (ArrayList<Mesa>) service.findAllMesas();
		ArrayList<Mesa> lista = new ArrayList<>();
		for(Mesa mesa : lista1){
			if(mesa.getStatus()){
				lista.add(mesa);
			}
		}
		model.addAttribute("lista", lista);
		return "mesas";
	}

}
