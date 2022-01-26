package classesauxiliares;

import javainterfaces.PermitirAcesso;

public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	/*ralmente e somente receber alguem que tenha contrato da interface de permitir acesso e chama o autenticar...*/
	public boolean autenticar(){

	return permitirAcesso.autenticar();
}
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		// TODO Auto-generated constructor stub
		this.permitirAcesso = acesso;
	}
}