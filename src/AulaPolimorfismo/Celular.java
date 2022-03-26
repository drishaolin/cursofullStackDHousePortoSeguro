package AulaPolimorfismo;

public class Celular extends Telefone {

	public Celular() {
		super("Telefone Celular"); //como s� tem um par�metro, podemos passar o valor diretamente
	}
	
	@Override //indica o m�todo polim�rfico que sobrescreve o m�todo da superclasse
	//nome do par�metro n�o precisa ser o mesmo; o nome do m�todo e tipo de dados, sim:
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
		System.out.println("\nO n�mero : " + numero + " � um celular...");
	}

}
