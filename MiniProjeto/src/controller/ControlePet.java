package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import model.*;
import view.*;

/**
 * Classe que controla as operações relacionadas aos animais de estimação (pets).
 * @author Artur Ricardo
 * @since 2023
 * @version 1.0
 */
public class ControlePet {
	private Pet pet;
	private ArrayList<Pet> pets;
	private TelaPet telaPet;
	private TelaCadastroPet telaCadastroPet;
	private TelaBuscaPet telaBuscaPet;
	private TelaBuscaNomePet telaBuscaNomePet;
	private TelaDetalhesPet telaDetalhesPet;
	private TelaListaVacinasPet telaListaVacinasPet;
	
	private ControleVacina controleVacina;
	private Vacina vacina;
	private ArrayList<Vacina> vacinas;
	
	private int variavelAuxiliarPet;
	private String nomeBuscado;
	
	/**
	 * Construtor da classe. Inicializa o ArrayList de pets e vacinas.
	 * @param controleVacina objeto da classe ControleVacina.
	 */
	public ControlePet(ControleVacina controleVacina) {
		super();
		pets = new ArrayList<Pet>();
		
		this.controleVacina = controleVacina;
		vacinas = new ArrayList<Vacina>();
		
		variavelAuxiliarPet = 0;
		
	}
	
	/**
	 * Retorna o nome do animal de estimação que foi pesquisado pelo usuário.
	 * @return nomeBuscado nome do animal de estimação a ser buscado.
	 */
	public String getNomeBuscado() {
		return nomeBuscado;
	}

	/**
	 * Salva o nome do animal de estimação que foi pesquisado pelo usuário.
	 * @param nomeBuscado nome do animal de estimação a ser buscado.
	 */
	public void setNomeBuscado(String nomeBuscado) {
		this.nomeBuscado = nomeBuscado;
	}
	
	/**
	 * Abre a tela onde será possível realizar o CRUD dos animais de estimação.
	 */
	public void abreTelaPet() {
		telaPet = new TelaPet(this, pets);
		telaPet.setVisible(true);
		
	}
	
	/**
	 * Abre a tela onde será possível realizar o cadastro de um animal de estimação.
	 */
	public void abreTelaCadastroPet() {
		telaCadastroPet = new TelaCadastroPet(this, pets);
		telaCadastroPet.setVisible(true);
	
	}
	
	/**
	 * Abre a tela onde será possível realizar a busca por um animal de estimação específico.
	 */
	public void abreTelaBuscaPet() {
		telaBuscaPet = new TelaBuscaPet(this, pets);
		telaBuscaPet.setVisible(true);
	}
	
	
	/**
	 * Abre a tela onde será possível inserir um nome a fim de buscar um animal de estimação específico cadastrado com o nome que será fornecido.
	 */
	public void abreTelaBuscaNomePet() {
		telaBuscaNomePet = new TelaBuscaNomePet(this);
		telaBuscaNomePet.setVisible(true);
	}

	/**
	 * Abre uma tela com os detalhes do animal de estimação, sendo possível, inclusive, alterá-los.
	 * @param pet o animal de estimação escolhido.
	 */
	public void abreTelaDetalhesPet(Pet pet) {
		telaDetalhesPet = new TelaDetalhesPet(this, pet);
		telaDetalhesPet.setVisible(true);
		
	}
	
	/**
	 * Abre uma tela contendo a listagem de vacinas recebidas por um determinado animal de estimação.
	 * @param pet o animal de estimação escolhido.
	 */
	public void abreTelaListaVacinasPet(Pet pet) {
		telaListaVacinasPet = new TelaListaVacinasPet(this, vacinas, controleVacina);
		telaListaVacinasPet.setVisible(true);
	}
	
	/**
	 * Cria e adiciona um animal de estimação (pet) à lista de animais de estimação (pets).
	 * @param nome o nome do animal de estimação.
	 * @param especie a espécie do animal de estimação.
	 * @param raca a raça do animal de estimação.
	 * @param sexo o sexo do animal de estimação.
	 * @param cor a cor/pelagem do animal de estimação.
	 * @param dataNascimento a data de nascimento do animal de estimação.
	 * @param microchip o número/código do microchip do animal de estimação.
	 * @param rga o Registro Geral do Animal do animal de estimação.
	 */
    public void adicionaPet(String nome, String especie, String raca, String sexo, String cor, LocalDate dataNascimento, String microchip, String rga) {
        //Cria uma nova instância da classe Pet com os dados fornecidos.
        pet = new Pet(nome, especie, raca, sexo, cor, dataNascimento, microchip, rga);
        
        pets.add(pet);
    }
    
    /**
	 * Remove um animal de estimação (pet) da lista de animais de estimação (pets).
	 * @param pet o animal de estimação escolhido.
	 */
    public void removePet(Pet pet) {
    	pets.remove(pet);
    }
    
    /**
	 * Fornece a lista dos animais de estimação (pets).
	 * @return pets lista de animais de estimação (pets).
	 */
    public ArrayList<Pet> getPets() {
    	return pets;
    }
    
    /**
	 * Adiciona uma vacina a uma lista de vacinas vinculada a um determinado animal de estimação.
	 * @param vacina objeto de tipo Vacina a ser adicionado à lista de vacinas.
	 */
    public void adicionaVacinaPet(Vacina vacina) {
    	this.vacina = vacina;
    	
    	vacinas.add(vacina);
    	
    }
    
    /**
	 * Cria e adiciona uma vacina a uma lista de vacinas vinculada a um determinado animal de estimação.
	 * @param tipo tipo de vacina. 
	 * @param fabricante nome do(a) fabricante da vacina.
	 * @param dataFabricacao data de fabricação da vacina.
	 * @param dataValidade data de validade da vacina.
	 * @param lote número/código do lote de produção da vacina.
	 * @param status status de utilização da vacina.
	 * @param medicoVeterinario nome do Médico Veterinário.
	 * @param crmv número vinculado ao Conselho Regional de Medicina Veterinária.
	 * @param uf Unidade Federativa.
	 */
    public void adicionaVacinaPet(String tipo, String fabricante, LocalDate dataFabricacao, LocalDate dataValidade, String lote, boolean status, String medicoVeterinario, String crmv, String uf) {
    	vacina = new Vacina(tipo, fabricante, dataFabricacao, dataValidade, lote, status, medicoVeterinario, crmv, uf);
    	
    	vacinas.add(vacina);
    	
    }
    
	/**
	 * Remove uma vacina específica da lista de vacinas de um animal de estimação específico.
	 * @param vacina um objeto do tipo Vacina.
	 */
    public void removeVacinaPet(Vacina vacina) {
    	vacinas.remove(vacina);
    	
    }
    
	/**
	 * Obtém a lista de vacinas.
	 * @return uma lista de vacinas.
	 */
    public ArrayList<Vacina> getVacinas() {
    	return vacinas;
    }
    
    /**
	 * Pré-cadastro de dados de alguns animais de estimação.
	 * @param variavelAuxiliarPet variável utilizada para verificar se o pré-cadastro já foi ou não realizado, a fim de evitar que os dados sejam cadastrados novamente no sistema.
	 * Se variavelAuxiliar for igual a 0, significa que ainda não houve um pré-cadastro de dados de animais de estimação. Caso contrário, significa que o pré-cadastro foi realizado.
	 */
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
    
}