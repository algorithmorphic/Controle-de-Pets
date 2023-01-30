package controller;

import model.*;
import view.*;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 * Classe que controla as operações relacionadas aos proprietários dos animais de estimação (tutores).
 * @author Artur Ricardo
 * @since 2023
 * @version 1.0
 */
public class ControleTutor {
	Tutor tutor;
	TelaTutor telaTutor;
	TelaCadastroTutor telaCadastroTutor;
	TelaDetalhesTutor telaDetalhesTutor;
	private ArrayList<Tutor> tutores;
	
	int variavelAuxiliarTutor;
	
	/**
	 * 
	 */
	public ControleTutor() {
		super();
		tutores = new ArrayList<Tutor>();
		
		variavelAuxiliarTutor = 0;
		
	}
	
	/**
	 * 
	 */
	public void abreTelaTutor() {
		telaTutor = new TelaTutor(this, tutores);
		telaTutor.setVisible(true);
		
	}
	
	/**
	 * 
	 */
	public void abreTelaCadastroTutor() {
		telaCadastroTutor = new TelaCadastroTutor(this, tutores);
		telaCadastroTutor.setVisible(true);
		
	}

	/**
	 * 
	 */
	public void abreTelaDetalhesTutor(Tutor tutor) {
		telaDetalhesTutor = new TelaDetalhesTutor(this, tutor);
		telaDetalhesTutor.setVisible(true);
		
	}
	
    /** 
	 * Adiciona um tutor ao ArrayList de tutores.
	 * 
	 */
    public void adicionaTutor(String nome, String sobrenome, LocalDate dataNascimento, String endereco, int telefone, String email, String rg, String cpf) {
        //Cria uma nova instância da classe Tutor com os dados fornecidos.
        tutor = new Tutor(nome, sobrenome, dataNascimento, endereco, telefone, email, rg, cpf);

        tutores.add(tutor);
    }
    
	/**
	 * 
	 */
    public void removeTutor(Tutor tutor) {
    	tutores.remove(tutor);
    }
    
	/**
	 * 
	 */
    public ArrayList<Tutor> getTutores() {
    	return tutores;
    
    }
    
	/**
	 * 
	 */
    public void fillWithSomeData(int variavelAuxiliarTutor) {
    	if(this.variavelAuxiliarTutor == variavelAuxiliarTutor) {
    		adicionaTutor("Manoel", "Gomes", LocalDate.parse("1969-12-02"), "Balsas, Maranhão, Brasil", 987654321, "canetaazul@gmail.com", "3658241", "45937685923");
    		adicionaTutor("Ariana", "Grande", LocalDate.parse("1993-06-26"), "Boca Raton, Flórida, Estados Unidos da América", 923456789, "bigariana@gmail.com", "1240986", "87312504619");
    		adicionaTutor("Bruna", "Marquezine", LocalDate.parse("1995-08-04"), "Duque de Caxias, Rio de Janeiro, Brasil", 912345678, "namoradadoartur@gmail.com", "6753812", "69548270345");
    		adicionaTutor("Neymar", "Júnior", LocalDate.parse("1992-02-05"), "Mogi das Cruzes, São Paulo, Brasil", 987654321, "meninoney@gmail.com", "8492760", "29384560712");
    		adicionaTutor("Cauã", "Reymond", LocalDate.parse("1980-05-20"), "Rio de Janeiro, Rio de Janeiro, Brasil", 943210987, "artur@gmail.com", "5309418", "73469058102");
    		
    		
    		this.variavelAuxiliarTutor++;
    	}
    }
    
}