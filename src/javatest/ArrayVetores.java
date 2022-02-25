package javatest;

import javax.swing.JOptionPane;

import java1.java.Aluno;
import java1.java.Disciplina;

public class ArrayVetores {

	public static void main(String[] args) {
	/*criado objeto aluno*/
		
	Aluno aluno = new Aluno();
	aluno.setNome("ernandes");
	aluno.setIdade(33);
	/*criado objeto disciplina*/
	
	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("java");
	double[] notas = {2.3,3.2,6.5,4.5};
	
	disciplina.setNota(notas);
	
	aluno.getDisciplinas().add(disciplina);
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("css");
	double[] notasCss = {9.9,8.4,2.5,3.5};
	
	disciplina2.setNota(notasCss);
	
	
	for(Disciplina d : disciplinas) {
		
	}
	
	}
	

}
