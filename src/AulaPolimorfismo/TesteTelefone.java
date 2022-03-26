package AulaPolimorfismo;

public class TesteTelefone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Celular celular = new Celular();
		Fixo fixo = new Fixo();
		Publico publico = new Publico();

		Telefone telefone = null; // não é objeto, é uma variável do tipo Telefone

		int n = (int) (Math.random() * 3.0); // gera um número aleátorio entre 0 e 2

		System.out.println("\nO número escolhido foi: " + n);

		switch (n) {
		case 0:
			telefone = celular;
			break;
		case 1:
			telefone = fixo;
			break;
		case 2:
			telefone = publico;
			break;
		default:
			System.out.println("\n Erro inesperado!!!");
		}
		
		if(telefone !=null) {
			telefone.disca("923454544");
			telefone.toca(2);
		}

	}

}
