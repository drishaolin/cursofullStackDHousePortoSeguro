package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula03Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		int[] numeros = new int[10];

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= numeros.length; i++) {
			System.out.printf("\n Entre com o n�mero %d:", i);
			numeros[i-1] = entrada.nextInt();
		}
		for (int j = 1; j <= numeros.length; j++) {
			if(numeros[j-1] % 2 == 0) System.out.printf("\n O n�mero %d � par",numeros[j-1]);
			else System.out.printf("\n O n�mero %d � �mpar",numeros[j-1]);
		}
		
	}
}
