package ExerciciosPortoSeguroDHouse;

import java.util.Scanner;

public class Aula02Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador 
		 * para controlar o rendimento di�rio de seu trabalho. Toda vez que 
		 * ele traz um peso de tomate maior que o estabelecido pelo regulamento 
		 * do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por
		 * quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a
		 * vari�vel P (peso de tomates) e verifique se h� excesso. Se houver, 
		 * gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que
		 * Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o 
		 * conte�do ZERO.
		 */
		
		final int pesoMax = 50;
		final float taxaMulta = 4.00f;
		
		float peso = 0, excesso = 0, multa = 0;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o peso: ");
		peso = entrada.nextFloat();		
		
		if(peso > pesoMax) {
			excesso = peso - pesoMax;
			multa = excesso * taxaMulta;
			System.out.printf("\n Seu peso � %.2f kg, excesso: %.2f kg e multa: R$ %.2f.",peso,excesso,multa);
			
		}
		else {
			System.out.printf("\n Seu peso � %.2f kg, excesso: %.2f kg e multa: R$ %.2f.",peso,excesso,multa);
			
		}

	}

}
