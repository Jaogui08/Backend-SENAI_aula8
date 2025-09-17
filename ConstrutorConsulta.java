package backend.aula8;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta consulta1 = new Consulta("Brian", "Matthew", "04/10");
		Consulta consulta2 = new Consulta("Jhonny", "Zacky");
		Consulta consulta3 = new Consulta("Mike");

		System.out.println("-----CONSULTA 1-----");
		System.out.println("Paciente " + consulta1.getNomePaciente() + " possui uma consulta com o Doutor "
				+ consulta1.getNomeDentista() + ", na data de " + consulta1.getData());

		System.out.println("\n-----CONSULTA 2-----");
		System.out.println("Paciente " + consulta2.getNomePaciente() + " possui uma consulta com o Doutor "
				+ consulta2.getNomeDentista() + ", na data de " + consulta2.getData());

		System.out.println("\n-----CONSULTA 3-----");
		System.out.println("Paciente " + consulta3.getNomePaciente() + " possui uma consulta com o Doutor "
				+ consulta3.getNomeDentista() + ", na data de " + consulta3.getData());

	}

}
