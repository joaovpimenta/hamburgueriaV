package br.com.grupoum.Restaurante.model.entities;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Long id;
	@Column(name = "nomeProduto")
	private String nomeProduto;
	private BigDecimal valor;
	@OneToMany
	@Column(name = "ingredientes")
	private List<Produto> ingredientes;
	
	public Produto() {
		
	}
	
	public Produto(Long id, String nomeProduto, BigDecimal valor, List<Produto> ingredientes) {
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.ingredientes = ingredientes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public List<Produto> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Produto> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
}
