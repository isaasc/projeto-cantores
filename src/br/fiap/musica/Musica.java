package br.fiap.musica;

import br.fiapmusic.cantor.Cantor;

public class Musica {
	private String titulo, genero;
	private Cantor cantor;
	private int total;
	
	public Musica(String titulo, String genero, Cantor cantor) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.cantor = cantor;
	}
	
	public String getDados() {
		String aux = "";
		aux += "Título da música: " + titulo + "\n";
		aux += "Gênero da música: " + genero + "\n";
		aux += cantor.getDados();
		aux += "Total de execuções: " + total + "\n";
		return aux;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Cantor getCantor() {
		return cantor;
	}

	public void setCantor(Cantor cantor) {
		this.cantor = cantor;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
	
}
