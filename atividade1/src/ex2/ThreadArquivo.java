package ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThreadArquivo implements Runnable {
	
	BufferedReader b;
	
	ThreadArquivo(String arq) {
		
		try {
			this.b = new BufferedReader(new FileReader(arq));
		} catch (FileNotFoundException e) {
			System.out.println("ERRO arquivo!");
		}
	}

	@Override
	public void run() {
		
		String l;
		
		
		try {
			while((l = b.readLine())!= null) {
				
				System.out.println(l);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					System.out.println("Thread interrompida!");
					break;
				
				}
				
			}
		} catch (IOException e) {
			System.out.println("Thread interrompida!");
		}
	
		
		
		
	}

}
