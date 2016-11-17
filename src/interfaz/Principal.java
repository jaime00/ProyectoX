/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Comida;
import clases.Helper;
import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jaime
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    ArrayList<Comida> c;
    Comida co;
    String ruta;
    ObjectOutputStream salida;
    String i = "C:\\Users\\jaime\\Desktop\\ProyectoX\\src\\imagenes";
    public Principal() {
        initComponents();
        try {
            
            setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage());

            ruta = "src/datos/Comidas.txt";
            //Hamburguesas
            c.add(new Comida("MUSH ROOM DIJON", 9000, "Hamburguesas"));
            c.add(new Comida("PREMIUM DELUXE", 7000, "Hamburguesas"));
            c.add(new Comida("CLUB HOUSE", 8500, "Hamburguesas"));
            //Bebidas
            c.add(new Comida("COCA-COLA", 4000, "Bebidas"));
            c.add(new Comida("SPRITE", 4000, "Bebidas"));
            c.add(new Comida("FUZE TEA", 3000, "Bebidas"));
            //Pollos
            c.add(new Comida("CLUBHOUSE POLLO CRISPY", 9000, "Pollos"));
            c.add(new Comida("POLLO JR", 7000, "Pollos"));
            c.add(new Comida("MC POLLO DELUXE", 8500, "Pollos"));
            //Desayunos
            c.add(new Comida("DESAYUNO COMPLETO", 12000, "Desayunos"));
            c.add(new Comida("HUEVOS PERICOS", 12000, "Desayunos"));
            c.add(new Comida("PANCAKES", 8000, "Desayunos"));
            //Acompañamientos
            c.add(new Comida("PAPAS FRITAS", 4000, "Acompañamientos"));
            c.add(new Comida("ENSALADA", 4000, "Acompañamientos"));
            c.add(new Comida("McFLURRY OREO", 3000, "Acompañamientos"));
            
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
            Helper.guardarArraysList(salida, c);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        } catch (NullPointerException e) {
        }
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
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passContrasena = new javax.swing.JPasswordField();
        cmdEntrar = new javax.swing.JButton();
        cmdEntrar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 110, -1));

        txtUsuario.setText("ADMIN");
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 160, -1));

        passContrasena.setText("123");
        jPanel1.add(passContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 110, -1));

        cmdEntrar.setText("ENTRAR");
        cmdEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 160, 40));

        cmdEntrar1.setText("SALIR");
        cmdEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEntrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 160, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unknown-128.png"))); // NOI18N
        jLabel5.setAutoscrolls(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/McDonald's_Golden_Arches.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(506, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEntrarActionPerformed

        if (txtUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite por favor el Usuario");
            txtUsuario.requestFocusInWindow();
        } else if (passContrasena.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite por favor la contraseña");
            passContrasena.requestFocusInWindow();
        } else if (txtUsuario.getText().equalsIgnoreCase("ADMIN") && passContrasena.getText().equals("123")) {

            
            Menu a = new Menu(this, true);
            a.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "Campos Invalidos !");
        }

    }//GEN-LAST:event_cmdEntrarActionPerformed

    private void cmdEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEntrar1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_cmdEntrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdEntrar;
    private javax.swing.JButton cmdEntrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
