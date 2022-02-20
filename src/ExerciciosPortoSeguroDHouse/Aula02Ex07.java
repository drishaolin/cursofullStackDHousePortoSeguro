package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula02Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Receber valores de base e altura de um tri�ngulo e verificar se s�o valores
		 * v�lidos (positivos maiores que zero). Em caso afirmativo, calcular a �rea do
		 * tri�ngulo.
		 */

		int base, altura, area;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o valor da base do tri�ngulo: ");
		base = entrada.nextInt();
		System.out.println("Entre com o valor da altura do tri�ngulo: ");
		altura = entrada.nextInt();

		if (base > 0 && altura > 0) {
			area = base * altura / 2;
			System.out.println("A �rea do tri�ngulo �: " + area);
		} else if (base <= 0)
			System.out.println("Valor da base inv�lido");
		else if (altura <= 0)
			System.out.println("Valor da altura inv�lido");

	}
}