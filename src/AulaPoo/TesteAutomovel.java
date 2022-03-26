package AulaPoo;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando um objeto da classe Automovel
		Automovel auto = new Automovel("Adriana Mucciolo", "Celta", "EBX 2309", 2008);
		auto.imprimirInfo();
		System.out.println("\n\n**************************************");
		System.out.println("Transferência de proprietário: ");
		auto.setNomeProprietario("Anderson Innocencio");
		System.out.println("\n**************************************");
		auto.imprimirInfo();
	}

}
