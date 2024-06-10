
package vista;

import java.awt.Color;
import javax.swing.JFrame;

public class InicioDeSesion extends javax.swing.JFrame {

    public InicioDeSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ocultar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmailSesionIniciada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        ver = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        contrasenia = new javax.swing.JPasswordField();
        volver = new javax.swing.JButton();
        labelOlvidasteContraseña = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2004, 1129));
        setMinimumSize(new java.awt.Dimension(2004, 1129));
        setPreferredSize(new java.awt.Dimension(2004, 1129));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(2004, 1129));
        jPanel1.setMinimumSize(new java.awt.Dimension(2004, 1129));
        jPanel1.setPreferredSize(new java.awt.Dimension(2004, 1129));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel3.setText("INICIAR SESIÓN");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("CORREO ELECTRÓNICO");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 350, -1));

        txtEmailSesionIniciada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtEmailSesionIniciada.setForeground(new java.awt.Color(102, 102, 102));
        txtEmailSesionIniciada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEmailSesionIniciada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailSesionIniciadaActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmailSesionIniciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 350, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("CONTRASEÑA");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 350, -1));

        btnInicio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        btnInicio.setText("INGRESAR");
        btnInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInicio.setContentAreaFilled(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 349, -1));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gratis-png-administrador-de-contrasenas-iconos-de-la-computadora-contrasena-thumbnail.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 40, 30));

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png-transparent-computer-icons-password-password-black-and-white-padlock-login-thumbnail_1.png"))); // NOI18N
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        jPanel1.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, -1, 30));

        contrasenia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 350, 30));

        volver.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        volver.setText("VOLVER");
        volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver.setContentAreaFilled(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, 190, 60));

        labelOlvidasteContraseña.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        labelOlvidasteContraseña.setText("¿OLVIDASTE TU CONTRASEÑA?");
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
        jPanel1.add(labelOlvidasteContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 300, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clouds-911346_1280.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2040, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2035, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailSesionIniciadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailSesionIniciadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailSesionIniciadaActionPerformed
    
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        dispose();
        SesionIniciada ses1 = new SesionIniciada();
        ses1.setVisible(true);
        ses1.setLocationRelativeTo(null);
        ses1.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        dispose();
        Autenticacion au = new Autenticacion();
        au.setVisible(true);
        au.setLocationRelativeTo(null);
        au.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_volverActionPerformed

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

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        ver.setVisible(false);
        ocultar.setVisible(true);
        contrasenia.setEchoChar((char)0);  
    }//GEN-LAST:event_verMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        ver.setVisible(true);
        ocultar.setVisible(false);
        contrasenia.setEchoChar('•');
    }//GEN-LAST:event_ocultarMouseClicked
                               
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDeSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JPasswordField contrasenia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelOlvidasteContraseña;
    private javax.swing.JLabel ocultar;
    private javax.swing.JTextField txtEmailSesionIniciada;
    private javax.swing.JLabel ver;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
