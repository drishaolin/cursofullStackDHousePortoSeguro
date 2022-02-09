package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e
		 * n�mero de horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se
		 * que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50
		 * calcule o excesso de pagamento armazenando-o na vari�vel E, caso contr�rio
		 * zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. No final do
		 * processamento imprimir o sal�rio total e o sal�rio excedente.
		 * 
		 */

		final float valorHora = 10.00f;
		final float valorHoraExcedente = 20.00f;
		final float horasTrabalhadasMax = 50.0f;
		float horasTrabalhadas = 0.0f, horasTrabalhadasExcedentes = 0.0f;
		float salario = 0.00f, salarioExcedente = 0.00f;

		@SuppressWarnings("resource")
		Scanner entradaHoras = new Scanner(System.in);

		System.out.println("\n Entre com o n�mero de horas trabalhadas: ");
		horasTrabalhadas = entradaHoras.nextFloat();
		if (horasTrabalhadas < horasTrabalhadasMax) {
			salario = horasTrabalhadas * valorHora;
			System.out.printf(
					"Voc� trabalhou %.1f horas, sal�rio: R$ %.2f, horas excedentes: %.1f,"
					+ "salario excedente: R$ %.2f",
					horasTrabalhadas,salario, horasTrabalhadasExcedentes, salarioExcedente);
		} else {
			salario = horasTrabalhadas * valorHora;
			horasTrabalhadasExcedentes = horasTrabalhadas - horasTrabalhadasMax;
			salarioExcedente = horasTrabalhadasExcedentes * valorHoraExcedente;
			System.out.printf(
					"Voc� trabalhou %.1f horas, sal�rio: R$ %.2f, horas excedentes: %.1f,"
					+ "salario excedente: R$ %.2f",
					horasTrabalhadas,salario, horasTrabalhadasExcedentes, salarioExcedente);
		}
	}

}
