package backend.aula8;

public class Consulta {
	private String nomePaciente;
	private String nomeDentista;
	private String data;
	
	public Consulta(String nomePaciente, String nomeDentista, String data) {
		this.nomePaciente = nomePaciente;
		this.nomeDentista = nomeDentista;
		this.data = data;
	}
	public Consulta(String nomePaciente, String nomeDentista) {
		this.nomePaciente = nomePaciente;
		this.nomeDentista = nomeDentista;
		data = "15/09";
	}
	public Consulta(String nomePaciente) {
		this.nomePaciente = nomePaciente;
		nomeDentista = "Jimmy";
		data = "10/04";
	}
	
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	public String getNomeDentista() {
		return nomeDentista;
	}
	public void setNomeDentista(String nomeDentista) {
		this.nomeDentista = nomeDentista;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
