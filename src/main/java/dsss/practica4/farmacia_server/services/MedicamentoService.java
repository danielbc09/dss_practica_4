package dsss.practica4.farmacia_server.services;

import dsss.practica4.farmacia_server.model.Medicamento;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface MedicamentoService {
    Set<Medicamento> getAllMedicamentos();

    Medicamento updateService(long id);

    Medicamento getMedicamentoById(long id);

    Medicamento selectMed(long id);

    Medicamento buyMed(long id);
}
