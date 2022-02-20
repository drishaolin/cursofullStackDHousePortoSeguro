package PortoSeguroPoo;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado[] listaEmpregados = new Empregado[3];
		
		listaEmpregados[0] = new Empregado("Adriana Mucciolo", 10000);
		listaEmpregados[1] = new Empregado("Ricardo Calixto", 12000);
		listaEmpregados[2] = new Empregado("Anderson Innocencio", 15000);
		
		for(Empregado item:listaEmpregados) {
			item.imprimir();
		}
		
		System.out.println("\n\n*******************************************************"
				+ "\nAtualização salarial: ");

		for(Empregado item:listaEmpregados) {
			item.aumentarSalario(10);
			item.imprimir();
		}
	}

}
