package br.com.grupoum.Restaurante.model.entities;

<<<<<<< Updated upstream
import antlr.collections.List;

public class Pedido {
	
	List<Produto> produto;

=======
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PEDIDO")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private Long id;
	@Column(name = "nomeProduto")
	private String nomeProduto;
	@Column(name = "valor")
	private BigDecimal valor;
	@Column(name = "nomeProduto")
	private List<ItemIngredientes> ingredientes;
	
	public Pedido() {
		
	}
	
	public Pedido(Long id, String nomeProduto, BigDecimal valor, List<ItemIngredientes> ingredientes) {
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

	public List<ItemIngredientes> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<ItemIngredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
>>>>>>> Stashed changes
}
