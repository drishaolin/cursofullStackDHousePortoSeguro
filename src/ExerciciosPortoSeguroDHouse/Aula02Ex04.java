package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula02Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se
		 * este n�mero � par ou �mpar, e se � positivo ou negativo.
		 */

		int numero;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		numero = entrada.nextInt();

		if (numero % 2 == 0) {
			if (numero > 0)
				System.out.printf("O n�mero %d � par e positivo", numero);
			else
				System.out.printf("O n�mero %d � par e negativo", numero);
		} else if (numero > 0)
			System.out.printf("O n�mero %d � impar e positivo ", numero);
		else
			System.out.printf("O n�mero %d � impar e negativo", numero);
	}
}
