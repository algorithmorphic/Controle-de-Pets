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

import controller.ControlePet;
import model.Pet;

public class TelaDetalhesPet extends JFrame {

    private ControlePet controlePet;
    private Pet pet;

    private JTextField campoTextoNome;
    private JTextField campoTextoEspecie;
    private JTextField campoTextoRaca;
    private JTextField campoTextoSexo;
    private JTextField campoTextoCor;
    private JTextField campoTextoDataNascimento;
    private JTextField campoTextoMicrochip;
    private JTextField campoTextoRga;

    private JButton botaoEditar;
    private JButton botaoApagar;
    private JButton botaoVoltar;

    public TelaDetalhesPet(ControlePet controlePet, Pet pet) {
        super("Detalhes Editáveis de Animal de Estimação");

        this.controlePet = controlePet;
        this.pet = pet;

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel painelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelTitulo = new JLabel("Detalhes de Animal de Estimação: ");
        labelTitulo.setFont(FontesMiniProjeto.fontePadrao);
        painelTitulo.add(labelTitulo);
        add(painelTitulo, BorderLayout.NORTH);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(8, 2));

        //Campos de texto para exibir as informações do pet
        campoTextoNome = new JTextField(pet.getNome());
        campoTextoNome.setBackground(Color.WHITE);
        campoTextoNome.setEditable(false);
        JLabel textoNome = new JLabel("    Nome:");
        textoNome.setForeground(Color.BLACK);
        textoNome.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoNome);
        painel.add(campoTextoNome);

        campoTextoEspecie = new JTextField(pet.getEspecie());
        campoTextoEspecie.setBackground(Color.WHITE);
        campoTextoEspecie.setEditable(false);
        JLabel textoEspecie = new JLabel("    Espécie:");
        textoEspecie.setForeground(Color.BLACK);
        textoEspecie.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoEspecie);
        painel.add(campoTextoEspecie);

        campoTextoRaca = new JTextField(pet.getRaca().toString());
        campoTextoRaca.setBackground(Color.WHITE);
        campoTextoRaca.setEditable(false);
        JLabel textoRaca = new JLabel("    Raça:");
        textoRaca.setForeground(Color.BLACK);
        textoRaca.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoRaca);
        painel.add(campoTextoRaca);
        
        campoTextoSexo = new JTextField(pet.getSexo());
        campoTextoSexo.setBackground(Color.WHITE);
        campoTextoSexo.setEditable(false);
        JLabel textoSexo = new JLabel("    Sexo:");
        textoSexo.setForeground(Color.BLACK);
        textoSexo.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoSexo);
        painel.add(campoTextoSexo);
        
        campoTextoCor = new JTextField(pet.getCor());
        campoTextoCor.setBackground(Color.WHITE);
        campoTextoCor.setEditable(false);
        JLabel textoCor = new JLabel("    Cor/Pelagem:");
        textoCor.setForeground(Color.BLACK);
        textoCor.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoCor);
        painel.add(campoTextoCor);
        
        campoTextoDataNascimento = new JTextField(pet.getDataNascimento().toString());
        campoTextoDataNascimento.setBackground(Color.WHITE);
        campoTextoDataNascimento.setEditable(false);
        JLabel textoDataNascimento = new JLabel("    Data de Nascimento:");
        textoDataNascimento.setForeground(Color.BLACK);
        textoDataNascimento.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoDataNascimento);
        painel.add(campoTextoDataNascimento);
        
        campoTextoMicrochip = new JTextField(pet.getMicrochip());
        campoTextoMicrochip.setBackground(Color.WHITE);
        campoTextoMicrochip.setEditable(false);
        JLabel textoMicrochip = new JLabel("    Microchip:");
        textoMicrochip.setForeground(Color.BLACK);
        textoMicrochip.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoMicrochip);
        painel.add(campoTextoMicrochip);
        
        campoTextoRga = new JTextField(pet.getRga());
        campoTextoRga.setBackground(Color.WHITE);
        campoTextoRga.setEditable(false);
        JLabel textoRga = new JLabel("    RGA:");
        textoRga.setForeground(Color.BLACK);
        textoRga.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoRga);
        painel.add(campoTextoRga);


        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new BoxLayout(painelBotoes, BoxLayout.X_AXIS));

        botaoEditar = new JButton("Editar");
        botaoEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoTextoNome.setEditable(true);
                campoTextoEspecie.setEditable(true);
                campoTextoRaca.setEditable(true);
                campoTextoSexo.setEditable(true);
                campoTextoCor.setEditable(true);
                campoTextoDataNascimento.setEditable(true);
                campoTextoMicrochip.setEditable(true);
                campoTextoRga.setEditable(true);
                
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
                
                labelTitulo.setText("Edição de Animal de Estimação: ");
                
                //painelBotoes.revalidate();
                //painelBotoes.repaint();
                
                botaoSalvar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        pet.setNome(campoTextoNome.getText());
                        pet.setEspecie(campoTextoEspecie.getText());
                        pet.setRaca(campoTextoRaca.getText());
                        pet.setSexo(campoTextoSexo.getText());
                        pet.setCor(campoTextoCor.getText());
                        pet.setDataNascimento(LocalDate.parse(campoTextoDataNascimento.getText()));
                        pet.setMicrochip(campoTextoMicrochip.getText());
                        pet.setRga(campoTextoRga.getText());
                        
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
            	controlePet.removePet(pet);
            	dispose();
            }
        });
        painelBotoes.add(botaoApagar);

        botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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