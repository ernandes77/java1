package java1.java;

import javax.swing.JOptionPane;

public class AlunoTeste {

	public static void main(String[] args) {
	
String nome = JOptionPane.showInputDialog("QUALE SEU NOME: ");
String idade = JOptionPane.showInputDialog("QUALE SUA IDADE: ");
String dataNascimento = JOptionPane.showInputDialog("QUALE DUA DATA NASCIMENTO: ");
String registroGeral = JOptionPane.showInputDialog("QUALE SEU RG: ");
String numeroCpf = JOptionPane.showInputDialog("QUALE SEU CPF: ");
String nomePai = JOptionPane.showInputDialog("QUALE NOME DO SEU PAI: ");
String nomeMae = JOptionPane.showInputDialog("QUALE NOME DA SUA MAE: ");
String dataMatricula = JOptionPane.showInputDialog("QUAL A DATA MATRICULA: ");
String nomeEscola = JOptionPane.showInputDialog("QUALE NOME DA ESCOLA: ");

String disciplina1 = JOptionPane.showInputDialog("disciplina1");
String nota1 = JOptionPane.showInputDialog("nota1");
String disciplina2 = JOptionPane.showInputDialog("disciplina2");
String nota2 = JOptionPane.showInputDialog("nota2");
String disciplina3 = JOptionPane.showInputDialog("disciplina3");
String nota3 = JOptionPane.showInputDialog("nota3");
String disciplina4 = JOptionPane.showInputDialog("disciplina4");
String nota4 = JOptionPane.showInputDialog("nota4");
		
		
/*ALUNO1 E UM REFERENCIA PARA OBJETO ALUNO*/
		
		Aluno aluno1 = new Aluno();/*Aqui sera joao*/
		
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
	
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		System.out.println("nome: "+aluno1.getNome());
		System.out.println("idade: "+aluno1.getIdade());
		System.out.println("dataNascimento: "+aluno1.getDataNascimento());
		System.out.println("registro Geral: "+aluno1.getRegistroGeral());
		System.out.println("CPF: "+aluno1.getNumeroCpf());
		System.out.println("Pai: "+aluno1.getNomePai());
		System.out.println("Mae: "+aluno1.getNomeMae());
		System.out.println("data matricula: "+aluno1.getDataMatricula());
		System.out.println("Nome da escola: "+aluno1.getNomeEscola());
		System.out.println("media: "+aluno1.getMedia());
		System.out.println("nota: "+aluno1.getAprovado());
		System.out.println("------------------");
		
	/*	Aluno aluno2 = new Aluno();AQUI SERA MARIA

		aluno2.setNome("maria");
		aluno2.setNota1(10);
		aluno2.setNota2(5);
		aluno2.setNota3(0);
		aluno2.setNota4(1);
		
		System.out.println("media: "+aluno2.getMedia());
		System.out.println("nota: "+aluno2.getMedia());
		System.out.println("------------------");
		
		Aluno aluno3 = new Aluno();AQUI SERA PEDRO
	
		
		aluno3.setNome("pedro");
	

		Aluno aluno4 = new Aluno();
		aluno4.setNome("victor");
		
		

		System.out.println("Nome : " + aluno1.getNome());	
		System.out.println("nome : " + aluno2.getNome());
		System.out.println("nome : " + aluno3.getNome());
		System.out.println("nome : " + aluno4.getNome());
		
	}
*/

	}}


