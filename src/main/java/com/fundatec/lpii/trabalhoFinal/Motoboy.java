package com.fundatec.lpii.trabalhoFinal;

public class Motoboy {
	private String nome;
	private Pedido pedido;

	public Motoboy(String nome, Pedido pedido) {
		super();
		this.nome = nome;
		this.pedido = pedido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
