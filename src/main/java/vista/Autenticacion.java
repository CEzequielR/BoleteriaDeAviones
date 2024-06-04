/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class Autenticacion extends javax.swing.JFrame {

    /**
     * Creates new form Autenticacion
     */
    public Autenticacion() {
        initComponents();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtNombreRegistro = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txtApellidoRegistro = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        txtEmailRegistro = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        txtContraseñaRegistro = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtEmailSesionIniciada = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        txtContraseñaSesionIniciada = new javax.swing.JTextField();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1860, 1000));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("REGISTRARSE");

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreRegistro.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtNombreRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtNombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegistroActionPerformed(evt);
            }
        });
        jPanel6.add(txtNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 349, 30));

        label3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label3.setText("Apellido");
        jPanel6.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        label4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label4.setText("Nombre");
        jPanel6.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtApellidoRegistro.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtApellidoRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtApellidoRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel6.add(txtApellidoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 349, 30));

        label5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label5.setText("Correo Electrónico");
        jPanel6.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtEmailRegistro.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtEmailRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtEmailRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel6.add(txtEmailRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 349, 30));

        label6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label6.setText("Contraseña");
        jPanel6.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtContraseñaRegistro.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseñaRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtContraseñaRegistro.setForeground(new java.awt.Color(102, 102, 102));
        txtContraseñaRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel6.add(txtContraseñaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 349, 30));

        btnRegistro.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrarse");
        jPanel6.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 349, 39));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
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

        txtEmailSesionIniciada.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailSesionIniciada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtEmailSesionIniciada.setForeground(new java.awt.Color(102, 102, 102));
        txtEmailSesionIniciada.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtEmailSesionIniciada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailSesionIniciadaActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label1.setText("Contraseña");

        label2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label2.setText("Correo Electrónico");

        txtContraseñaSesionIniciada.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseñaSesionIniciada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtContraseñaSesionIniciada.setForeground(new java.awt.Color(102, 102, 102));
        txtContraseñaSesionIniciada.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btnInicio.setBackground(new java.awt.Color(51, 51, 51));
        btnInicio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Iniciar Sesión");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseñaSesionIniciada, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailSesionIniciada, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(237, 237, 237)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailSesionIniciada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContraseñaSesionIniciada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(650, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(297, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegistroActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        dispose();
        SesionIniciada ses1 = new SesionIniciada();
        ses1.setVisible(true);
        ses1.setLocationRelativeTo(null);
        ses1.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void txtEmailSesionIniciadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailSesionIniciadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailSesionIniciadaActionPerformed

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
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTextField txtApellidoRegistro;
    private javax.swing.JTextField txtContraseñaRegistro;
    private javax.swing.JTextField txtContraseñaSesionIniciada;
    private javax.swing.JTextField txtEmailRegistro;
    private javax.swing.JTextField txtEmailSesionIniciada;
    private javax.swing.JTextField txtNombreRegistro;
    // End of variables declaration//GEN-END:variables
}
