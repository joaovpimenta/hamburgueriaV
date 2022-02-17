package br.com.grupoum.Restaurante.model.repositories;

import br.com.grupoum.Restaurante.model.entities.Gerente;
import br.com.grupoum.Restaurante.model.entities.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepository extends JpaRepository<Mesa, Long> {

    Mesa findByPosicao(Integer posicao);

}
