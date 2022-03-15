package threds;

import javax.swing.JOptionPane;

public class AulaThred {

	public static void main(String[] args) throws InterruptedException {
		 
		Thread threademail =new Thread(thread1);
		threademail.start();
		
		/*----------Divisao das threads------*/
		
		Thread threadfiscal = new Thread(thread2); 
		threadfiscal.start();
		
		System.out.println("Chegou ao fim do teste de thread !!!");
		
		JOptionPane.showMessageDialog(null, "Sistema continua executando para usuario!!!");
	}

	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			for(int pos = 0; pos <=10;pos++) {//inicio do codigo paralelo
				
				System.out.println("envio de nota fiscal!!!");//fim do codigo parelelo
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	
	private static Runnable thread1 = new Runnable() {
		public void run() {
			
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
			
		}
	};
}
