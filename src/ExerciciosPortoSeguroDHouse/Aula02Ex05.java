package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula02Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3
		 * grupos de indústrias que são altamente poluentes do meio ambiente. O índice
		 * de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as
		 * indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o
		 * índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a
		 * suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem
		 * ser notificados a paralisarem suas atividades. Faça um sistema que leia o
		 * índice de poluição medido e emita a notificação adequada aos diferentes
		 * grupos de empresas.
		 */
		float indicePoluicao;
		final float pausaGrupo1 = 0.3f, pausaGrupo2 = 0.4f, pausaGrupo3 = 0.5f;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o índice de poluição? ");
		indicePoluicao = entrada.nextFloat();

		if (pausaGrupo2 > indicePoluicao && indicePoluicao >= pausaGrupo1)
			System.out.println("Industrias Grupo 1 devem suspender atividades");
		else if (pausaGrupo3 > indicePoluicao && indicePoluicao >= pausaGrupo2)
			System.out.println("Industrias Grupos 1 e 2 devem suspender atividades");
		else if (indicePoluicao >= pausaGrupo3)
			System.out.println("Industrias Grupos 1, 2 e 3 devem suspender atividades");

	}

}
