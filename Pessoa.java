package backend.aula8;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa() {
		nome = "Matt Shadows";
		idade = 44;
	}
	public Pessoa(String nome) {
		this.nome = nome;
		idade = 43;
	}
	public Pessoa(int idade) {
		nome = "The Rev";
		this.idade = idade;
	}
	
	//get set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
