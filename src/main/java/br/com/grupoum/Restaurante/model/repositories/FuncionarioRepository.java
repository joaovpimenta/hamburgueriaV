package br.com.grupoum.Restaurante.model.repositories;

import br.com.grupoum.Restaurante.model.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    Funcionario findByLogin(String login);

}
