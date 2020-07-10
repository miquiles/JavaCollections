package br.com.alura;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
		
		lista.stream()
		.skip(2)//ignora os dois primeiros elementos
		.limit(2) //filtra os elementos do strem e filtra apenas dois elementos
		.distinct() //nao permite que o stream processe elementos repetidos. Compara pelo equals e hashcode
		.filter(e -> e % 2 == 0) //retorna os valores de um filtro. No caso, apenas valores pares.
		.map(e -> e * 2) // Recebe os dados do stream e multiplica por 2. A lista original não será modificada
		
		//.min(Comparator.naturalOrder());
		
		//.count(); //retorna a quantidade de elementos na lista.
		//System.out.println(count);
		.forEach(e -> System.out.println(e));
	}

}
 