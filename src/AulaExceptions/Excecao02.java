package AulaExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao02 {

	// demonstra lan�amento de uma exce��o quando ocorre uma divis�o por zero:
	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean continueLoop = true; // determina se mais entradas s�o necess�rias

		do {
			try {
				System.out.println("\n Entre com o numerador: ");
				int numerador = entrada.nextInt();
				System.out.println("\n Entre com o denominador: ");
				int denominador = entrada.nextInt();

				int resultado = quociente(numerador, denominador);
				System.out.printf("\n Resultado: %d / %d = %d \n", numerador, denominador, resultado);
				continueLoop = false;
				// fim do try!!
			} catch (InputMismatchException inputMismatchException) {
				System.err.printf("\n\nException: %s \n", inputMismatchException );
				entrada.nextLine();
				System.out.println("\nVoc� deve inserir um valor do tipo inteiro..."
						+ "Por favor, tente novamente!!");
			} catch (ArithmeticException arithmeticException) {
				System.err.printf("\n\n Exception: %s \n", arithmeticException);
				System.out.println("\n Zero � um denominador inv�lido!! "
						+ "Por favor, tente novamente...");
			}
		} while (continueLoop);
		
		entrada.close();
		

	}

}
