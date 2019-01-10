package dsss.practica4.farmacia_server.repositories;

import dsss.practica4.farmacia_server.model.Farmacia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmaciaRepositorio extends JpaRepository<Farmacia, Long> {
}
