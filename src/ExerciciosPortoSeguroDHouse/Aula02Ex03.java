package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula02Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolva um sistema em que: 
		 * leia 4 (quatro) números; 
		 * calcule o quadrado de cada um; 
		 * se o valor resultante do quadrado do terceiro for >= 1000, 
		 * imprima-o e finalize; 
		 * caso contrário, imprima os valores lidos e
		 * seus respectivos quadrados.
		 */

		double[] numeros = new double[4], quadradosNum = new double[4];

		@SuppressWarnings("resource")
		Scanner entradaNum = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("\n Entre com o numero %d: ", i+1);
			numeros[i] = entradaNum.nextInt();
			quadradosNum[i] = Math.pow(numeros[i],2);
		}
		
		if(quadradosNum[2] >= 1000) {
			System.out.printf("\n O quadrado de %.2f é: %.2f",numeros[2],quadradosNum[2]);
			
		}else {
			for(int i = 0; i < numeros.length; i++) {
				
			System.out.printf("\n %.2f ^ 2 = %.2f ",numeros[i], quadradosNum[i]);
			}
			
		}
		

	}

}
