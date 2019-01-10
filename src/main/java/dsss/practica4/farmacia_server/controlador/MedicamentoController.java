package dsss.practica4.farmacia_server.controlador;


import dsss.practica4.farmacia_server.model.Medicamento;
import dsss.practica4.farmacia_server.services.MedicamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(MedicamentoController.BASE_URL)
public class MedicamentoController {

    public static final String BASE_URL = "/medicamentos";
    private final MedicamentoService medicamentoService;

    public MedicamentoController(MedicamentoService medicamentoService) {
        this.medicamentoService = medicamentoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Set<Medicamento> getMedicamentos(){
        return this.medicamentoService.getAllMedicamentos();
    }

}
