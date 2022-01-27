package javatest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import classesauxiliares.FuncaoAutenticacao;
import contantesStaticos.StatusAluno;
import java1.java.Aluno;
import java1.java.Diretor;
import java1.java.Disciplina;
import java1.java.Secretario;
import javainterfaces.PermitirAcesso;

public class AlunoTeste {

	public static void main(String[] args) {
		
		try {
		
		
		String loing = JOptionPane.showInputDialog("qual seu loing");
		String senha = JOptionPane.showInputDialog("qual sua senha");
		
		
		
		
		PermitirAcesso permitirAcesso = new Diretor(loing,senha);/*interface e igual a objeto secretario*/
	
		
		
		if( new FuncaoAutenticacao (new Secretario(loing,senha)).autenticar()) {
		
		
	

		List<Aluno> alunos = new ArrayList<Aluno>();/*PECORRENDO A LISTA ALUNO COM FOR*/

		List<Aluno>alunosAprovados = new ArrayList<Aluno>();
		List<Aluno>alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno>alunosReprovado = new ArrayList<Aluno>();
		
		for(int qtd = 1;qtd <=1;qtd++) {
		
		String nome = JOptionPane.showInputDialog("QUALE SEU NOME : "+qtd+"");
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

		for(int pos= 0 ; pos< 4; pos++) {/*ADICIONA DISCIPLINA*/
			
			String nomeDisciplina = JOptionPane.showInputDialog("nomeDisciplina = "+pos+" ^^ ");
			String nota = JOptionPane.showInputDialog("nota = "+pos+" ^^ ");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(nota));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		/*REMOVER DISCIPILINA*/
		int escolha =JOptionPane.showConfirmDialog(null, "deseja remover algumadisciplina");
		
		if(escolha == 0) {/*opcao SIM e 0 ESCOLHER MAIS DE UMA DISCIPLINA PARAREMOVER*/
		
			int continuarRemover = 0;
			int posicao = 1;
			
	while(continuarRemover == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("qual disciplina 1,2,3, ou 4");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-posicao);
			posicao++;
			
		
	continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina: ");
			}
		}
	
	
		
		alunos.add(aluno1);
		}

		for (Aluno aluno : alunos) {
			System.out.println(""+aluno);
			System.out.println("Situacao do aluno: "+aluno.getMedia());
			System.out.println("Resultado : "+aluno.getAprovado());
		}

		
			

		}else {
			JOptionPane.showMessageDialog(null, "Acesso nao permetido!!!");
		}	
		
		
			




		/*fim*/
		}catch (Exception e) {
			StringBuilder saida = new StringBuilder();
		e.printStackTrace();/*imprimi erro no console*/
		/*MENSAGEM DE ERRO*/
		System.out.println("mensagem"+e.getMessage());
		
		
		for(int i = 0;i<= e.getStackTrace().length;i++) {
			saida.append("classe erro : "+e.getStackTrace()[i].getClassName());
			saida.append("metodo erro : " +e.getStackTrace()[i].getMethodName());
			saida.append("linha de erro : "+e.getStackTrace()[i].getLineNumber());
		}
		
		JOptionPane.showMessageDialog(null, "erro ao processar"+saida.toString());
		}

	}
	
}
		
	
		
		
	
		

