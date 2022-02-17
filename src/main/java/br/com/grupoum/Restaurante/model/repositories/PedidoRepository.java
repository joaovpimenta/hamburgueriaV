package br.com.grupoum.Restaurante.model.repositories;

import br.com.grupoum.Restaurante.model.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
