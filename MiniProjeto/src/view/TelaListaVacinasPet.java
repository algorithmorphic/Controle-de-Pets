package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import controller.ControlePet;
import controller.ControleVacina;
import model.Vacina;

public class TelaListaVacinasPet extends JFrame {
    private JPanel painelVacinas;
    private JPanel painelBotoes;
    private JPanel painelTitulo;
    private JLabel labelTitulo;
    private JButton botaoAtualizar;
    private JButton botaoAdicionar;
    private JButton botaoRemover;
    private JButton botaoVoltar;
    
    private ControlePet controlePet;
    private ControleVacina controleVacina;
    private ArrayList<Vacina> vacinas;
    
    //Declação para funcionar dentro de escopos diferentes aqui no código.
    GridBagConstraints gbc;
    
    //Construtor
    public TelaListaVacinasPet(ControlePet controlePet, ArrayList<Vacina> vacinas, ControleVacina controleVacina) {
        super("Listagem de Vacinas Recebidas");
        
        this.controlePet = controlePet;
    	this.vacinas = vacinas;
    	
    	this.controleVacina = controleVacina;
    	
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
        
        
        painelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        labelTitulo = new JLabel("Vacinas recebidas:");
        
        labelTitulo.setFont(FontesMiniProjeto.fontePadrao);
        painelTitulo.add(labelTitulo);
        
        add(painelTitulo, BorderLayout.NORTH);
        
        //Criação de um painel de vacinas.
        painelVacinas = new JPanel();
        
        //Define um layout específico para o painel de vacinas.
        painelVacinas.setLayout(new GridBagLayout());
        
        //Utilização do GridBagConstraints a fim de manter as vacinas que forem sendo criados empilhados na vertical e no centro da tela.
        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.CENTER;
        gbc.gridy = GridBagConstraints.BELOW_BASELINE_TRAILING;
        gbc.insets = new Insets(10,10,10,10); 
        
        add(new JScrollPane(painelVacinas), BorderLayout.CENTER);
        //add(painelPets, BorderLayout.CENTER)
        
        
        
        //Cria um painel para conter três botões.
        painelBotoes = new JPanel();
        
        //Definine o layout do painel dos botões.
        painelBotoes.setLayout(new BoxLayout(painelBotoes, BoxLayout.X_AXIS));
        
        
        //Cria os dois botões.
        botaoAtualizar = new JButton("Atualizar");
        botaoAdicionar = new JButton("Adicionar");
        botaoRemover = new JButton("Remover");
        botaoVoltar = new JButton("Voltar");
        
        //Define o tamanho, a aparência e a fonte dos botões.
        botaoAtualizar.setPreferredSize(new Dimension(200, 50));
        botaoAtualizar.setForeground(Color.BLACK);
        botaoAtualizar.setBackground(Color.WHITE);
        botaoAtualizar.setFont(FontesMiniProjeto.fontePadrao);
        
        botaoAdicionar.setPreferredSize(new Dimension(200, 50));
        botaoAdicionar.setForeground(Color.BLACK);
        botaoAdicionar.setBackground(Color.WHITE);
        botaoAdicionar.setFont(FontesMiniProjeto.fontePadrao);
        
        botaoRemover.setPreferredSize(new Dimension(200, 50));
        botaoRemover.setForeground(Color.BLACK);
        botaoRemover.setBackground(Color.WHITE);
        botaoRemover.setFont(FontesMiniProjeto.fontePadrao);
        
        botaoVoltar.setPreferredSize(new Dimension(200, 50));
        botaoVoltar.setForeground(Color.BLACK);
        botaoVoltar.setBackground(Color.WHITE);
        botaoVoltar.setFont(FontesMiniProjeto.fontePadrao);
        
        //Adiciona os botões ao painel de botões.
        painelBotoes.add(botaoAtualizar);
        painelBotoes.add(botaoAdicionar);
        painelBotoes.add(botaoRemover);
        painelBotoes.add(botaoVoltar);
        
        //Esse método adiciona um espaço vazio horizontal (glue) ao painel de botões, o que pode ser usado para alinhar os botões dentro do painel de acordo com a necessidade do layout. O método createHorizontalGlue() da classe Box é usado para criar esse espaço vazio.
        //"Glue" é uma metáfora utilizada para descrever espaços vazios flexíveis dentro de um layout. Esses espaços vazios podem ser expandidos ou contraídos de acordo com a necessidade, para ajudar a alinhar os componentes dentro de um container. Na programação de interface gráfica, o glue é geralmente utilizado em conjunto com outros componentes, como "struts" e "rigid areas", para criar layouts mais flexíveis e adaptáveis.
        painelBotoes.add(Box.createHorizontalGlue());
        
        //Adiciona o painel de botões ao final (sul) da tela principal (TelaPet).
        add(painelBotoes, BorderLayout.SOUTH);
        
        //Torna a tela principal visível.
        setVisible(true);
        
        //Atualiza a lista de pets.
        atualizaLista();
        
        //Adiciona uma ação aos botões criados.
        
        //botaoNovaBusca.addActionListener(e -> controlePet.abreTelaBuscaNomePet());
        botaoAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelTitulo.setText("Vacinas recebidas:");
				
				atualizaLista();
        
			}
		});
        
        botaoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelBotoes.remove(botaoAdicionar);
				
				labelTitulo.setText("Clique na vacina que deseja adicionar:");
				
				abreListaVacinas();
        
			}
		});
        
        botaoRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelTitulo.setText("Clique na vacina que deseja remover:");
				
				removeVacina();
        
			}
		});
        
        botaoVoltar.addActionListener(e -> dispose());
        
    }

    //Atualiza a lista de tutores apresentada na tela.
    private void atualizaLista() {
        painelVacinas.removeAll();
        
        vacinas = controlePet.getVacinas();
        
        if(vacinas.isEmpty()) {
        	JLabel label = new JLabel("Este animal de estimação ainda não recebeu uma vacina!");
        	
        	label.setFont(FontesMiniProjeto.fontePadrao);
        	label.setForeground(Color.RED);

        	UIManager.put("OptionPane.buttonFont", FontesMiniProjeto.fontePadrao);
        	
        	UIManager.put("OptionPane.foreground", Color.BLACK);
        	UIManager.put("OptionPane.background", Color.WHITE);
        	
        	JOptionPane.showMessageDialog(null, label, "Aviso", JOptionPane.WARNING_MESSAGE);

        } else {
	        for (Vacina vacina : vacinas) {
	            JButton botaoVacina = new JButton(vacina.getTipo());
	            
	            botaoVacina.addActionListener(e -> controleVacina.abreTelaDetalhesVacina(vacina));
	            
	            botaoVacina.setForeground(Color.BLACK);
	            botaoVacina.setBackground(Color.WHITE);
	            botaoVacina.setFont(FontesMiniProjeto.fontePadrao);
	            
	            painelVacinas.add(botaoVacina, gbc);
	            gbc.gridy++;
	        }
        }
        
        //Atualizando o conteúdo dos componente na tela:
        
        //É usado para invalidar o layout do componente, o que significa que o layout manager será chamado para recalcular o tamanho e a posição do componente. Isso é útil quando você adiciona ou remove componentes de um container ou quando muda o tamanho de um componente.
        painelVacinas.revalidate();
        
        //É usado para repintar o componente. Isso significa que o componente será redesenhado na tela. Isso é útil quando você altera o conteúdo de um componente, como mudar o texto de um JLabel ou mudar a cor de fundo de um JPanel.
        painelVacinas.repaint();
        
        //pack(); //É utilizado para ajustar o tamanho da janela de acordo com o tamanho dos componentes contidos nela. Ele ajusta o tamanho da janela para que todos os componentes sejam exibidos corretamente, sem deixar espaços vazios.
        
    }
    
    //Atualiza a lista de vacinas apresentada na tela.
    private void abreListaVacinas() {
    	painelBotoes.remove(botaoAtualizar);
    	painelBotoes.remove(botaoAdicionar);
    	painelBotoes.remove(botaoRemover);
    	painelBotoes.remove(botaoVoltar);
    	
    	painelBotoes.add(botaoAtualizar);
    	painelBotoes.add(botaoAdicionar);
    	painelBotoes.add(botaoRemover);
    	painelBotoes.add(botaoVoltar);
    	
    	
        painelVacinas.removeAll();
        
        vacinas = controleVacina.getVacinas();
        
        if(vacinas.isEmpty()) {
        	JLabel label = new JLabel("Não há vacinas cadastradas!");
        	
        	label.setFont(FontesMiniProjeto.fontePadrao);
        	label.setForeground(Color.RED);

        	UIManager.put("OptionPane.buttonFont", FontesMiniProjeto.fontePadrao);
        	
        	UIManager.put("OptionPane.foreground", Color.BLACK);
        	UIManager.put("OptionPane.background", Color.WHITE);
        	
        	JOptionPane.showMessageDialog(null, label, "Aviso", JOptionPane.WARNING_MESSAGE);

        } else {
	        for (Vacina vacina : vacinas) {
	            JButton botaoVacina = new JButton(vacina.getTipo());
	            
	            botaoVacina.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				controleVacina.alteraStatusVacina(vacina, false);
	    				
	    				controlePet.adicionaVacinaPet(vacina);
	    				
	    				labelTitulo.setText("Vacinas recebidas:");
	            
	            		atualizaLista();
	            
	    			}
	    		});
	            //botaoVacina.addActionListener(e -> controlePet.adicionaVacinaPet(vacina));
	            
	            botaoVacina.setForeground(Color.BLACK);
	            botaoVacina.setBackground(Color.WHITE);
	            botaoVacina.setFont(FontesMiniProjeto.fontePadrao);
	            
	            painelVacinas.add(botaoVacina, gbc);
	            gbc.gridy++;
	        }
        }
        
        //Atualizando o conteúdo dos componente na tela:
        
        //É usado para invalidar o layout do componente, o que significa que o layout manager será chamado para recalcular o tamanho e a posição do componente. Isso é útil quando você adiciona ou remove componentes de um container ou quando muda o tamanho de um componente.
        painelVacinas.revalidate();
        
        //É usado para repintar o componente. Isso significa que o componente será redesenhado na tela. Isso é útil quando você altera o conteúdo de um componente, como mudar o texto de um JLabel ou mudar a cor de fundo de um JPanel.
        painelVacinas.repaint();
        
        //pack(); //É utilizado para ajustar o tamanho da janela de acordo com o tamanho dos componentes contidos nela. Ele ajusta o tamanho da janela para que todos os componentes sejam exibidos corretamente, sem deixar espaços vazios.
        
    }
    
    private void removeVacina() {
        painelVacinas.removeAll();
        
        vacinas = controlePet.getVacinas();
        
        if(vacinas.isEmpty()) {
        	JLabel label = new JLabel("Este animal de estimação ainda não recebeu uma vacina!");
        	
        	label.setFont(FontesMiniProjeto.fontePadrao);
        	label.setForeground(Color.RED);

        	UIManager.put("OptionPane.buttonFont", FontesMiniProjeto.fontePadrao);
        	
        	UIManager.put("OptionPane.foreground", Color.BLACK);
        	UIManager.put("OptionPane.background", Color.WHITE);
        	
        	JOptionPane.showMessageDialog(null, label, "Aviso", JOptionPane.WARNING_MESSAGE);

        } else {
	        for (Vacina vacina : vacinas) {
	            JButton botaoVacina = new JButton(vacina.getTipo());
	            
	            botaoVacina.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				controleVacina.alteraStatusVacina(vacina, true);
	    				
	    				controlePet.removeVacinaPet(vacina);
	    				
	    				labelTitulo.setText("Vacinas recebidas:");
	            
	            		atualizaLista();
	            
	    			}
	    		});
	            
	            botaoVacina.setForeground(Color.BLACK);
	            botaoVacina.setBackground(Color.WHITE);
	            botaoVacina.setFont(FontesMiniProjeto.fontePadrao);
	            
	            painelVacinas.add(botaoVacina, gbc);
	            gbc.gridy++;
	        }
        }
        
        //Atualizando o conteúdo dos componente na tela:
        
        //É usado para invalidar o layout do componente, o que significa que o layout manager será chamado para recalcular o tamanho e a posição do componente. Isso é útil quando você adiciona ou remove componentes de um container ou quando muda o tamanho de um componente.
        painelVacinas.revalidate();
        
        //É usado para repintar o componente. Isso significa que o componente será redesenhado na tela. Isso é útil quando você altera o conteúdo de um componente, como mudar o texto de um JLabel ou mudar a cor de fundo de um JPanel.
        painelVacinas.repaint();
        
        //pack(); //É utilizado para ajustar o tamanho da janela de acordo com o tamanho dos componentes contidos nela. Ele ajusta o tamanho da janela para que todos os componentes sejam exibidos corretamente, sem deixar espaços vazios.
        
    }

}