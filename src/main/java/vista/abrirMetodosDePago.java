package vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class abrirMetodosDePago extends javax.swing.JFrame {

    public abrirMetodosDePago() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonverificar = new javax.swing.JButton();
        txtreservacodigo = new javax.swing.JTextField();
        combopagos = new javax.swing.JComboBox<>();
        botonpagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textpaneprecio = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("Elegir un método de pago");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Código de Reserva");

        botonverificar.setBackground(new java.awt.Color(255, 255, 255));
        botonverificar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        botonverificar.setForeground(new java.awt.Color(0, 153, 255));
        botonverificar.setText("Verificar");
        botonverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonverificarActionPerformed(evt);
            }
        });

        txtreservacodigo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        combopagos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        combopagos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Mercado Pago", "Tarjeta" }));
        combopagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopagosActionPerformed(evt);
            }
        });

        botonpagar.setBackground(new java.awt.Color(255, 255, 255));
        botonpagar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        botonpagar.setForeground(new java.awt.Color(0, 153, 255));
        botonpagar.setText("Pagar");
        botonpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpagarActionPerformed(evt);
            }
        });

        textpaneprecio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        textpaneprecio.setForeground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(textpaneprecio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(combopagos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonverificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtreservacodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 343, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtreservacodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonverificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combopagos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combopagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopagosActionPerformed

    }//GEN-LAST:event_combopagosActionPerformed

    private void botonpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpagarActionPerformed
        String metodoPagoSeleccionado = (String) combopagos.getSelectedItem();

        switch (metodoPagoSeleccionado) {
            case "MERCADO PAGO":
                dispose();
                MercadoPago mp = new MercadoPago(this, rootPaneCheckingEnabled);
                mp.setVisible(true);
                break;
            case "Efectivo":
                dispose();
                Efectivo e = new Efectivo(this, rootPaneCheckingEnabled);
                e.setVisible(true);
                break;
            case "Tarjeta":
                dispose();
                Tarjeta t = new Tarjeta(this, rootPaneCheckingEnabled);
                t.setVisible(true);
                break;
        }
    }//GEN-LAST:event_botonpagarActionPerformed

    private void botonverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonverificarActionPerformed
        
        String query = "SELECT precio FROM reservas WHERE id = ?";

        try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {

            int codigo = Integer.parseInt(txtreservacodigo.getText().trim());
            stmt.setInt(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    double precio = rs.getDouble("precio");
                    textpaneprecio.setText("El precio de la reserva es: $" + precio);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró la reserva con el ID proporcionado.");
                    textpaneprecio.setText("");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un código de reserva válido.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta: " + e.getMessage());
        }
    }//GEN-LAST:event_botonverificarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abrirMetodosDePago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonpagar;
    private javax.swing.JButton botonverificar;
    private javax.swing.JComboBox<String> combopagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane textpaneprecio;
    private javax.swing.JTextField txtreservacodigo;
    // End of variables declaration//GEN-END:variables
}
