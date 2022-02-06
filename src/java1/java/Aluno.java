package java1.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import contantesStaticos.StatusAluno;

public class Aluno extends Pessoa {

	/* ESSES SAO OS ATRIBUTOS DO OBJETO */

	private String dataMatricula;
	private String nomeEscola;
	private String serieMtriculado;

	private List<Disciplina> Disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplinas() {
		return Disciplinas;
	}
	/*
	 * public Aluno() {CRIA DADOS NA MEMORIA SENDO PADRAO JAVA
	 * 
	 * } public Aluno(String nomePadrao) { nome = nomePadrao; } public Aluno (String
	 * nomePadrao, int idadePadrao) { nome = nomePadrao; idade = idadePadrao; }
	 */

	/*
	 * GET E SETRS SET SAO PARA ADICIONAR OU RECEBER DADOS DO ATRIBUTO GET E PARA
	 * RESGATAR OU OBTER VALOR DO ATRIBUTO
	 */

	public double getMedia() {/* METODO QUE RETORNA SOMA DAS NOTAS */
		
		double somaNotas = 0;
		
		for (Disciplina disciplina : Disciplinas) {
		
		somaNotas += disciplina.getMediaNotas();
		}
		
		
		return somaNotas /Disciplinas.size();
	}

	public String getAprovado() {/* METODO QUE RETORNA APROVADOOU REPROVADO */
		double media = this.getMedia();
		
	if(media >=5) {
		if (media >= 7) {
			return StatusAluno.Aprovado;
		} else {
			return StatusAluno.Recuperacao;
		}
	}else {
			return StatusAluno.Reprovado;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMtriculado() {
		return serieMtriculado;
	}

	public void setSerieMtriculado(String serieMtriculado) {
		this.serieMtriculado = serieMtriculado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Disciplinas, dataMatricula, dataNascimento, idade, nome, nomeEscola, nomeMae, nomePai,
				numeroCpf, registroGeral, serieMtriculado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(Disciplinas, other.Disciplinas) && Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Objects.equals(numeroCpf, other.numeroCpf) && Objects.equals(registroGeral, other.registroGeral)
				&& Objects.equals(serieMtriculado, other.serieMtriculado);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMtriculado="
				+ serieMtriculado + ", Disciplinas=" + Disciplinas + "]";
	}
	@Override
	public double salario() {
		
		return 1800.98;
	}

	@Override
	public boolean maiorDeIdade() {
		
		
		return super.maiorDeIdade();
	}
}
