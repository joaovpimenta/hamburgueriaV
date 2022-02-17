package br.com.grupoum.Restaurante.model.services;

import br.com.grupoum.Restaurante.model.entities.Produto;
import br.com.grupoum.Restaurante.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;


    // Validação


    // Create/Update a Produto
    public boolean createProduto(Produto produto){
        if(produto != null){
            repository.save(produto);
            return true;
        }
        return false;
    }

    // Delete a Produto
    public boolean deleteProdutoById(Long id){
        Optional<Produto> produtoToDelete = repository.findById(id);
        if(produtoToDelete.isPresent()){
            repository.delete(produtoToDelete.get());
            return true;
        }
        return false;
    }

    // Read a Produto
    public Produto findProdutoByID(Long id){
        Optional<Produto> produto = repository.findById(id);
        return produto.orElse(null);
    }

    // Read All Produtos
    public ArrayList<Produto> findAllProdutos(){
        ArrayList<Produto> produtos = (ArrayList<Produto>) repository.findAll();
        return produtos;
    }

}
