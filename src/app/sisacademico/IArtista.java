package app.sisacademico;

public interface IArtista extends IPessoa{
	//Atributos constantes e estáticos (public static final)
	long TIME_OUT = 10000000;
	
	//Métodos publicos e abstratos (public abstract)
	String getNomeArtista();
	boolean alterarArtista(String login);
	
	String getGenero();
	void setGenero(String genero);
}
