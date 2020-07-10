package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "TRabalhando com cursos e sets";

		ArrayList<String> aulas = new ArrayList<String>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) {

			System.out.println("Aula : " + aula);

		}

		String primeiraAula = aulas.get(0);

		System.out.println("A primeira aula é : " + primeiraAula);

		System.out.println(aulas.size());

		aulas.forEach(aula -> {
			System.out.println("Percorrendo :");
			System.out.println("Aula  " + aula);
			
		
		}); // lambda
		
		aulas.add("Aumentando nosso conhecimento");
		
		Collections.sort(aulas); //ordenação na ordem alfabetica
		
		
		System.out.println(aulas);

	}

}
