package br.edu.infnet.appsdim.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appsdim.model.negocio.Pessoa;

@Repository
public interface IPessoaRepository extends CrudRepository<Pessoa, Integer> {

}
