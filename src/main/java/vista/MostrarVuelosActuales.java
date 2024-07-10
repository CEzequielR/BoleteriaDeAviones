package vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import javax.swing.table.DefaultTableModel;

public class MostrarVuelosActuales extends javax.swing.JFrame {

    private final DefaultTableModel model2;

    public MostrarVuelosActuales() {

        initComponents();

        model2 = new DefaultTableModel();
        tabla2.setModel(model2);

        model2.addColumn("IDvuelo");
        model2.addColumn("Salida");
        model2.addColumn("Destino");
        model2.addColumn("Horario");
        model2.addColumn("Estado");

        //Object[] vuelo1 = {"V1", "Ciudad A", "Ciudad B", LocalTime.now(), "Programado"};
        //Object[] vuelo2 = {"V2", "Ciudad C", "Ciudad D", LocalTime.now().plusHours(1), "A tiempo"};
        //model2.addRow(vuelo1);
        //model2.addRow(vuelo2);
        mostrarVuelosActuales();

    }

    @SuppressWarnings("unchecked")

    private void mostrarVuelosActuales() {
        
     String query = "SELECT IDvuelo, Salida, Destino, Horario, Estado FROM vuelosActuales";

    try (Connection conn = new Conexion().estableceConexion();
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        model2.setRowCount(0);

        while (rs.next()) {
            String idVuelo = rs.getString("IDvuelo");
            String ciudadSalida = rs.getString("Salida");
            String ciudadDestino = rs.getString("Destino");
            
            Time horarioTime = rs.getTime("Horario");
            LocalTime horario = horarioTime != null ? horarioTime.toLocalTime() : null;
            
            String estado = determinarEstado(horario);

            Object[] vuelo = {idVuelo, ciudadSalida, ciudadDestino, horario != null ? horario.toString() : "", estado};
            model2.addRow(vuelo);
        }

    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta de vuelos actuales: " + e.getMessage());
    }
     
    }

    private String generarIDVuelo() {
        return "Vuelo-" + (model2.getRowCount() + 1);
    }

     private String determinarEstado(LocalTime horaVuelo) {
        LocalTime horaActual = LocalTime.now();
        LocalTime horaLimite = horaVuelo.plusHours(1);

        if (horaActual.isAfter(horaLimite)) {
            return "Cancelado";
        } else if (horaActual.isAfter(horaVuelo)) {
            return "Retrasado";
        } else {
            return "A tiempo";
        }
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1860, 1000));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla2);

        jLabel1.setText("VUELOS ACTUALES");

        volver.setText("VOLVER");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(435, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        dispose();
        InformacionDeVuelos idv = new InformacionDeVuelos();
        idv.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarVuelosActuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new MostrarVuelosActuales().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla2;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
