package dsss.practica4.farmacia_server.model;

import javax.persistence.*;

@Entity(name="medicamentos")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double precio;
    private int seleccionado;
    private int comprado;
    private String farmacia;


    public Medicamento(){

    }

    public Medicamento(String nombre, double precio, String farmacia, int seleccionado, int comprado) {
        this.nombre = nombre;
        this.precio = precio;
        this.seleccionado = seleccionado;
        this.comprado = comprado;
        this.farmacia = farmacia;
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

}
