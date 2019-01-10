package dsss.practica4.farmacia_server.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "farmacias")
public class Farmacia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String etiqueta;
    private double latitude;
    private double longitude;

    @ManyToMany( fetch = FetchType.LAZY)
    @JoinTable(name = "farmac_medic",
            joinColumns = { @JoinColumn(name = "farmacia_id") },
            inverseJoinColumns = { @JoinColumn(name = "med_id") })
    private Set<Medicamento> medicamentos = new HashSet<>();

    public Farmacia(){}

    public Farmacia(String etiqueta, double latitude, double longitude) {
        this.etiqueta = etiqueta;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Set<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Set<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
}