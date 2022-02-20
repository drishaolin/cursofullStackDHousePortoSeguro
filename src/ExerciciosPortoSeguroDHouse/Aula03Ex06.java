package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula03Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. E no
		 * final imprimir a média dos números múltiplos de 3. Para sair digitar
		 * 0(zero).(DO...WHILE)
		 */

		int numero, somaMultiplos3 = 0, media, contador = 0;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Digite um número ou 0 para sair: ");
			numero = entrada.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				somaMultiplos3 += numero;
				contador++;
			}

		} while (numero != 0);

		if (contador != 0) {
			media = somaMultiplos3 / contador;
			System.out.printf("\n A soma dos múltiplos de 3 é : %d "
					+ "e a media é: %d", somaMultiplos3, media);
		} else
			System.out.println("Não existem múltiplos de 3...");
	}

}
