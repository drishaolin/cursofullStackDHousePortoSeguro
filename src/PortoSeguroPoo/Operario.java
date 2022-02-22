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

	// m�todos da classe
	public void imprimirInfo() {
		/* @formatter:off */
		System.out.println(
				"\n Nome do oper�rio: " + getNome() + 
				"\n CPF: " + getCpf() + 
				"\n Idade: " + getIdade() + 
				"\nTelefone: " + getTelefone() + 
				"\nEndere�o: " + getEndereco() + 
				"\n Valor monet�rio dos artigos produzidos: " + valorProducao +
				"\nPorcentagem da comiss�o deste artigo: " + comissao);
		/* @formatter:on */
	}

	public void calcularProducao() {
		double valorTotal = valorProducao + (valorProducao * (comissao / 100));
		System.out.println("\n O valor total a ser recebido pelo oper�rio " + getNome() + 
				", ser� de : " + valorTotal);
	}

}
