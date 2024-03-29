package EX26;

import java.util.Scanner;

public class Ex26DoWhile {

	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite o numero que vamos calcular a tabuada:");
		int numero_tabuada = stdin.nextInt();
		
		//Checando se o numero digitado � negativo
		while (numero_tabuada < 0 ) {
			
			System.out.print("N�meros negativos n�o s�o permitidos.\n");
			System.out.print("Digite o numero que vamos calcular a tabuada:");
			numero_tabuada = stdin.nextInt();
			
		}
		
		System.out.print("Digite o numero que vamos iniciar calculando a tabuada:"); 
		int tabuada_de = stdin.nextInt();
		
		//Checando se o numero digitado � negativo.
		while(tabuada_de < 0) {
			
			System.out.print("N�meros negativos n�o s�o permitidos.\n");
			System.out.print("Digite o numero que vamos iniciar calculando a tabuada:"); 
			tabuada_de = stdin.nextInt();
			
		}
		
		System.out.print("Digite o numero de at� onde vamos calcular a tabuada:");
		int tabuada_ate = stdin.nextInt();
		
		//Checando se o numero digitado � negativo.
		while (tabuada_ate < 0) {
			System.out.print("N�meros negativos n�o s�o permitidos.\n");
			System.out.print("Digite o numero de at� onde vamos calcular a tabuada:"); 
			tabuada_ate = stdin.nextInt();
		}
		
		//Checando se o numero at� onde vamos calcular a tabuada � maior que o inicio, se n�o
		//� impossivel fazer a tabuada.
		while (tabuada_ate < tabuada_de) {
			System.out.printf("N�o podemos calcular a tabuada do %d de %d at� %d\n",numero_tabuada,tabuada_de,tabuada_ate);
			System.out.print("Digite o numero de at� onde vamos calcular a tabuada:"); 
			tabuada_ate = stdin.nextInt();
			//Checando dnv se o numero � negativo.
			while (tabuada_ate < 0) {
				System.out.print("N�meros negativos n�o s�o permitidos.\n");
				System.out.print("Digite o numero de at� onde vamos calcular a tabuada:"); 
				tabuada_ate = stdin.nextInt();
			}
		}
		
		int i = tabuada_de;
		do {
			System.out.printf("%d X %d = %d\n",numero_tabuada,i,numero_tabuada*i);
			i++;
		}
		while (tabuada_ate >= i);
		
		stdin.close();
	}
}
