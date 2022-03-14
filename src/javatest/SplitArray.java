package javatest;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String  texto = "alex,30,curso java,";
		
		String [] valoresarray = texto.split(",");
		
		System.out.println("nome : "+valoresarray[0]);
		System.out.println("idade : "+valoresarray[1]);
		System.out.println("curso : "+valoresarray[2] );

		//Convertendo um array para uma Lista
		List<String>list = Arrays.asList(valoresarray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		//convertendo uma lista para um array
		String [] conversaorArray = list.toArray(new String[2]);
		
		for(int pos = 0; pos <conversaorArray.length;pos++) {
			System.out.println(conversaorArray[pos]);
			
		}

		



	}

}
