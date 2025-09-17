package backend.aula8;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		Pessoa musico1 = new Pessoa("Synyster Gates", 44);
		Pessoa musico2 = new Pessoa();
		Pessoa musico3 = new Pessoa("Zacky Vengeance");
		Pessoa musico4 = new Pessoa(28);
		
		System.out.println(musico1.getNome() + ", " + musico1.getIdade() + " anos de idade");
		System.out.println("----------------------\n");
		
		System.out.println(musico2.getNome() + ", " + musico2.getIdade() + " anos de idade");
		System.out.println("----------------------\n");
		
		System.out.println(musico3.getNome() + ", " + musico3.getIdade() + " anos de idade");
		System.out.println("----------------------\n");
		
		System.out.println(musico4.getNome() + ", " + musico4.getIdade() + " anos de idade");
		System.out.println("----------------------\n");
	}

}