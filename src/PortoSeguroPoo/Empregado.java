package PortoSeguroPoo;

import java.text.NumberFormat;

public class Empregado {
	
	//criação dos atributos
	private String nome;
	private double salario;
	
	//método construtor
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
	
	//outros métodos
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual / 100; 
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //coloca a moeda do país
		nf.setMinimumFractionDigits(2); // quantidde de casas decimais
		String formatoMoeda = nf.format(salario); // formatação monetária do valor
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.printf("\n %s \t\t Salário: %s", nome, this.formatarMoeda());
		//System.out.println(nome + "\t\t Salário: " + this.formatarMoeda());
		
	}
	
	

}
