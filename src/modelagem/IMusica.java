package modelagem;

public interface IMusica {
	String getNomeMusica();
	void setNomeMusica(String nomeMusica);
	boolean alterarMusica(String buscarNomeMusica, String novoNomeMusica, String novoNomeAlbum, String novoAnoAlbum, 
			String novoNomeArtista, String novaIdadeArtista, String novaDescricaoArtista, String novoGeneroArtista);

	Album getAlbum();
	void setAlbum(Album album);

	Artista getArtista();
	void setArtista(Artista artista);

	boolean alterarMusica(String musica);

}
