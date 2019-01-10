package dsss.practica4.farmacia_server.repositories;

import dsss.practica4.farmacia_server.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuariRepositorio extends JpaRepository<Usuario, Long> {
}
