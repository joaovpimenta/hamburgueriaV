package br.com.grupoum.Restaurante.model.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_INGREDIENTE")
public class Ingrediente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ingrediente", nullable = false)
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "unidade_medida")
	private Enum unidadeDeMedida;
	@Column(name = "custo")
	private BigDecimal custo;
	@Column(name = "quantidade_estoque")
	private Double quantidadeDeEstoque;
	private String unidadeMedida;
	
	public Ingrediente() {
		
	}

	public Ingrediente(Long id, String nome, Enum unidadeDeMedida, BigDecimal custo, Double quantidadeEstoque,
			String unidadeMedida) {
		this.id = id;
		this.nome = nome;
		this.unidadeDeMedida = unidadeDeMedida;
		this.custo = custo;
		this.quantidadeDeEstoque = quantidadeEstoque;
		this.unidadeMedida = unidadeMedida;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Enum getUnidadeDeMedida() {
		return unidadeDeMedida;
	}

	public void setUnidadeDeMedida(Enum unidadeDeMedida) {
		this.unidadeDeMedida = unidadeDeMedida;
	}

	public BigDecimal getCusto() {
		return custo;
	}

	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}

	public Double getQuantidadeEstoque() {
		return quantidadeDeEstoque;
	}

	public void setQuantidadeEstoque(Double quantidadeEstoque) {
		this.quantidadeDeEstoque = quantidadeEstoque;
	}
	
}
