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
public class Venta implements java.io.Serializable {

    Comida c;
    Cliente cl;
    int cant;

    public Venta(int cant, Comida c, Cliente cl) {
        this.cant = cant;
        this.c = c;
        this.cl = cl;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Comida getC() {
        return c;
    }

    public void setC(Comida c) {
        this.c = c;
    }

    public Cliente getCl() {
        return cl;
    }

    public void setCl(Cliente cl) {
        this.cl = cl;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
}
