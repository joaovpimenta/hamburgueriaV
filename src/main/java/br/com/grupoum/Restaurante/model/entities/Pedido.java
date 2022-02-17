package br.com.grupoum.Restaurante.model.entities;


import java.math.BigDecimal;
import java.util.List;
import javax.persistence.*;

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
	@OneToMany
	@Column(name = "nomeProduto")
	private List<Produto> listaProdutos;
	
	public Pedido() {
		
	}
	
	public Pedido(Long id, String nomeProduto, BigDecimal valor, List<Produto> listaProdutos) {
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.listaProdutos = listaProdutos;
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

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
}
