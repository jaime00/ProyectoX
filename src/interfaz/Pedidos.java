/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author jaime
 */
public class Pedidos extends javax.swing.JDialog {

    /**
     * Creates new form Pedidos
     */
    public Pedidos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        cmdMenuHamburguesas = new javax.swing.JButton();
        cmdMenuEnsaladaAcompañamientos = new javax.swing.JButton();
        cmdRegresar = new javax.swing.JButton();
        cmdMenuBebidas = new javax.swing.JButton();
        cmdMenuPollo = new javax.swing.JButton();
        cmdMenuDesayunos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdMenuHamburguesas.setText("HAMBURGUESAS");
        cmdMenuHamburguesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuHamburguesasActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMenuHamburguesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, 50));

        cmdMenuEnsaladaAcompañamientos.setText("ACOMPAÑAMIENTOS");
        cmdMenuEnsaladaAcompañamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuEnsaladaAcompañamientosActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMenuEnsaladaAcompañamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 190, 50));

        cmdRegresar.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        cmdRegresar.setForeground(new java.awt.Color(255, 0, 0));
        cmdRegresar.setText("REGRESAR");
        cmdRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 180, 40));

        cmdMenuBebidas.setText("BEBIDAS");
        cmdMenuBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMenuBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 180, 50));

        cmdMenuPollo.setText("POLLO");
        cmdMenuPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuPolloActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMenuPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 180, 50));

        cmdMenuDesayunos.setText("DESAYUNOS");
        cmdMenuDesayunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuDesayunosActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMenuDesayunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mcdonalds,-madera-165062.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(632, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMenuBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuBebidasActionPerformed

        Bebidas b = new Bebidas(null, true);
        b.setVisible(true);
    }//GEN-LAST:event_cmdMenuBebidasActionPerformed

    private void cmdRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegresarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_cmdRegresarActionPerformed

    private void cmdMenuHamburguesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuHamburguesasActionPerformed

        Hamburguesas h = new Hamburguesas(null, true);
        h.setVisible(true);
    }//GEN-LAST:event_cmdMenuHamburguesasActionPerformed

    private void cmdMenuPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuPolloActionPerformed

        Pollos p = new Pollos(null, true);
        p.setVisible(true);
    }//GEN-LAST:event_cmdMenuPolloActionPerformed

    private void cmdMenuDesayunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuDesayunosActionPerformed

        Desayunos d = new Desayunos(null, true);
        d.setVisible(true);
    }//GEN-LAST:event_cmdMenuDesayunosActionPerformed

    private void cmdMenuEnsaladaAcompañamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuEnsaladaAcompañamientosActionPerformed

        Acompañamientos a = new Acompañamientos(null, true);
        a.setVisible(true);
    }//GEN-LAST:event_cmdMenuEnsaladaAcompañamientosActionPerformed

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
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pedidos dialog = new Pedidos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cmdMenuBebidas;
    private javax.swing.JButton cmdMenuDesayunos;
    private javax.swing.JButton cmdMenuEnsaladaAcompañamientos;
    private javax.swing.JButton cmdMenuHamburguesas;
    private javax.swing.JButton cmdMenuPollo;
    private javax.swing.JButton cmdRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
