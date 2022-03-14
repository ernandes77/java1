package javatest;

import javax.swing.JOptionPane;

import java1.java.Aluno;
import java1.java.Disciplina;

public class ArrayVetores {

	public static void main(String[] args) {
		double[] notas = {2.3,3.2,6.5,4.5};
		double[] notasCss = {9.9,8.4,2.5,3.5};
		
		/*criado objeto aluno*/
	Aluno aluno = new Aluno();
	aluno.setNome("ernandes");
	aluno.setIdade(33);
	/*criado objeto disciplina*/
	
	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("java");
	disciplina.setNota(notas);
	
	
	aluno.getDisciplinas().add(disciplina);
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("css");
	disciplina2.setNota(notasCss);
	
	aluno.getDisciplinas().add(disciplina2);
	
	System.out.println(" aluno: "+aluno.getNome()+" Inscrito no curso : "+aluno.getNomeEscola());
	System.out.println("----------------MATERIAS DO ALUNO----------------");
	
	for(Disciplina d : aluno.getDisciplinas()) {
		System.out.println("Disciplina: "+d.getDisciplina());
		System.out.println("Asnotas da disciplina sao : ");
		
		for(int pos = 0;pos < d.getNota().length; pos++) {
			System.out.println("as notas sao : "+pos+" e igual "+d.getNota()[pos]);
			
		}
		
	}
	
	}
	

}
