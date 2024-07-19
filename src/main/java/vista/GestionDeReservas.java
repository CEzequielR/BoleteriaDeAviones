package vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionDeReservas extends javax.swing.JFrame {

    DefaultTableModel model;

    public GestionDeReservas() {

        initComponents();
        model = new DefaultTableModel();
        jTable1.setModel(model);
               
        model.addColumn("id");
        model.addColumn("nombre");
        model.addColumn("apellido");
        model.addColumn("Salida");
        model.addColumn("Destino");
        model.addColumn("fecha");
        model.addColumn("horarioSalida");
        model.addColumn("estado");
        model.addColumn("pasajeros");
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonpagar = new javax.swing.JButton();
        botoncancelar = new javax.swing.JButton();
        txtdni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicio.setText("VOLVER AL INICIO");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        jPanel1.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1113, 842, 190, 52));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 550, 490));

        botonpagar.setText("PAGAR RESERVA");
        botonpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpagarActionPerformed(evt);
            }
        });
        jPanel1.add(botonpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 160, 40));

        botoncancelar.setText("CANCELAR RESERVA");
        botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botoncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 160, 40));
        jPanel1.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 140, 30));

        jLabel1.setText("Dni:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 90, -1));

        botonbuscar.setText("BUSCAR RESERVA");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        dispose();
        SesionIniciada si = new SesionIniciada();
        si.setVisible(true);
    }//GEN-LAST:event_inicioActionPerformed

    private void botonpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpagarActionPerformed
       dispose();
       abrirMetodosDePago amp = new abrirMetodosDePago();
       amp.setVisible(true);
    }//GEN-LAST:event_botonpagarActionPerformed

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed

    }//GEN-LAST:event_botoncancelarActionPerformed

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        try {
            int dni = Integer.parseInt(txtdni.getText().trim());
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String query = "SELECT reservas.id, usuarios.nombre, usuarios.apellido, vuelos.Salida, vuelos.Destino, vuelos.Fecha, vuelos.HorarioSalida, reservas.estado, reservas.pasajeros "
                    + "FROM reservas "
                    + "INNER JOIN usuarios ON reservas.usuarios_id = usuarios.idusuarios "
                    + "INNER JOIN vuelos ON reservas.vuelo_id = vuelos.IDvuelo "
                    + "WHERE usuarios.idusuarios = ?";

            try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {

                stmt.setInt(1, dni);

                try (ResultSet rs = stmt.executeQuery()) {
                    model.setRowCount(0);

                    while (rs.next()) {
                        Object[] row = {
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("Salida"),
                            rs.getString("Destino"),
                            rs.getString("Fecha"),
                            rs.getString("HorarioSalida"),
                            rs.getString("estado"),
                            rs.getString("pasajeros")
                        };
                        model.addRow(row);
                    }
                }

                if (model.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "No se encontraron reservas para el DNI ingresado.", "Sin resultados", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autenticacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbuscar;
    private javax.swing.JButton botoncancelar;
    private javax.swing.JButton botonpagar;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdni;
    // End of variables declaration//GEN-END:variables
}
