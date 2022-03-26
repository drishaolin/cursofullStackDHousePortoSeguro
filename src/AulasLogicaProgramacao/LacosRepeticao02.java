package AulasLogicaProgramacao;

import java.util.Scanner;

public class LacosRepeticao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabuada, x = 1, resultado;

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		System.out.println("\n Entre qual tabuada deseja visualizar: ");
		tabuada = leia.nextInt();

		do {
			resultado = x * tabuada;
			System.out.printf("\n %d X %d = %d", tabuada, x, resultado);
			x++;
		} while (x <= 10);

	}

}
