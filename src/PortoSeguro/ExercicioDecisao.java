package PortoSeguro;

import java.util.Scanner;

public class ExercicioDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem
		 indicando se este n�mero � par ou �mpar, e se � positivo ou negativo
		 */
		int numero;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\n Entre com um n�mero inteiro: ");
			numero = leia.nextInt();
		}
		if(numero % 2 == 0 ) 
		{
			if(numero >=0) 
			{
				System.out.println("\nEsse n�mero � par e positivo");
			} 
			else  System.out.println("\nEsse n�mero � par e negativo");
		} 
		else {
			if(numero >=0) 
			{
				System.out.println("\nEsse n�mero � impar e positivo");
			} 
			else  System.out.println("\nEsse n�mero � impar e negativo");
		}

	}

}
