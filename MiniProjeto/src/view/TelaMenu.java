package view;

import model.*;
import javax.swing.*;

import controller.ControlePet;
import controller.ControleTutor;

import java.awt.*;
import java.awt.event.*;

public class TelaMenu {
	JFrame telaMenu = new JFrame("Controle de Animais de Estimação");
	JButton botaoTutor = new JButton("Tutor");
	JButton botaoPet = new JButton("Animal de Estimação");
	JButton botaoCartao = new JButton("Cartão de Vacinação e Vermifugação");
	JButton botaoMedicamento = new JButton("Medicamento");
	
	ControleTutor controleTutor;
	ControlePet controlePet;
	
	//Construtor
	public TelaMenu() {
		//Instancia os construtores dos controladores.
		controleTutor = new ControleTutor();
		controlePet = new ControlePet();
		
		
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
		
		botaoMedicamento.setBounds(35, 180, 315, 30);
		botaoMedicamento.setForeground(Color.BLACK);
		botaoMedicamento.setBackground(Color.WHITE);
		botaoMedicamento.setFont(FontesMiniProjeto.fontePadrao);
		
		//Adiciona botões à tela.
		telaMenu.add(botaoTutor);
		telaMenu.add(botaoPet);
		telaMenu.add(botaoCartao);
		telaMenu.add(botaoMedicamento);
		
		//Define o layout de tela.
		telaMenu.setLayout(null);
		
		//Define o tamanho, a localização e a operação padrão de fechar a tela.
		telaMenu.setSize(400, 300);
		telaMenu.setLocationRelativeTo(null);
		telaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Torna telaMenu visível.
		telaMenu.setVisible(true);
		
		
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
		
	}

	//Main
	public static void main(String[] args) {
		TelaMenu telaMenu = new TelaMenu();

	}

}