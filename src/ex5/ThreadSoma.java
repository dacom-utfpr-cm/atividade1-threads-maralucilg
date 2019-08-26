package ex5;

import java.util.Scanner;

public class ThreadSoma implements Runnable {

	@Override
	public void run() {
		Scanner s = new Scanner(System.in);
		int num, soma = 0;
		num = s.nextInt();
		for(int i = 0; i <= num; i++) {	
					soma+= s.nextInt();
		}
		System.out.println("número final" + " " + soma);
		
		
	}

}
