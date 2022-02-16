package br.com.grupoum.Restaurante.controller;

import br.com.grupoum.Restaurante.model.entities.Cliente;
import br.com.grupoum.Restaurante.model.entities.Mesa;
import br.com.grupoum.Restaurante.model.entities.Produtos;
import br.com.grupoum.Restaurante.model.repositories.MesaRepository;
import br.com.grupoum.Restaurante.model.services.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class ApplicationController {

    @Autowired
    MesaService mesaService = new MesaService();


    // Quando estiver só no localhost:8080 vai executar esse método

    @GetMapping(value = "/")
    public String getHome(){
        Mesa mesa = new Mesa();
        mesa.setStatus(false);
        mesa.setPosicao(4);
        mesaService.createMesa(mesa);

        return "home";
    }

}
