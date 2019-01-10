package dsss.practica4.farmacia_server.services;

import dsss.practica4.farmacia_server.model.Farmacia;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface FarmaciaService {

    Set<Farmacia> getFarmacias();
}
