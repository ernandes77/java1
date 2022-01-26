package java1.java;

import javainterfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{

	protected String registroEducacao;
	protected int tempoDirecao;
	protected String titulacao;
	
	private String loing;
	private String senha;

	public Diretor(String loing, String senha) {
		this.loing = loing;
		this.senha = senha;
	}
	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]";
	}
	@Override
	public double salario() {
		
		return 3000.99;
	}
	@Override
	public boolean autenticar(String loing, String senha) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean autenticar() {
		
		return loing.equals("nandy") && senha.equals("123");
	}

	
}
