package AulaPolimorfismo;

public class Celular extends Telefone {

	public Celular() {
		super("Telefone Celular"); //como só tem um parâmetro, podemos passar o valor diretamente
	}
	
	@Override //indica o método polimórfico que sobrescreve o método da superclasse
	//nome do parâmetro não precisa ser o mesmo; o nome do método e tipo de dados, sim:
	public void toca(int codigoToque) { 
		switch(codigoToque) {
		case 1: 
			System.out.println("\n Chalala...");
			break;
		case 2: 
			System.out.println("\nTananinana..");
			break;
		default:
			System.out.println("\n Ta... tanana... tanana");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número : " + numero + " é um celular...");
	}

}
