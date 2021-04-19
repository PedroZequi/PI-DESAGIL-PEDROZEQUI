package br.edu.insper.desagil.pi;

import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<Usuario,Integer> avaliacoes;
	
	public Video(int id, Produto produto) {
		this.id = id;
		this.produto = produto;
	}
	
	public void adcionaAvaliacao(Usuario usario, int avaliacao) {
		if (avaliacao  >=1 && avaliacao <=5) {
				this.avaliacoes.put(usario, avaliacao);
			}
			
		}
	
	public int mediaAvaliacoes() {
		int mediatotal = 0;
		for (Integer media :avaliacoes.values() ) {
			int media1 = Math.round(media);
			mediatotal += media1;
		}
		return mediatotal/avaliacoes.size();
		
				
	}
	
	
	

}

