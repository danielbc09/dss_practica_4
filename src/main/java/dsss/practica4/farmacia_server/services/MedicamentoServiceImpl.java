package dsss.practica4.farmacia_server.services;

import dsss.practica4.farmacia_server.model.Medicamento;
import dsss.practica4.farmacia_server.repositories.MedicamentoRepositorio;
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
}
