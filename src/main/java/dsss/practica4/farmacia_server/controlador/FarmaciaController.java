package dsss.practica4.farmacia_server.controlador;


import dsss.practica4.farmacia_server.model.Farmacia;
import dsss.practica4.farmacia_server.services.FarmaciaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(FarmaciaController.BASE_URL)
public class FarmaciaController {

    public static final String BASE_URL = "/farmacias";
    private final FarmaciaService farmaciaService;

    public FarmaciaController(FarmaciaService farmaciaService) {
        this.farmaciaService = farmaciaService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Set<Farmacia> getAllFarmacias(){
       return farmaciaService.getFarmacias();
    }

}
