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
public class Pedido implements java.io.Serializable {

    Cliente cliente;
    Venta v;

    public Pedido(Cliente cliente, Venta v) {
        this.cliente = cliente;
        this.v = v;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Venta getV() {
        return v;
    }

    public void setV(Venta v) {
        this.v = v;
    }

    
    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
}
