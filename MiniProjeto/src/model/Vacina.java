package model;

public class Vacina extends Medicamento {
	private String medicoVeterinario;
	
	public Vacina(String medicoVeterinario) {
		super();
		this.medicoVeterinario = medicoVeterinario;
	}

	public String getMedicoVeterinario() {
		return medicoVeterinario;
	}

	public void setMedicoVeterinario(String medicoVeterinario) {
		this.medicoVeterinario = medicoVeterinario;
	}
	
}