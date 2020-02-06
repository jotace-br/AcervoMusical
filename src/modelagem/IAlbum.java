package modelagem;

import java.util.ArrayList;

public interface IAlbum {
	String getNomeAlbum();
	void setNomeAlbum(String nomeAlbum);

	int getAnoAlbum();
	void setAnoAlbum(int anoAlbum);

	ArrayList<String> getMusicas();
	void setMusicas(ArrayList<String> musicas);
	boolean alterarAlbum(String album, String novoNomeAlbum, String novoAnoAlbum);
}
