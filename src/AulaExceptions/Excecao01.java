package AulaExceptions;

public class Excecao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
			//captura de uma poss�vel exce��o:
		} catch (NullPointerException e) {
			//tratamento da exce��o:
			System.out.println("\n A frase inicial est� nula, para solucionar tal problema,"
					+ "foi lhe atribu�do um valor default...");
			frase = "Agora tem algo aqui";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("\n Frase antiga: " + frase);
		System.out.println("\n Nova Frase: " + novaFrase);
		

	}

}
