package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import model.*;
import view.*;

public class ControleVacina {
	Vacina vacina;
	TelaVacina telaVacina;
	TelaCadastroVacina telaCadastroVacina;
	TelaDetalhesVacina telaDetalhesVacina;
	private ArrayList<Vacina> vacinas;
	
	private ControlePet controlePet;
	int variavelAuxiliarVacina;
	
	//Construtor
	public ControleVacina() {
		super();
		vacinas = new ArrayList<Vacina>();
		variavelAuxiliarVacina = 0;
		
	}
	
	public void forneceControlePet(ControlePet controlePet) {
		this.controlePet = controlePet;
	}
	
	public void abreTelaVacina() {
		telaVacina = new TelaVacina(this, vacinas);
		telaVacina.setVisible(true);
		
	}
	
	public void abreTelaCadastroVacina() {
		telaCadastroVacina = new TelaCadastroVacina(this, vacinas);
		telaCadastroVacina.setVisible(true);
		
	}


	public void abreTelaDetalhesVacina(Vacina vacina) {
		telaDetalhesVacina = new TelaDetalhesVacina(this, vacina, controlePet);
		telaDetalhesVacina.setVisible(true);
		
	}

	
    //Adiciona uma vacina ao ArrayList de vacinas.
    public void adicionaVacina(String nome, String fabricante, LocalDate dataFabricacao, LocalDate dataValidade, String lote, boolean status, String medicoVeterinario, String crmv, String uf) {
        //Cria uma nova instância da classe Vacina com os dados fornecidos.
        vacina = new Vacina(nome, fabricante, dataFabricacao, dataValidade, lote, status, medicoVeterinario, crmv, uf);
        
        vacinas.add(vacina);
    }
    
    public void removeVacina(Vacina vacina) {
    	vacinas.remove(vacina);
    }
    
    public ArrayList<Vacina> getVacinas() {
    	return vacinas;
    }
    
    public void alteraStatusVacina(Vacina vacina, Boolean status) {
    	vacina.setStatus(status);
    }
    
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
    
    // método para exibir os pets de um tutor
/*    public ArrayList<Pet> exibirPets(Tutor tutor) {
        return tutor.mostraPets();
    }
*/
}