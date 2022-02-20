package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula02Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das
		 * seguintes categorias: Infantil A = 5 a 7 anos Infantil B = 8 a 11 anos
		 * Juvenil A = 12 a 13 anos Juvenil B = 14 a 17 anos Adultos = Maiores de 18
		 * anos
		 */

		int idade;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		if(idade < 5) System.out.println("Você é muito novo!!!");
		else if(5 <= idade && idade <= 7) System.out.println("Categoria Infantil A");
		else if(idade <= 11) System.out.println("Categoria Infantil B");
		else if(idade <= 13) System.out.println("Categoria Juvenil A");
		else if(idade <= 17) System.out.println("Categoria Juvenil B");
		else System.out.println("Categoria Adulto");
	}

}
