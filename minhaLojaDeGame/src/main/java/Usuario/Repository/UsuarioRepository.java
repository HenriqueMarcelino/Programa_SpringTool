package Usuario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Usuario.Model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{

}
