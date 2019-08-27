package ex4;

import java.util.ArrayList;

public class ThreadMonitor extends Thread {
	
	ArrayList<Thread> maisthreads;
	ThreadMonitor(ArrayList maisthreads) {
		this.maisthreads = maisthreads;
	}
	
	public void run() {
		
		while(maisthreads.size() > 0) { // loop do break
		
		for(int i = 0; i < maisthreads.size(); i++) {
			if(maisthreads.get(i).isInterrupted()) {
				System.out.println(maisthreads.get(i).getName());
			}
		}
		
		if(Thread.currentThread().isInterrupted()) {
			break;
		}
		}
		
	}

}
