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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import controller.ControlePet;
import controller.ControleVacina;
import model.Vacina;

public class TelaDetalhesVacina extends JFrame {

    private ControleVacina controleVacina;
    private Vacina vacina;

    private JTextField campoTextoTipo;
    private JTextField campoTextoFabricante;
    private JTextField campoTextoDataFabricacao;
    private JTextField campoTextoDataValidade;
    private JTextField campoTextoLote;
    private JTextField campoTextoStatus;
    private JTextField campoTextoMedicoVeterinario;
    private JTextField campoTextoCrmv;
    private JTextField campoTextoUf;

    private JButton botaoEditar;
    private JButton botaoApagar;
    private JButton botaoVoltar;
    
    private ControlePet controlePet;

    public TelaDetalhesVacina(ControleVacina controleVacina, Vacina vacina, ControlePet controlePet) {
        super("Detalhes Editáveis de Vacina");

        this.controleVacina = controleVacina;
        this.vacina = vacina;
        
        this.controlePet = controlePet;

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel painelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelTitulo = new JLabel("Detalhes de Vacina: ");
        labelTitulo.setFont(FontesMiniProjeto.fontePadrao);
        painelTitulo.add(labelTitulo);
        add(painelTitulo, BorderLayout.NORTH);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(9, 2));

        //Campos de texto para exibir as informações da vacina
        campoTextoTipo = new JTextField(vacina.getTipo());
        campoTextoTipo.setBackground(Color.WHITE);
        campoTextoTipo.setEditable(false);
        JLabel textoTipo = new JLabel("    Tipo:");
        textoTipo.setForeground(Color.BLACK);
        textoTipo.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoTipo);
        painel.add(campoTextoTipo);

        campoTextoFabricante = new JTextField(vacina.getFabricante());
        campoTextoFabricante.setBackground(Color.WHITE);
        campoTextoFabricante.setEditable(false);
        JLabel textoFabricante = new JLabel("    Fabricante:");
        textoFabricante.setForeground(Color.BLACK);
        textoFabricante.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoFabricante);
        painel.add(campoTextoFabricante);

        campoTextoDataFabricacao = new JTextField(vacina.getDataFabricacao().toString());
        campoTextoDataFabricacao.setBackground(Color.WHITE);
        campoTextoDataFabricacao.setEditable(false);
        JLabel textoDataFabricacao = new JLabel("    Data de Fabricação:");
        textoDataFabricacao.setForeground(Color.BLACK);
        textoDataFabricacao.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoDataFabricacao);
        painel.add(campoTextoDataFabricacao);
        
        campoTextoDataValidade = new JTextField(vacina.getDataValidade().toString());
        campoTextoDataValidade.setBackground(Color.WHITE);
        campoTextoDataValidade.setEditable(false);
        JLabel textoDataValidade = new JLabel("    Data de Validade:");
        textoDataValidade.setForeground(Color.BLACK);
        textoDataValidade.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoDataValidade);
        painel.add(campoTextoDataValidade);
        
        campoTextoLote = new JTextField(vacina.getLote());
        campoTextoLote.setBackground(Color.WHITE);
        campoTextoLote.setEditable(false);
        JLabel textoLote = new JLabel("    Lote:");
        textoLote.setForeground(Color.BLACK);
        textoLote.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoLote);
        painel.add(campoTextoLote);
        
        campoTextoStatus = new JTextField(Boolean.toString(vacina.isStatus()));
        campoTextoStatus.setBackground(Color.WHITE);
        campoTextoStatus.setEditable(false);
        JLabel textoStatus = new JLabel("    Status:");
        textoStatus.setForeground(Color.BLACK);
        textoStatus.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoStatus);
        painel.add(campoTextoStatus);
        
        campoTextoMedicoVeterinario = new JTextField(vacina.getMedicoVeterinario());
        campoTextoMedicoVeterinario.setBackground(Color.WHITE);
        campoTextoMedicoVeterinario.setEditable(false);
        JLabel textoMedicoVeterinario = new JLabel("    Médico Veterinário:");
        textoMedicoVeterinario.setForeground(Color.BLACK);
        textoMedicoVeterinario.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoMedicoVeterinario);
        painel.add(campoTextoMedicoVeterinario);
        
        campoTextoCrmv = new JTextField(vacina.getCrmv());
        campoTextoCrmv.setBackground(Color.WHITE);
        campoTextoCrmv.setEditable(false);
        JLabel textoCrmv = new JLabel("    CRMV:");
        textoCrmv.setForeground(Color.BLACK);
        textoCrmv.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoCrmv);
        painel.add(campoTextoCrmv);
        
        campoTextoUf = new JTextField(vacina.getUf());
        campoTextoUf.setBackground(Color.WHITE);
        campoTextoUf.setEditable(false);
        JLabel textoUf = new JLabel("    UF:");
        textoUf.setForeground(Color.BLACK);
        textoUf.setFont(FontesMiniProjeto.fontePadrao);
        painel.add(textoUf);
        painel.add(campoTextoUf);


        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new BoxLayout(painelBotoes, BoxLayout.X_AXIS));

        botaoEditar = new JButton("Editar");
        botaoEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoTextoTipo.setEditable(true);
                campoTextoFabricante.setEditable(true);
                campoTextoDataFabricacao.setEditable(true);
                campoTextoDataValidade.setEditable(true);
                campoTextoLote.setEditable(true);
                campoTextoStatus.setEditable(true);
                campoTextoMedicoVeterinario.setEditable(true);
                campoTextoCrmv.setEditable(true);
                campoTextoUf.setEditable(true);
                
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
                
                labelTitulo.setText("Edição de Vacina: ");
                
                //painelBotoes.revalidate();
                //painelBotoes.repaint();
                
                botaoSalvar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vacina.setTipo(campoTextoTipo.getText());
                        vacina.setFabricante(campoTextoFabricante.getText());
                        vacina.setDataFabricacao(LocalDate.parse(campoTextoDataFabricacao.getText()));
                        vacina.setDataValidade(LocalDate.parse(campoTextoDataValidade.getText()));
                        vacina.setLote(campoTextoLote.getText());
                        vacina.setStatus(Boolean.parseBoolean(campoTextoStatus.getText()));
                        vacina.setMedicoVeterinario(campoTextoMedicoVeterinario.getText());
                        vacina.setCrmv(campoTextoCrmv.getText());
                        vacina.setUf(campoTextoUf.getText());
                        
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
            	controleVacina.removeVacina(vacina);
            	
            	if((controlePet.getVacinas()).isEmpty()) {
            		JLabel label = new JLabel("Este animal de estimação ainda não recebeu uma vacina!");
                	
                	label.setFont(FontesMiniProjeto.fontePadrao);
                	label.setForeground(Color.RED);

                	UIManager.put("OptionPane.buttonFont", FontesMiniProjeto.fontePadrao);
                	
                	UIManager.put("OptionPane.foreground", Color.BLACK);
                	UIManager.put("OptionPane.background", Color.WHITE);
                	
                	JOptionPane.showMessageDialog(null, label, "Aviso", JOptionPane.WARNING_MESSAGE);
            	
            	} else {
            		controlePet.removeVacinaPet(vacina);
            	}
            	
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