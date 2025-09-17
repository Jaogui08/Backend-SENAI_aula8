package backend.aula8;

public class Animal {
	private String nome;
	private String sexo;
	private double peso;
	
	public Animal(String nome, String sexo, double peso) {
		this.nome = nome;
		this.sexo = sexo;
		this.peso = peso;
	}
	public Animal(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
		peso = 8;
	}
	public Animal(String nome) {
		this.nome = nome;
		sexo = "Macho";
		peso = 6000;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
