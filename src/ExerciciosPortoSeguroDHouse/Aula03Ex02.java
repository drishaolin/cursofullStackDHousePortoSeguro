package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula03Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		int[] numeros = new int[10];

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= numeros.length; i++) {
			System.out.printf("\n Entre com o número %d:", i);
			numeros[i-1] = entrada.nextInt();
		}
		for (int j = 1; j <= numeros.length; j++) {
			if(numeros[j-1] % 2 == 0) System.out.printf("\n O número %d é par",numeros[j-1]);
			else System.out.printf("\n O número %d é ímpar",numeros[j-1]);
		}
		
	}
}
