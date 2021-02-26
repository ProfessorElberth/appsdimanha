package br.edu.infnet.appsdim.aula01;

import java.util.HashMap;
import java.util.Map;

public class AlunoMapaTeste {

	public static void main(String[] args) {

		Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
		
		//incluir:
		mapaNomes.put(1, "elberth");
		mapaNomes.put(2, "maria");
		mapaNomes.put(3, "joao");

		System.out.println("Após inclusão: " + mapaNomes);
		
		//alterar:
		mapaNomes.put(2, "pedrinho");

		System.out.println("Após alteração: " + mapaNomes);
		
		//excluir:
		int key = 1;
		String value = mapaNomes.remove(key);
		System.out.println("O aluno " + value + " foi excluido através da chave " + key);
		
		System.out.println("Após exclusão: " + mapaNomes);
	}
}