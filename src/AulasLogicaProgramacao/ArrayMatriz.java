package AulasLogicaProgramacao;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numeros = new int[2][3]; // primeira dimensão são as linhas, segunda dimensão, as colunas
		int linha, coluna, quantPar = 0, somaImpar = 0;
		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 2; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("\nEntre com um número: ");
				numeros[linha][coluna] = leia.nextInt();
				if (numeros[linha][coluna] % 2 == 0) {
					quantPar++;
				} else {
					somaImpar += numeros[linha][coluna];
				}
			}
		}
		System.out.println("\n Quantidade de numeros pares: " + quantPar);
		System.out.println("\nSomatório dos numeros ímpares:" + somaImpar);

	}

}
