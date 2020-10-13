package Usuario.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Usuario.Model.UsuarioModel;
import Usuario.Repository.UsuarioRepository;

@RestController
@RequestMapping
public class UsuarioController {

	public UsuarioRepository repository;

	@GetMapping
	public ResponseEntity<List<UsuarioModel>> findAllNome() {

		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<UsuarioModel> findByIDUsuarioModel(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<UsuarioModel> postUsuarioModel(@RequestBody UsuarioModel usuarioModel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuarioModel));
	}

	@PutMapping
	public ResponseEntity<UsuarioModel> putUsuarioModel(@RequestBody UsuarioModel usuarioModel) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(usuarioModel));
	}

	@DeleteMapping("/{id}")
	public void deleteIdUsuarioModel(@PathVariable long id) {
		repository.deleteById(id);
	}

}
