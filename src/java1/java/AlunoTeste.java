package java1.java;



public class AlunoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*ALUNO1 E UM REFERENCIA PARA OBJETO ALUNO*/
		
		Aluno aluno1 = new Aluno();/*Aqui sera joao*/
		
		aluno1.setNome("ernandes");
		
		
		Aluno aluno2 = new Aluno();/*AQUI SERA MARIA*/

		aluno2.setNome("maria");
		
		
		Aluno aluno3 = new Aluno();/*AQUI SERA PEDRO*/
	
		
		aluno3.setNome("pedro");
	

		Aluno aluno4 = new Aluno();
		aluno4.setNome("victor");
		
		

		System.out.println("Nome : " + aluno1.getNome());	
		System.out.println("nome : " + aluno2.getNome());
		System.out.println("nome : " + aluno3.getNome());
		System.out.println("nome : " + aluno4.getNome());
	}


	}


