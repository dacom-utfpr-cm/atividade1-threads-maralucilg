package ex4;

/*
 * 4. Faça uma Thread que monitora um conjunto de threads e
exiba quais threads receberam sinais de interrupção.
 * 
 * @maralucilg
 */


import java.util.ArrayList;

public class ex4Main {

	private static final int NUM_THREADS = 3;

	public static void main(String[] args) {
		ArrayList<Thread> maisthreads = new ArrayList<Thread>();
		
		ThreadMonitor m = new ThreadMonitor(maisthreads);
		m.start();
		
		for(int i = 0; i < NUM_THREADS; i++) {
			
			maisthreads.add(new Thread(new ThreadSleepEx()));
			maisthreads.get(i).start();
			
			maisthreads.get(i).interrupt();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				System.out.println("[Interrupção do try/catch] \n "
						+ "Kenobi says:  Você deveria ter trazido equilíbrio à Força, não deixá-la na escuridão.");
			}
			
			
			
		}
		
		m.interrupt(); // interrompe a thread monitor
		


	}

}
