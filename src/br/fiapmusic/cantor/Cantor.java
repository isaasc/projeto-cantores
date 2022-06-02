package br.fiapmusic.cantor;

public class Cantor {
	private String nome, nacionalidade;

	public Cantor(String nome) {
		super();
		this.nome = nome;
	}
	
	public Cantor(String nome, String nacionalidade) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}


	public String getDados() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "Nacionalidade: " + nacionalidade + "\n";
		return aux;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}
