package PortoSeguro;

import java.util.Scanner;

public class LacosRepeticao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media,somaMedia = 0, mediaGeral;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		for(int i = 1; i<= 5; i++) {
			System.out.printf("\nNotas do aluno %d", i);
			System.out.println("\n\t Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			while(n1<0 || n1>10) {
				System.out.println("\n Nota inválida... \n\t Entre com a primeira nota:");
				n1 = leia.nextFloat();
			}
			System.out.println("\n\t Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			while(n2<0 || n2>10) {
				System.out.println("\n Nota inválida... \n\t Entre com a segunda nota:");
				n2 = leia.nextFloat();
			}
			System.out.println("\n\t Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			while(n3<0 || n3>10) {
				System.out.println("\n Nota inválida... \n\t Entre com a terceira nota:");
				n3 = leia.nextFloat();
			}
			
			media = (n1+n2+n3) / 3;
			
			somaMedia = somaMedia + media; //== somaMedia+= media
		}
		mediaGeral = somaMedia / 5;
		System.out.printf("\n Média Geral %2.2f", mediaGeral);
	}

}
