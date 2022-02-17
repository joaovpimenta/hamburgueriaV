package br.com.grupoum.Restaurante.controller;

import br.com.grupoum.Restaurante.model.services.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @Autowired
    MesaService mesaService = new MesaService();


    // Quando estiver só no localhost:8080 vai executar esse método

    @GetMapping(value = "/")
    public String getHome(){


        return "home";
    }

}
