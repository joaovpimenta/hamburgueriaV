package br.com.grupoum.Restaurante.controller;

import br.com.grupoum.Restaurante.model.entities.Funcionario;
import br.com.grupoum.Restaurante.model.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastrarFuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @GetMapping("/cadastrar-funcionario")
    public String telaLogin(ModelMap model) {
        String login = "";
        String senha = "";
        String nome = "";
        model.addAttribute("nome", nome);
        model.addAttribute("login", login);
        model.addAttribute("senha", senha);
        return "cadastrar-funcionario"; // Joga pro user o html Tela Login + Model
    }

    @PostMapping(value = "/cadastrarfuncionario")
    public String fazerLogin(String nome, String login, String senha){
        Funcionario funcionario = new Funcionario();
        funcionario.setLogin(login);
        funcionario.setNome(nome);
        funcionario.setSenha(senha);
        funcionarioService.createFuncionario(funcionario);

        return "redirect:/tela-login";
    }
}
