package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Funcionario;
import br.com.grupoum.Restaurante.model.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository repository;


    // Validação


    // Create/Update a Funcionario
    public boolean createFuncionario(Funcionario funcionario){
        if(funcionario != null){
            repository.save(funcionario);
            return true;
        }
        return false;
    }

    // Delete a Funcionario
    public boolean deleteFuncionarioById(Long id){
        Optional<Funcionario> funcionarioToDelete = repository.findById(id);
        if(funcionarioToDelete.isPresent()){
            repository.delete(funcionarioToDelete.get());
            return true;
        }
        return false;
    }

    // Read a Funcionario
    public Funcionario findFuncionarioByID(Long id){
        Optional<Funcionario> funcionario = repository.findById(id);
        return funcionario.orElse(null);
    }

    // Read All Funcionarios
    public List<Funcionario> findAllFuncionarios(){
        List<Funcionario> funcionarios = repository.findAll();
        return funcionarios;
    }

}
