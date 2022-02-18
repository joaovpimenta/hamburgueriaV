package br.com.grupoum.Restaurante.controller;

import br.com.grupoum.Restaurante.RestauranteApplication;
import br.com.grupoum.Restaurante.model.entities.Mesa;
import br.com.grupoum.Restaurante.model.services.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastrarMesaController {

    @Autowired
    MesaService mesaService;

    @GetMapping("/cadastrar-mesa")
    public String telaLogin(ModelMap model) {
        if(RestauranteApplication.nivel != 2){
            return "redirect:/tela-login";
        }
        Integer numero = 0;
        String senha = "";
        model.addAttribute("numero", numero);
        model.addAttribute("senha", senha);
        return "cadastrar-mesa"; // Joga pro user o html Tela Login + Model
    }

    @PostMapping(value = "/cadastrarmesa")
    public String fazerLogin(Integer numero, String senha){
        Mesa mesa = new Mesa();
        mesa.setPosicao(numero);
        mesa.setSenha(senha);
        mesa.setStatus(false);
        mesaService.createMesa(mesa);

        return "redirect:/tela-login";
    }
}
