package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula02Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Construa um sistema para ler uma variável numérica N e imprimi-la somente se
		 * a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
		 */
		int numero;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		if(numero> 100) System.out.println(numero + " é maior que 100");
		else {
			numero = 0;
			System.out.println("Fim: " + numero);
		}
	}
}
