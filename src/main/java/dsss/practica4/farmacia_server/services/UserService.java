package dsss.practica4.farmacia_server.services;


import dsss.practica4.farmacia_server.model.Usuario;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public interface UserService {

    Set<Usuario> getUsuarios();

    Usuario createUsuar(Usuario usuario);
}
