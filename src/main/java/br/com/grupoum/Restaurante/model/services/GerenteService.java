package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Funcionario;
import br.com.grupoum.Restaurante.model.entities.Gerente;
import br.com.grupoum.Restaurante.model.entities.Gerente;
import br.com.grupoum.Restaurante.model.repositories.GerenteRepository;
import br.com.grupoum.Restaurante.model.repositories.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GerenteService {

    @Autowired
    GerenteRepository repository;


    // Create/Update a Gerente
    public boolean createGerente(Gerente gerente){
        if(gerente != null){
            FuncionarioService service = new FuncionarioService();
            if(!existGerenteByLogin(gerente.getLogin())) {
                repository.save(gerente);
                return true;
            }
        }
        return false;
    }

    // Delete a Gerente
    public boolean deleteGerenteById(Long id){
        Optional<Gerente> gerenteToDelete = repository.findById(id);
        if(gerenteToDelete.isPresent()){
            repository.delete(gerenteToDelete.get());
            return true;
        }
        return false;
    }

    // Read a Gerente
    public Gerente findGerenteByID(Long id){
        Optional<Gerente> gerente = repository.findById(id);
        return gerente.orElse(null);
    }

    // Read All Gerentes
    public List<Gerente> findAllGerentes(){
        List<Gerente> gerentes = repository.findAll();
        return gerentes;
    }

    //
    public Gerente findGerenteByLogin(String login){
        Gerente gerenteLogin = repository.findByLogin(login);
        return gerenteLogin;
    }

    public boolean existGerenteByLogin(String login){
        Gerente novoGerente = findGerenteByLogin(login);
        return novoGerente != null;
    }

}
