package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula02Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3
		 * grupos de ind�strias que s�o altamente poluentes do meio ambiente. O �ndice
		 * de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as
		 * ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, se o
		 * �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a
		 * suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem
		 * ser notificados a paralisarem suas atividades. Fa�a um sistema que leia o
		 * �ndice de polui��o medido e emita a notifica��o adequada aos diferentes
		 * grupos de empresas.
		 */
		float indicePoluicao;
		final float pausaGrupo1 = 0.3f, pausaGrupo2 = 0.4f, pausaGrupo3 = 0.5f;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o �ndice de polui��o? ");
		indicePoluicao = entrada.nextFloat();

		if (pausaGrupo2 > indicePoluicao && indicePoluicao >= pausaGrupo1)
			System.out.println("Industrias Grupo 1 devem suspender atividades");
		else if (pausaGrupo3 > indicePoluicao && indicePoluicao >= pausaGrupo2)
			System.out.println("Industrias Grupos 1 e 2 devem suspender atividades");
		else if (indicePoluicao >= pausaGrupo3)
			System.out.println("Industrias Grupos 1, 2 e 3 devem suspender atividades");

	}

}
