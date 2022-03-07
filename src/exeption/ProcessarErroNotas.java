package exeption;

public class ProcessarErroNotas extends Exception{
	
public ProcessarErroNotas(String erro) {
	super("ix erro ao processar as notas"+erro);
}
}
