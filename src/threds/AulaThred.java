package threds;

import javax.swing.JOptionPane;

public class AulaThred {

	public static void main(String[] args) throws InterruptedException {
		 
		new Thread() {/*Inicia uma thread*/
			public void run() {/*run executa o que nos quisemos*/
				/*codigo da rotina*/
				
				/*codigo da rotina executando*/
				for(int pos = 0; pos <=10; pos++) {
					
					System.out.println("Executando algo por exemplo. envio de email ");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}/*Da um tempo no envio */
				
				}
			};
		}.start();/*liga a thread que fica processando paralera por tras*/
		
		
		System.out.println("Chegou ao fim do teste de thread !!!");
		
		JOptionPane.showMessageDialog(null, "Sistema continua executando para usuario!!!");
	}

}
