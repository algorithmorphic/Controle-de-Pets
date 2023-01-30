package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControlePet;

public class TelaBuscaNomePet extends JFrame {
	private JPanel painelTitulo;
	private JLabel labelTitulo1;
	private JLabel labelTitulo2;
	private JTextField campoTextoNome;
	private JButton botaoBuscar;
	
	private ControlePet controlePet;
	
	public TelaBuscaNomePet(ControlePet controlePet) {
		super("Busca por Animal de Estimação");
		
		this.controlePet = controlePet;
		
    	//Define o layout da tela.
    	setLayout(new BorderLayout());
    	
    	//Define o tamanho, a localização e a operação padrão de fechar a tela.
    	setSize(300, 135);
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        painelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        labelTitulo1 = new JLabel("Insira o nome do");
        labelTitulo2 = new JLabel("animal de estimação: ");
        
        labelTitulo1.setFont(FontesMiniProjeto.fontePadrao);
        painelTitulo.add(labelTitulo1);
        
        labelTitulo2.setFont(FontesMiniProjeto.fontePadrao);
        painelTitulo.add(labelTitulo2);
        
        add(painelTitulo);
        
        JPanel painel = new JPanel();
        //painel.setLayout(new GridLayout(2, 2));
        //painel.setLayout(new BoxLayout(painel, BoxLayout.X_AXIS));
        add(painel, BorderLayout.SOUTH);
        
        campoTextoNome = new JTextField();
        campoTextoNome.setBackground(Color.WHITE);
        campoTextoNome.setEditable(true);
        
        botaoBuscar = new JButton("Buscar");
		botaoBuscar.setForeground(Color.BLACK);
		botaoBuscar.setBackground(Color.WHITE);
		botaoBuscar.setFont(FontesMiniProjeto.fontePadrao);
        
        campoTextoNome.setPreferredSize(new Dimension(100, 30));
        botaoBuscar.setPreferredSize(new Dimension(100, 30));
        
        painel.add(campoTextoNome);
        painel.add(botaoBuscar);
        
		setVisible(true);
        
		//Adiciona uma ação ao botão.
		botaoBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlePet.setNomeBuscado(campoTextoNome.getText());
				controlePet.abreTelaBuscaPet();
				
				dispose();
			}
			
		});

	}

}