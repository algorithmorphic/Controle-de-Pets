package controller;

import model.*;
import view.*;
import java.util.ArrayList;
import java.time.LocalDate;


public class ControleTutor {
	Tutor tutor;
	TelaTutor telaTutor;
	TelaCadastroTutor telaCadastroTutor;
	TelaDetalhesTutor telaDetalhesTutor;
	private ArrayList<Tutor> tutores;
	
	//Construtor
	public ControleTutor() {
		super();
		tutores = new ArrayList<Tutor>();
		
	}
	
	public void abreTelaTutor() {
		telaTutor = new TelaTutor(this, tutores);
		telaTutor.setVisible(true);
		
	}
	
	public void abreTelaCadastroTutor() {
		telaCadastroTutor = new TelaCadastroTutor(this, tutores);
		telaCadastroTutor.setVisible(true);
		
	}


	public void abreTelaDetalhesTutor(Tutor tutor) {
		telaDetalhesTutor = new TelaDetalhesTutor(this, tutor);
		telaDetalhesTutor.setVisible(true);
		
	}

	
	 //Adiciona um tutor ao ArrayList de tutores.
    public void adicionaTutor(String nome, String sobrenome, LocalDate dataNascimento, String endereco, int telefone, String email, String rg, String cpf) {
        //Cria uma nova instância da classe Tutor com os dados fornecidos.
        tutor = new Tutor(nome, sobrenome, dataNascimento, endereco, telefone, email, rg, cpf);

        tutores.add(tutor);
    }
    
    public void removeTutor(Tutor tutor) {
    	tutores.remove(tutor);
    }
    
    public ArrayList<Tutor> getTutores() {
    	return tutores;
    }
    
    // método para exibir os pets de um tutor
/*    public ArrayList<Pet> exibirPets(Tutor tutor) {
        return tutor.mostraPets();
    }
*/
}