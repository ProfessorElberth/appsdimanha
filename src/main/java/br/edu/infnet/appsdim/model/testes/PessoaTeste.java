package br.edu.infnet.appsdim.model.testes;

import br.edu.infnet.appsdim.model.negocio.Pessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa huguinho = new Pessoa();
		huguinho.setId(1);
		huguinho.setNome("Hugo");
		huguinho.setEmail("hugo@hugo.com");
		huguinho.setSalario(1000);
		huguinho.setQtdeMeses(12);
		System.out.println("Pato " + huguinho);
		
		Pessoa zezinho = new Pessoa("Jose", "jose@jose.com", 2000, 10);
		zezinho.setId(2);
		System.out.println("Pato " + zezinho);
		
		Pessoa luizinho = new Pessoa("Luis", "luis@luis.com", 3000, 9);
		luizinho.setId(3);
		System.out.println("Pato " + luizinho);
	}
}