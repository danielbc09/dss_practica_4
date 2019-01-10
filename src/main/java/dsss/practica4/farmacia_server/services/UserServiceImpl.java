package dsss.practica4.farmacia_server.services;

import dsss.practica4.farmacia_server.model.Usuario;
import dsss.practica4.farmacia_server.repositories.UsuariRepositorio;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UsuariRepositorio usuariRepositorio;

    public UserServiceImpl(UsuariRepositorio usuariRepositorio) {
        this.usuariRepositorio = usuariRepositorio;
    }

    @Override
    public Set<Usuario> getUsuarios() {
        Set<Usuario> usuariosSet = new HashSet<>();
        usuariRepositorio.findAll().iterator().forEachRemaining(usuariosSet::add);
        return usuariosSet;
    }

    @Override
    public Usuario createUsuar(Usuario usuario) {
        usuariRepositorio.save(usuario);
        return usuario;
    }

}
