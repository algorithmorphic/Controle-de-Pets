package model;

public class Vermifugo extends Medicamento {
	private String forma;

	public Vermifugo(String forma) {
		super();
		
		this.forma = forma;
		
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
}