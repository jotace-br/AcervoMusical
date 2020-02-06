package controller;

import java.util.ArrayList;

public class SongController {
	private ArrayList<ISongController> songs;

	public SongController() {
		this.songs = new ArrayList<ISongController>();
	}

	public boolean addSong(ISongController music) {
		if(music != null) {
			songs.add(music);
			return true;
		}
		return false;
	}

	public void listMusic() {
		for (ISongController string : songs) {
			System.out.println(string);
		}
	}

	public ISongController searchSong(String song) {
		for (ISongController songVar : songs) {
			if(((ISongController) songs).getSong().equals(songVar)) {
				return songVar;
			}
		}
		return null;
	}

	public boolean changeSongName(String song, String newName) {
		ISongController shazamSong = searchSong(song);

		boolean isSongChanged = shazamSong.setSongName(newName);
		return isSongChanged;
	}



	//criar musica


	//sonic boom!

	//criar musica
	//editar musica
	//remover musica
	//buscar musica
	//listar musica
	//listar musica buscada
	//getmusica
	//adicionar musica em X album
}
