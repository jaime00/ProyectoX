/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author jaime
 */
public class Comida implements java.io.Serializable {

    String nombre;
    int Precio;
    String categoria;

    public Comida(String nombre, int precio) {
        this.nombre = nombre;
        this.Precio = precio;
    }

    public Comida(String nombre, int precio, int cantidad, String categoria) {
        this.nombre = nombre;
        this.Precio = precio;
        cantidad = 1;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }

}
