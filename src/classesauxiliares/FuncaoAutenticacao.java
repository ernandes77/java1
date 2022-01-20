package classesauxiliares;

import javainterfaces.PermitirAcesso;

public class FuncaoAutenticacao {
	
	/*ralmente e somente receber alguem que tenha contrato da interface de permitir acesso e chama o autenticar...*/
	public boolean autenticarJava(PermitirAcesso acesso) {

	return acesso.auenticar();
}
}