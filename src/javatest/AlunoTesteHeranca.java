package javatest;

import java1.java.Aluno;
import java1.java.Diretor;
import java1.java.Secretario;

public class AlunoTesteHeranca {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("ernandes");
		aluno.setIdade(32);
		
		Diretor diretor = new Diretor();
		diretor.setTempoDirecao(5);
		diretor.setRegistroEducacao("123456");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia(1);;
		secretario.setNivelCargo("secretario");
		
		System.out.println(aluno);
		System.out.println(secretario);
		System.out.println(diretor);
		
		System.out.println("Salario Aluno e  = "+aluno.salario());
		System.out.println("Salario Diretor e = "+diretor.salario());
		System.out.println("Salario Secretario e = "+secretario.salario());
	}

}
