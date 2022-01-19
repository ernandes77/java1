package java1.java;

import javainterfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{

	protected String registro;
	protected String nivelCargo;
	protected int experiencia;
	
	private String loing;
	private String senha;
	
	
	
	public String getLoing() {
		return loing;
	}
	public void setLoing(String loing) {
		this.loing = loing;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
	}
	@Override
	public double salario() {
		
		return 2500;
	}
	
	@Override/*sobe escrevendo metodo */
	public boolean maiorDeIdade() {
		
		return super.maiorDeIdade();
	}


	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return loing.equals("admin") && senha.equals("admin") ;
	}
	
}
