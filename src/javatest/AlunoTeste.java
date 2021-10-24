package javatest;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java1.java.Aluno;
import java1.java.Disciplina;

public class AlunoTeste {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();/*PECORRENDO A LISTA ALUNO COM FOR*/

		for(int qtd = 1;qtd <=2;qtd++) {
		
		String nome = JOptionPane.showInputDialog("QUALE SEU NOME: "+qtd+"");
		String idade = JOptionPane.showInputDialog("QUALE SUA IDADE: ");
		String dataNascimento = JOptionPane.showInputDialog("QUALE DUA DATA NASCIMENTO: ");
		String registroGeral = JOptionPane.showInputDialog("QUALE SEU RG: ");
		String numeroCpf = JOptionPane.showInputDialog("QUALE SEU CPF: ");
		String nomePai = JOptionPane.showInputDialog("QUALE NOME DO SEU PAI: ");
		String nomeMae = JOptionPane.showInputDialog("QUALE NOME DA SUA MAE: ");
		String dataMatricula = JOptionPane.showInputDialog("QUAL A DATA MATRICULA: ");
		String nomeEscola = JOptionPane.showInputDialog("QUALE NOME DA ESCOLA: ");

	/*	String disciplina1 = JOptionPane.showInputDialog("disciplina1");
		String nota1 = JOptionPane.showInputDialog("nota1");
		String disciplina2 = JOptionPane.showInputDialog("disciplina2");
		String nota2 = JOptionPane.showInputDialog("nota2");
		String disciplina3 = JOptionPane.showInputDialog("disciplina3");
		String nota3 = JOptionPane.showInputDialog("nota3");
		String disciplina4 = JOptionPane.showInputDialog("disciplina4");
		String nota4 = JOptionPane.showInputDialog("nota4");

		
		 ALUNO1 E UM REFERENCIA PARA OBJETO ALUNO */

		Aluno aluno1 = new Aluno();/* Aqui sera joao */

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeMae(nomeMae);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMtriculado("SUPERIOR");

		for(int pos= 0;pos< 4;pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("nomeDisciplina: "+pos+" ^^");
			String nota = JOptionPane.showInputDialog("nota: "+pos+"");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(nota));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha =JOptionPane.showConfirmDialog(null, "deseja remover algumadisciplina");
		
		if(escolha ==0) {
		
			int continuarRemover = 0;
			int poscicao = 1;
			
			while(continuarRemover == 0) {
			String removeDisciplina = JOptionPane.showInputDialog("qual disciplina 1,2,3, ou 4");
			aluno1.getDisciplinas().remove(Integer.valueOf(removeDisciplina)-1);
		
	continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina: ");
			}
		}
		/*CRIANDO LISTA
		 * 
		 * Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("port");
		disciplina1.setNota(1);

		aluno1.getDisciplinas().add(disciplina1);
		

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("JAVA");
		disciplina2.setNota(10);
		
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Mat");
		disciplina3.setNota(10);
		
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Logica");
		disciplina4.setNota(0);
		
		aluno1.getDisciplinas().add(disciplina4);
		
*/		
		
		/* CHAMANDO METODO SET 
		System.out.println("nome: " + aluno1.getNome());
		System.out.println("idade: " + aluno1.getIdade());
		System.out.println("dataNascimento: " + aluno1.getDataNascimento());
		System.out.println("registro Geral: " + aluno1.getRegistroGeral());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("Pai: " + aluno1.getNomePai());
		System.out.println("Mae: " + aluno1.getNomeMae());
		System.out.println("data matricula: " + aluno1.getDataMatricula());
		System.out.println("Nome da escola: " + aluno1.getNomeEscola());

*/		
	
		
		alunos.add(aluno1);
		}		

for (Aluno aluno : alunos) {
	
	
	/* CHAMANDO METODO GET */
	System.out.println("media: " + aluno.getMedia());
	System.out.println("nota: " + aluno.getAprovado());
	System.out.println("------------------");

}		
		
	
		/*
		 * Aluno aluno2 = new Aluno();AQUI SERA MARIA
		 * 
		 * aluno2.setNome("maria"); aluno2.setNota1(10); aluno2.setNota2(5);
		 * aluno2.setNota3(0); aluno2.setNota4(1);
		 * 
		 * System.out.println("media: "+aluno2.getMedia());
		 * System.out.println("nota: "+aluno2.getMedia());
		 * System.out.println("------------------");
		 * 
		 * Aluno aluno3 = new Aluno();AQUI SERA PEDRO
		 * 
		 * 
		 * aluno3.setNome("pedro");
		 * 
		 * 
		 * Aluno aluno4 = new Aluno(); aluno4.setNome("victor");
		 * 
		 * 
		 * 
		 * System.out.println("Nome : " + aluno1.getNome());
		 * System.out.println("nome : " + aluno2.getNome());
		 * System.out.println("nome : " + aluno3.getNome());
		 * System.out.println("nome : " + aluno4.getNome());
		 * 
		 * }
		 */

	}
}
