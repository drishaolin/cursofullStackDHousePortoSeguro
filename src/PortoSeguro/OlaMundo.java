package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade = 40;
		float altura;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in); //criando a entrada de dados
		
		System.out.println("Olá Mundo!");
		System.out.println("Olá usuário!\n\t\tEntre com seu nome: ");
		nome = leia.nextLine(); //pegando a entrada do usuário como texto
		System.out.println("\n\tEntre com sua altura: ");
		altura = leia.nextFloat();
		
//		System.out.println("\nMeu nome é: " +nome+ " e tenho " +idade+ 
//				" anos e minha altura é " + altura);
		//OUTRO MODO DE ESCREVER:
		System.out.printf("\n\tMeu nome é %s e tenho %d anos de idade"
				+ " e minha altura é %.2f.",nome, idade,altura);
		

	}

}
