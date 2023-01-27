package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import model.*;
import view.*;

public class ControlePet {
	Pet pet;
	TelaPet telaPet;
	TelaCadastroPet telaCadastroPet;
	TelaBuscaPet telaBuscaPet;
	TelaDetalhesPet telaDetalhesPet;
	private ArrayList<Pet> pets;
	
	int variavelAuxiliarPet;
	
	//Construtor
	public ControlePet() {
		super();
		pets = new ArrayList<Pet>();
		variavelAuxiliarPet = 0;
		
	}
	
	public void abreTelaPet() {
		telaPet = new TelaPet(this, pets);
		telaPet.setVisible(true);
		
	}
	
	public void abreTelaCadastroPet() {
		telaCadastroPet = new TelaCadastroPet(this, pets);
		telaCadastroPet.setVisible(true);
		
	}

	public void abreTelaBuscaPet() {
		telaBuscaPet = new telaBuscaPet(this, pets);
		telaBuscaPet.setVisible(true);
	}

	public void abreTelaDetalhesPet(Pet pet) {
		telaDetalhesPet = new TelaDetalhesPet(this, pet);
		telaDetalhesPet.setVisible(true);
		
	}
	
    //Adiciona um pet ao ArrayList de pets.
    public void adicionaPet(String nome, String especie, String raca, String sexo, String cor, LocalDate dataNascimento, String microchip, String rga) {
        //Cria uma nova instância da classe Pet com os dados fornecidos.
        pet = new Pet(nome, especie, raca, sexo, cor, dataNascimento, microchip, rga);
        
        pets.add(pet);
    }
    
    public void removePet(Pet pet) {
    	pets.remove(pet);
    }
    
    public ArrayList<Pet> getPets() {
    	return pets;
    }
    
    public void fillWithSomeData(int variavelAuxiliarPet) {
    	if(this.variavelAuxiliarPet == variavelAuxiliarPet) {
    		adicionaPet("Dama", "Cachorro", "Cocker Spaniel Americano", "Fêmea", "Marrom avermelhada", LocalDate.parse("1955-06-24"), "567890123456789", "1234567");
    		adicionaPet("Vagabundo", "Cachorro", "Vira-lata", "Macho", "Cinza e branca", LocalDate.parse("1950-06-24"), "6543210987654321", "9876543");
    		adicionaPet("Garfield", "Gato", "Persa", "Macho", "Laranja com listras pretas", LocalDate.parse("1978-06-19"), "9876543210987654", "9876542");
    		adicionaPet("Jake", "Cachorro", "Buldogue", "Macho", "Amarelo", LocalDate.parse("2010-04-11"), "6172839485172839", "4851672");
    		adicionaPet("Scooby-Doo", "Cachorro", "Dogue Alemão", "Macho", "Marrom com manchas pretas", LocalDate.parse("1969-09-13"), "7894561237894561", "7894562");
    		
    		this.variavelAuxiliarPet++;
    		
    	}
    	
    }
    
    // método para exibir os pets de um tutor
/*    public ArrayList<Pet> exibirPets(Tutor tutor) {
        return tutor.mostraPets();
    }
*/
}