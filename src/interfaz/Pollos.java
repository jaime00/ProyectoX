/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Comida;
import clases.Helper;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaime
 */
public class Pollos extends javax.swing.JDialog {

    /**
     * Creates new form Pollo
     */
    String ruta;
    ObjectOutputStream salida;
    ArrayList<Comida> comidas;
    int contP1 = 0;
    int contP2 = 0;
    int contP3 = 0;

    public Pollos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/Comidas.txt"; 
        try {
            comidas = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Helper.volcado(salida, comidas);
        Helper.llenarTabla(tblTablaP, ruta,"");
        cmdEliminar.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmdRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmdP3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmdP1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmdP2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaP = new javax.swing.JTable();
        cmdEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("POLLOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 210, -1));

        cmdRegresar.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        cmdRegresar.setForeground(new java.awt.Color(255, 0, 0));
        cmdRegresar.setText("REGRESAR");
        cmdRegresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        cmdRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel3.setText("CLUBHOUSE POLLO CRISPY");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 330, -1));

        cmdP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/P3.jpg"))); // NOI18N
        cmdP3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cmdP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdP3ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 200, 160));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel2.setText("POLLO JR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 210, 20));

        cmdP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/P1.jpg"))); // NOI18N
        cmdP1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cmdP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdP1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 200, 160));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel4.setText("MC POLLO DELUXE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 220, -1));

        cmdP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/P2.jpg"))); // NOI18N
        cmdP2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cmdP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdP2ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 200, 160));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Total"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Nombre", "Precio", "Cantidad", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTablaP);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 520, 190));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 550, 230));

        cmdEliminar.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        cmdEliminar.setText("ELIMINAR");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 150, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/McDonald's_Golden_Arches.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 510, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(914, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegresarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_cmdRegresarActionPerformed

    private void cmdP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdP3ActionPerformed

        
        String nombre = "MC POLLO DELUXE";

        Comida p = new Comida(nombre, 8500, contP3, "Pollos");

        try {
            p.guardar(salida);
        } catch (IOException ex) {
            Logger.getLogger(Hamburguesas.class.getName()).log(Level.SEVERE, null, ex);
        }
        Helper.llenarTabla(tblTablaP, ruta, "Pollos");


    }//GEN-LAST:event_cmdP3ActionPerformed

    private void cmdP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdP1ActionPerformed
        String nombre = "CLUBHOUSE POLLO CRISPY";

        Comida p = new Comida(nombre, 9000, contP1,"Pollos");

        try {
            p.guardar(salida);
        } catch (IOException ex) {
            Logger.getLogger(Hamburguesas.class.getName()).log(Level.SEVERE, null, ex);
        }
        Helper.llenarTabla(tblTablaP, ruta,"Pollos");


    }//GEN-LAST:event_cmdP1ActionPerformed

    private void cmdP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdP2ActionPerformed

        String nombre = "POLLO JR";

        Comida p = new Comida(nombre, 7000, contP2, "Pollos");

        try {
            p.guardar(salida);
        } catch (IOException ex) {
            Logger.getLogger(Hamburguesas.class.getName()).log(Level.SEVERE, null, ex);
        }
        Helper.llenarTabla(tblTablaP, ruta,"Pollos");

    }//GEN-LAST:event_cmdP2ActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;

        ArrayList<Comida> comidas = Helper.traerDatos(ruta);
        i = tblTablaP.getSelectedRow();
        comidas.remove(i);
        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Comida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Comida.class.getName()).log(Level.SEVERE, null, ex);
        }

        Helper.volcado(salida, comidas);
        Helper.llenarTabla(tblTablaP, ruta,"");
        cmdEliminar.setEnabled(false);
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void tblTablaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaPMouseClicked
        int i;
        Comida c;
        ArrayList<Comida> comidas = Helper.traerDatos(ruta);
        i = tblTablaP.getSelectedRow();

        c = comidas.get(i);

        cmdEliminar.setEnabled(true);
    }//GEN-LAST:event_tblTablaPMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pollos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pollos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pollos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pollos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pollos dialog = new Pollos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdP1;
    private javax.swing.JButton cmdP2;
    private javax.swing.JButton cmdP3;
    private javax.swing.JButton cmdRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaP;
    // End of variables declaration//GEN-END:variables
}
