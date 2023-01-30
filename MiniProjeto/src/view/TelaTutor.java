package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

import java.util.ArrayList;

import controller.ControleTutor;
import model.Tutor;

public class TelaTutor extends JFrame {
    private JPanel painelTutores;
    private JButton botaoCadastrar;
    private JButton botaoAtualizar;
    private JButton botaoVoltar;
    
    private ControleTutor controleTutor;
    private ArrayList<Tutor> tutores;
    
    //Declação para funcionar dentro de escopos diferentes aqui no código.
    GridBagConstraints gbc;
    
    //Construtor
    public TelaTutor(ControleTutor controleTutor, ArrayList<Tutor> tutores) {
        super("CRUD de Tutor");
        
        this.controleTutor = controleTutor;
    	this.tutores = tutores;
    	
    	//Chama um método para a criação da tela.
    	criaTela();
    }

    //Cria a tela.
    private void criaTela() {
    	//Define o layout da tela.
    	setLayout(new BorderLayout());
    	
    	//Define o tamanho, a localização e a operação padrão de fechar a tela.
    	setSize(400, 300);
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        JPanel painelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JLabel labelTitulo = new JLabel("Tutores Cadastrados: ");
        
        labelTitulo.setFont(FontesMiniProjeto.fontePadrao);
        painelTitulo.add(labelTitulo);
        add(painelTitulo, BorderLayout.NORTH);
        
        //Criação de um painel de tutores.
        painelTutores = new JPanel();
        
        //Define um layout específico para o painel de tutores.
        painelTutores.setLayout(new GridBagLayout());
        
        //Utilização do GridBagConstraints a fim de manter os tutores que forem sendo criados empilhados na vertical e no centro da tela.
        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.CENTER;
        gbc.gridy = GridBagConstraints.PAGE_START;
        gbc.insets = new Insets(10,10,10,10); 
        
        add(new JScrollPane(painelTutores), BorderLayout.CENTER);
        
        
        //Cria um painel para conter três botões.
        JPanel painelBotoes = new JPanel();
        
        //Definine o layout do painel dos botões.
        painelBotoes.setLayout(new BoxLayout(painelBotoes, BoxLayout.X_AXIS));
        
        //Cria os três botões.
        botaoCadastrar = new JButton("Cadastrar");
        botaoAtualizar = new JButton("Atualizar");
        botaoVoltar = new JButton("Voltar");
        
        //Define o tamanho, a aparência e a fonte dos botões.
        botaoCadastrar.setPreferredSize(new Dimension(150, 50));
        botaoCadastrar.setForeground(Color.BLACK);
        botaoCadastrar.setBackground(Color.WHITE);
        botaoCadastrar.setFont(FontesMiniProjeto.fontePadrao);
        
        botaoAtualizar.setPreferredSize(new Dimension(150, 50));
        botaoAtualizar.setForeground(Color.BLACK);
        botaoAtualizar.setBackground(Color.WHITE);
        botaoAtualizar.setFont(FontesMiniProjeto.fontePadrao);
        
        botaoVoltar.setPreferredSize(new Dimension(150, 50));
        botaoVoltar.setForeground(Color.BLACK);
        botaoVoltar.setBackground(Color.WHITE);
        botaoVoltar.setFont(FontesMiniProjeto.fontePadrao);
        
        //Adiciona os botões ao painel de botões.
        painelBotoes.add(botaoCadastrar);
        painelBotoes.add(botaoAtualizar);
        painelBotoes.add(botaoVoltar);
        
        //Esse método adiciona um espaço vazio horizontal (glue) ao painel de botões, o que pode ser usado para alinhar os botões dentro do painel de acordo com a necessidade do layout. O método createHorizontalGlue() da classe Box é usado para criar esse espaço vazio.
        //"Glue" é uma metáfora utilizada para descrever espaços vazios flexíveis dentro de um layout. Esses espaços vazios podem ser expandidos ou contraídos de acordo com a necessidade, para ajudar a alinhar os componentes dentro de um container. Na programação de interface gráfica, o glue é geralmente utilizado em conjunto com outros componentes, como "struts" e "rigid areas", para criar layouts mais flexíveis e adaptáveis.
        painelBotoes.add(Box.createHorizontalGlue());
        
        //Adiciona o painel de botões ao final (sul) da tela principal (TelaTutor).
        add(painelBotoes, BorderLayout.SOUTH);
        
        //Torna a tela principal visível.
        setVisible(true);
        
        //Atualiza a lista de tutores.
        atualizaLista();
        
        
        //Adiciona uma ação aos botões criados.
        botaoCadastrar.addActionListener(e -> controleTutor.abreTelaCadastroTutor());
        botaoAtualizar.addActionListener(e -> atualizaLista());
        botaoVoltar.addActionListener(e -> dispose());
        
    }

    //Atualiza a lista de tutores apresentada na tela.
    private void atualizaLista() {
        painelTutores.removeAll();
        
        tutores = controleTutor.getTutores();
        
        if(tutores.isEmpty()) {
        	JLabel label = new JLabel("Não há tutores cadastrados!");
        	
        	label.setFont(FontesMiniProjeto.fontePadrao);
        	label.setForeground(Color.RED);

        	UIManager.put("OptionPane.buttonFont", FontesMiniProjeto.fontePadrao);
        	
        	UIManager.put("OptionPane.foreground", Color.BLACK);
        	UIManager.put("OptionPane.background", Color.WHITE);
        	
        	JOptionPane.showMessageDialog(null, label, "Aviso", JOptionPane.WARNING_MESSAGE);

        } else {
	        for (Tutor tutor : tutores) {
	            JButton botaoTutor = new JButton(tutor.getNome() + " " + tutor.getSobrenome());
	            
	            botaoTutor.addActionListener(e -> controleTutor.abreTelaDetalhesTutor(tutor));
	            
	            botaoTutor.setForeground(Color.BLACK);
	            botaoTutor.setBackground(Color.WHITE);
	            botaoTutor.setFont(FontesMiniProjeto.fontePadrao);
	            
	            painelTutores.add(botaoTutor, gbc);
	            gbc.gridy++;
	        }
        }
        
        //Atualizando o conteúdo dos componente na tela:
        
        //É usado para invalidar o layout do componente, o que significa que o layout manager será chamado para recalcular o tamanho e a posição do componente. Isso é útil quando você adiciona ou remove componentes de um container ou quando muda o tamanho de um componente.
        painelTutores.revalidate();
        
        //É usado para repintar o componente. Isso significa que o componente será redesenhado na tela. Isso é útil quando você altera o conteúdo de um componente, como mudar o texto de um JLabel ou mudar a cor de fundo de um JPanel.
        painelTutores.repaint();
        
        //pack(); //É utilizado para ajustar o tamanho da janela de acordo com o tamanho dos componentes contidos nela. Ele ajusta o tamanho da janela para que todos os componentes sejam exibidos corretamente, sem deixar espaços vazios.
        
    }

}