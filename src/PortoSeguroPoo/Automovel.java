package PortoSeguroPoo;

public class Automovel {
	// declar��o de atributos da classe Automovel
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;

	// cria��o do m�todo especial construtor
	public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
		super();//indica a superclasse
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}

	// cria��o dos m�todos da classe
	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void imprimirInfo() {
		System.out.printf("\n %s possui um(a) %s com placa: %s e ano: %d", 
				nomeProprietario, modelo, placa, ano);
	}

}
