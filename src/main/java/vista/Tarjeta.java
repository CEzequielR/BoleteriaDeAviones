/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import static com.mysql.cj.conf.PropertyKey.PASSWORD;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import static javax.mail.Flags.Flag.USER;
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
public class Tarjeta extends javax.swing.JDialog {

    Connection conn = new Conexion().estableceConexion();

    public String correoReceptor;

    public Tarjeta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Tarjeta() {
    }

    public void insertarTarjeta() {
        try {
            String nombreCompleto = txtNombreCompleto.getText();
            int cvv = Integer.parseInt(txtCvv.getText());
            int dni = Integer.parseInt(txtDni.getText());
            String fecha = txtFechaExpiración.getText();
            String numeroTarjeta = txtNumeroTarjeta.getText();

            String sql = "INSERT INTO tarjetas (nombrecompleto, cvv, usuario_id, fecha, numerotarjeta) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, nombreCompleto);
            pstmt.setInt(2, cvv);
            pstmt.setInt(3, dni);
            pstmt.setString(4, fecha);
            pstmt.setString(5, numeroTarjeta);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar los datos: " + e.getMessage());
        }
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

    private void enviarCorreoTarjeta() {
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

    private void enviarCorreo(String correoRemitente, String passwordRemitente, String correoReceptor, String asunto, String cuerpoMensaje) {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setText("Fecha de expiración");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setText("Nombre completo");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setText("Número de tarjeta");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel4.setText("CVV");

        btnPagar.setBackground(new java.awt.Color(255, 255, 255));
        btnPagar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(0, 153, 255));
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel5.setText("DNI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(txtFechaExpiración, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPagar)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Estás en una sección segura para realizar pagos en línea. Coelsa Nations.", "Coelsa Nations", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            int confirmResult = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea hacer este pago?", "Confirmar pago", JOptionPane.YES_NO_OPTION);
            if (confirmResult == JOptionPane.YES_OPTION) {
                insertarTarjeta();
                cambiarEstado();
                JOptionPane.showMessageDialog(this, "Pago realizado con éxito.");
                enviarCorreoTarjeta();
                this.dispose();
            } else {
                System.out.println("Pago cancelado.");
            }
        } else {
            System.out.println("Operación cancelada por el usuario.");
        }


    }//GEN-LAST:event_btnPagarActionPerformed

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
            java.util.logging.Logger.getLogger(Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tarjeta dialog = new Tarjeta(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaExpiración;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
