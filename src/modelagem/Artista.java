package modelagem;

import java.util.ArrayList;

public class Artista extends Pessoa implements IArtista {
	private String nomeArtista;
	private String descricaoArtista;
	private String genero;
	private static int qntArtistas = 0;
	private ArrayList<IAlbum> albuns;

	public ArrayList<IAlbum> getAlbuns() {
		return albuns;
	}

	public void setAlbuns(ArrayList<IAlbum> albuns) {
		this.albuns = albuns;
	}

	public Artista(String nome, String idade, String nomeArtista, String descricaoArtista, String genero, Album albuns) {
		super(nome, idade);
		this.nomeArtista = nomeArtista;
		this.descricaoArtista = descricaoArtista;
		this.genero = genero;
		this.albuns = new ArrayList<>();
		qntArtistas++;
	}

	public Artista(String nome, String idade, String nomeArtista, String descricaoArtista, String genero) {
		super(nome, idade);
		this.nomeArtista = nomeArtista;
		this.descricaoArtista = descricaoArtista;
		this.genero = genero;
		qntArtistas++;
	}

	public Artista(String nome, String idade, String nomeArtista, String descricaoArtista) {
		super(nome, idade);
		this.nomeArtista = nomeArtista;
		this.descricaoArtista = descricaoArtista;
		qntArtistas++;
	}

	public Artista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
		qntArtistas++;
	}

	public Artista(Album albuns) {
		this.albuns = new ArrayList<>();
		qntArtistas++;
	}

	public int getQntArtistas() {
		return qntArtistas;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public String getDescricaoArtista() {
		return descricaoArtista;
	}

	public void setDescricaoArtista(String descricaoArtista) {
		this.descricaoArtista = descricaoArtista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	private boolean isArtistaValido(String artista) {
		if(!artista.equals("") && !artista.equals(" ")) {
			return true;
		}

		return false;
	}

	@Override
	public boolean alterarArtista(String artista) {
		if(isArtistaValido(artista))  {
			setNome(artista);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterarArtista(String artista, String novoNomeArtista, String novaIdadeArtista,
			String nomeArtistaConstrutor, String novaDescricaoArtista, String novoGeneroArtista) {

		if(isArtistaValido(artista))  {
			setNome(novoNomeArtista);
			setIdade(novaIdadeArtista);
			setNomeArtista(nomeArtistaConstrutor);
			setDescricaoArtista(novaDescricaoArtista);
			setGenero(novoGeneroArtista);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Artista: [Nome do artista: " + nomeArtista + ", Idade: " + idade + ", Descrição do artista: " + descricaoArtista 
				+ ", Gênero: " + genero + ", Albuns do artista: " + albuns + "]";
	}
}
