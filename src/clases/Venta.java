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
public class Venta {

    int cant;
    Comida c;

    public Venta(int cant, Comida c) {
        this.cant = cant;
        this.c = c;
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

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
}
