package br.edu.insper.desagil.pi;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	protected String nome;
	private List<Video> videos;
	
	public Usuario(String nome, List<Video> videos) {
		this.nome = nome;
		this.videos = videos;
	}
	public void postaVideo(int id, Produto produto) {
		List<Video> videos = new ArrayList<>();
		Video video = new Video(id, produto); 
		this.videos.add(video);
		
	}
	return this.video;
	public void totalAvaliacoes() {
		
		
		
	}

}
}
