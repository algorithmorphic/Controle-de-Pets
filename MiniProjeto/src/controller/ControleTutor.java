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
	 * Construtor da classe.
	 * Instancia uma lista de de tutores.
	 * Utiliza o recurso de uma variável auxiliar para controle de dados.
	 */
	public ControleTutor() {
		super();
		tutores = new ArrayList<Tutor>();
		
		variavelAuxiliarTutor = 0;
		
	}
	
	/**
	 * Abre a tela responsável pelo CRUD de um proprietário de um animal de estimação (tutor).
	 */
	public void abreTelaTutor() {
		telaTutor = new TelaTutor(this, tutores);
		telaTutor.setVisible(true);
		
	}
	
	/**
	 * Abre uma tela na qual é possível realizar o cadastro de um tutor.
	 */
	public void abreTelaCadastroTutor() {
		telaCadastroTutor = new TelaCadastroTutor(this, tutores);
		telaCadastroTutor.setVisible(true);
		
	}

	/**
	 * Abre uma tela que fornece os detalhes editáveis de um tutor.
	 * @param tutor o tutor selecionado.
	 */
	public void abreTelaDetalhesTutor(Tutor tutor) {
		telaDetalhesTutor = new TelaDetalhesTutor(this, tutor);
		telaDetalhesTutor.setVisible(true);
		
	}
	
    /** 
	 * Cria e adiciona um tutor a uma lista de tutores.
	 * @param nome o nome do tutor.
	 * @param sobrenome o sobrenome do tutor.
	 * @param dataNascimento a data de nascimento do tutor.
	 * @param endereco o endereço do tutor.
	 * @param telefone o telefone do tutor.
	 * @param email o e-mail do tutor.
	 * @param rg o RG do tutor.
	 * @param cpf o CPF do tutor.
	 */
    public void adicionaTutor(String nome, String sobrenome, LocalDate dataNascimento, String endereco, int telefone, String email, String rg, String cpf) {
        //Cria uma nova instância da classe Tutor com os dados fornecidos.
        tutor = new Tutor(nome, sobrenome, dataNascimento, endereco, telefone, email, rg, cpf);

        tutores.add(tutor);
    }
    
	/**
	 * Remove um tutor específico da lista de tutores.
	 * @param tutor o tutor selecionado.
	 */
    public void removeTutor(Tutor tutor) {
    	tutores.remove(tutor);
    }
    
	/**
	 * Obtém a lista de tutores.
	 * @return tutores a lista de tutores.
	 */
    public ArrayList<Tutor> getTutores() {
    	return tutores;
    
    }
    
	/**
	 * Realiza o pré-cadastro de dados de alguns tutores.
	 * @param variavelAuxiliar uma variável utilizada para verificar se o pré-cadastro já foi ou não realizado.
	 * Caso a variável auxiliar contenha o valor "0", significa que o pré-cadastro não foi realizado. Caso contrário, significa que o pré-cadastro foi realizado. 
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