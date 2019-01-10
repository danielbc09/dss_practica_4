package dsss.practica4.farmacia_server.controlador;


import dsss.practica4.farmacia_server.model.Medicamento;
import dsss.practica4.farmacia_server.services.MedicamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Medicamento getMedicamentos(@PathVariable long id){
        return this.medicamentoService.getMedicamentoById(id);
    }

    @PutMapping("/seleccionar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Medicamento seleccionarMedicamento(@PathVariable long id){
        return medicamentoService.selectMed(id);
    }

    @PutMapping("/comprar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Medicamento comprarMedicamento(@PathVariable long id){
        return medicamentoService.buyMed(id);
    }

    @PutMapping("{id}")
    @ResponseStatus
    public Medicamento actualizarMedicamento(@PathVariable long id){
        return medicamentoService.updateService(id);
    }
}
