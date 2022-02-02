package javatest;

import javax.swing.JOptionPane;

public class ArrayVetores {

	public static void main(String[] args) {
	
		String posicoes = JOptionPane.showInputDialog("qual a poisicao do array: ");
		
		double[] notas = new double[Integer.parseInt(posicoes)];
		
	for(int pos = 0; pos <notas.length;pos++) {
		String valor = JOptionPane.showInputDialog("entre com a nota: "+pos);
		notas[pos] = Double.valueOf(valor);
		
	}
		
		for(int pos = 0; pos < notas.length;pos++) {
			
		
		System.out.println("nota "+ (pos  +1)+ " e = " +notas[pos]);
		}
	}	
	

}
