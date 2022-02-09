package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Elabore um sistema que leia as variáveis C e N, respectivamente código e
		 * número de horas trabalhadas de um operário. E calcule o salário sabendo-se
		 * que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50
		 * calcule o excesso de pagamento armazenando-o na variável E, caso contrário
		 * zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do
		 * processamento imprimir o salário total e o salário excedente.
		 * 
		 */

		final float valorHora = 10.00f;
		final float valorHoraExcedente = 20.00f;
		final float horasTrabalhadasMax = 50.0f;
		float horasTrabalhadas = 0.0f, horasTrabalhadasExcedentes = 0.0f;
		float salario = 0.00f, salarioExcedente = 0.00f;

		@SuppressWarnings("resource")
		Scanner entradaHoras = new Scanner(System.in);

		System.out.println("\n Entre com o número de horas trabalhadas: ");
		horasTrabalhadas = entradaHoras.nextFloat();
		if (horasTrabalhadas < horasTrabalhadasMax) {
			salario = horasTrabalhadas * valorHora;
			System.out.printf(
					"Você trabalhou %.1f horas, salário: R$ %.2f, horas excedentes: %.1f,"
					+ "salario excedente: R$ %.2f",
					horasTrabalhadas,salario, horasTrabalhadasExcedentes, salarioExcedente);
		} else {
			salario = horasTrabalhadas * valorHora;
			horasTrabalhadasExcedentes = horasTrabalhadas - horasTrabalhadasMax;
			salarioExcedente = horasTrabalhadasExcedentes * valorHoraExcedente;
			System.out.printf(
					"Você trabalhou %.1f horas, salário: R$ %.2f, horas excedentes: %.1f,"
					+ "salario excedente: R$ %.2f",
					horasTrabalhadas,salario, horasTrabalhadasExcedentes, salarioExcedente);
		}
	}

}
