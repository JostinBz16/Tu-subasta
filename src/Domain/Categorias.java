package Domain;

import java.io.Serializable;

public class Categorias implements Serializable{

    
    private String nombre;

    public Categorias() {
    }

    public Categorias(String nombre, String descripcion) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
