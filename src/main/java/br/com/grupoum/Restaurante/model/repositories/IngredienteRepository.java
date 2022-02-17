package br.com.grupoum.Restaurante.model.repositories;

import br.com.grupoum.Restaurante.model.entities.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {

}
