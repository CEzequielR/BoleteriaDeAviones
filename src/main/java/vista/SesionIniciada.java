/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class SesionIniciada extends javax.swing.JFrame {

    /**
     * Creates new form SesionIniciada
     */
    public SesionIniciada() {
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
        btnInicio = new javax.swing.JButton();
        busquedaVuelos = new javax.swing.JButton();
        gestionReservas = new javax.swing.JButton();
        informacionVuelos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnInicio.setText("Volver al Inicio");
        btnInicio.setAutoscrolls(true);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 760, 228, 33));

        busquedaVuelos.setBackground(new java.awt.Color(255, 255, 255));
        busquedaVuelos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        busquedaVuelos.setForeground(new java.awt.Color(0, 153, 255));
        busquedaVuelos.setText("Busqueda de vuelos");
        busquedaVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaVuelosActionPerformed(evt);
            }
        });
        jPanel1.add(busquedaVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 550, 50));

        gestionReservas.setBackground(new java.awt.Color(255, 255, 255));
        gestionReservas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        gestionReservas.setForeground(new java.awt.Color(0, 102, 255));
        gestionReservas.setText("Gestión de reservas");
        gestionReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionReservasActionPerformed(evt);
            }
        });
        jPanel1.add(gestionReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 550, 50));

        informacionVuelos.setBackground(new java.awt.Color(255, 255, 255));
        informacionVuelos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        informacionVuelos.setForeground(new java.awt.Color(0, 102, 255));
        informacionVuelos.setText("Información de vuelos");
        informacionVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionVuelosActionPerformed(evt);
            }
        });
        jPanel1.add(informacionVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 550, 50));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("En esta sección podrás ver la información de todos los vuelos.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("En este apartado podrás buscar vuelos, consultar precios y crear una reserva de vuelo.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("En esta sección podrás ver el estado de tus reservas, pagarlas y cancelarlas.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        dispose();
        Autenticacion aute1 = new Autenticacion();
        aute1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        aute1.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void busquedaVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaVuelosActionPerformed
        dispose();
        BusquedaDeVuelos bdv = new BusquedaDeVuelos();
        bdv.setExtendedState(JFrame.MAXIMIZED_BOTH);
        bdv.setVisible(true);
    }//GEN-LAST:event_busquedaVuelosActionPerformed

    private void gestionReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionReservasActionPerformed
        dispose();
        GestionDeReservas gdr = new GestionDeReservas();
        gdr.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gdr.setVisible(true);
    }//GEN-LAST:event_gestionReservasActionPerformed

    private void informacionVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionVuelosActionPerformed
        dispose();
        InformacionDeVuelos idv = new InformacionDeVuelos();
        idv.setExtendedState(JFrame.MAXIMIZED_BOTH);
        idv.setVisible(true);
    }//GEN-LAST:event_informacionVuelosActionPerformed

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
            java.util.logging.Logger.getLogger(SesionIniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SesionIniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SesionIniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SesionIniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SesionIniciada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton busquedaVuelos;
    private javax.swing.JButton gestionReservas;
    private javax.swing.JButton informacionVuelos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
