package PortoSeguroPoo;

import java.text.NumberFormat;

public class Empregado {
	
	//cria��o dos atributos
	private String nome;
	private double salario;
	
	//m�todo construtor
	public Empregado(String n, double s) {
		this.setNome(n);
		this.setSalario(s);
	}

	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//outros m�todos
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual / 100; 
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //coloca a moeda do pa�s
		nf.setMinimumFractionDigits(2); // quantidde de casas decimais
		String formatoMoeda = nf.format(salario); // formata��o monet�ria do valor
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.printf("\n %s \t\t Sal�rio: %s", nome, this.formatarMoeda());
		//System.out.println(nome + "\t\t Sal�rio: " + this.formatarMoeda());
		
	}
	
	

}
