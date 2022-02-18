package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Gerente;
import br.com.grupoum.Restaurante.model.entities.Mesa;
import br.com.grupoum.Restaurante.model.repositories.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MesaService {

    @Autowired
    MesaRepository repository;


    // Validação


    // Create/Update a Mesa
    public boolean createMesa(Mesa mesa){
        if(mesa != null){
            repository.save(mesa);
            return true;
        }
        return false;
    }

    // Delete a Mesa
    public boolean deleteMesaById(Long id){
        Optional<Mesa> mesaToDelete = repository.findById(id);
        if(mesaToDelete.isPresent()){
            repository.delete(mesaToDelete.get());
            return true;
        }
        return false;
    }

    // Delete a Mesa
    public boolean deleteMesaByLogin(Integer id){
        Mesa mesaToDelete = repository.findByPosicao(id);
        if(mesaToDelete != null){
            repository.delete(mesaToDelete);
            return true;
        }
        return false;
    }

    // Read a Mesa
    public Mesa findMesaByID(Long id){
        Optional<Mesa> mesa = repository.findById(id);
        return mesa.orElse(null);
    }

    // Read All Mesas
    public List<Mesa> findAllMesas(){
        List<Mesa> mesas = repository.findAll();
        return mesas;
    }

    public Mesa findMesaByLogin(Integer posicao){
        Mesa mesaLogin = repository.findByPosicao(posicao);
        return mesaLogin;
    }

}
