package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula03Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		 * 0(zero).(DO...WHILE)
		 */

		int numero, somaMultiplos3 = 0, media, contador = 0;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Digite um n�mero ou 0 para sair: ");
			numero = entrada.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				somaMultiplos3 += numero;
				contador++;
			}

		} while (numero != 0);

		if (contador != 0) {
			media = somaMultiplos3 / contador;
			System.out.printf("\n A soma dos m�ltiplos de 3 � : %d "
					+ "e a media �: %d", somaMultiplos3, media);
		} else
			System.out.println("N�o existem m�ltiplos de 3...");
	}

}
