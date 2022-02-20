package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula02Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se
		 * este número é par ou ímpar, e se é positivo ou negativo.
		 */

		int numero;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = entrada.nextInt();

		if (numero % 2 == 0) {
			if (numero > 0)
				System.out.printf("O número %d é par e positivo", numero);
			else
				System.out.printf("O número %d é par e negativo", numero);
		} else if (numero > 0)
			System.out.printf("O número %d é impar e positivo ", numero);
		else
			System.out.printf("O número %d é impar e negativo", numero);
	}
}
