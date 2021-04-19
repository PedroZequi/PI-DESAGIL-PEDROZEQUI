package br.edu.insper.desagil.pi;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario {
	private List<Produto> produtos;
	
	public Vendedor(String nome, List<Video> videos, List<Produto> produtos) {
		super(nome, videos);
		this.produtos = produtos;
		
		
	}
	public void novoProduto (String nome, double preco ) {
		List<Produto> produtos = new ArrayList<>();
		Produto produto = new Produto(nome,preco);
		this.produtos.add(produto);
		
		
	}
	

}
