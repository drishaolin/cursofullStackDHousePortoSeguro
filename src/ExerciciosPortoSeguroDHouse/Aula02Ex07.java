package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula02Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Receber valores de base e altura de um triângulo e verificar se são valores
		 * válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do
		 * triângulo.
		 */

		int base, altura, area;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o valor da base do triângulo: ");
		base = entrada.nextInt();
		System.out.println("Entre com o valor da altura do triângulo: ");
		altura = entrada.nextInt();

		if (base > 0 && altura > 0) {
			area = base * altura / 2;
			System.out.println("A área do triângulo é: " + area);
		} else if (base <= 0)
			System.out.println("Valor da base inválido");
		else if (altura <= 0)
			System.out.println("Valor da altura inválido");

	}
}