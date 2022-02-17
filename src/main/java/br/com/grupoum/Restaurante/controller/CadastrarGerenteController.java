package br.com.grupoum.Restaurante.controller;

import br.com.grupoum.Restaurante.model.entities.Gerente;
import br.com.grupoum.Restaurante.model.services.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastrarGerenteController {

    @Autowired
    GerenteService gerenteService;

    @GetMapping("/cadastrar-gerente")
    public String telaLoginGerente(ModelMap model) {
        String login = "";
        String senha = "";
        String nome = "";
        model.addAttribute("nome", nome);
        model.addAttribute("login", login);
        model.addAttribute("senha", senha);
        return "cadastrar-gerente"; // Joga pro user o html Tela Login + Model
    }

    @PostMapping(value = "/cadastrargerente")
    public String fazerLoginGerente(String nome, String login, String senha){
        Gerente gerente = new Gerente();
        gerente.setLogin(login);
        gerente.setNome(nome);
        gerente.setSenha(senha);
        gerenteService.createGerente(gerente);

        return "redirect:/tela-login";
    }
}
