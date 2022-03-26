package AulaInterfaces;

public class Quadrado extends BaseFigura implements Figuras {

	//construtor da classe Quadrado
	Quadrado(double lado, String nome) {
		super(lado, lado, nome);
		nomeClasse = "Quadrado"; //atributo definido na classe pai BaseFigura
	}

	@Override
	public double getDiagonal() {
		return Math.sqrt(2) * lado1;
	}

}
