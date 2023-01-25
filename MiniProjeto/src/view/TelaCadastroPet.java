package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControlePet;
import model.Pet;

import java.time.LocalDate;
import java.util.ArrayList;

public class TelaCadastroPet extends JFrame {
	private ControlePet controlePet;
	private ArrayList<Pet> pets;
	
    private JTextField campoTextoNome;
    private JTextField campoTextoEspecie;
    private JTextField campoTextoRaca;
    private JTextField campoTextoSexo;
    private JTextField campoTextoCor;
    private JTextField campoTextoDataNascimento;
    private JTextField campoTextoMicrochip;
    private JTextField campoTextoRga;

    private JButton botaoSalvar;
    private JButton botaoVoltar;

    //Construtor
    public TelaCadastroPet(ControlePet controlePet, ArrayList<Pet> pets) {
        super("Cadastro de Animal de Estimação");
        
        this.controlePet = controlePet;
        this.pets = pets;
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        JPanel painelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelTitulo = new JLabel("Cadastro de Animal de Estimação: ");
        labelTitulo.setFont(FontesMiniProjeto.fontePadrao);
        painelTitulo.add(labelTitulo);
        add(painelTitulo, BorderLayout.NORTH);

        JPanel painel = new JPanel();

        painel.setLayout(new GridLayout(8, 2));

        //Campos de texto para preencher as informações do pet.
        campoTextoNome = new JTextField();
        JLabel textoNome = new JLabel("    Nome:");
        textoNome.setForeground(Color.BLACK);
        textoNome.setBackground(Color.WHITE);
        textoNome.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoNome);
        painel.add(campoTextoNome);

        campoTextoEspecie = new JTextField();
        JLabel textoEspecie = new JLabel("    Espécie:");
        textoEspecie.setForeground(Color.BLACK);
        textoEspecie.setBackground(Color.WHITE);
        textoEspecie.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoEspecie);
        painel.add(campoTextoEspecie);

        campoTextoRaca = new JTextField();
        JLabel textoRaca = new JLabel("    Raça:");
        textoRaca.setForeground(Color.BLACK);
        textoRaca.setBackground(Color.WHITE);
        textoRaca.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoRaca);
        painel.add(campoTextoRaca);

        campoTextoSexo = new JTextField();
        JLabel textoSexo = new JLabel("    Sexo:");
        textoSexo.setForeground(Color.BLACK);
        textoSexo.setBackground(Color.WHITE);
        textoSexo.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoSexo);
        painel.add(campoTextoSexo);

        campoTextoCor = new JTextField();
        JLabel textoCor = new JLabel("    Cor/Pelagem:");
        textoCor.setForeground(Color.BLACK);
        textoCor.setBackground(Color.WHITE);
        textoCor.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoCor);
        painel.add(campoTextoCor);

        campoTextoDataNascimento = new JTextField();
        JLabel textoDataNascimento = new JLabel("    Data de Nascimento:");
        textoDataNascimento.setForeground(Color.BLACK);
        textoDataNascimento.setBackground(Color.WHITE);
        textoDataNascimento.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoDataNascimento);
        painel.add(campoTextoDataNascimento);

        campoTextoMicrochip = new JTextField();
        JLabel textoMicrochip = new JLabel("    Microchip:");
        textoMicrochip.setForeground(Color.BLACK);
        textoMicrochip.setBackground(Color.WHITE);
        textoMicrochip.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoMicrochip);
        painel.add(campoTextoMicrochip);

        campoTextoRga = new JTextField();
        JLabel textoRga = new JLabel("    RGA:");
        textoRga.setForeground(Color.BLACK);
        textoRga.setBackground(Color.WHITE);
        textoRga.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoRga);
        painel.add(campoTextoRga);

        // Botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new BoxLayout(painelBotoes, BoxLayout.X_AXIS));
        
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setForeground(Color.BLACK);
        botaoSalvar.setBackground(Color.WHITE);
        botaoSalvar.setFont(FontesMiniProjeto.fontePadrao);
        botaoSalvar.setPreferredSize(new Dimension(200, 50));
        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cria um novo objeto Pet com as informações preenchidas
                // e adiciona à lista de pets no controle
                controlePet.adicionaPet(campoTextoNome.getText(), campoTextoEspecie.getText(), campoTextoRaca.getText(), campoTextoSexo.getText(), campoTextoCor.getText(), LocalDate.parse(campoTextoDataNascimento.getText()), campoTextoMicrochip.getText(), campoTextoRga.getText());
                
                // Fecha a tela de cadastro
                dispose();
            }
        });
        //painel.add(botaoSalvar);
        painelBotoes.add(botaoSalvar);

        botaoVoltar = new JButton("Voltar");
        botaoVoltar.setForeground(Color.BLACK);
        botaoVoltar.setBackground(Color.WHITE);
        botaoVoltar.setFont(FontesMiniProjeto.fontePadrao);
        botaoVoltar.setPreferredSize(new Dimension(200, 50));
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fecha a tela de cadastro
                dispose();
            }
        });
        //painel.add(botaoVoltar);
        painelBotoes.add(botaoVoltar);
        
        painelBotoes.add(Box.createHorizontalGlue());
        add(painelBotoes, BorderLayout.SOUTH);
        
        // Adiciona o painel à tela
        add(painel);

    }
    
}