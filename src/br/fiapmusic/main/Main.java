package br.fiapmusic.main;

import br.fiap.musica.Musica;
import br.fiapmusic.cantor.Cantor;
import br.fiapmusic.playlist.Playlist;

public class Main {

	public static void main(String[] args) {

		Playlist playlist = new Playlist(4);
		
		Cantor cantor1 = new Cantor("Caetano Veloso", "Brasileiro");
		Cantor cantor2 = new Cantor("Iza", "Brasileira");
		Cantor cantor3 = new Cantor("Duda Beat", "Brasileira");
		Cantor cantor4 = new Cantor("Criolo", "Brasileiro");
		
		Musica musica1 = new Musica("Leoazinho", "MPB", cantor1);
		Musica musica2 = new Musica("Talisma", "Funk", cantor2);
		Musica musica3 = new Musica("Tangerina", "MPB", cantor3);
		Musica musica4 = new Musica("Subirudoistiozin", "Rap", cantor4);
		
		playlist.inserir(musica1);
		playlist.inserir(musica2);
		playlist.inserir(musica3);
		playlist.inserir(musica4);
		
		playlist.tocar("Leaozinho");
		playlist.tocar("Talisma");
		
		
		System.out.println(playlist.listar());
	}

}
