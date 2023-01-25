package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import model.*;
import view.*;

public class ControlePet {
	Pet pet;
	TelaPet telaPet;
	TelaCadastroPet telaCadastroPet;
	TelaDetalhesPet telaDetalhesPet;
	private ArrayList<Pet> pets;
	
	//Construtor
	public ControlePet() {
		super();
		pets = new ArrayList<Pet>();
		
	}
	
	public void abreTelaPet() {
		telaPet = new TelaPet(this, pets);
		telaPet.setVisible(true);
		
	}
	
	public void abreTelaCadastroPet() {
		telaCadastroPet = new TelaCadastroPet(this, pets);
		telaCadastroPet.setVisible(true);
		
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
    
    // método para exibir os pets de um tutor
/*    public ArrayList<Pet> exibirPets(Tutor tutor) {
        return tutor.mostraPets();
    }
*/
}