package threds;

import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class TelaTimeThread extends JDialog{
	
	public TelaTimeThread() {//executar oque tiver dentro na hora 
		
	JPanel jPanel = new JPanel(new GridBagLayout());//painel de componentes
	
	JLabel descricaoHora = new JLabel("Time da Thred 1");
	JTextField mostraTempo = new JTextField();
	
	JLabel descricaoHora2 = new JLabel("Time da thread2");
	JTextField mostraTempo2 = new JTextField();

	JButton jButton = new JButton("Start");
	JButton jButton2 = new JButton("Stop");
	
		setTitle("Minha tela");//title nome do titulo da tela
		setSize(new Dimension (240, 240));//tamanho da tela
		setLocationRelativeTo(null);//centralaiza tela
		setResizable(false);

		
		//primeira etapa concluida
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//Controlado de posicao de componentes
		gridBagConstraints.gridx = 0;//linha X posicao 0
		gridBagConstraints.gridy = 0;//coluna y posicao 0
		gridBagConstraints.gridwidth =2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		//--------------------------------------------------------------
		
		descricaoHora.setPreferredSize(new Dimension(220,25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200,25));
		mostraTempo.setEditable(false);
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		//-------------------------------------------------
		
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		mostraTempo2.setEditable(false);
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo2,gridBagConstraints);
		
		//------------------------------------------------------
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton,gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2,gridBagConstraints);
	
	
	
		add(jPanel, BorderLayout.WEST);//CHAMADO O PAINEL Jpanel
	
	setVisible(true);//chama a tela para visualizar
	}

}
