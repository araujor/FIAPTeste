package br.com.fiap.projeto_usuarios.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.projeto_usuarios.model.Usuario;
import br.com.fiap.projeto_usuarios.model.UsuarioChaveComposta;
import br.com.fiap.projeto_usuarios.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repU;

	@GetMapping("/todos")
	public List<Usuario> buscarTodos() {
		return repU.findAll();
	}

	@PostMapping("/inserir")
	public Usuario inserirUsuario(@RequestBody Usuario usuario_novo) {
		repU.save(usuario_novo);
		return usuario_novo;
	}

	@GetMapping("/busca_por_id")
	public Usuario buscarPorID(@RequestParam Long id_usuario, @RequestParam String rm) {

		UsuarioChaveComposta chave = new UsuarioChaveComposta(id_usuario, rm);

		Optional<Usuario> op = repU.findById(chave);

		if (op.isPresent()) {
			return op.get();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

	}

}
