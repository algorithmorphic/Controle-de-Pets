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

import controller.ControleVacina;
import model.Vacina;

import java.time.LocalDate;
import java.util.ArrayList;

public class TelaCadastroVacina extends JFrame {
	private ControleVacina controleVacina;
	private ArrayList<Vacina> vacinas;
	
    private JTextField campoTextoTipo;
    private JTextField campoTextoFabricante;
    private JTextField campoTextoDataFabricacao;
    private JTextField campoTextoDataValidade;
    private JTextField campoTextoLote;
    private JTextField campoTextoStatus;
    private JTextField campoTextoMedicoVeterinario;
    private JTextField campoTextoCrmv;
    private JTextField campoTextoUf;

    private JButton botaoSalvar;
    private JButton botaoVoltar;

    //Construtor
    public TelaCadastroVacina(ControleVacina controleVacina, ArrayList<Vacina> vacinas) {
        super("Cadastro de Vacina");
        
        this.controleVacina = controleVacina;
        this.vacinas = vacinas;
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        JPanel painelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelTitulo = new JLabel("Cadastro de Vacina: ");
        labelTitulo.setFont(FontesMiniProjeto.fontePadrao);
        painelTitulo.add(labelTitulo);
        add(painelTitulo, BorderLayout.NORTH);

        JPanel painel = new JPanel();

        painel.setLayout(new GridLayout(9, 2));

        //Campos de texto para preencher as informações da vacina.
        campoTextoTipo = new JTextField();
        JLabel textoTipo = new JLabel("    Tipo:");
        textoTipo.setForeground(Color.BLACK);
        textoTipo.setBackground(Color.WHITE);
        textoTipo.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoTipo);
        painel.add(campoTextoTipo);

        campoTextoFabricante = new JTextField();
        JLabel textoFabricante = new JLabel("    Fabricante:");
        textoFabricante.setForeground(Color.BLACK);
        textoFabricante.setBackground(Color.WHITE);
        textoFabricante.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoFabricante);
        painel.add(campoTextoFabricante);

        campoTextoDataFabricacao = new JTextField();
        JLabel textoDataFabricacao = new JLabel("    Data de Fabricação:");
        textoDataFabricacao.setForeground(Color.BLACK);
        textoDataFabricacao.setBackground(Color.WHITE);
        textoDataFabricacao.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoDataFabricacao);
        painel.add(campoTextoDataFabricacao);

        campoTextoDataValidade = new JTextField();
        JLabel textoDataValidade = new JLabel("    Data de Validade:");
        textoDataValidade.setForeground(Color.BLACK);
        textoDataValidade.setBackground(Color.WHITE);
        textoDataValidade.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoDataValidade);
        painel.add(campoTextoDataValidade);

        campoTextoLote = new JTextField();
        JLabel textoLote = new JLabel("    Lote:");
        textoLote.setForeground(Color.BLACK);
        textoLote.setBackground(Color.WHITE);
        textoLote.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoLote);
        painel.add(campoTextoLote);

        campoTextoStatus = new JTextField();
        JLabel textoStatus = new JLabel("    Status:");
        textoStatus.setForeground(Color.BLACK);
        textoStatus.setBackground(Color.WHITE);
        textoStatus.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoStatus);
        painel.add(campoTextoStatus);

        campoTextoMedicoVeterinario = new JTextField();
        JLabel textoMedicoVeterinario = new JLabel("    Médico Veterinário:");
        textoMedicoVeterinario.setForeground(Color.BLACK);
        textoMedicoVeterinario.setBackground(Color.WHITE);
        textoMedicoVeterinario.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoMedicoVeterinario);
        painel.add(campoTextoMedicoVeterinario);

        campoTextoCrmv = new JTextField();
        JLabel textoCrmv = new JLabel("    CRMV:");
        textoCrmv.setForeground(Color.BLACK);
        textoCrmv.setBackground(Color.WHITE);
        textoCrmv.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoCrmv);
        painel.add(campoTextoCrmv);
        
        campoTextoUf = new JTextField();
        JLabel textoUf = new JLabel("    UF:");
        textoUf.setForeground(Color.BLACK);
        textoUf.setBackground(Color.WHITE);
        textoUf.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoUf);
        painel.add(campoTextoUf);

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
                // Cria um novo objeto Vacina com as informações preenchidas
                // e adiciona à lista de vacinas no controle
                controleVacina.adicionaVacina(campoTextoTipo.getText(), campoTextoFabricante.getText(), LocalDate.parse(campoTextoDataFabricacao.getText()), LocalDate.parse(campoTextoDataValidade.getText()), campoTextoLote.getText(), Boolean.parseBoolean(campoTextoStatus.getText()), campoTextoMedicoVeterinario.getText(), campoTextoCrmv.getText(), campoTextoUf.getText());
                
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