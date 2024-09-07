/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Subasta implements Serializable{
    
    private Producto producto;
    private String nombrePostor;
    private float monto;

    public Subasta() {
    }

    public Subasta(Producto producto, String nombrePostor, float monto) {
        this.producto = producto;
        this.nombrePostor = nombrePostor;
        this.monto = monto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getNombrePostor() {
        return nombrePostor;
    }

    public void setNombrePostor(String nombrePostor) {
        this.nombrePostor = nombrePostor;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    
    
}
