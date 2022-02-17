package br.com.grupoum.Restaurante.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Pessoa{

	@OneToOne
	@JoinColumn(name = "Mesa")
	private Mesa mesa;
	@OneToOne
	@JoinColumn(name = "Pedido")
	private Pedido pedido;
	
	public Cliente() {
		
	}
	
	public Cliente(Mesa mesa, Pedido pedido) {
		this.mesa = mesa;
		this.pedido = pedido;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
