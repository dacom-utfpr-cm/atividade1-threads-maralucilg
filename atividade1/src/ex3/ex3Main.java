package ex3;

import ex2.ThreadArquivo;

/*
 * 3. Faça um programa Java que envia interrupções para as
threads dos exercı́cios anteriores. As threads devem fazer o
tratamento dessas interrupções e realizar uma finalização
limpa.
 * 
 * @maralucilg
 */

public class ex3Main {
	// One Thread to Rule Them All
	public static void main(String[] args) {
		
		Thread exemplo1 = new Thread(new ThreadSleepEx());
		Thread exemplo2 = new Thread(new ThreadArquivoEx("arquivo.txt"));
		
		exemplo1.start();
		exemplo2.start();
		
		exemplo1.interrupt();
		exemplo2.interrupt();
		
		

	}

}
