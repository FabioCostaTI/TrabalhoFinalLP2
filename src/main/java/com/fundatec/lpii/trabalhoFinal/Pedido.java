package com.fundatec.lpii.trabalhoFinal;

public class Pedido {

	private int numeroPedido;
	private Endereco enderecoBusca;
	private EnderecoEntrega enderecoEntrega;
	private String descricaoMaterial;

	public Pedido(int numeroPedido, Endereco enderecoBusca, EnderecoEntrega enderecoEntrega,
			String descricaoMaterial) {
		super();
		this.numeroPedido = numeroPedido;
		this.enderecoBusca = enderecoBusca;
		this.enderecoEntrega = enderecoEntrega;
		this.descricaoMaterial = descricaoMaterial;
	}
	
	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Endereco getEnderecoBusca() {
		return enderecoBusca;
	}

	public void setEnderecoBusca(Endereco enderecoBusca) {
		this.enderecoBusca = enderecoBusca;
	}

	public EnderecoEntrega getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(EnderecoEntrega enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public String getDescricaoMaterial() {
		return descricaoMaterial;
	}

	public void setDescricaoMaterial(String descricaoMaterial) {
		this.descricaoMaterial = descricaoMaterial;
	}

	public void inclusaoDeDados() {
		
	}
	public void listagemDosDadosArmazenados() {
		
	}
	public void alteracaoDosDados() {
		
	}
}
