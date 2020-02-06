package modelagem;

public class Musica implements IMusica {
	private String nomeMusica;
	private Album album;
	private Artista artista;

	public Musica(String nomeMusica, Album album, Artista artista) {
		this.nomeMusica = nomeMusica;
		this.album = album;
		this.artista = artista;
	}

	public Musica(String nomeMusica, Album album) {
		this.nomeMusica = nomeMusica;
		this.album = album;
	}

	public Musica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	private boolean isMusicaValida(String musica) {
		if(!musica.equals("") && !musica.equals(" ")) {
			return true;
		}

		return false;
	}

	public boolean alterarMusica(String musica) {
		if(isMusicaValida(musica))  {
			setNomeMusica(musica);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterarMusica(String buscarNomeMusica, String novoNomeMusica, String novoNomeAlbum, String novoAnoAlbum, 
			String novoNomeArtista, String novaIdadeArtista, String novaDescricaoArtista, String novoGeneroArtista) {
		if(isMusicaValida(buscarNomeMusica))  {
			setNomeMusica(novoNomeMusica);
			album.setAnoAlbum(Integer.parseInt(novoAnoAlbum));
			artista.setNome(novoNomeArtista);
			artista.setIdade(novaIdadeArtista);
			artista.setNomeArtista(novoNomeArtista);
			artista.setDescricaoArtista(novaDescricaoArtista);
			artista.setGenero(novoGeneroArtista);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Música: [Nome da música: " + nomeMusica + ", " + album + ", " + artista + "]";
	}

}
