/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaime
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void llenarTabla(JTable tabla, String ruta, int cant, String categoria) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Comida> comidas = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = comidas.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(comidas.get(i).getNombre(), i, 1);
            tabla.setValueAt(comidas.get(i).getPrecio(), i, 2);
            tabla.setValueAt(comidas.get(i).getCategoria(), i, 4);
        }
    }
    public static void llenarTabla(JTable tabla, String ruta,int cant) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Comida> comidas = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = comidas.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(comidas.get(i).getNombre(), i, 1);
            tabla.setValueAt(comidas.get(i).getPrecio(), i, 2);
            tabla.setValueAt(cant, i, 3);
            tabla.setValueAt(comidas.get(i).getCategoria(), i, 4);
           }
    }
        public static void llenarTabla(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Comida> comidas = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = comidas.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(comidas.get(i).getNombre(), i, 1);
            tabla.setValueAt(comidas.get(i).getPrecio(), i, 2);
            tabla.setValueAt(comidas.get(i).getCategoria(),i,4);
           }
    }
    
    public static ArrayList traerDatos(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList comidas = new ArrayList();
        Object c;

        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((c = entrada.readObject()) != null) {
                comidas.add(c);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return comidas;
    }

    public static void volcado(ObjectOutputStream salida, ArrayList comidas) {
        for (int i = 0; i < comidas.size(); i++) {
            try {
                salida.writeObject(comidas.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

}
