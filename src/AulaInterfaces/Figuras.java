package AulaInterfaces;

public interface Figuras {
	
	public String nomeInterface = "Figuras";
	
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	public double getArea();
	public double getPerimetro();
	double getDiagonal(); //se n�o colocar a palavra public, isso fica subentendido

}
