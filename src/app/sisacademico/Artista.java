package app.sisacademico;

public class Artista extends Pessoa implements IArtista {
	private String nomeArtista;
	private String descricaoArtista;
	private String genero;
	private static int qntArtistas = 0; 

	public Artista(String nome, String idade, String nomeArtista, String descricaoArtista, String genero) {
		super(nome, idade);
		this.nomeArtista = nomeArtista;
		this.descricaoArtista = descricaoArtista;
		this.genero = genero;
		qntArtistas++;
	}

	public static int getQntArtistas() {
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

	public static void setQntArtistas(int qntArtistas) {
		Artista.qntArtistas = qntArtistas;
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
	public String toString() {
		return "Artista [Descrição do artista: " + descricaoArtista + ", Gênero: " + genero + ", Nome do artista:" + getNome() + "]";
	}
}
