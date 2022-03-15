package threds;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{
	
	public TelaTimeThread() {//executar oque tiver dentro na hora 
		setTitle("Minha tela");
		setSize(new Dimension (240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
	
	
	
	setVisible(true);//chama a tela para visualizar
	}

}
