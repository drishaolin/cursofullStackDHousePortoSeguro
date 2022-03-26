package AulaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {

		int opcoes;
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n-----------------------------------------------------");
			System.out.println("\n (1) Deseja adicionar produtos no estoque?");
			System.out.println("\n (2) Deseja remover produtos do estoque?");
			System.out.println("\n (3) Deseja atualizar produtos do estoque?");
			System.out.println("\n (4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n (0) Deseja sair do programa?");
			System.out.println("\n-----------------------------------------------------");
			System.out.println("\n Digite uma opção: ");
			opcoes = entrada.nextInt();
			
			
			
			
			switch (opcoes) {
			case 1:
				entrada.nextLine(); //limpeza do cache de memória
				System.out.println("\n Digite o produto para adicionar ao estoque: ");
				String adicionarProd = entrada.nextLine();
				//adicionarProd = adicionarProd.toUpperCase(); //padronizar a entrada do usuário
				estoque.add(adicionarProd);
				break;
				
			case 2:
				entrada.nextLine(); //limpeza do cache de memória
				System.out.println("\n Digite o produto para remover do estoque: ");
				String removerProd = entrada.nextLine();
				//removerProd = removerProd.toUpperCase();
				//verificar se o produto existe no estoque antes de removê-lo:
				if(estoque.contains(removerProd)) {
					estoque.remove(removerProd);
					System.out.println("\n O produto: " + removerProd + " foi removido do estoque.");
				} else {
					System.out.println("\n Produto não encontrado...");
				}
				System.out.println(estoque);
				break;
			case 3: 
				entrada.nextLine();
				System.out.println("\n Digite o produto que quer atualizar: ");
				String verificaProd = entrada.nextLine();
				System.out.println("\n Digite o nome do produto que entrará no lugar de:  " + verificaProd);
				String novoProd = entrada.nextLine();
				
				if(estoque.contains(verificaProd)) {
					estoque.remove(verificaProd);
					estoque.add(novoProd);
				} else {
					System.out.println("\n Produto não encontrado...");
				}
				System.out.println(estoque);
				break;
			case 4: 
				System.out.println("\n Os produtos do estoque são: \n" + estoque);
				break;
			default:
				if(opcoes == 0) {
					System.out.println("\n Obrigado por utilizar o programa!");
				} else {
					System.out.println("\n Opção inválida...");
				}
				break;
			}
			
		} while (opcoes != 0);
		
		
		
		entrada.close();
		
	}

}
