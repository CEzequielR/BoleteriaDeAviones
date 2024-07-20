package vista;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Monica Valenzuela
 */
public class MercadoPago extends javax.swing.JDialog {

    Connection conn = new Conexion().estableceConexion();

    public String correoReceptor;

    public MercadoPago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /*public int buscarReserva() {

        String query = "SELECT id FROM reservas WHERE estado = 'Pendiente' LIMIT 1";

        try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                rs.getInt("id");
            } else {
                throw new SQLException("No se encontró una reserva pendiente.");
            }
        } catch (SQLException e) {

        }
        return 0;
    }*/
    public MercadoPago() {
    }

    public void cambiarEstado() {
        String sql = "UPDATE reservas r "
                + "JOIN usuarios u ON r.usuarios_id = u.idusuarios "
                + "SET r.estado = 'Pagado' "
                + "WHERE u.idusuarios = ?";

        Conexion conexion = new Conexion();
        try (Connection conn = conexion.estableceConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            int usuarioId;
            try {
                usuarioId = Integer.parseInt(txtDni.getText());
            } catch (NumberFormatException e) {
                System.out.println("DNI inválido: " + txtDni.getText());
                return;
            }

            pstmt.setInt(1, usuarioId);

            int filasActualizadas = pstmt.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Estado actualizado correctamente.");
            } else {
                System.out.println("No se encontró ningún registro con el ID de usuario proporcionado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar el estado: " + e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreCompleto = new javax.swing.JTextField();
        txtNumeroTarjeta = new javax.swing.JTextField();
        txtFechaExpiración = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCvv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panemercado = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setText("Fecha de expiración");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setText("Nombre completo");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setText("Número de tarjeta");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel4.setText("CVV");

        btnPagar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(0, 153, 255));
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel5.setText("DNI");

        jScrollPane1.setViewportView(panemercado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(txtFechaExpiración, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaExpiración, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPagar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        try {
            double precioReserva = obtenerPrecioReserva();
            panemercado.setText("Precio de la reserva: $" + precioReserva);
            pagarConMercadoPago(precioReserva);

            JOptionPane.showMessageDialog(this, "Se abrirá la página de Mercado Pago.");

            new Thread(() -> {
                String urlMercadoPago = "https://www.mercadolibre.com/jms/mla/lgz/login?platform_id=MP&go=https%3A%2F%2Fwww.mercadopago.com.ar%2Fcost-simulator%2F&loginType=explicit";
                try {
                    Desktop.getDesktop().browse(new URI(urlMercadoPago));
                } catch (IOException | URISyntaxException e) {
                    JOptionPane.showMessageDialog(this, "Error al abrir la página de Mercado Pago: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }).start();

            Thread.sleep(3000);

            CompraDePasajes compraDePasajes = new CompraDePasajes();
            compraDePasajes.setVisible(true);
            
            cambiarEstado();

            JOptionPane.showMessageDialog(this, "Pago realizado con éxito.");
            //enviarCorreoPagoMercado();
        } catch (SQLException | InterruptedException e) {
            JOptionPane.showMessageDialog(this, "Error al realizar el pago: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private double obtenerPrecioReserva() throws SQLException {

        String query = "SELECT precio FROM reservas WHERE usuarios_id = ?";
        int usuarioId;

        try {
            usuarioId = Integer.parseInt(txtDni.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "DNI inválido: " + txtDni.getText());
            return 0;
        }

        try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, usuarioId);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    double precio = rs.getDouble("precio");
                    panemercado.setText("Total a pagar: $" + precio);
                    return precio;
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró la reserva con el ID proporcionado.");
                    panemercado.setText("");
                    return 0;
                }
            }
        }

    }

    private void pagarConMercadoPago(double monto) {
        JOptionPane.showMessageDialog(this, "Se pagará $" + monto + " a través de Mercado Pago.");
    }

    public void enviarCorreoPagoMercado() {
        String correoRemitente = "aerolineasezisina@gmail.com";
        String passwordRemitente = "t p w x c n f r re c a s i t i";
        correoReceptor = txtDni.getText().trim();

        String query = "SELECT reservas.id, reservas.pasajeros, reservas.precio, vuelos.Salida, vuelos.Destino, vuelos.Fecha, vuelos.HorarioSalida, vuelos.HorarioLlegada, usuarios.correo "
                   + "FROM reservas "
                   + "JOIN usuarios ON reservas.usuarios_id = usuarios.idusuarios "
                   + "JOIN vuelos ON reservas.vuelo_id = vuelos.IDvuelo "
                   + "WHERE usuarios.idusuarios = ?";
        
        String asunto = "DETALLES DE SU RESERVA";
        StringBuilder cuerpoMensaje = new StringBuilder();
        cuerpoMensaje.append("Estimado cliente,\n\n");
        cuerpoMensaje.append("Aquí están los detalles de su reserva:\n\n");

        try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, correoReceptor);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    cuerpoMensaje.append("Reserva: ").append(rs.getInt("id")).append("\n");
                    cuerpoMensaje.append("Pasajeros: ").append(rs.getString("pasajeros")).append("\n");
                    cuerpoMensaje.append("Precio: $").append(rs.getDouble("precio")).append("\n");
                    cuerpoMensaje.append("Salida: ").append(rs.getString("salida")).append("\n");
                    cuerpoMensaje.append("Destino: ").append(rs.getString("destino")).append("\n");
                    cuerpoMensaje.append("Fecha: ").append(rs.getString("fecha")).append("\n");
                    cuerpoMensaje.append("Horario de Salida: ").append(rs.getString("horarioSalida")).append("\n");
                    cuerpoMensaje.append("Horario de Llegada: ").append(rs.getString("horarioLlegada")).append("\n\n");
           
                    // Obtener el correo del usuario
                    String correoReceptor = rs.getString("correo");

                    // Agregar más información si es necesario
                    cuerpoMensaje.append("Gracias por elegir nuestra aerolínea.");

                    enviarCorreo(correoRemitente, passwordRemitente, correoReceptor, asunto, cuerpoMensaje.toString());

                    JOptionPane.showMessageDialog(null, "Correo enviado correctamente a: " + correoReceptor);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ninguna reserva asociada al DNI proporcionado.");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Autenticacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al obtener los detalles de la reserva: " + ex.getMessage());
        }
    }

    public void enviarCorreo(String correoRemitente, String passwordRemitente, String correoReceptor, String asunto, String cuerpoMensaje) {
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getInstance(props, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(correoRemitente, passwordRemitente);
                }
            });

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);

            message.setText(cuerpoMensaje);

            Transport.send(message);

        } catch (MessagingException ex) {
            Logger.getLogger(Autenticacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al enviar el correo: " + ex.getMessage());
        }
    }

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MercadoPago dialog = new MercadoPago(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane panemercado;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaExpiración;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
