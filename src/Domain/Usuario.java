package Domain;

import java.io.Serializable;

public class Usuario implements Serializable{
    
    private int id;
    private String nombre;
    private String Identificacion;
    private String correo;
    private String password;    
    private String direccion;
    private String telefono;

    public Usuario() {
        this.id = id++;
    }

    public Usuario(int id, String nombre, String Identificacion, String correo, String password, String direccion, String telefono) {
        this();
        this.nombre = nombre;
        this.Identificacion = Identificacion;
        this.correo = correo;
        this.password = password;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
}
