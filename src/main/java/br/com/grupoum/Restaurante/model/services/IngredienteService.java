package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Ingrediente;
import br.com.grupoum.Restaurante.model.repositories.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredienteService {

    @Autowired
    IngredienteRepository repository;


    // Validação


    // Create/Update a Ingrediente
    public boolean createIngrediente(Ingrediente ingrediente){
        if(ingrediente != null){
            repository.save(ingrediente);
            return true;
        }
        return false;
    }

    // Delete a Ingrediente
    public boolean deleteIngredienteById(Long id){
        Optional<Ingrediente> ingredienteToDelete = repository.findById(id);
        if(ingredienteToDelete.isPresent()){
            repository.delete(ingredienteToDelete.get());
            return true;
        }
        return false;
    }

    // Read a Ingrediente
    public Ingrediente findIngredienteByID(Long id){
        Optional<Ingrediente> ingrediente = repository.findById(id);
        return ingrediente.orElse(null);
    }

    // Read All Ingredientes
    public List<Ingrediente> findAllIngredientes(){
        List<Ingrediente> ingredientes = repository.findAll();
        return ingredientes;
    }

}
