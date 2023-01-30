package model;

import java.time.LocalDate;


public abstract class Medicamento {
	private String tipo;
	private String fabricante;
	private LocalDate dataFabricacao;
	private LocalDate dataValidade;
	private String lote; //Geralmente contém de 6 a 11 dígitos.
	private boolean status; //Para verificação de usabilidade.
	
	
	public String getTipo() {
		return tipo;
	
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	
	}
	
	public String getFabricante() {
		return fabricante;
	
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	
	}
	
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	
	}
	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	
	}
	
	public LocalDate getDataValidade() {
		return dataValidade;
	
	}
	
	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	
	}
	
	public String getLote() {
		return lote;
	
	}
	
	public void setLote(String lote) {
		this.lote = lote;
	
	}
	
	public boolean isStatus() {
		return status;
	
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	
	}

}