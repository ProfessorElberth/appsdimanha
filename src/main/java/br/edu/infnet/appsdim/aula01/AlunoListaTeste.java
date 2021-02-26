package br.edu.infnet.appsdim.aula01;

import java.util.ArrayList;
import java.util.List;

public class AlunoListaTeste {

	public static void main(String[] args) {
		
		String[] nomes = {"Elberth Moraes", "maria", "jose", "joao"};
		
		String[] emails = {"elberth@elberth.com", "maria@maria.com", "jose@jose.com", "joao@joao.com"};
		
		List<Aluno> alunos = new ArrayList<Aluno>();

		//criar objetos: populando a coleção
		for(int i = 0; i < nomes.length; i++) {
			Aluno aluno = new Aluno();
			aluno.setId(i+1);
			aluno.setNome(nomes[i]);
			aluno.setEmail(emails[i]);		

			alunos.add(aluno);		
		}
		
		//leitura da coleção
		for(Aluno item : alunos) {
			System.out.println(item);
		}
	}
}