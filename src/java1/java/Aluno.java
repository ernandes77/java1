package java1.java;

public class Aluno {

	
	/*ESSES SAO OS ATRIBUTOS DO OBJETO*/
	private	String nome;
	private	int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomePai;
	private String nomeMae;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMtriculado;
	
	
	private Disciplina Disciplina = new Disciplina();
	
	public void setDisciplina(Disciplina disciplina) {
		Disciplina = disciplina;
	}
	public Disciplina getDisciplina() {
		return Disciplina;
	}
	

	/*public Aluno() {CRIA DADOS NA MEMORIA SENDO PADRAO JAVA
		
	}
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}*/ 
	
	/* GET E SETRS SET SAO PARA ADICIONAR OU RECEBER DADOS DO ATRIBUTO
	 * GET E PARA RESGATAR OU OBTER VALOR DO ATRIBUTO*/
	
	
	public double getMedia() {/*METODO QUE RETORNA SOMA DAS NOTAS*/
		return(Disciplina.getNota1() + Disciplina.getNota2() + Disciplina.getNota3() + Disciplina.getNota4())/4;
	}
	public String getAprovado() {/*METODO QUE RETORNA APROVADOOU REPROVADO*/
		double media = this.getMedia();
		if (media>= 10) {
			return "aprovado";
		}else {
			return "reprovado";
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
	
	
	
	
	
	
	
	
}

	
