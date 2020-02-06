package controlador;

import java.util.LinkedList;
import java.util.List;

import modelagem.IMusica;
import modelagem.Musica;

public class ControladorMusica {
	private List<IMusica> musicas;

	public ControladorMusica() {
		musicas = new LinkedList<IMusica>();
	}

	public boolean adicionarMusica(IMusica musica) {
		if(musica != null) {
			musicas.add(musica);
			return true;
		}
		return false;
	}

	public void listarMusica() {
		for (int i = 0; i < musicas.size(); i++) {
			IMusica musica = musicas.get(i);

			System.out.println(musica);
		}
	}

	public void listarArtistasBuscados(String musicaBuscada) {
		for (int i = 0; i < musicas.size(); i++) {
			IMusica musica = musicas.get(i);

			if(musica.getNomeMusica().equals(musicaBuscada)) {
				System.out.println(musica);
			}
		}
	}

	public boolean existeMusica() {
		boolean encontrou = false;
		for (IMusica musicaForEach : musicas) {
			if (musicaForEach != null) {
				encontrou = true;	
			} else {
				encontrou = false;
			}
		}
		return encontrou;
	}

	public IMusica buscarMusica(String musica) {
		for (IMusica musicaForEach : musicas) {
			try {
				if(!musicaForEach.getNomeMusica().equals("") && musicaForEach.getNomeMusica().equals(musica)) {
					return musicaForEach;
				}
			} catch (Exception e) {
				System.out.println("Não foi possível encontrar a música.");
			} finally {
				if(!musicaForEach.getNomeMusica().equals("") && musicaForEach.getNomeMusica().equals(musica)) {
					System.out.println("Música encontrada:");
					System.out.println("Nome da música: " + musicaForEach.getNomeMusica());
					System.out.println("Genero: " + musicaForEach.getAlbum());
					System.out.println("Artista: " + musicaForEach.getArtista());
				}
			}
		}
		return null;
	}

	public boolean removerMusica(Musica musica, String musicaNome) {
		if(musica != null && musica.getNomeMusica().contains(musicaNome)) {
			musicas.remove(musica);
			return true;
		}

		return false;
	}

	public boolean alterarMusica(String buscarNomeMusica, String novoNomeMusica, String novoNomeAlbum, String novoAnoAlbum, 
			String novoNomeArtista, String novaIdadeArtista, String novaDescricaoArtista, String novoGeneroArtista) {

		IMusica buscarMusica = buscarMusica(buscarNomeMusica);

		boolean alterouMusica = buscarMusica.alterarMusica(buscarNomeMusica, novoNomeMusica, novoNomeAlbum, novoAnoAlbum, 
				novoNomeArtista, novaIdadeArtista, novaDescricaoArtista, novoGeneroArtista);
		return alterouMusica;
	}
}
