package br.com.fiap.projeto_usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.projeto_usuarios.model.Usuario;
import br.com.fiap.projeto_usuarios.model.UsuarioChaveComposta;

public interface UsuarioRepository extends JpaRepository<Usuario, UsuarioChaveComposta> {

}
