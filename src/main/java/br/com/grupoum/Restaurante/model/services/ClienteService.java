package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Cliente;
import br.com.grupoum.Restaurante.model.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;


    // Validação


    // Create/Update a Cliente
    public boolean createCliente(Cliente cliente){
        if(cliente != null){
            repository.save(cliente);
            return true;
        }
        return false;
    }

    // Delete a Cliente
    public boolean deleteClienteById(Long id){
        Optional<Cliente> clienteToDelete = repository.findById(id);
        if(clienteToDelete.isPresent()){
            repository.delete(clienteToDelete.get());
            return true;
        }
        return false;
    }

    // Read a Cliente
    public Cliente findClienteByID(Long id){
        Optional<Cliente> cliente = repository.findById(id);
        return cliente.orElse(null);
    }

    // Read All Clientes
    public List<Cliente> findAllClientes(){
        List<Cliente> clientes = repository.findAll();
        return clientes;
    }

}
