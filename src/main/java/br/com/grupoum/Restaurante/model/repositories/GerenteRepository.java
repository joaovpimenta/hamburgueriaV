package br.com.grupoum.Restaurante.model.repositories;

import br.com.grupoum.Restaurante.model.entities.Caixa;
import br.com.grupoum.Restaurante.model.entities.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GerenteRepository extends JpaRepository<Gerente, Long> {

}
