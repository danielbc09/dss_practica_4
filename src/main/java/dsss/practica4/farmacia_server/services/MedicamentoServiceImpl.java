package dsss.practica4.farmacia_server.services;

import dsss.practica4.farmacia_server.model.Medicamento;
import dsss.practica4.farmacia_server.repositories.MedicamentoRepositorio;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

    private final MedicamentoRepositorio repositorio;

    public MedicamentoServiceImpl(MedicamentoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Set<Medicamento> getAllMedicamentos() {
        Set<Medicamento> medicamentos = new HashSet<>();
        repositorio.findAll().iterator().forEachRemaining(medicamentos::add);
        return medicamentos;
    }

    @Override
    public Medicamento getMedicamentoById(long id) {
        return repositorio.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Medicamento updateService(long id) {
        Medicamento medicamentoAct = getMedicamentoById(id);
       // medicamentoAct.set
        return null;
    }

    @Override
    public Medicamento selectMed(long id) {
        Medicamento medicamentoSelect = getMedicamentoById(id);

        if (medicamentoSelect.getSeleccionado() == 0){
            medicamentoSelect.setSeleccionado(1);
        }else if  (medicamentoSelect.getSeleccionado() == 1) {
            medicamentoSelect.setSeleccionado(0);
        }

        repositorio.save(medicamentoSelect);
        return medicamentoSelect;
    }

    @Override
    public Medicamento buyMed(long id) {
        Medicamento buyMed= getMedicamentoById(id);
        buyMed.setComprado(1);
        repositorio.save(buyMed);
        return buyMed;
    }
}
