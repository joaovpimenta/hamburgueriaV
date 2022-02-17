package br.com.grupoum.Restaurante.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SALAO")
public class Salao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_salao")
	private Long id;
	@Column(name = "mesa")
	private List<Mesa> mesa;
	@Column(name = "funcionario")
	private Funcionario funcionario;
	
	public Salao() {
		
	}
	
	public Salao(Long id, List<Mesa> mesa, Funcionario funcionario) {
		this.id = id;
		this.mesa = mesa;
		this.funcionario = funcionario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Mesa> getMesa() {
		return mesa;
	}

	public void setMesa(List<Mesa> mesa) {
		this.mesa = mesa;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
