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
import javax.swing.JFrame;
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

        model.addColumn("Salida");
        model.addColumn("H. Salida");
        model.addColumn("Fecha");
        model.addColumn("Destino");
        model.addColumn("H. Llegada");
        model.addColumn("FechaLlegada");
        model.addColumn("Estado");
        model.addColumn("Aerolínea");

        consultaTodos();
        iniciarTimer();

    }

    private void consultaTodos() {

        String query = "SELECT vuelos.Salida, vuelos.Destino, vuelos.HorarioSalida, vuelos.Estado, vuelos.Fecha, vuelos.HorarioLlegada, vuelos.FechaLlegada, avion.Aerolinea FROM vuelos JOIN avion ON vuelos.Id_avion_vuelos = avion.id;";

        try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            model.setRowCount(0);

            while (rs.next()) {
                String ciudadSalida = rs.getString("Salida");
                String ciudadDestino = rs.getString("Destino");
                LocalTime horarioSalida = rs.getTime("HorarioSalida").toLocalTime();
                Date fecha = rs.getDate("Fecha");
                LocalTime horarioLlegada = rs.getTime("HorarioLlegada").toLocalTime();
                Date fechaLlegada = rs.getDate("FechaLlegada");
                String aerolinea = rs.getString("Aerolinea");

                String estado = determinarEstado(horarioSalida, fecha, fechaLlegada, horarioLlegada);
                Object[] vuelo = {ciudadSalida, horarioSalida, fecha, ciudadDestino,  horarioLlegada, fechaLlegada, estado, aerolinea};
                model.addRow(vuelo);
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }

    private void vuelosDeHoy() {

        String query = "SELECT vuelos.Salida, vuelos.Destino, vuelos.HorarioSalida, vuelos.Estado, vuelos.Fecha, vuelos.HorarioLlegada, vuelos.FechaLlegada, avion.Aerolinea FROM vuelos JOIN avion ON vuelos.Id_avion_vuelos = avion.id WHERE DATE(Fecha) = CURDATE();";

        try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            model.setRowCount(0);

            while (rs.next()) {
                String ciudadSalida = rs.getString("Salida");
                String ciudadDestino = rs.getString("Destino");
                LocalTime horarioSalida = rs.getTime("HorarioSalida").toLocalTime();
                Date fecha = rs.getDate("Fecha");
                LocalTime horarioLlegada = rs.getTime("HorarioLlegada").toLocalTime();
                Date fechaLlegada = rs.getDate("FechaLlegada");
                String aerolinea = rs.getString("Aerolinea");

                String estado = determinarEstado(horarioSalida, fecha, fechaLlegada, horarioLlegada);
                Object[] vuelo = {ciudadSalida, horarioSalida, fecha, ciudadDestino,  horarioLlegada, fechaLlegada, estado, aerolinea};
                model.addRow(vuelo);
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }

    private void vuelosDiferidos() {

        String query = "SELECT vuelos.Salida, vuelos.Destino, vuelos.HorarioSalida, vuelos.Estado, vuelos.Fecha, vuelos.HorarioLlegada, vuelos.FechaLlegada, avion.Aerolinea FROM vuelos JOIN avion ON vuelos.Id_avion_vuelos = avion.id WHERE DATE(Fecha) > CURDATE();";

        try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            model.setRowCount(0);

            while (rs.next()) {
                String ciudadSalida = rs.getString("Salida");
                String ciudadDestino = rs.getString("Destino");
                LocalTime horarioSalida = rs.getTime("HorarioSalida").toLocalTime();
                Date fecha = rs.getDate("Fecha");
                LocalTime horarioLlegada = rs.getTime("HorarioLlegada").toLocalTime();
                Date fechaLlegada = rs.getDate("FechaLlegada");
                String aerolinea = rs.getString("Aerolinea");

                String estado = determinarEstado(horarioSalida, fecha, fechaLlegada, horarioLlegada);
                Object[] vuelo = {ciudadSalida, horarioSalida, fecha, ciudadDestino,  horarioLlegada, fechaLlegada, estado, aerolinea};
                model.addRow(vuelo);
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }

    private String determinarEstado(LocalTime horario, Date fecha, Date fechaLlegada, LocalTime horarioLlegada) {

        LocalTime horaActual = LocalTime.now();
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaSalidaVuelo = fecha.toLocalDate();
        LocalDate fechaLlegadaVuelo = fechaLlegada.toLocalDate();

        if ((fechaActual.isAfter(fechaLlegadaVuelo)) || (!fechaActual.isBefore(fechaLlegadaVuelo) && !horaActual.isBefore(horarioLlegada)) ) {
            return "Aterrizado";
        } else if (!fechaActual.isAfter(fechaSalidaVuelo) && horaActual.isBefore(horario)) {
            return "Programado";
        } else {
            return "A tiempo";
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

        jPanel1 = new javax.swing.JPanel();
        inicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTodosLosVuelos = new javax.swing.JButton();
        btnVuelosDelDia = new javax.swing.JButton();
        btnVuelosDiferidos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setPreferredSize(new java.awt.Dimension(1213, 632));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicio.setBackground(new java.awt.Color(255, 255, 255));
        inicio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        inicio.setForeground(new java.awt.Color(0, 153, 255));
        inicio.setText("Volver al inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        jPanel1.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 950, 40));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setText("Horarios y estados de los vuelos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 400, 50));

        btnTodosLosVuelos.setBackground(new java.awt.Color(255, 255, 255));
        btnTodosLosVuelos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnTodosLosVuelos.setForeground(new java.awt.Color(0, 153, 255));
        btnTodosLosVuelos.setText("Mostrar todos los vuelos");
        btnTodosLosVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosLosVuelosActionPerformed(evt);
            }
        });
        jPanel1.add(btnTodosLosVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 240, -1));

        btnVuelosDelDia.setBackground(new java.awt.Color(255, 255, 255));
        btnVuelosDelDia.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnVuelosDelDia.setForeground(new java.awt.Color(0, 153, 255));
        btnVuelosDelDia.setText("Vuelos del día");
        btnVuelosDelDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosDelDiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVuelosDelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 280, -1));

        btnVuelosDiferidos.setBackground(new java.awt.Color(255, 255, 255));
        btnVuelosDiferidos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnVuelosDiferidos.setForeground(new java.awt.Color(0, 153, 255));
        btnVuelosDiferidos.setText("Vuelos de los próximos días");
        btnVuelosDiferidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosDiferidosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVuelosDiferidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 240, -1));

        tabla.setBackground(new java.awt.Color(0, 102, 255));
        tabla.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
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
        tabla.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 950, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        dispose();
        SesionIniciada si = new SesionIniciada();
        si.setExtendedState(JFrame.MAXIMIZED_BOTH);
        si.setVisible(true);
        this.dispose();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
