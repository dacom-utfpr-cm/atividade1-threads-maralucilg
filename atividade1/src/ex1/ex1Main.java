package ex1;

/*
 * 1. Faça um programa em Java que inicie três threads e, cada
thread, espere um tempo aleatório para terminar.
 * 
 * @maralucilg
 */

public class ex1Main {
	
	final static int NUM_THREADS = 3;

	public static void main(String[] args) {
		
		for(int i = 0; i < NUM_THREADS; i++) {
		
		new Thread (new ThreadSleep()).start();

		}
	}

}
