package br.edu.infnet.appsdim.model.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appsdim.model.negocio.Pessoa;

@Repository
public class PessoaRepository {

	private static Map<Integer, Pessoa> mapaPessoa = new HashMap<Integer, Pessoa>();
	private static Integer id = 1;
	
	public void incluir(Pessoa pessoa) {
		pessoa.setId(id++);
		
		mapaPessoa.put(pessoa.getId(), pessoa);
		
		System.out.println("Pessoa cadastrada com sucesso: " + pessoa);		
	}
}
