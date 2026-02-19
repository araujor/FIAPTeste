package br.com.fiap.projeto_usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.projeto_usuarios.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
