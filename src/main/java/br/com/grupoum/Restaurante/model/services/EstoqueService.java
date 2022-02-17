package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Estoque;
import br.com.grupoum.Restaurante.model.repositories.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstoqueService {

    @Autowired
    EstoqueRepository repository;


    // Validação


    // Create/Update a Estoque
    public boolean createEstoque(Estoque estoque){
        if(estoque != null){
            repository.save(estoque);
            return true;
        }
        return false;
    }

    // Delete a Estoque
    public boolean deleteEstoqueById(Long id){
        Optional<Estoque> estoqueToDelete = repository.findById(id);
        if(estoqueToDelete.isPresent()){
            repository.delete(estoqueToDelete.get());
            return true;
        }
        return false;
    }

    // Read a Estoque
    public Estoque findEstoqueByID(Long id){
        Optional<Estoque> estoque = repository.findById(id);
        return estoque.orElse(null);
    }

    // Read All Estoques
    public List<Estoque> findAllEstoques(){
        List<Estoque> estoques = repository.findAll();
        return estoques;
    }

}
