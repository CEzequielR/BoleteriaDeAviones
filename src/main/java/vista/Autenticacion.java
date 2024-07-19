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
public class Autenticacion extends javax.swing.JFrame {

    public Autenticacion() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtNombreRegistro = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txtApellidoRegistro = new javax.swing.JTextField();
        txtEmailRegistro = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        btnRegistro = new javax.swing.JButton();
        txtcontraseñaregistro = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txtconfirmarcontraseña = new javax.swing.JPasswordField();
        labelcontrasenia = new javax.swing.JLabel();
        labelcorreo = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        panelInicioSesion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtEmailSesionIniciada = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        btnInicio = new javax.swing.JButton();
        labelOlvidasteContraseña = new javax.swing.JLabel();
        txtcontrasenia = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 102, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistro.setBackground(new java.awt.Color(0, 153, 255));
        panelRegistro.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRARSE");

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtNombreRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtNombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegistroActionPerformed(evt);
            }
        });
        jPanel6.add(txtNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 160, 30));

        label3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Apellido");
        jPanel6.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        label4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Nombre");
        jPanel6.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtApellidoRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtApellidoRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtApellidoRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel6.add(txtApellidoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 150, 30));

        txtEmailRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtEmailRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtEmailRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel6.add(txtEmailRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 160, 30));

        label6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Contraseña");
        jPanel6.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        btnRegistro.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel6.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 349, 39));
        jPanel6.add(txtcontraseñaregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 160, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Confirmar contraseña");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, -1));
        jPanel6.add(txtconfirmarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 30));
        jPanel6.add(labelcontrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 340, 30));
        jPanel6.add(labelcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 330, -1));
        jPanel6.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, 30));

        label7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Dni");
        jPanel6.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        label8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Correo Electrónico");
        jPanel6.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        panelFondo.add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 52, -1, 580));

        panelInicioSesion.setBackground(new java.awt.Color(51, 153, 255));
        panelInicioSesion.setBorder(new javax.swing.border.MatteBorder(null));
        panelInicioSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INICIAR SESIÓN");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        txtEmailSesionIniciada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtEmailSesionIniciada.setForeground(new java.awt.Color(102, 102, 102));
        txtEmailSesionIniciada.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtEmailSesionIniciada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailSesionIniciadaActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Contraseña");

        label2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Correo Electrónico");

        btnInicio.setBackground(new java.awt.Color(51, 51, 51));
        btnInicio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Iniciar Sesión");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panelInicioSesionLayout = new javax.swing.GroupLayout(panelInicioSesion);
        panelInicioSesion.setLayout(panelInicioSesionLayout);
        panelInicioSesionLayout.setHorizontalGroup(
            panelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioSesionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(labelOlvidasteContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInicioSesionLayout.createSequentialGroup()
                        .addGroup(panelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtcontrasenia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailSesionIniciada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                        .addGap(237, 237, 237)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInicioSesionLayout.setVerticalGroup(
            panelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioSesionLayout.createSequentialGroup()
                .addGroup(panelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInicioSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailSesionIniciada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInicioSesionLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcontrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelOlvidasteContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        panelFondo.add(panelInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 52, 410, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1221, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegistroActionPerformed

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

    private void txtEmailSesionIniciadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailSesionIniciadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailSesionIniciadaActionPerformed

    private void labelOlvidasteContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidasteContraseñaMouseClicked
        // TODO add your handling code here:
        OlvidarContraseña olv1 = new OlvidarContraseña(this, rootPaneCheckingEnabled);
        olv1.setVisible(true);
        olv1.setLocationRelativeTo(null);
    }//GEN-LAST:event_labelOlvidasteContraseñaMouseClicked

    private void labelOlvidasteContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidasteContraseñaMouseEntered
        // TODO add your handling code here:
        labelOlvidasteContraseña.setForeground(Color.blue);
    }//GEN-LAST:event_labelOlvidasteContraseñaMouseEntered

    private void labelOlvidasteContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidasteContraseñaMouseExited
        // TODO add your handling code here:
        labelOlvidasteContraseña.setForeground(Color.black);
    }//GEN-LAST:event_labelOlvidasteContraseñaMouseExited

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
                labelcorreo.setText("El formato del correo electrónico no es válido");
                return;
            } else {
                labelcorreo.setText("");
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
                labelcontrasenia.setText("La contraseña debe tener al menos 8 caracteres");
                return;
            } else {
                labelcontrasenia.setText("");
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
            Logger.getLogger(Autenticacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Autenticacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al enviar el correo");
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Autenticacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private javax.swing.JLabel labelOlvidasteContraseña;
    private javax.swing.JLabel labelcontrasenia;
    private javax.swing.JLabel labelcorreo;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelInicioSesion;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTextField txtApellidoRegistro;
    private javax.swing.JTextField txtEmailRegistro;
    private javax.swing.JTextField txtEmailSesionIniciada;
    private javax.swing.JTextField txtNombreRegistro;
    private javax.swing.JPasswordField txtconfirmarcontraseña;
    private javax.swing.JPasswordField txtcontrasenia;
    private javax.swing.JPasswordField txtcontraseñaregistro;
    private javax.swing.JTextField txtdni;
    // End of variables declaration//GEN-END:variables
}
