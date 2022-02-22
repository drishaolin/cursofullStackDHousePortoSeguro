package PortoSeguroPoo;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	//construtor
	public Pessoa(String nome, String endereco, String cpf, int telefone, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//m�todos da classe
	public void validarCpf() {
		if(getCpf().length() !=11) {
			System.out.println("\n ********** CPF Inv�lido! **********");
		} else {
			System.out.println("\n ********** CPF V�lido! ********** ");
		}
	}
	
	
	
	

}