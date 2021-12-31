package java1.java;

public class Secretario extends Pessoa{

	protected String registro;
	protected String nivelCargo;
	protected int experiencia;
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
	
	@Override
	public boolean maiorDeIdade() {
		
		return super.maiorDeIdade();
	}
}
