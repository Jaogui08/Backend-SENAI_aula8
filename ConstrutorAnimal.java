package backend.aula8;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Leoa", "Fêmea", 130);
		Animal animal2 = new Animal("Cachorro", "Macho");
		Animal animal3 = new Animal("Elefante");
		
		System.out.println("-----ANIMAL 1-----");
		System.out.println(animal1.getNome() + ", " + animal1.getSexo() + " pesando " + animal1.getPeso() + "kg");
		
		System.out.println("\n-----ANIMAL 2-----");
		System.out.println(animal2.getNome() + ", " + animal2.getSexo() + " pesando " + animal2.getPeso() + "kg");
		
		System.out.println("\n-----ANIMAL 2-----");
		System.out.println(animal3.getNome() + ", " + animal3.getSexo() + " pesando " + animal3.getPeso() + "kg");
		
	}

}
