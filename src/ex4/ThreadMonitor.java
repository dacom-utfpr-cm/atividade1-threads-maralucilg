package ex4;

import java.util.ArrayList;

public class ThreadMonitor extends Thread {
	
	ArrayList<Thread> otherthreads;
	ThreadMonitor(ArrayList otherthreads) {
		this.otherthreads = otherthreads;
	}
	
	public void run() {
		while (otherthreads.size()) {
			int i = 0;
			if(otherthreads.get(i).isAlive()) {
				System.out.println(otherthreads.get(i).getName());
			}
			
		if(Thread.currentThread().isInterrupted()){
			break;
		}
		}
	}

}
