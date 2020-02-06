package modelagem;

public class Pessoa implements IPessoa {
	private String nome;
	protected String idade;

	public Pessoa(String nome, String idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

}
