package vista;

import javax.swing.JFrame;

public class Autenticacion extends javax.swing.JFrame {

    public Autenticacion() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnUsuarioReg = new javax.swing.JButton();
        btnregistrarus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("¡TE DAMOS LA BIENVENIDA A AEROLÍNEAS EZISINA!");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 910, 70));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("¿Ya tienes una cuenta o debes registrarte?");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        btnUsuarioReg.setBackground(new java.awt.Color(0, 0, 0));
        btnUsuarioReg.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnUsuarioReg.setText("YA TENGO CUENTA");
        btnUsuarioReg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUsuarioReg.setContentAreaFilled(false);
        btnUsuarioReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioRegActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 160, 40));

        btnregistrarus.setBackground(new java.awt.Color(0, 0, 0));
        btnregistrarus.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnregistrarus.setText("DEBO REGISTRARME ");
        btnregistrarus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnregistrarus.setContentAreaFilled(false);
        btnregistrarus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarusActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrarus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 160, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("MÉTODOS DE PAGO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 180, 50));

        jLabel3.setBackground(new java.awt.Color(102, 153, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1280px-Banco_Nación.svg_1.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 210, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DESTINOS INTERNACIONALES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 200, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miami_1.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 310, 200));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Desde Mendoza a Miami");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 120, 60));

        jLabel8.setBackground(new java.awt.Color(0, 0, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images (1)_1.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 150, 60));

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images (2)_1.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 120, 60));

        jLabel10.setBackground(new java.awt.Color(0, 102, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images (3)_1.png"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 160, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1441, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarusActionPerformed
        dispose();
        RegistroDeCuenta rdc = new RegistroDeCuenta();
        rdc.setVisible(true);
        rdc.setLocationRelativeTo(null);
        rdc.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnregistrarusActionPerformed

    private void btnUsuarioRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioRegActionPerformed
        dispose();
        InicioDeSesion ids = new InicioDeSesion();
        ids.setVisible(true);
        ids.setLocationRelativeTo(null);
        ids.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }//GEN-LAST:event_btnUsuarioRegActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autenticacion().setVisible(true);
            }
        });
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuarioReg;
    private javax.swing.JButton btnregistrarus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
