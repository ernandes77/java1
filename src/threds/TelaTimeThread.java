package threds;


import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class TelaTimeThread extends JDialog{
	
	public TelaTimeThread() {//executar oque tiver dentro na hora 
		
		private JPanel jPanel = new JPanel(new GridBagLayout());//PAINEL DE COMPONENTES
		private JLabel descricaoHora = new JLabel("Time da thread 1");
		
		setTitle("Minha tela");//title nome do titulo da tela
		setSize(new Dimension (240, 240));//tamanho da tela
		setLocationRelativeTo(null);//centralaiza tela
		setResizable(false);
		
		
		//primeira etapa concluida
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//Controlado de posicao de componentes
		gridBagConstraints.gridx = 0;//linha X posicao 0
		gridBagConstraints.gridy = 0;//coluna y posicao 0
		
		setpr
	
	
	
	setVisible(true);//chama a tela para visualizar
	}

}
