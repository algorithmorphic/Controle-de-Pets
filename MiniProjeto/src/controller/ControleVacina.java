package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import model.*;
import view.*;

/**
 * Classe que controla as operações relacionadas às vacinas.
 * Controla as operações relacionadas às vacinas, como adicionar, remover,
 * exibir detalhes e alterar status.
 * @author Artur Ricardo
 * @since 2023
 * @version 1.0
 */
public class ControleVacina {
	Vacina vacina;
	TelaVacina telaVacina;
	TelaCadastroVacina telaCadastroVacina;
	TelaDetalhesVacina telaDetalhesVacina;
	private ArrayList<Vacina> vacinas;
	
	private ControlePet controlePet;
	int variavelAuxiliarVacina;
	
   /**
	* Construtor da classe.
	* Inicializa o ArrayList de vacinas e a variável auxiliar.
	*/
	public ControleVacina() {
		super();
		vacinas = new ArrayList<Vacina>();
		variavelAuxiliarVacina = 0;
		
	}
	
   /**
	* Fornece o controlador de pets para a classe.
	* @param controlePet controlador de pets.
	*/
	public void forneceControlePet(ControlePet controlePet) {
		this.controlePet = controlePet;
	
	}
	
	/**
	 * Abre a tela responsável pelo CRUD de vacinas.
	 */
	public void abreTelaVacina() {
		telaVacina = new TelaVacina(this, vacinas);
		telaVacina.setVisible(true);
		
	}
	
	/**
	 * Abre uma tela na qual é possível realizar o cadastro de uma vacina.
	 */
	public void abreTelaCadastroVacina() {
		telaCadastroVacina = new TelaCadastroVacina(this, vacinas);
		telaCadastroVacina.setVisible(true);
		
	}

    /**
	 * Abre a tela com os detalhes dos dados de uma determinada vacina.
	 * @param vacina vacina selecionada.
	 */
	public void abreTelaDetalhesVacina(Vacina vacina) {
		telaDetalhesVacina = new TelaDetalhesVacina(this, vacina, controlePet);
		telaDetalhesVacina.setVisible(true);
		
	}

	
    /**
	 * Adiciona uma vacina ao ArrayList de vacinas.
	 * @param nome nome da vacina.
	 * @param fabricante fabricante da vacina.
   	 * @param dataFabricacao data de fabricação da vacina.
	 * @param dataValidade data de validade da vacina.
	 * @param lote lote da vacina.
	 * @param status status da vacina.
	 * @param medicoVeterinario médico veterinário responsável pela vacina.
	 * @param crmv CRMV do médico veterinário.
	 * @param uf UF do CRMV do médico veterinário.
	 */ 
    public void adicionaVacina(String nome, String fabricante, LocalDate dataFabricacao, LocalDate dataValidade, String lote, boolean status, String medicoVeterinario, String crmv, String uf) {
        //Cria uma nova instância da classe Vacina com os dados fornecidos.
        vacina = new Vacina(nome, fabricante, dataFabricacao, dataValidade, lote, status, medicoVeterinario, crmv, uf);
        
        vacinas.add(vacina);
    
    }
    
	/**
	 * Remove uma vacina específica da lista de vacinas.
	 * @param vacina vacina selecionada.
	 */
    public void removeVacina(Vacina vacina) {
    	vacinas.remove(vacina);
    
    }
    
	/**
	 * Obtém a lista de vacinas.
	 * @return vacinas lista de vacinas.
	 */
    public ArrayList<Vacina> getVacinas() {
    	return vacinas;
    
    }
    
	/**
	 * Altera o status atual da vacina para um status específico.
	 * @param vacina a vacina selecionada.
	 * @param status o status escolhido.
	 */
    public void alteraStatusVacina(Vacina vacina, Boolean status) {
    	vacina.setStatus(status);
    
    }
    
	/**
	 * Pré-cadastra os dados de algumas vacinas.
	 */
    public void fillWithSomeData(int variavelAuxiliarVacina) {
    	if(this.variavelAuxiliarVacina == variavelAuxiliarVacina) {
    		adicionaVacina("V8", "Lema-Injex Biologic", LocalDate.parse("2021-03-03"), LocalDate.parse("2023-03-03"), "000000", true, "Fulano Sobrenome Aleatório", "567890123456789", "1234567");
    		adicionaVacina("V3", "Labovet Produtos Veterinários", LocalDate.parse("2020-07-03"), LocalDate.parse("2022-07-03"), "111111", true, "Beltrana Sobrenome Aleatório", "567890123456789", "1234567");
    		adicionaVacina("Giardíase", "Lema-Injex Biologic", LocalDate.parse("2020-12-29"), LocalDate.parse("2022-12-29"), "222222", true, "Cicrana Sobrenome Aleatório", "567890123456789", "1234567");
    		adicionaVacina("Antirrábica", "Lema-Injex Biologic", LocalDate.parse("2021-05-08"), LocalDate.parse("2023-05-08"), "333333", true, "Beltrano Sobrenome Aleatório", "567890123456789", "1234567");
    		adicionaVacina("V10", "Lema-Injex Biologic", LocalDate.parse("2020-11-26"), LocalDate.parse("2022-11-26"), "444444", true, "Fulana Sobrenome Aleatório", "567890123456789", "1234567");
    		adicionaVacina("Gripe canina", "Lema-Injex Biologic", LocalDate.parse("2021-08-27"), LocalDate.parse("2023-08-27"), "555555", true, "Cicrano Sobrenome Aleatório", "567890123456789", "1234567");
    		adicionaVacina("Reforço da V8", "Lema-Injex Biologic", LocalDate.parse("2021-03-03"), LocalDate.parse("2023-03-03"), "666666", true, "Fulano Sobrenome Aleatório", "567890123456789", "1234567");
    		adicionaVacina("V5", "Labovet Produtos Veterinários", LocalDate.parse("2021-12-07"), LocalDate.parse("2023-12-07"), "777777", true, "Beltrana Sobrenome Aleatório", "567890123456789", "1234567");
    		adicionaVacina("V4", "Labovet Produtos Veterinários", LocalDate.parse("2021-09-12"), LocalDate.parse("2023-09-12"), "888888", true, "Fulana Sobrenome Aleatório", "567890123456789", "1234567");
    		adicionaVacina("Reforço da V5", "Labovet Produtos Veterinários", LocalDate.parse("2021-12-07"), LocalDate.parse("2023-12-07"), "999999", true, "Beltrano Sobrenome Aleatório", "567890123456789", "1234567");
    		adicionaVacina("Reforço da V10", "Lema-Injex Biologic", LocalDate.parse("2020-11-26"), LocalDate.parse("2022-11-26"), "123456", true, "Cicrana Sobrenome Aleatório", "567890123456789", "1234567");
    		
    		this.variavelAuxiliarVacina++;
    		
    	}
    	
    }
    
}