package PortoSeguro;

import java.util.Scanner;

public class ExercicioDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Faça um sistema que leia um número inteiro e mostre uma mensagem
		 indicando se este número é par ou ímpar, e se é positivo ou negativo
		 */
		int numero;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\n Entre com um número inteiro: ");
			numero = leia.nextInt();
		}
		if(numero % 2 == 0 ) 
		{
			if(numero >=0) 
			{
				System.out.println("\nEsse número é par e positivo");
			} 
			else  System.out.println("\nEsse número é par e negativo");
		} 
		else {
			if(numero >=0) 
			{
				System.out.println("\nEsse número é impar e positivo");
			} 
			else  System.out.println("\nEsse número é impar e negativo");
		}

	}

}
