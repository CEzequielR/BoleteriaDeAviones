package vista;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BusquedaDeVuelos extends javax.swing.JFrame {

    private DefaultTableModel model;
    private int cantPasajeros;
    private int codigoVuelo;
    public int idReserva;
   
    public BusquedaDeVuelos() {
        initComponents();
        model = new DefaultTableModel();
        tablaInfo.setModel(model);
        model.addColumn("Código");
        model.addColumn("Salida");
        model.addColumn("H. Salida");
        model.addColumn("Fecha");
        model.addColumn("Destino");
        model.addColumn("H. Llegada");
        model.addColumn("Fecha Llegada");
        model.addColumn("Aerolínea");
        model.addColumn("Cantidad pasajeros");

        consultaTodos();
        //Acá debe estar llamado el método para inicializar el combobox

    }
    

    //Acá hacer el método para llenar los combo box
    private void consultaTodos() {
        String query = "SELECT vuelos.IDvuelo, vuelos.Salida, vuelos.Destino, vuelos.HorarioSalida, vuelos.Estado, vuelos.Fecha, vuelos.HorarioLlegada, vuelos.FechaLlegada, avion.Aerolinea, avion.Cantidad_pasajeros FROM vuelos JOIN avion ON vuelos.Id_avion_vuelos = avion.id WHERE DATE(Fecha) > CURDATE();";

        try (Connection conn = new Conexion().estableceConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            model.setRowCount(0);

            while (rs.next()) {
                int id = rs.getInt("IDvuelo");
                String ciudadSalida = rs.getString("Salida");
                String ciudadDestino = rs.getString("Destino");
                LocalTime horarioSalida = rs.getTime("HorarioSalida").toLocalTime();
                Date fecha = rs.getDate("Fecha");
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String fechaString = dateFormat.format(fecha);
                LocalTime horarioLlegada = rs.getTime("HorarioLlegada").toLocalTime();
                Date fechaLlegada = rs.getDate("FechaLlegada");
                String aerolinea = rs.getString("Aerolinea");
                String pasajeros = rs.getString("Cantidad_pasajeros");
                Object[] vuelo = {ciudadSalida, horarioSalida, fechaString, ciudadDestino, horarioLlegada, fechaLlegada, aerolinea, pasajeros};
                model.addRow(vuelo);
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInfo = new javax.swing.JTable();
        btnBuscarFecha = new javax.swing.JButton();
        botonreservar = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        choseerFecha = new com.toedter.calendar.JDateChooser();
        comboDestino = new javax.swing.JComboBox<>();
        comboOrigen = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        spinBebes = new javax.swing.JSpinner();
        spinNinios = new javax.swing.JSpinner();
        spinMayores = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1915, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1860, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaInfo.setBackground(new java.awt.Color(153, 153, 255));
        tablaInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaInfo.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(tablaInfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 700, 1211));

        btnBuscarFecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnBuscarFecha.setText("Buscar");
        btnBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFechaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 160, 40));

        botonreservar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonreservar.setText("Reservar");
        botonreservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonreservarActionPerformed(evt);
            }
        });
        jPanel1.add(botonreservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 180, 230, 66));

        inicio.setText("VOLVER AL INICIO");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        jPanel1.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 230, 60));
        jPanel1.add(choseerFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 230, 40));

        comboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buenos Aires", "Cancún", "Miami", "Rio De Janeiro", " " }));
        jPanel1.add(comboDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 230, 40));

        comboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buenos Aires", "Cancún", " " }));
        jPanel1.add(comboOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 230, 40));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("Destino");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Origen");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setText("Código del vuelo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, -1, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 130, 240, 40));
        jPanel1.add(spinBebes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 300, -1, -1));
        jPanel1.add(spinNinios, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, -1, -1));
        jPanel1.add(spinMayores, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("Bebes menores a 2 años");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText("Niños menores de 18 años");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setText("Mayores de 18 años");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        dispose();
        SesionIniciada si = new SesionIniciada();
        si.setVisible(true);
    }//GEN-LAST:event_inicioActionPerformed

    private void btnBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFechaActionPerformed
        // Obtener una conexión a la base de datos
        Connection conn = new Conexion().estableceConexion();

        // Consulta SQL para obtener vuelos filtrados por origen, destino y fecha, con información del avión
        String sql = "SELECT  vuelos.IDvuelo, vuelos.Salida, vuelos.Destino, vuelos.HorarioSalida, vuelos.Fecha, "
                + "vuelos.HorarioLlegada, vuelos.FechaLlegada, avion.Aerolinea, avion.Cantidad_pasajeros "
                + "FROM vuelos "
                + "JOIN avion ON vuelos.Id_avion_vuelos = avion.id "
                + "WHERE vuelos.Salida = ? AND vuelos.Destino = ? AND vuelos.Fecha = ?";

        try {
            // Obtener origen y destino seleccionados del ComboBox
            String origen = comboOrigen.getSelectedItem().toString();
            String destino = comboDestino.getSelectedItem().toString();

            // Obtener la fecha seleccionada del JDateChooser
            Date selectedDate = choseerFecha.getDate();
            java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

            // Preparar la consulta SQL con parámetros
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, origen);
            pstmt.setString(2, destino);
            pstmt.setDate(3, sqlDate);

            // Limpiar items actuales de la tabla
            DefaultTableModel model = (DefaultTableModel) tablaInfo.getModel();
            model.setRowCount(0);

            // Ejecutar la consulta y obtener el resultado
            ResultSet rs = pstmt.executeQuery();

            // Procesar el resultado y agregar filas a la tabla
            while (rs.next()) {
                int id = rs.getInt("IDvuelo");
                String salida = rs.getString("Salida");
                destino = rs.getString("Destino");
                Time horarioSalida = rs.getTime("HorarioSalida");
                Date fecha = rs.getDate("Fecha");
                Time horarioLlegada = rs.getTime("HorarioLlegada");
                Date fechaLlegada = rs.getDate("FechaLlegada");
                String aerolinea = rs.getString("Aerolinea");
                int cantidadPasajeros = rs.getInt("Cantidad_pasajeros");

                // Agregar datos a la tabla
                Object[] vuelo = {salida, horarioSalida, fecha, destino, horarioLlegada, fechaLlegada, aerolinea, cantidadPasajeros};
                model.addRow(vuelo);
            }

        } catch (SQLException ex) {
            System.out.println("Error al buscar vuelos: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarFechaActionPerformed

    private void botonreservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonreservarActionPerformed
        try {

            String codigo = txtCodigo.getText().trim();

            int codigoEntero = Integer.parseInt(codigo);

            Connection conn = new Conexion().estableceConexion();

            String sql = "SELECT IDvuelo, precio FROM vuelos WHERE IDvuelo = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, codigoEntero);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                codigoVuelo = rs.getInt("IDvuelo");
                double precio = rs.getDouble("precio");

                int numBebes = (int) spinBebes.getValue();
                int numNinios = (int) spinNinios.getValue();
                int numMayores = (int) spinMayores.getValue();
                cantPasajeros = numBebes + numNinios + numMayores;

                double precioTotal = calcularPrecioTotal(precio, numBebes, numNinios, numMayores);

                String mensaje = "Cantidad de bebés: " + numBebes + " (50% off)\n"
                        + "Cantidad de niños: " + numNinios + "\n"
                        + "Cantidad de adultos: " + numMayores + "\n\n"
                        + "El precio total es: $" + precioTotal;

                JOptionPane.showMessageDialog(null, mensaje);

                String sql2 = "INSERT INTO reservas (vuelo_id, precio, estado, pasajeros) VALUES (?, ?, ?, ?)";
                PreparedStatement pstmtInsert = conn.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
                //PreparedStatement pstmtInsert = conn.prepareStatement(sql2);
                pstmtInsert.setInt(1, codigoVuelo);
                pstmtInsert.setDouble(2, precioTotal);
                pstmtInsert.setString(3, "Pendiente");
                pstmtInsert.setInt(4, cantPasajeros);

                int filasInsertadas = pstmtInsert.executeUpdate();

                if (filasInsertadas > 0) {
                    ResultSet generatedKeys = pstmtInsert.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        idReserva = generatedKeys.getInt(1);
                        JOptionPane.showMessageDialog(null, "Reserva realizada correctamente. ID de reserva: " + idReserva);
                        IngresarPasajeros ip = new IngresarPasajeros(null, true);
                        ip.pack(); 
                        ip.setLocationRelativeTo(null); 
                        ip.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo realizar la reserva.");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un vuelo con el código " + codigo);
                }

                conn.close();

            }
        } catch (NumberFormatException | SQLException ex) {
            Logger.getLogger(BusquedaDeVuelos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al buscar el vuelo: " + ex.getMessage());
        }
    }//GEN-LAST:event_botonreservarActionPerformed

    private double calcularPrecioTotal(double precioBase, int numBebes, int numNinios, int numMayores) {
        double precioTotal = 0.0;

        precioTotal = precioBase * (numNinios + numMayores);
        double descuentoBebes = numBebes * (precioBase * 0.50);
        precioTotal += descuentoBebes;

        return precioTotal;
    }

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
            java.util.logging.Logger.getLogger(BusquedaDeVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaDeVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaDeVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaDeVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaDeVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonreservar;
    private javax.swing.JButton btnBuscarFecha;
    private com.toedter.calendar.JDateChooser choseerFecha;
    private javax.swing.JComboBox<String> comboDestino;
    private javax.swing.JComboBox<String> comboOrigen;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinBebes;
    private javax.swing.JSpinner spinMayores;
    private javax.swing.JSpinner spinNinios;
    private javax.swing.JTable tablaInfo;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
