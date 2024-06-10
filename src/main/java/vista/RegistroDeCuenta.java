
package vista;

import javax.swing.JFrame;

public class RegistroDeCuenta extends javax.swing.JFrame {

    /**
     * Creates new form RegistroDeCuenta
     */
    public RegistroDeCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnvolverregistro = new javax.swing.JButton();
        txtNombreRegistro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellidoRegistro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmailRegistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        ver2 = new javax.swing.JLabel();
        ocultar2 = new javax.swing.JLabel();
        contrasenia2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(1400, 787));
        jPanel2.setMinimumSize(new java.awt.Dimension(1400, 787));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("REGISTRARSE");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("NOMBRE");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 350, -1));

        btnvolverregistro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnvolverregistro.setText("VOLVER");
        btnvolverregistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnvolverregistro.setContentAreaFilled(false);
        btnvolverregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverregistroActionPerformed(evt);
            }
        });
        jPanel2.add(btnvolverregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 640, 190, 50));

        txtNombreRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtNombreRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegistroActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 349, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("APELLIDO");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 350, -1));

        txtApellidoRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtApellidoRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtApellidoRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtApellidoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 349, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("CORREO ELECTRÓNICO");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 350, -1));

        txtEmailRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtEmailRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtEmailRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtEmailRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 349, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("CONTRASEÑA");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 350, -1));

        btnRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        btnRegistro.setText("CREAR CUENTA ");
        btnRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistro.setContentAreaFilled(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 349, 39));

        ver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gratis-png-administrador-de-contrasenas-iconos-de-la-computadora-contrasena-thumbnail.png"))); // NOI18N
        ver2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver2MouseClicked(evt);
            }
        });
        jPanel2.add(ver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, 30));

        ocultar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png-transparent-computer-icons-password-password-black-and-white-padlock-login-thumbnail_1.png"))); // NOI18N
        ocultar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultar2MouseClicked(evt);
            }
        });
        jPanel2.add(ocultar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, 30));

        contrasenia2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(contrasenia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 350, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clouds-911346_1280.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 790));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverregistroActionPerformed
        dispose();
        SesionIniciada si = new SesionIniciada();
        si.setVisible(true);
        si.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnvolverregistroActionPerformed

    private void txtNombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegistroActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        dispose();
        BienvenidoCuentaRegistrada bcr = new BienvenidoCuentaRegistrada();
        bcr.setVisible(true);
        bcr.setLocationRelativeTo(null);
        bcr.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void ver2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver2MouseClicked
        ver2.setVisible(false);
        ocultar2.setVisible(true);
        contrasenia2.setEchoChar((char)0);                         
        
    }//GEN-LAST:event_ver2MouseClicked

    private void ocultar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultar2MouseClicked
        ver2.setVisible(true);
        ocultar2.setVisible(false);
        contrasenia2.setEchoChar('•');
    }//GEN-LAST:event_ocultar2MouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnvolverregistro;
    private javax.swing.JPasswordField contrasenia2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel ocultar2;
    private javax.swing.JTextField txtApellidoRegistro;
    private javax.swing.JTextField txtEmailRegistro;
    private javax.swing.JTextField txtNombreRegistro;
    private javax.swing.JLabel ver2;
    // End of variables declaration//GEN-END:variables
}
