package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControleTutor;
import model.Tutor;

public class TelaDetalhesTutor extends JFrame {

    private ControleTutor controleTutor;
    private Tutor tutor;

    private JTextField campoTextoNome;
    private JTextField campoTextoSobrenome;
    private JTextField campoTextoDataNascimento;
    private JTextField campoTextoEndereco;
    private JTextField campoTextoTelefone;
    private JTextField campoTextoEmail;
    private JTextField campoTextoRg;
    private JTextField campoTextoCpf;

    private JButton botaoEditar;
    private JButton botaoApagar;
    private JButton botaoVoltar;

    public TelaDetalhesTutor(ControleTutor controleTutor, Tutor tutor) {
        super("Detalhes Editáveis de Tutor");

        this.controleTutor = controleTutor;
        this.tutor = tutor;

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel painelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelTitulo = new JLabel("Detalhes de Tutor: ");
        labelTitulo.setFont(FontesMiniProjeto.fontePadrao);
        painelTitulo.add(labelTitulo);
        add(painelTitulo, BorderLayout.NORTH);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(8, 2));

        // Campos de texto para exibir as informações do tutor
        campoTextoNome = new JTextField(tutor.getNome());
        campoTextoNome.setBackground(Color.WHITE);
        campoTextoNome.setEditable(false);
        JLabel textoNome = new JLabel("    Nome:");
        textoNome.setForeground(Color.BLACK);
        textoNome.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoNome);
        painel.add(campoTextoNome);

        campoTextoSobrenome = new JTextField(tutor.getSobrenome());
        campoTextoSobrenome.setBackground(Color.WHITE);
        campoTextoSobrenome.setEditable(false);
        JLabel textoSobrenome = new JLabel("    Sobrenome:");
        textoSobrenome.setForeground(Color.BLACK);
        textoSobrenome.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoSobrenome);
        painel.add(campoTextoSobrenome);

        campoTextoDataNascimento = new JTextField(tutor.getDataNascimento().toString());
        campoTextoDataNascimento.setBackground(Color.WHITE);
        campoTextoDataNascimento.setEditable(false);
        JLabel textoDataNascimento = new JLabel("    Data de Nascimento:");
        textoDataNascimento.setForeground(Color.BLACK);
        textoDataNascimento.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoDataNascimento);
        painel.add(campoTextoDataNascimento);
        
        campoTextoEndereco = new JTextField(tutor.getEndereco());
        campoTextoEndereco.setBackground(Color.WHITE);
        campoTextoEndereco.setEditable(false);
        JLabel textoEndereco = new JLabel("    Endereço:");
        textoEndereco.setForeground(Color.BLACK);
        textoEndereco.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoEndereco);
        painel.add(campoTextoEndereco);
        
        //Como o método getTelefone() da classe Tutor retorna um inteiro e o co
        //nstrutor de JTextField(String text) espera receber uma String, tive q
        //ue utilizar o método Integer.toString() para converter o inteiro para
        //String antes de passálo para o construtor do JTextField.
        campoTextoTelefone = new JTextField(Integer.toString(tutor.getTelefone()));
        campoTextoTelefone.setBackground(Color.WHITE);
        campoTextoTelefone.setEditable(false);
        JLabel textoTelefone = new JLabel("    Telefone:");
        textoTelefone.setForeground(Color.BLACK);
        textoTelefone.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoTelefone);
        painel.add(campoTextoTelefone);
        
        campoTextoEmail = new JTextField(tutor.getEmail());
        campoTextoEmail.setBackground(Color.WHITE);
        campoTextoEmail.setEditable(false);
        JLabel textoEmail = new JLabel("    E-mail:");
        textoEmail.setForeground(Color.BLACK);
        textoEmail.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoEmail);
        painel.add(campoTextoEmail);
        
        campoTextoRg = new JTextField(tutor.getRg());
        campoTextoRg.setBackground(Color.WHITE);
        campoTextoRg.setEditable(false);
        JLabel textoRg = new JLabel("    RG:");
        textoRg.setForeground(Color.BLACK);
        textoRg.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoRg);
        painel.add(campoTextoRg);
        
        campoTextoCpf = new JTextField(tutor.getCpf());
        campoTextoCpf.setBackground(Color.WHITE);
        campoTextoCpf.setEditable(false);
        JLabel textoCpf = new JLabel("    CPF:");
        textoCpf.setForeground(Color.BLACK);
        textoCpf.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoCpf);
        painel.add(campoTextoCpf);


        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new BoxLayout(painelBotoes, BoxLayout.X_AXIS));

        botaoEditar = new JButton("Editar");
        botaoEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoTextoNome.setEditable(true);
                campoTextoSobrenome.setEditable(true);
                campoTextoDataNascimento.setEditable(true);
                campoTextoEndereco.setEditable(true);
                campoTextoTelefone.setEditable(true);
                campoTextoEmail.setEditable(true);
                campoTextoRg.setEditable(true);
                campoTextoCpf.setEditable(true);
                
                painelBotoes.remove(botaoEditar);
                painelBotoes.remove(botaoApagar);
                painelBotoes.remove(botaoVoltar);
                
                JButton botaoSalvar = new JButton("Salvar");
                painelBotoes.add(botaoSalvar);
                painelBotoes.add(botaoApagar);
                painelBotoes.add(botaoVoltar);
                
                botaoSalvar.setForeground(Color.BLACK);
                botaoSalvar.setBackground(Color.WHITE);
                botaoSalvar.setFont(FontesMiniProjeto.fontePadrao);
                botaoSalvar.setPreferredSize(new Dimension(150, 50));
                
                labelTitulo.setText("Edição de Tutor: ");
                
                //painelBotoes.revalidate();
                //painelBotoes.repaint();
                
                botaoSalvar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // salvar as alterações no objeto Tutor e no banco de dados
                        tutor.setNome(campoTextoNome.getText());
                        tutor.setSobrenome(campoTextoSobrenome.getText());
                        tutor.setDataNascimento(LocalDate.parse(campoTextoDataNascimento.getText()));
                        tutor.setEndereco(campoTextoEndereco.getText());
                        tutor.setTelefone(Integer.parseInt(campoTextoTelefone.getText()));
                        tutor.setEmail(campoTextoEmail.getText());
                        tutor.setRg(campoTextoRg.getText());
                        tutor.setCpf(campoTextoCpf.getText());
                        
                        dispose();
                    }
                });
            }
        });
        painelBotoes.add(botaoEditar);

        botaoApagar = new JButton("Apagar");
        botaoApagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	controleTutor.removeTutor(tutor);
            	dispose();
            }
        });
        painelBotoes.add(botaoApagar);

        botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação para voltar para a tela anterior
                dispose();
            }
        });
        painelBotoes.add(botaoVoltar);

        add(painel, BorderLayout.CENTER);
        
        botaoEditar.setForeground(Color.BLACK);
        botaoEditar.setBackground(Color.WHITE);
        botaoEditar.setFont(FontesMiniProjeto.fontePadrao);
        botaoEditar.setPreferredSize(new Dimension(150, 50));
        
        botaoApagar.setForeground(Color.BLACK);
        botaoApagar.setBackground(Color.WHITE);
        botaoApagar.setFont(FontesMiniProjeto.fontePadrao);
        botaoApagar.setPreferredSize(new Dimension(150, 50));
        
        botaoVoltar.setForeground(Color.BLACK);
        botaoVoltar.setBackground(Color.WHITE);
        botaoVoltar.setFont(FontesMiniProjeto.fontePadrao);
        botaoVoltar.setPreferredSize(new Dimension(150, 50));
        
        painelBotoes.add(Box.createHorizontalGlue());
        add(painelBotoes, BorderLayout.SOUTH);

        setVisible(true);
        
    }
    
}