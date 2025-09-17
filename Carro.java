package backend.aula8;

public class Carro {
	private String modelo;
	private String cor;
	private String placa;
	
	public Carro(String modelo, String cor, String placa) {
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}
	public Carro(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
		placa = "AD12G34";
	}
	public Carro(String modelo) {
		this.modelo = modelo;
		cor = "Vermelho";
		placa = "FG05B54";
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
