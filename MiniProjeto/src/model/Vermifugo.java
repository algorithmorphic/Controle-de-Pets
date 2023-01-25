package model;

public class Vermifugo extends Medicamento {
	private String tipo;

	public Vermifugo(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}