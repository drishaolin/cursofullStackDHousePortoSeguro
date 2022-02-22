package PortoSeguroPoo;

public class Operario extends Pessoa {

	private double valorProducao;
	private double comissao;

	// construtor
	public Operario(String nome, String endereco, String cpf, int telefone, int idade, double valorProducao,
			double comissao) {
		super(nome, endereco, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	// getters e setters
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	// métodos da classe
	public void imprimirInfo() {
		/* @formatter:off */
		System.out.println(
				"\n Nome do operário: " + getNome() + 
				"\n CPF: " + getCpf() + 
				"\n Idade: " + getIdade() + 
				"\nTelefone: " + getTelefone() + 
				"\nEndereço: " + getEndereco() + 
				"\n Valor monetário dos artigos produzidos: " + valorProducao +
				"\nPorcentagem da comissão deste artigo: " + comissao);
		/* @formatter:on */
	}

	public void calcularProducao() {
		double valorTotal = valorProducao + (valorProducao * (comissao / 100));
		System.out.println("\n O valor total a ser recebido pelo operário " + getNome() + 
				", será de : " + valorTotal);
	}

}
