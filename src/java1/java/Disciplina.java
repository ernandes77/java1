package java1.java;

import java.util.Objects;

public class Disciplina {
	/* ESSA CLASSE DISCIPLINA SERVIRA PARA TODOS */
	private double[] nota= new double[4];//Aluno era 4 nota o ano todo
	private String disciplina;

	

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}

	
	
	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

	public double getMediaNotas() {
		
		double somaTotal = 0;
		
		for(int pos = 0;pos < nota.length;pos++) {
			
		}
		return somaTotal /4;
	}
}
