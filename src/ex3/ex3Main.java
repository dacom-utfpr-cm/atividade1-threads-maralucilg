package ex3;

/*


Faça um programa Java que envia interrupções para as threads dos exercı́cios anteriores. 
As threads devem fazer o tratamento dessas interrupções e realizar uma finalização limpa.

@maralucilg



*/


public class ex3Main {
	// One Thread to Rule Them All
	public static void main(String[] args) {
		
		Thread exe1 = new Thread(ThreadSleepEx());
		Thread exe2 = new Thread(ThreadArquivoEx("arquivo.txt"));
		exe1.start();
		exe2.start();
		
		exe1.interrupt();
		exe2.interrupt();
		
		

	}

}
