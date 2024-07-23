package vista;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Registrarse extends javax.swing.JFrame {

    public Registrarse() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label4 = new java.awt.Label();
        txtNombreRegistro = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        txtApellidoRegistro = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        txtEmailRegistro = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        txtdni = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        txtcontraseñaregistro = new javax.swing.JPasswordField();
        txtconfirmarcontraseña = new javax.swing.JPasswordField();
        btnRegistro = new javax.swing.JButton();
        btnautenticacion2 = new javax.swing.JButton();
        label9 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 102, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setText("REGISTRARSE");
        panelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        label4.setBackground(new java.awt.Color(102, 102, 102));
        label4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Nombre");
        panelFondo.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        txtNombreRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtNombreRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtNombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegistroActionPerformed(evt);
            }
        });
        panelFondo.add(txtNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 160, 30));

        label3.setBackground(new java.awt.Color(102, 102, 102));
        label3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Apellido");
        panelFondo.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        txtApellidoRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtApellidoRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtApellidoRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panelFondo.add(txtApellidoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 150, 30));

        label8.setBackground(new java.awt.Color(102, 102, 102));
        label8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 0, 0));
        label8.setText("Correo Electrónico");
        panelFondo.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        txtEmailRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtEmailRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtEmailRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panelFondo.add(txtEmailRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 160, 30));

        label7.setBackground(new java.awt.Color(102, 102, 102));
        label7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 0, 0));
        label7.setText("Dni");
        panelFondo.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, -1, -1));
        panelFondo.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 150, 30));

        label6.setBackground(new java.awt.Color(102, 102, 102));
        label6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("Confirmar contraseña");
        panelFondo.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));
        panelFondo.add(txtcontraseñaregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 160, 30));
        panelFondo.add(txtconfirmarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 160, 30));

        btnRegistro.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        panelFondo.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 390, 39));

        btnautenticacion2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnautenticacion2.setText("VOLVER AL INICIO");
        btnautenticacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnautenticacion2ActionPerformed(evt);
            }
        });
        panelFondo.add(btnautenticacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, 340, 50));

        label9.setBackground(new java.awt.Color(102, 102, 102));
        label9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label9.setForeground(new java.awt.Color(0, 0, 0));
        label9.setText("Contraseña");
        panelFondo.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/airplane-in-sky-background-free-photo.jpg"))); // NOI18N
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1380, 1030));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegistroActionPerformed

    public boolean guardarUsuario(String correo, String contrasenia) {
        Connection conn = new Conexion().estableceConexion();
        String sql = "INSERT INTO usuarios (correo, contrasenia) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, correo);
            pstmt.setString(2, contrasenia);

            int ts = pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario guardado correctamente");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e.getMessage());
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean consultarUsuario(String correo, String contrasenia) {
        Connection conn = new Conexion().estableceConexion();
        String sql = "SELECT correo, contrasenia FROM usuarios WHERE correo = ? AND contrasenia = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, correo);
            pstmt.setString(2, contrasenia);

            ResultSet rs = pstmt.executeQuery();

            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Error al consultar usuario: " + ex.getMessage());
            return false;
        }

    }

    private boolean usuarioYaRegistrado(String correo) {
        Connection conn = new Conexion().estableceConexion();
        String sql = "SELECT COUNT(*) AS count FROM usuarios WHERE correo = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, correo);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count > 0;
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar si el usuario está registrado: " + ex.getMessage());
        }
        return false;
    }

    public boolean validarCorreoElectronico(String correo) {

        return correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    private boolean registrarUsuario(int dni, String nombre, String apellido, String correo, String contrasenia) {
        if (usuarioYaRegistrado(correo)) {
            JOptionPane.showMessageDialog(null, "El correo electrónico ya está registrado");
            return false;
        }

        Connection conn = new Conexion().estableceConexion();

        if (conn != null) {
            String sql = "INSERT INTO usuarios (idusuarios, nombre, apellido, correo, contrasenia) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, dni);
                pstmt.setString(2, nombre);
                pstmt.setString(3, apellido);
                pstmt.setString(4, correo);
                pstmt.setString(5, contrasenia);

                int rowsAffected = pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
                return rowsAffected > 0;
            } catch (SQLException ex) {
                System.out.println("Error al registrar usuario: " + ex.getMessage());
                return false;
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar la conexión: " + ex.getMessage());
                }
            }
        } else {
            System.out.println("No se pudo establecer la conexión a la base de datos");
            return false;
        }
    }

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            String correoRemitente = "aerolineasezisina@gmail.com";
            String passwordRemitente = "t p w x c n f r re c a s i t i";
            String correoReceptor = txtEmailRegistro.getText();
            String asunto = "Correo en Java";
            String mensaje = "Validación de correo";

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje);

            Transport transport = session.getTransport("smtp");

            int dni = Integer.parseInt(txtdni.getText());       
            String nombre = txtNombreRegistro.getText();
            String apellido = txtApellidoRegistro.getText();
            String correo = txtEmailRegistro.getText();
            String contrasenia = new String(txtcontraseñaregistro.getPassword());
            String confirmarContrasena = new String(txtconfirmarcontraseña.getPassword());

            if (!validarCorreoElectronico(correo)) {
                txtEmailRegistro.setText("El formato del correo electrónico no es válido");
                return;
            } else {
                txtEmailRegistro.setText("");
            }

            if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || contrasenia.isEmpty() || confirmarContrasena.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios. Por favor, llénelos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!contrasenia.equals(confirmarContrasena)) {
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden. Por favor, inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (contrasenia.length() < 8) {
                txtcontraseñaregistro.setText("La contraseña debe tener al menos 8 caracteres");
                return;
            } else {
                txtcontraseñaregistro.setText("");
            }

            transport.connect(correoRemitente, passwordRemitente);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();

            // Si llega aquí, el correo se envió correctamente
            JOptionPane.showMessageDialog(null, "Correo enviado correctamente a: " + correoReceptor);
            registrarUsuario(dni, nombre,apellido,correo,contrasenia);
            //JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");

            SesionIniciada si = new SesionIniciada();
            si.setVisible(true);

        } catch (AddressException ex) {
            Logger.getLogger(Registrarse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Registrarse.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al enviar el correo");
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnautenticacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnautenticacion2ActionPerformed
        dispose();
        Autenticacion a = new Autenticacion();
        a.setVisible(true);
    }//GEN-LAST:event_btnautenticacion2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnautenticacion2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtApellidoRegistro;
    private javax.swing.JTextField txtEmailRegistro;
    private javax.swing.JTextField txtNombreRegistro;
    private javax.swing.JPasswordField txtconfirmarcontraseña;
    private javax.swing.JPasswordField txtcontraseñaregistro;
    private javax.swing.JTextField txtdni;
    // End of variables declaration//GEN-END:variables
}
