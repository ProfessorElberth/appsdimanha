package br.edu.infnet.appsdim.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appsdim.model.negocio.Pessoa;
import br.edu.infnet.appsdim.model.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public void incluir(Pessoa pessoa) {
		pessoaRepository.incluir(pessoa);
	}
	
	public String obterStatus(Pessoa pessoa) {
		
		if(pessoa.calcularSalarioAnual() > 500000) {
			return pessoa.getNome() + ", que pessoa rica";
		}		
		
		return "Poxa, "+ pessoa.getNome() +"!!! Tá difícil, né?!";
	}
	
}
