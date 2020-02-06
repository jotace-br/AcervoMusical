package modelagem;

import java.util.ArrayList;

public class Album implements IAlbum {
	private String nomeAlbum;
	private int anoAlbum;
	private ArrayList<String> musicas;

	public Album(String nomeAlbum, int anoAlbum, Musica musica) {
		this.nomeAlbum = nomeAlbum;
		this.anoAlbum = anoAlbum;
		this.musicas = new ArrayList<String>();
	}

	public Album(String nomeAlbum, int anoAlbum) {
		this.nomeAlbum = nomeAlbum;
		this.anoAlbum = anoAlbum;
		this.musicas = new ArrayList<String>();
	}

	public Album(String nomeAlbum) {
		this.nomeAlbum = nomeAlbum;
		this.musicas = new ArrayList<String>();
	}

	public String getNomeAlbum() {
		return nomeAlbum;
	}

	public void setNomeAlbum(String nomeAlbum) {
		this.nomeAlbum = nomeAlbum;
	}

	public int getAnoAlbum() {
		return anoAlbum;
	}

	public void setAnoAlbum(int anoAlbum) {
		this.anoAlbum = anoAlbum;
	}

	private boolean isAlbumValido(String album) {
		if(!album.equals("") && !album.equals(" ")) {
			return true;
		}

		return false;
	} 

	public ArrayList<String> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<String> musicas) {
		this.musicas = musicas;
	}

	@Override
	public String toString() {
		return "Album: [Nome do álbum: " + nomeAlbum + ", Ano do Álbum: " + anoAlbum
				+ ", Músicas: " + musicas + "]";
	}

	@Override
	public boolean alterarAlbum(String album, String novoNomeAlbum, String novoAnoAlbum) {
		if(isAlbumValido(album))  {
			setNomeAlbum(novoNomeAlbum);
			setAnoAlbum(Integer.parseInt(novoAnoAlbum));
			return true;
		}
		return false;
	}

}
