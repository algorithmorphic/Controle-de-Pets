package model;

import java.time.LocalDate;

public class Vermifugo extends Medicamento {
	private String forma;

	
	public Vermifugo(String tipo, String fabricante, LocalDate dataFabricacao, LocalDate dataValidade, String lote, boolean status, String forma) {
		super();
		
		this.setTipo(tipo);
		this.setFabricante(fabricante);
		this.setDataFabricacao(dataFabricacao);
		this.setDataValidade(dataValidade);
		this.setLote(lote);
		this.setStatus(status);
		this.forma = forma;
		
	}

	
	public String getForma() {
		return forma;
	
	}

	public void setForma(String forma) {
		this.forma = forma;
	
	}
	
}