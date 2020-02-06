package controlador;

import java.util.LinkedList;
import java.util.List;

import modelagem.Artista;
import modelagem.IArtista;

public class ControladorArtista {
	private List<IArtista> artistas;

	public ControladorArtista() {
		artistas = new LinkedList<IArtista>();
	}

	public boolean adicionarArtista(IArtista artista) {
		if(artista != null) {
			artistas.add(artista);
			return true;
		}
		return false;
	}

	public IArtista listarArtistas() {
		for (int i = 0; i < artistas.size(); i++) {
			IArtista artista = artistas.get(i);

			System.out.println(artista);
		}
		return null;
	}

	public boolean existeArtista() {
		boolean encontrou = false;
		for (IArtista artistaForEach : artistas) {
			if (artistaForEach != null) {
				encontrou = true;	
			} else {
				encontrou = false;
			}
		}
		return encontrou;
	}

	public IArtista buscarArtista(String artista) {
		for (IArtista artistaForEach : artistas) {
			try {
				if(!artistaForEach.getNomeArtista().equals("") && artistaForEach.getNomeArtista().equals(artista)) {
					return artistaForEach;
				}
			}
			catch (Exception e) {
				System.out.println("Não foi possível encontrar o álbum");
			} finally {
				if(!artistaForEach.getNomeArtista().equals("") && artistaForEach.getNomeArtista().equals(artista)) {
					System.out.println("Album encontrado:");
					System.out.println("Nome do artista:" + artistaForEach.getNomeArtista());
					System.out.println("Genero:" + artistaForEach.getGenero());
					System.out.println("Descrição do artista:" + artistaForEach.getDescricaoArtista());
				}
			}
		}
		return null;
	}

	public boolean removerArtista(Artista artista, String artistaNome) {
		if(artista.getNomeArtista().contains(artistaNome)) {
			artistas.remove(artista);
			return true;
		}

		return false;
	}

	public boolean alterarArtista(String artista, String novoNomeArtista, String novaIdadeArtista, 
			String nomeArtistaConstrutor, String novaDescricaoArtista, 
			String novoGeneroArtista) {
		IArtista buscarArtista = buscarArtista(artista);

		boolean alterouArtista = buscarArtista.alterarArtista(artista, novoNomeArtista, novaIdadeArtista, 
				nomeArtistaConstrutor, novaDescricaoArtista, 
				novoGeneroArtista);	
		return alterouArtista;
	}

}
