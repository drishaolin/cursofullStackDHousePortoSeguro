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
		
		System.out.println("Ol� Mundo!");
		System.out.println("Ol� usu�rio!\n\t\tEntre com seu nome: ");
		nome = leia.nextLine(); //pegando a entrada do usu�rio como texto
		System.out.println("\n\tEntre com sua altura: ");
		altura = leia.nextFloat();
		
//		System.out.println("\nMeu nome �: " +nome+ " e tenho " +idade+ 
//				" anos e minha altura � " + altura);
		//OUTRO MODO DE ESCREVER:
		System.out.printf("\n\tMeu nome � %s e tenho %d anos de idade"
				+ " e minha altura � %.2f.",nome, idade,altura);
		

	}

}
