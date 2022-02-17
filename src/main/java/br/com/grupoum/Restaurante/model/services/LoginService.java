package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Pessoa;
import br.com.grupoum.Restaurante.model.repositories.FuncionarioRepository;
import br.com.grupoum.Restaurante.model.repositories.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    FuncionarioService serviceFuncionario;

    @Autowired
    GerenteService serviceGerente;

    public boolean verifyAccountByLogin(String login) {
        System.out.println(!serviceFuncionario.existFuncionarioByLogin(login));
        System.out.println(!serviceGerente.existGerenteByLogin(login));
        if(serviceFuncionario.existFuncionarioByLogin(login) || serviceGerente.existGerenteByLogin(login)){
            System.out.println("Há conta!");
            return true;
        }
        System.out.println("Não há conta");
        return false;

    }


}
