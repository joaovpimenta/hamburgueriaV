package br.com.grupoum.Restaurante.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ITEMINGREDIENTES")
public class ItemIngredientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_itemingredientes")
	private Long id;
	@Column(name = "ingredientes")
	private Ingrediente ingrediente;
	@Column(name = "qtdIngrediente")
	private Double qtdIngrediente;
	
	public ItemIngredientes() {
		
	}
	
	public ItemIngredientes(Long id, Ingrediente ingrediente, Double qtdIngrediente) {
		this.id = id;
		this.ingrediente = ingrediente;
		this.qtdIngrediente = qtdIngrediente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	public Double getQtdIngrediente() {
		return qtdIngrediente;
	}

	public void setQtdIngrediente(Double qtdIngrediente) {
		this.qtdIngrediente = qtdIngrediente;
	}
}
