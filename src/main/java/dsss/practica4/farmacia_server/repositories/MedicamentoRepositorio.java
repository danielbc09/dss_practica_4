package dsss.practica4.farmacia_server.repositories;

import dsss.practica4.farmacia_server.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepositorio extends JpaRepository<Medicamento, Long> {
}
