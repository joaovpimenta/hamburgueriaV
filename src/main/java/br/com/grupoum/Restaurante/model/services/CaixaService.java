package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Caixa;
import br.com.grupoum.Restaurante.model.repositories.CaixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaixaService {

    @Autowired
    CaixaRepository repository;


    // Validação


    // Create/Update a Caixa
    public boolean createCaixa(Caixa caixa){
        if(caixa != null){
            repository.save(caixa);
            return true;
        }
        return false;
    }

    // Delete a Caixa
    public boolean deleteCaixaById(Long id){
        Optional<Caixa> caixaToDelete = repository.findById(id);
        if(caixaToDelete.isPresent()){
            repository.delete(caixaToDelete.get());
            return true;
        }
        return false;
    }

    // Read a Caixa
    public Caixa findCaixaByID(Long id){
        Optional<Caixa> caixa = repository.findById(id);
        return caixa.orElse(null);
    }

    // Read All Caixas
    public List<Caixa> findAllCaixas(){
        List<Caixa> caixas = repository.findAll();
        return caixas;
    }

}
