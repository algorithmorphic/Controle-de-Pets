package model;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pet {
	private String nome;
	private String especie;
	private String raca;
	private String sexo;
	private String cor;
	private LocalDate dataNascimento;
	private String microchip; //Contém 15 algarismos (somente números).
	private String rga; //Contém 7 algarismos (somente números).
	private ArrayList<Vacina> vacinas;
	
	public Pet(String nome, String especie, String raca, String sexo, String cor, LocalDate dataNascimento,
			String microchip, String rga) {
		super();
		
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.sexo = sexo;
		this.cor = cor;
		this.dataNascimento = dataNascimento;
		this.microchip = microchip;
		this.rga = rga;
		
		vacinas = new ArrayList<Vacina>();
		
	}

	
	public String getNome() {
		return nome;
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	
	}

	public String getEspecie() {
		return especie;
	
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	
	}

	public String getRaca() {
		return raca;
	
	}

	public void setRaca(String raca) {
		this.raca = raca;
	
	}

	public String getSexo() {
		return sexo;
	
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	
	}

	public String getCor() {
		return cor;
	
	}

	public void setCor(String cor) {
		this.cor = cor;
	
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	
	}

	public String getMicrochip() {
		return microchip;
	
	}

	public void setMicrochip(String microchip) {
		this.microchip = microchip;
	
	}

	public String getRga() {
		return rga;
	
	}

	public void setRga(String rga) {
		this.rga = rga;
	
	}

	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	
	}

	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	
	}
	
	public void adicionaVacina(Vacina vacina) {
		vacinas.add(vacina);
	
	}
	
	public void removeVacina(Vacina vacina) {
		vacinas.remove(vacina);
	
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nEspécie: " + especie + "\nRaça: " + raca + "\nSexo: " + sexo + "\nCor: " + cor
				+ "\nMicrochip: " + microchip + "\nRGA: " + rga;
	
	}
	
}