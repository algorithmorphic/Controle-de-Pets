package view;

import java.awt.BorderLayout;
import java.awt.Color;
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
	private JLabel labelTitulo;
	private JTextField campoTextoNome;
	private JButton botaoBuscar;
	
	private ControlePet controlePet;
	
	public TelaBuscaNomePet(ControlePet controlePet) {
		super("blá");
		
		this.controlePet = controlePet;
		
    	//Define o layout da tela.
    	setLayout(new BorderLayout());
    	
    	//Define o tamanho, a localização e a operação padrão de fechar a tela.
    	setSize(300, 200);
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        JPanel painelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JLabel labelTitulo = new JLabel("Insira o nome do animal de estimação: ");
        
        labelTitulo.setFont(FontesMiniProjeto.fontePadrao);
        painelTitulo.add(labelTitulo);
        add(painelTitulo, BorderLayout.NORTH);
        
        campoTextoNome = new JTextField();
        campoTextoNome.setBackground(Color.WHITE);
        campoTextoNome.setEditable(true);
        
        botaoBuscar = new JButton("Buscar");
		botaoBuscar.setForeground(Color.BLACK);
		botaoBuscar.setBackground(Color.WHITE);
		botaoBuscar.setFont(FontesMiniProjeto.fontePadrao);
        
        campoTextoNome.setBounds(35, 130, 315, 30);
        botaoBuscar.setBounds(35, 180, 315, 30);
        
        add(campoTextoNome);
        add(botaoBuscar);
        
		setVisible(true);
        
		//Adiciona uma ação ao botão.
		botaoBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlePet.setNomeBuscado(campoTextoNome.getText());
				
				dispose();
			}
			
		});

	}

}