package AulaPolimorfismo;

public abstract class Telefone {
	
	private String tipo;
	
	//declara��o dos m�todos abstratos:
	abstract public void disca(String numero);
	abstract public void toca(int numToques);
	
	public Telefone(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo( ) {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
