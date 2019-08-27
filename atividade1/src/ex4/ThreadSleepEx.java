package ex4;

public class ThreadSleepEx implements Runnable {
	


		@Override
		public void run() {
			
					
				try {
					Thread.sleep((long)(Math.random() * 10000));
					System.out.println( "Nome = " + Thread.currentThread( ).getName( ));
					System.out.println("May the force be with you!");
				} catch (InterruptedException e) {
					System.out.println( "Thread interrompida!");
				}
				
		
			
			
		}

}
