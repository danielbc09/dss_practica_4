package dsss.practica4.farmacia_server.bootstrap;

import dsss.practica4.farmacia_server.model.Farmacia;
import dsss.practica4.farmacia_server.model.Medicamento;
import dsss.practica4.farmacia_server.model.Usuario;
import dsss.practica4.farmacia_server.repositories.FarmaciaRepositorio;
import dsss.practica4.farmacia_server.repositories.MedicamentoRepositorio;
import dsss.practica4.farmacia_server.repositories.UsuariRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private UsuariRepositorio usuariRepositorio;
    private FarmaciaRepositorio farmaciaRepositorio;
    private MedicamentoRepositorio medicamentoRepositorio;


    public Bootstrap(UsuariRepositorio usuariRepositorio, FarmaciaRepositorio farmaciaRepositorio, MedicamentoRepositorio medicamentoRepositorio) {

        this.usuariRepositorio = usuariRepositorio;
        this.farmaciaRepositorio = farmaciaRepositorio;
        this.medicamentoRepositorio = medicamentoRepositorio;
    }

    @Override
    public void run(String... args) throws Exception {

        this.usuariRepositorio.deleteAllInBatch();
        this.medicamentoRepositorio.deleteAllInBatch();
        this.farmaciaRepositorio.deleteAllInBatch();
        cargarUsuarios();
        cargarMedicamentos();
        cargarFarmacias();
        System.out.println("Elementos Cargados Correctamente");
    }

    private void cargarUsuarios() {

        Usuario usuario1 = new Usuario();
        usuario1.setCorreo("usuario1@gmail.com");
        usuario1.setPassword("12345");
        usuariRepositorio.save(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setCorreo("usuario2@gmail.com");
        usuario2.setPassword("12345");
        usuariRepositorio.save(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.setCorreo("usuario3@gmail.com");
        usuario3.setPassword("12345");
        usuariRepositorio.save(usuario3);





        System.out.println("Usuairos Cargados Correctamente");

    }
/*
    private void cargarFarmacias() {

        Medicamento medicamento1 = new Medicamento("Medicamento1", 100, 0, 0, farmacia);
        Medicamento medicamento2 = new Medicamento("Medicamento2", 150, 0, 0, farmacia);
        Medicamento medicamento3 = new Medicamento("Medicamento3", 10, 0, 0, farmacia);
        Medicamento medicamento4 = new Medicamento("Medicamento4", 20, 0, 0, farmacia);
        Medicamento medicamento5 = new Medicamento("Medicamento5", 30, 0, 1, farmacia);

        medicamentoRepositorio.save(medicamento1);
        medicamentoRepositorio.save(medicamento2);
        medicamentoRepositorio.save(medicamento3);
        medicamentoRepositorio.save(medicamento4);
        medicamentoRepositorio.save(medicamento5);

        System.out.println("Medicamentos Cargados Correctamente");

        Farmacia farmacia1 = new Farmacia();
        farmacia1.setEtiqueta("Etiqueta Farmacia 1");
        farmacia1.setLatitude(1998);
        farmacia1.setLongitude(2000);
        farmacia1.getMedicamentos().add(medicamento1);
        farmacia1.getMedicamentos().add(medicamento2);
        farmacia1.getMedicamentos().add(medicamento3);

        farmaciaRepositorio.save(farmacia1);
    //Farmacia 2
        Farmacia farmacia2 = new Farmacia();
        farmacia2.setEtiqueta("Etiqueta Farmacia 2");
        farmacia2.setLatitude(1525);
        farmacia2.setLongitude(2245);
  //      farmacia2.getMedicamentos().add(medicamento1);
        farmacia2.getMedicamentos().add(medicamento4);
        farmacia2.getMedicamentos().add(medicamento5);

        farmaciaRepositorio.save(farmacia2);

        //Farmacia 3
        Farmacia farmacia3 = new Farmacia();
        farmacia3.setEtiqueta("Etiqueta Farmacia 3");
        farmacia3.setLatitude(1525);
        farmacia3.setLongitude(2245);
        farmacia3.getMedicamentos().add(medicamento1);
        farmacia3.getMedicamentos().add(medicamento2);
        farmacia3.getMedicamentos().add(medicamento3);
        farmacia3.getMedicamentos().add(medicamento4);
        farmacia3.getMedicamentos().add(medicamento5);

        farmaciaRepositorio.save(farmacia3);


        System.out.println("Farmacias Cargadas Correctamente");
    }

*/

    public void cargarMedicamentos(){
        Medicamento medicamento1 = new Medicamento("Medicamento1", 100, "farmacia1", 0, 0);
        Medicamento medicamento2 = new Medicamento("Medicamento2", 150, "farmacia2", 0, 0);
        Medicamento medicamento3 = new Medicamento("Medicamento3", 10, "farmacia3", 0, 0);
        Medicamento medicamento4 = new Medicamento("Medicamento4", 20, "farmacia4", 0, 0);
        Medicamento medicamento5 = new Medicamento("Medicamento5", 30, "farmacia5", 0, 1);

        medicamentoRepositorio.save(medicamento1);
        medicamentoRepositorio.save(medicamento2);
        medicamentoRepositorio.save(medicamento3);
        medicamentoRepositorio.save(medicamento4);
        medicamentoRepositorio.save(medicamento4);
    }

    public void cargarFarmacias(){

        Farmacia farmacia1 = new Farmacia();
        farmacia1.setNombre("Farmacia del Parque");
        farmacia1.setEtiqueta("Aynadamar");
        farmacia1.setLatitude(37.195989);
        farmacia1.setLongitude(-3.627848);
        farmaciaRepositorio.save(farmacia1);
        //Farmacia 2
        Farmacia farmacia2 = new Farmacia();
        farmacia2.setNombre("Farmacia del Norte");
        farmacia2.setEtiqueta("Almanjáyar");
        farmacia2.setLatitude(37.204860);
        farmacia2.setLongitude(-3.615192);
        //      farmacia2.getMedicamentos().add(medicamento1);

        farmaciaRepositorio.save(farmacia2);

        //Farmacia 3
        Farmacia farmacia3 = new Farmacia();
        farmacia3.setNombre("Farmacia Ferroviaria");
        farmacia3.setEtiqueta("Maracena");
        farmacia3.setLatitude(37.207201);
        farmacia3.setLongitude(-3.628083);
        farmaciaRepositorio.save(farmacia3);
    }
}
