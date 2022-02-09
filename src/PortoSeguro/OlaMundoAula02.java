package PortoSeguro;


import java.util.Scanner;

public class OlaMundoAula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3, media;
		int x,y;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in); //criando a entrada de dados
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
		if(media >= 7 && media <= 10) {
			System.out.println("\nAluno aprovado!!!");
		} else if(media >= 5 && media < 7){
			System.out.println("\nAluno de exame!!!");
		} else if(media >= 0 && media < 5) {
			System.out.println("\nAluno reprovado!!!");
		} else {
			System.out.println("\nMédia inválida!!!");
		}
		
		System.out.printf("\nMédia aritmética: %2.2f",media);
		
		nota1 = Math.sqrt(nota1); //raiz quadrada
		nota2 = Math.pow(nota3,  3); //potencia
		
		System.out.println("\n\nEntre com o valor de X: ");
		x = leia.nextInt();
		System.out.println("\nEntre com o valor de Y: ");
		y = leia.nextInt();
		
		x = x % y; // calcula resto da divisão de dois numeros inteiros
		System.out.println("\nO resto da divisão é: " + x);
		

	}

}
