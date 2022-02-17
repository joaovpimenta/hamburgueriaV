package br.com.grupoum.Restaurante.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente extends Pessoa{
	
	@Column(name = "Mesa")
	private Mesa mesa;
	@Column(name = "Pedido")
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
