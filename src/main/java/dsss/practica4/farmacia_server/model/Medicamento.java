package dsss.practica4.farmacia_server.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="medicamentos")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double precio;
    private int seleccionado;
    private int comprado;

    @ManyToMany(fetch = FetchType.LAZY,
            mappedBy = "medicamentos"
    )
    private Set<Farmacia> farmacia = new HashSet<>();


    public Medicamento(){

    }

    public Medicamento(String nombre,double precio, int seleccionado, int comprado) {
        this.nombre = nombre;
        this.precio = precio;
        this.seleccionado = seleccionado;
        this.comprado = comprado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(int seleccionado) {
        this.seleccionado = seleccionado;
    }

    public int getComprado() {
        return comprado;
    }

    public void setComprado(int comprado) {
        this.comprado = comprado;
    }

    public Set<Farmacia> getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Set<Farmacia> farmacia) {
        this.farmacia = farmacia;
    }
}
