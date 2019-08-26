package ex4;

import java.util.ArrayList;


/*


Faça uma Thread que monitora um conjunto de threads e exiba quais threads receberam sinais de interrupção.

@maralucilg



*/

public class ex4Main {

	private static final int NUM_THREADS = 3;

	public static void main(String[] args) {
		ArrayList<Thread> otherthreads = new ArrayList<Thread>();
		
		ThreadMonitor m = new ThreadMonitor(otherthreads);
		m.start();
		
		for(int i = 0; i < NUM_THREADS; i++) {
			
			othethreads.add(new Thread(new ThreadSleepEx()));
			otherthreads.get(i).start();
			
			otherthreads.get(i).interrupt();
			((Thread) otherthreads).sleep(10000);
			
			
		}
		
		m.interrupt();
		


	}

}
