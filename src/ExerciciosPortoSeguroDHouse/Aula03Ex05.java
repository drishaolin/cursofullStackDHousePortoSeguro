package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula03Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
		 * igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */

		int num, soma = 0;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Entre com um n�mero, ou digite 0 para ver a soma: ");
			num = entrada.nextInt();
			soma+= num;
		} while (num != 0);
		
		System.out.printf("A soma dos n�meros �: %d", soma);
	}

}
