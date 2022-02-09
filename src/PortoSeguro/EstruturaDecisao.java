package PortoSeguro;

import java.util.Scanner;

public class EstruturaDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, resultado = 0;
		int op;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		n2 = ler.nextFloat();
		
		System.out.println("\n\t\tCalculadora");
		System.out.println("\n 1 - Soma");
		System.out.println("\n 2 - Diferença");
		System.out.println("\n 3 - Multiplicação");
		System.out.println("\n 4 - Divisão");
		System.out.println("\nEntre com sua opção:");
		op = ler.nextInt();
		
		//switch case pode ser usado com valores inteiros, strings ou chars
		//não recomendado com numeros decimais
		switch(op) {
		case 1:
			resultado = n1 + n2;
			break;
		case 2: 
			resultado = n1 - n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4: 
			if(n2 == 0) {
				System.out.println("\n Não existe divisão por zero!!!");
			} else	resultado = n1 / n2;
			break;
		default:
			System.out.println("\n Opção inválida...");
		}
		System.out.println("\n Resultado: " + resultado);

	}

}
