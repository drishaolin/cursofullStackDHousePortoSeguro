package ExerciciosPortoSeguroDHouse;

public class Aula03Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos
		 * resto = 5. (FOR)
		 */
		
		int counter = 0;
		for(int i = 1000; i<+1999; i++) {
			if(i%11 == 5) {
				counter++;
				System.out.printf("\n %d - %d / 11 tem resto 5",counter,i);
			}
		}
	}

}
