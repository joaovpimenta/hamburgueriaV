package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Salao;
import br.com.grupoum.Restaurante.model.repositories.SalaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaoService {

    @Autowired
    SalaoRepository repository;


    // Validação


    // Create/Update a Salao
    public boolean createSalao(Salao salao){
        if(salao != null){
            repository.save(salao);
            return true;
        }
        return false;
    }

    // Delete a Salao
    public boolean deleteSalaoById(Long id){
        Optional<Salao> salaoToDelete = repository.findById(id);
        if(salaoToDelete.isPresent()){
            repository.delete(salaoToDelete.get());
            return true;
        }
        return false;
    }

    // Read a Salao
    public Salao findSalaoByID(Long id){
        Optional<Salao> salao = repository.findById(id);
        return salao.orElse(null);
    }

    // Read All Salaos
    public List<Salao> findAllSalaos(){
        List<Salao> salaos = repository.findAll();
        return salaos;
    }

}
