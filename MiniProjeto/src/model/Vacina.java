package model;

import java.time.LocalDate;

public class Vacina extends Medicamento {
	private String medicoVeterinario;
	private String crmv;
	private String uf;
	
	
	//Construtor.
	public Vacina(String tipo, String fabricante, LocalDate dataFabricacao, LocalDate dataValidade, String lote, boolean status, String medicoVeterinario, String crmv, String uf) {
		super();
		
		this.setTipo(tipo);
		this.setFabricante(fabricante);
		this.setDataFabricacao(dataFabricacao);
		this.setDataValidade(dataValidade);
		this.setLote(lote);
		this.setStatus(status);
		this.medicoVeterinario = medicoVeterinario;
		this.crmv = crmv;
		this.uf = uf;
		
	}

	
	public String getMedicoVeterinario() {
		return medicoVeterinario;
	}

	public void setMedicoVeterinario(String medicoVeterinario) {
		this.medicoVeterinario = medicoVeterinario;
	}

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}