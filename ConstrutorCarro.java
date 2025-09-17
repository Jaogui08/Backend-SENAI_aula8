package backend.aula8;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Opala", "Preto", "GJ80G73");
		Carro carro2 = new Carro("Carrera GT", "Prata");
		Carro carro3 = new Carro("SF90");

		System.out.println("-----CARRO 1-----");
		System.out.println(carro1.getModelo() + " de cor " + carro1.getCor() + 
				" possui a placa: " + carro1.getPlaca());
		
		System.out.println("\n-----CARRO 2-----");
		System.out.println(carro2.getModelo() + " de cor " + carro2.getCor() + 
				" possui a placa: " + carro2.getPlaca());
		
		System.out.println("\n-----CARRO 3-----");
		System.out.println(carro3.getModelo() + " de cor " + carro3.getCor() + 
				" possui a placa: " + carro3.getPlaca());
	}

}
