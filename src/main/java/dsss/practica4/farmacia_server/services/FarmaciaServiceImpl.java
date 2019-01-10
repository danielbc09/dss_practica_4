package dsss.practica4.farmacia_server.services;

import dsss.practica4.farmacia_server.model.Farmacia;
import dsss.practica4.farmacia_server.repositories.FarmaciaRepositorio;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class FarmaciaServiceImpl implements FarmaciaService{

    private final FarmaciaRepositorio repositorio;

    public FarmaciaServiceImpl(FarmaciaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Set<Farmacia> getFarmacias() {
        Set<Farmacia> farmacias = new HashSet<>();
        repositorio.findAll().iterator().forEachRemaining(farmacias::add);
        return farmacias;
    }
}