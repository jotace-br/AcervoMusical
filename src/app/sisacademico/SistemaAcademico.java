package app.sisacademico;

import java.util.LinkedList;
import java.util.List;

public class SistemaAcademico {
	private List<IArtista> musicas;
	
	public SistemaAcademico() {
		musicas = new LinkedList<IArtista>();
	}
	
	public boolean adicionarMusica(IArtista musica) {
		if(musica != null) {
			musicas.add(musica);
			return true;
		}
		return false;
	}
	
	public void listarMusicas() {
		for (int i = 0; i < musicas.size(); i++) {
			IArtista musica = musicas.get(i);
			
			System.out.println(musica);
		}
	}
	
	public IArtista buscarMusica(String musica) {
		for (IArtista musique : musicas) {
			if(musique.getGenero().equals(musica)) {
				return musique;
			}
		}
		return null;
	}
	
	public boolean removerMusica(IArtista musica) {
		if(musica != null) {
			musicas.remove(musica);
			return true;
		}
		
		return false;
	}

	
	public boolean alterarMusica(String musica, String novaMusica) {
		IArtista usuario = buscarMusica(musica);
		
		boolean alterouMusica = usuario.alterarArtista(novaMusica);	
		return alterouMusica;
	}
}
