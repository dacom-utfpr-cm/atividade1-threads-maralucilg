package ex2;


/*


Faça uma thread Java que realize a leitura de um arquivo texto com frases e exiba as frases a cada 10 segundos.

@maralucilg



*/

public class ex2Main {

	public static void main(String[] args) {
		
		new Thread(new ThreadArquivo("arquivo.txt")).start();
		
	}

}
