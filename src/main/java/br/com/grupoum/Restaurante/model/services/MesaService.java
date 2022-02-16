package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Mesa;
import br.com.grupoum.Restaurante.model.repositories.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesaService {

    @Autowired
    MesaRepository repository;


    // Validação

    public boolean createMesa(Mesa mesa){
        if(mesa.getStatus()){
            repository.save(mesa);
            return true;
        }
        return false;
    }


}
