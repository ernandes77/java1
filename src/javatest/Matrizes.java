package javatest;

public class Matrizes {

	public static void main(String[] args) {
		
		
	int notas [][] = new int [2][3];
	
	notas [0][0]=30;
	notas [0][1]=60;
	notas [0][2]=50;

	notas [1][0]= 10;
	notas [1][1]= 35;
	notas [1][2]= 15;
	
	for(int poslinha = 0; poslinha <notas.length;poslinha++) {
		System.out.println("---------------------");
		for(int poscoluna = 0;poscoluna < notas[poslinha].length;poscoluna++) {
			System.out.println("valor da matriz : "+notas[poslinha][poscoluna]);
		}
	}
	
	}

}
