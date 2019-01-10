package dsss.practica4.farmacia_server.controlador;


import dsss.practica4.farmacia_server.model.Usuario;
import dsss.practica4.farmacia_server.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Set;


@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController {

    public static final String BASE_URL = "/usuarios";

    private final UserService servicioUsuario;


    public UserController(UserService userService) {
        this.servicioUsuario = userService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Set<Usuario> getAllUsers(){
        return servicioUsuario.getUsuarios();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario crearUsuario(@RequestBody @Valid Usuario usuario){
        return servicioUsuario.createUsuar(usuario);
    }


}
