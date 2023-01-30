package view;

import javax.swing.*;

import controller.ControlePet;
import controller.ControleTutor;
import controller.ControleVacina;

import java.awt.*;
import java.awt.event.*;


/**
 * Classe TelaMenu é responsável por exibir a tela principal do sistema, onde o usuário pode escolher as opções de Tutor, Animal de Estimação, Cartão de Vacinação e Vermifugação e Vacina.
 *A classe instancia os controladores ControleTutor, ControlePet e ControleVacina, e os inicializa com pré-cadastro de dados.
 *Também define as configurações e posições dos botões na tela, adiciona ações aos botões e define a aparência da tela.
 *@author Artur Ricardo
 * @since 2023
 * @version 1.0
 */
public class TelaMenu {
	JFrame telaMenu = new JFrame("Controle de Animais de Estimação");
	JButton botaoTutor = new JButton("Tutor");
	JButton botaoPet = new JButton("Animal de Estimação");
	JButton botaoCartao = new JButton("Cartão de Vacinação e Vermifugação");
	JButton botaoVacina = new JButton("Vacina");
	
	ControleTutor controleTutor;
	ControlePet controlePet;
	ControleVacina controleVacina;
	
	int variavelAuxiliarTutor;
	int variavelAuxiliarPet;
	int variavelAuxiliarVacina;
	
	//Construtor
	public TelaMenu() {
		//Instancia os construtores dos controladores.
		controleTutor = new ControleTutor();
		controleVacina = new ControleVacina();
		controlePet = new ControlePet(controleVacina);
		
		controleVacina.forneceControlePet(controlePet);
		
		//Configura posição, aparência e fonte dos botões.
		botaoTutor.setBounds(35, 30, 315, 30);
		botaoTutor.setForeground(Color.BLACK);
		botaoTutor.setBackground(Color.WHITE);
		botaoTutor.setFont(FontesMiniProjeto.fontePadrao);
		
		botaoPet.setBounds(35, 80, 315, 30);
		botaoPet.setForeground(Color.BLACK);
		botaoPet.setBackground(Color.WHITE);
		botaoPet.setFont(FontesMiniProjeto.fontePadrao);
		
		botaoCartao.setBounds(35, 130, 315, 30);
		botaoCartao.setForeground(Color.BLACK);
		botaoCartao.setBackground(Color.WHITE);
		botaoCartao.setFont(FontesMiniProjeto.fontePadrao);
		
		botaoVacina.setBounds(35, 180, 315, 30);
		botaoVacina.setForeground(Color.BLACK);
		botaoVacina.setBackground(Color.WHITE);
		botaoVacina.setFont(FontesMiniProjeto.fontePadrao);
		
		//Adiciona botões à tela.
		telaMenu.add(botaoTutor);
		telaMenu.add(botaoPet);
		telaMenu.add(botaoCartao);
		telaMenu.add(botaoVacina);
		
		//Define o layout de tela.
		telaMenu.setLayout(null);
		
		//Define o tamanho, a localização e a operação padrão de fechar a tela.
		telaMenu.setSize(400, 300);
		telaMenu.setLocationRelativeTo(null);
		telaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Torna telaMenu visível.
		telaMenu.setVisible(true);
		
		//Pré-Cadastro de dados.
		variavelAuxiliarTutor = 0;
		variavelAuxiliarPet = 0;
		variavelAuxiliarVacina = 0;
		
		controleTutor.fillWithSomeData(variavelAuxiliarTutor);
		controlePet.fillWithSomeData(variavelAuxiliarPet);
		controleVacina.fillWithSomeData(variavelAuxiliarVacina);
		
		
		//Adiciona uma ação aos botões.
		botaoTutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleTutor.abreTelaTutor();
			}
		});
		
		botaoPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlePet.abreTelaPet();
			}
		});
		
		botaoVacina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleVacina.abreTelaVacina();
			}
		});
		
	}

	//Main
	public static void main(String[] args) {
		TelaMenu telaMenu = new TelaMenu();

	}

}