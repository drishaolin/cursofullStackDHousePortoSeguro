package AulasLogicaProgramacao;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] media = new float[5];
		float n1, n2, n3, somaMedia = 0, mediaGeral;
		int x, aprovados = 0;

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 5; x++) {
			System.out.println("\n Notas do aluno " + (x + 1));
			System.out.println("\n Entre com a primeira nota:");
			n1 = leia.nextFloat();
			while (n1 < 0 || n1 > 10) {
				System.out.println("Nota inválida... Entre com a primeira nota: ");
				n1 = leia.nextFloat();
			}
			System.out.println("\n Entre com a segunda nota:");
			n2 = leia.nextFloat();
			while (n2 < 0 || n2 > 10) {
				System.out.println("Nota inválida... Entre com a primeira nota: ");
				n2 = leia.nextFloat();
			}
			System.out.println("\n Entre com a terceira nota:");
			n3 = leia.nextFloat();
			while (n3 < 0 || n3 > 10) {
				System.out.println("Nota inválida... Entre com a primeira nota: ");
				n3 = leia.nextFloat();
			}

			media[x] = (n1 + n2 + n3) / 3;

			if (media[x] >= 7 && media[x] <= 10) {
				System.out.println("\n Aluno aprovado!!");
				aprovados++;
			}
			else if (media[x] >= 5 && media[x] < 7)
				System.out.println("\n Aluno de exame!!");
			else
				System.out.println("\n Aluno reprovado!!");

			System.out.println("\n Média: " + media[x]);
			somaMedia += media[x];
		}
		mediaGeral = somaMedia / x; // x é o ultimo valor do loop, igual a quantidade de alunos
		
		System.out.println("\n Media Geral: " + mediaGeral);
		System.out.println("\n Alunos Aprovados: " + aprovados);

	}

}
