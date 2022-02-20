package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula03Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99. (WHILE)
		 */
		
		int idade = 0, jovens = 0, idosos = 0;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
				
		while(idade!=-99) {
			System.out.println("Entre com a idade ou -99 para encerrar:");
			idade = entrada.nextInt();
			if(idade > 0 && idade <= 21) jovens++;
			if(idade >= 50) idosos++;
		}
		System.out.printf("Jovens menor de 21 anos: %d;"
				+ " e Idosos maior de 50 anos: %d.",jovens,idosos);
		
		

	}

}
