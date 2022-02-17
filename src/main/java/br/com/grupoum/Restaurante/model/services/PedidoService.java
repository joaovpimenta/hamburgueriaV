package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Pedido;
import br.com.grupoum.Restaurante.model.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository repository;


    // Validação


    // Create/Update a Pedido
    public boolean createPedido(Pedido pedido){
        if(pedido != null){
            repository.save(pedido);
            return true;
        }
        return false;
    }

    // Delete a Pedido
    public boolean deletePedidoById(Long id){
        Optional<Pedido> pedidoToDelete = repository.findById(id);
        if(pedidoToDelete.isPresent()){
            repository.delete(pedidoToDelete.get());
            return true;
        }
        return false;
    }

    // Read a Pedido
    public Pedido findPedidoByID(Long id){
        Optional<Pedido> pedido = repository.findById(id);
        return pedido.orElse(null);
    }

    // Read All Pedidos
    public List<Pedido> findAllPedidos(){
        List<Pedido> pedidos = repository.findAll();
        return pedidos;
    }

}
