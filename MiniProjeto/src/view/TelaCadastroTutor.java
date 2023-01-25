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

import controller.ControleTutor;
import model.Tutor;

import java.time.LocalDate;
import java.util.ArrayList;

public class TelaCadastroTutor extends JFrame {
	private ControleTutor controleTutor;
	private ArrayList<Tutor> tutores;
	
    private JTextField campoTextoNome;
    private JTextField campoTextoSobrenome;
    private JTextField campoTextoDataNascimento;
    private JTextField campoTextoEndereco;
    private JTextField campoTextoTelefone;
    private JTextField campoTextoEmail;
    private JTextField campoTextoRg;
    private JTextField campoTextoCpf;

    private JButton botaoSalvar;
    private JButton botaoVoltar;

    public TelaCadastroTutor(ControleTutor controleTutor, ArrayList<Tutor> tutores) {
        super("Cadastro de Tutor");
        
        this.controleTutor = controleTutor;
        this.tutores = tutores;
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        JPanel painelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelTitulo = new JLabel("Cadastro de Tutor: ");
        labelTitulo.setFont(FontesMiniProjeto.fontePadrao);
        painelTitulo.add(labelTitulo);
        add(painelTitulo, BorderLayout.NORTH);

        JPanel painel = new JPanel();
        //painel.setBackground(null);
        painel.setLayout(new GridLayout(8, 2));

        // Campos de texto para preencher as informações do tutor
        campoTextoNome = new JTextField();
        JLabel textoNome = new JLabel("    Nome:");
        textoNome.setForeground(Color.BLACK);
        textoNome.setBackground(Color.WHITE);
        textoNome.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoNome);
        painel.add(campoTextoNome);

        campoTextoSobrenome = new JTextField();
        JLabel textoSobrenome = new JLabel("    Sobrenome:");
        textoSobrenome.setForeground(Color.BLACK);
        textoSobrenome.setBackground(Color.WHITE);
        textoSobrenome.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoSobrenome);
        painel.add(campoTextoSobrenome);

        campoTextoDataNascimento = new JTextField();
        JLabel textoDataNascimento = new JLabel("    Data de Nascimento:");
        textoDataNascimento.setForeground(Color.BLACK);
        textoDataNascimento.setBackground(Color.WHITE);
        textoDataNascimento.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoDataNascimento);
        painel.add(campoTextoDataNascimento);

        campoTextoEndereco = new JTextField();
        JLabel textoEndereco = new JLabel("    Endereço:");
        textoEndereco.setForeground(Color.BLACK);
        textoEndereco.setBackground(Color.WHITE);
        textoEndereco.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoEndereco);
        painel.add(campoTextoEndereco);

        campoTextoTelefone = new JTextField();
        JLabel textoTelefone = new JLabel("    Telefone:");
        textoTelefone.setForeground(Color.BLACK);
        textoTelefone.setBackground(Color.WHITE);
        textoTelefone.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoTelefone);
        painel.add(campoTextoTelefone);

        campoTextoEmail = new JTextField();
        JLabel textoEmail = new JLabel("    E-mail:");
        textoEmail.setForeground(Color.BLACK);
        textoEmail.setBackground(Color.WHITE);
        textoEmail.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoEmail);
        painel.add(campoTextoEmail);

        campoTextoRg = new JTextField();
        JLabel textoRg = new JLabel("    RG:");
        textoRg.setForeground(Color.BLACK);
        textoRg.setBackground(Color.WHITE);
        textoRg.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoRg);
        painel.add(campoTextoRg);

        campoTextoCpf = new JTextField();
        JLabel textoCpf = new JLabel("    CPF:");
        textoCpf.setForeground(Color.BLACK);
        textoCpf.setBackground(Color.WHITE);
        textoCpf.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoCpf);
        painel.add(campoTextoCpf);

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
                // Cria um novo objeto Tutor com as informações preenchidas
                // e adiciona à lista de tutores no controle
            	//ControleTutor controleTutor = new ControleTutor();
                controleTutor.adicionaTutor(campoTextoNome.getText(), campoTextoSobrenome.getText(), LocalDate.parse(campoTextoDataNascimento.getText()), campoTextoEndereco.getText(), Integer.parseInt(campoTextoTelefone.getText()), campoTextoEmail.getText(), campoTextoRg.getText(), campoTextoCpf.getText());
                //tutores = controleTutor.getTutores();
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