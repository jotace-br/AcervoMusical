package modelagem;

public interface IArtista {
	String getNomeArtista();
	boolean alterarArtista(String login);

	int getQntArtistas();
	void setNomeArtista(String nomeArtista);

	String getDescricaoArtista();
	void setDescricaoArtista(String descricaoArtista);

	String getGenero();
	void setGenero(String genero);
	boolean alterarArtista(String artista, String novoNomeArtista, String novaIdadeArtista,
			String nomeArtistaConstrutor, String novaDescricaoArtista, String novoGeneroArtista);
}
