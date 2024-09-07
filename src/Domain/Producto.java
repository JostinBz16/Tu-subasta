package Domain;

import java.io.Serializable;
import java.util.Date;

public class Producto implements Serializable{
    
    private String nombre;
    private String descripcion;
    private String estado;
    private String categoria;
    private float valorMininimo;
    private Date fechaInificio;
    private Date fechaFinal;
    private byte[] imagen;
    private String vendedor;
    private String comprador;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, String estado, String categoria, float valorMininimo, Date fechaInificio, Date fechaFinal, byte[] imagen, String vendedor, String comprador) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.categoria = categoria;
        this.valorMininimo = valorMininimo;
        this.fechaInificio = fechaInificio;
        this.fechaFinal = fechaFinal;
        this.imagen = imagen;
        this.vendedor = vendedor;
        this.comprador = comprador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getValorMininimo() {
        return valorMininimo;
    }

    public void setValorMininimo(float valorMininimo) {
        this.valorMininimo = valorMininimo;
    }

    public Date getFechaInificio() {
        return fechaInificio;
    }

    public void setFechaInificio(Date fechaInificio) {
        this.fechaInificio = fechaInificio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    
}
