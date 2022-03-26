package AulaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes1 {

	public static void main(String[] args) {

		//cria��o do List
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		//inser��o dos elementos do meu ArrayList --> minhaLista
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		minhaLista.add(8);
		minhaLista.add(5);
		minhaLista.add(1);
		
		//vou percorrer todos os elementos da minhaLista
		for (Integer elemento : minhaLista) {
			System.out.println(elemento);
		}
		
		System.out.println("\n Removendo um elemento da lista...");
		System.out.println(); //limpando o cache de mem�ria
		
		minhaLista.remove(0);
		
		for (Integer elemento : minhaLista) {
			System.out.println(elemento);
		}
		
		//metodo get, pega o valor de um elemento da minha lista atrav�s do seu �ndice
		int primeiroElemento = minhaLista.get(0); 
		System.out.println("\n O primeiro elemento da minha lista �: " + primeiroElemento);
		
		System.out.println(); //limpando o cache de mem�ria
		
		for(int i=0; i< minhaLista.size(); i++) {
			System.out.println("\n Elemento " + i + ": " + minhaLista.get(i));
		}
		
		//ordena os elementos da minha lista em ordem crescente
		Collections.sort(minhaLista);
		System.out.println("\n Depois de ordenar a minha lista, temos: \n" + minhaLista);
		System.out.println(); //limpando o cache de mem�ria
		
		
		//**********Set**********
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(6);
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(2);
		
		//usando a API Iterator, ordenamos e removemos os elementos repetidos
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
		}
		
		
		
		
	}

}
