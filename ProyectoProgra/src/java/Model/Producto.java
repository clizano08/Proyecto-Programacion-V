/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author carlo
 */
public class Producto {
    int ID;
    String nombre;
    double precio;
    int cantidad;
    int cantidadMinimaVenta;
    String categoria;
    String link;
    boolean editable;

    public Producto() {
    }

    public Producto(int Id, String nombre, double precio, int cantidad, int cantidadMinimaVenta, String link, String categoria) {
        this.ID = Id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cantidadMinimaVenta = cantidadMinimaVenta;
        this.categoria = categoria;
        this.link = link;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadMinimaVenta() {
        return cantidadMinimaVenta;
    }

    public void setCantidadMinimaVenta(int cantidadMinimaVenta) {
        this.cantidadMinimaVenta = cantidadMinimaVenta;
    }
    
    
  
}
