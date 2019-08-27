package ex5;

/*
 * 5. Faça uma thread Java que fica aguardando uma sequência
numérica de tamanho arbitrário digitado por usuário para
realizar uma soma. Use o join().
 * 
 * @maralucilg
 */

public class ex5Main {

	public static void main(String[] args) {
	Thread t5 = new Thread(new ThreadSoma());
	t5.start();
	System.out.println("Digite um número: ");
	try {
		t5.join(); 
	} catch (InterruptedException e) {
		System.out.println("Thread interrompida!");
	}
		System.out.println("Sequencia terminada");
	}

}
