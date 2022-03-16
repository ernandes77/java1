package threds;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{
	
	public TelaTimeThread() {//executar oque tiver dentro na hora 
		setTitle("Minha tela");//title nome do titulo da tela
		setSize(new Dimension (240, 240));//tamanho da tela
		setLocationRelativeTo(null);//centralaiza tela
		setResizable(false);
		//primeira etapa concluida
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.Gridx();
	
	
	
	setVisible(true);//chama a tela para visualizar
	}

}
