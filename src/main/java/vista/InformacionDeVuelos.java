/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;
import javax.crypto.AEADBadTagException;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class InformacionDeVuelos extends javax.swing.JFrame {

    private final DefaultTableModel model;
    private Timer timer;

    public InformacionDeVuelos() {

        initComponents();

        model = new DefaultTableModel(); 
        tabla.setModel(model);

        model.addColumn("IDvuelo");
        model.addColumn("Salida");
        model.addColumn("Destino");
        model.addColumn("Horario");
        model.addColumn("Estado");
        model.addColumn("Fecha");
        consultaTodos();
        iniciarTimer();

    }

    private void consultaTodos() {
        
        String query = "SELECT IDvuelo, Salida, Destino, Horario, Estado, Fecha FROM vuelos";

        try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            model.setRowCount(0);

            while (rs.next()) {
                String idVuelo = rs.getString("IDvuelo");
                String ciudadSalida = rs.getString("Salida");
                String ciudadDestino = rs.getString("Destino");
                LocalTime horario = rs.getTime("Horario").toLocalTime();
                Date fecha = rs.getDate("Fecha");                
                String estado = determinarEstado(horario, fecha);
                Object[] vuelo = {idVuelo, ciudadSalida, ciudadDestino, horario, estado, fecha};
                model.addRow(vuelo);
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
    private void vuelosDeHoy() {

        String query = "SELECT * FROM vuelos\n" +
"WHERE DATE(Fecha) = CURDATE();";

        try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            model.setRowCount(0);

            while (rs.next()) {
                String idVuelo = rs.getString("IDvuelo");
                String ciudadSalida = rs.getString("Salida");
                String ciudadDestino = rs.getString("Destino");
                LocalTime horario = rs.getTime("Horario").toLocalTime();
                Date fecha = rs.getDate("Fecha");
                String estado = determinarEstado(horario, fecha);
                Object[] vuelo = {idVuelo, ciudadSalida, ciudadDestino, horario, estado, fecha};
                model.addRow(vuelo);
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }

private void vuelosDiferidos() {

        String query = "SELECT * FROM vuelos\n" +
"WHERE DATE(Fecha) != CURDATE();";

        try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            model.setRowCount(0);

            while (rs.next()) {
                String idVuelo = rs.getString("IDvuelo");
                String ciudadSalida = rs.getString("Salida");
                String ciudadDestino = rs.getString("Destino");
                LocalTime horario = rs.getTime("Horario").toLocalTime();
                Date fecha = rs.getDate("Fecha");
                String estado = determinarEstado(horario, fecha);
                Object[] vuelo = {idVuelo, ciudadSalida, ciudadDestino, horario, estado, fecha};
                model.addRow(vuelo);
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }

private String determinarEstado(LocalTime horario, Date fecha) {
    LocalTime horaActual = LocalTime.now();
    LocalDate fechaActual = LocalDate.now();

    // Comparar la fecha y la hora actual con las del vuelo
    if (fecha.toLocalDate().isBefore(fechaActual)) {
        return "Aterrizado";
    } else if (fecha.toLocalDate().isEqual(fechaActual) && horario.isBefore(horaActual)) {
        return "Aterrizado";
    } else if (fecha.toLocalDate().isEqual(fechaActual) && horario.equals(horaActual)) {
        return "En tiempo";
    } else if (fecha.toLocalDate().isEqual(fechaActual) && horario.isAfter(horaActual)) {
        return "Retrasado";
    } else {
        return "Programado";
    }
}

    private void iniciarTimer() {
        int delay = 60000; // Intervalo de actualización en milisegundos (ejemplo: cada 60 segundos)
        ActionListener listener = (ActionEvent e) -> {
        consultaTodos(); // Actualizar datos cada vez que se ejecute el temporizador
        };
        timer = new Timer(delay, listener);
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnTodosLosVuelos = new javax.swing.JButton();
        btnVuelosDiferidos = new javax.swing.JButton();
        btnVuelosDelDia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicio.setText("VOLVER AL INICIO");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 700, 40));

        jLabel1.setText("HORARIOS Y ESTADOS DE TODOS LOS VUELOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, 50));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 950, 400));

        btnTodosLosVuelos.setText("MOSTRAR TODOS LOS VUELOS");
        btnTodosLosVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosLosVuelosActionPerformed(evt);
            }
        });
        getContentPane().add(btnTodosLosVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 210, -1));

        btnVuelosDiferidos.setText("MOSTRAR VUELOS DIFERIDOS");
        btnVuelosDiferidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosDiferidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnVuelosDiferidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 210, -1));

        btnVuelosDelDia.setText("MOSTRAR VUELOS DEL DÍA");
        btnVuelosDelDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosDelDiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVuelosDelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        dispose();
        SesionIniciada si = new SesionIniciada();
        si.setVisible(true);
    }//GEN-LAST:event_inicioActionPerformed

    private void btnTodosLosVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosLosVuelosActionPerformed
        consultaTodos();
      
    }//GEN-LAST:event_btnTodosLosVuelosActionPerformed

    private void btnVuelosDiferidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosDiferidosActionPerformed
        vuelosDiferidos();
    }//GEN-LAST:event_btnVuelosDiferidosActionPerformed

    private void btnVuelosDelDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosDelDiaActionPerformed
        // TODO add your handling code here:
        vuelosDeHoy();
    }//GEN-LAST:event_btnVuelosDelDiaActionPerformed

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
    private javax.swing.JButton btnTodosLosVuelos;
    private javax.swing.JButton btnVuelosDelDia;
    private javax.swing.JButton btnVuelosDiferidos;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
