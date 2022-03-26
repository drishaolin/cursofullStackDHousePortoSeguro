package AulaPoo;

public class Empregado01 extends Pessoa {

	// atributos específicos da subclasse Empregado01
	private int codigoSetor;
	private float salarioBase;
	private float imposto;

	// construtor
	public Empregado01(String nome, String endereco, String cpf, int telefone, int idade, int codigoSetor,
			float salarioBase, float imposto) {

		super(nome, endereco, cpf, telefone, idade); // indica os parâmetros que vem da superClasse
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	// getters e setters
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	// métodos da classe
	public void imprimirInfo() {
		/* @formatter:off */
		System.out.println(
				"\n Nome do empregado: " + getNome() + 
				"\n CPF: " + getCpf() + 
				"\n Idade: " + getIdade() + 
				"\n Telefone: " + getTelefone() + 
				"\n Endereço: " + getEndereco() + 
				"\n Código do setor: " + codigoSetor + 
				"\n Salário base: " + getSalarioBase() + 
				"\n Valor em porcentagem de imposto a ser retido do salário: " + imposto);
		/* @formatter:on */
	}

	public void calcularSalario() {
		double salarioLiquido = salarioBase - (salarioBase * (imposto / 100));
		System.out.println(
				"\n O salário total a ser recebido pelo empregado: " + getNome() + ", é igual a : " + salarioLiquido);
	}

}
