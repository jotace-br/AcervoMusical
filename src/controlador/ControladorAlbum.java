package controlador;

import java.util.ArrayList;
import java.util.List;

import modelagem.Album;
import modelagem.IAlbum;

public class ControladorAlbum {
	private List<IAlbum> albuns;

	public ControladorAlbum() {
		albuns = new ArrayList<IAlbum>();
	}

	public boolean adicionarAlbum(IAlbum album, ArrayList<String> musicas) {
		if(album != null) {
			albuns.add(album);
			album.setMusicas(musicas);
			return true;
		}
		return false;
	}


	public boolean adicionarAlbum(IAlbum album) {
		if(album != null) {
			albuns.add(album);
			return true;
		}
		return false;
	}

	public IAlbum listarAlbuns() {
		for (int i = 0; i < albuns.size(); i++) {
			IAlbum album = albuns.get(i);

			System.out.println(album);
		}
		return null;
	}

	public IAlbum listarAlbunsBuscados(String albumBuscado) {
		for (IAlbum iAlbum : albuns) {
			try {
				if(iAlbum.getNomeAlbum().equals(albumBuscado)) {
					System.out.println("Album encontrado:");
					System.out.println("Nome:" + iAlbum.getNomeAlbum());
					System.out.println("Nome:" + iAlbum.getAnoAlbum());
					System.out.println("Nome:" + iAlbum.getMusicas());
					return iAlbum;
				}
			}catch (Exception e) {
				System.out.println("Não foi possível encontrar o álbum");
			}
		}
		return null;
	}


	public boolean existeAlbum() {
		boolean encontrou = false;
		for (IAlbum albumForEach : albuns) {
			if (albumForEach != null) {
				encontrou = true;	
			} else {
				encontrou = false;
			}
		}
		return encontrou;
	}

	public IAlbum buscarAlbum(String album) {
		for (IAlbum albumForEach : albuns) {
			try {
				if(!albumForEach.getNomeAlbum().equals("") && albumForEach.getNomeAlbum().equals(album)) {
					return albumForEach;
				}
			}
			catch (Exception e) {
				System.out.println("Não foi possível encontrar o álbum");
			} finally {
				if(!albumForEach.getNomeAlbum().equals("") && albumForEach.getNomeAlbum().equals(album)) {
					System.out.println("Album encontrado:");
					System.out.println("Nome:" + albumForEach.getNomeAlbum());
					System.out.println("Ano:" + albumForEach.getAnoAlbum());
					System.out.println("Musicas:" + albumForEach.getMusicas());
				}
			}
		}
		return null;
	}

	public boolean removerAlbum(Album album, String albumNome) {
		if(album.getNomeAlbum().contains(albumNome)) {
			albuns.remove(album);
			return true;
		}
		return false;
	}

	public boolean alterarAlbum(String album, String novoNomeAlbum, String novoAnoAlbum) {

		IAlbum buscarAlbum = buscarAlbum(album);

		boolean alterouAlbum = buscarAlbum.alterarAlbum(album, novoNomeAlbum, novoAnoAlbum);
		return alterouAlbum;
	}

}
