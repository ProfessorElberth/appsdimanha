package br.edu.infnet.appsdim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appsdim.model.negocio.Pessoa;
import br.edu.infnet.appsdim.model.service.PessoaService;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;

	@PostMapping(value = "/pessoa/incluir")
	public String incluir(Pessoa pessoa) {
		System.out.println(pessoaService.obterStatus(pessoa));
		
		pessoaService.incluir(pessoa);
		
		return "redirect:/";
	}
}
