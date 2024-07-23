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
public class InicioSesion extends javax.swing.JFrame {

    public InicioSesion() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        txtEmailSesionIniciada = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        txtcontrasenia = new javax.swing.JPasswordField();
        labelOlvidasteContraseña = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnautenticacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(204, 204, 204));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel3.setText("INICIAR SESIÓN");
        panelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        label2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Correo Electrónico");
        panelFondo.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        txtEmailSesionIniciada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtEmailSesionIniciada.setForeground(new java.awt.Color(102, 102, 102));
        txtEmailSesionIniciada.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtEmailSesionIniciada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailSesionIniciadaActionPerformed(evt);
            }
        });
        panelFondo.add(txtEmailSesionIniciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 349, 30));

        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Contraseña");
        panelFondo.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));
        panelFondo.add(txtcontrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 349, 34));

        labelOlvidasteContraseña.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        labelOlvidasteContraseña.setForeground(new java.awt.Color(51, 51, 51));
        labelOlvidasteContraseña.setText("¿Olvidaste la contraseña?");
        labelOlvidasteContraseña.setToolTipText("");
        labelOlvidasteContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOlvidasteContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOlvidasteContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOlvidasteContraseñaMouseExited(evt);
            }
        });
        panelFondo.add(labelOlvidasteContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 189, -1));

        btnInicio.setBackground(new java.awt.Color(51, 51, 51));
        btnInicio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("INICIAR SESIÓN");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        panelFondo.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 349, 50));

        btnautenticacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnautenticacion.setText("VOLVER AL INICIO");
        btnautenticacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnautenticacionActionPerformed(evt);
            }
        });
        panelFondo.add(btnautenticacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 590, 350, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/airplane-in-sky-background-free-photo.jpg"))); // NOI18N
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1500, 1020));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        String correo = txtEmailSesionIniciada.getText();
        String contrasenia = new String(txtcontrasenia.getPassword());

        if (correo.isEmpty() || contrasenia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos");
            return;
        }

        if (consultarUsuario(correo, contrasenia)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
            SesionIniciada si = new SesionIniciada();
            si.setExtendedState(JFrame.MAXIMIZED_BOTH);
            si.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos");
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void labelOlvidasteContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidasteContraseñaMouseExited
        // TODO add your handling code here:
        labelOlvidasteContraseña.setForeground(Color.black);
    }//GEN-LAST:event_labelOlvidasteContraseñaMouseExited

    private void labelOlvidasteContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidasteContraseñaMouseEntered
        // TODO add your handling code here:
        labelOlvidasteContraseña.setForeground(Color.blue);
    }//GEN-LAST:event_labelOlvidasteContraseñaMouseEntered

    private void labelOlvidasteContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidasteContraseñaMouseClicked
        // TODO add your handling code here:
        OlvidarContraseña olv1 = new OlvidarContraseña(this, rootPaneCheckingEnabled);
        olv1.setVisible(true);
        olv1.setLocationRelativeTo(null);
    }//GEN-LAST:event_labelOlvidasteContraseñaMouseClicked

    private void txtEmailSesionIniciadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailSesionIniciadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailSesionIniciadaActionPerformed

    private void btnautenticacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnautenticacionActionPerformed
       dispose();
       Autenticacion a = new Autenticacion();
       a.setVisible(true);
    }//GEN-LAST:event_btnautenticacionActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnautenticacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JLabel labelOlvidasteContraseña;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtEmailSesionIniciada;
    private javax.swing.JPasswordField txtcontrasenia;
    // End of variables declaration//GEN-END:variables
}
