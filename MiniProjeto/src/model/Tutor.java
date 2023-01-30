package model;
import java.time.LocalDate;
import java.util.ArrayList;


public class Tutor {
	private String nome;
	private String sobrenome;
	private LocalDate dataNascimento;
	private String endereco;
	private int telefone;
	private String email;
	private String rg;
	private String cpf;
	private ArrayList<Pet> pets;
	
	
	public Tutor() {
		super();
		
	}
	
	public Tutor(String nome, String sobrenome, LocalDate dataNascimento, String endereco, int telefone, String email,
			String rg, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
		this.cpf = cpf;
		
		pets = new ArrayList<Pet>();
	
	}
	
	
	public String getNome() {
		return nome;
	
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	
	}
	
	public String getSobrenome() {
		return sobrenome;
	
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	
	}
	
	public String getEndereco() {
		return endereco;
	
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	
	}
	
	public int getTelefone() {
		return telefone;
	
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	
	}
	
	public String getEmail() {
		return email;
	
	}
	
	public void setEmail(String email) {
		this.email = email;
	
	}
	
	public String getRg() {
		return rg;
	
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	
	}
	
	public String getCpf() {
		return cpf;
	
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	
	}
	
	public ArrayList<Pet> getPets() {
		return pets;
	
	}

	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	
	}
	
	public void adicionaPet(Pet pet) {
		pets.add(pet);
	
	}
	
	public void removePet(Pet pet) {
		pets.remove(pet);
	
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nData de nascimento: " + dataNascimento + "\nEndereço: "
				+ endereco + "\nTelefone: " + telefone + "\nE-mail: " + email + "\nRG: " + rg + "\nCPF: " + cpf + "\n" /*+ pets + "\n"*/;
	
	}
	
}