package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
 
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "root";
    String bd = "vuelos";
    String ip = "localhost";
    String puerto = "3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion() { 
        
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            //JOptionPane.showMessageDialog(null, " La conexión se ha realizado con éxito");
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos, erorr: "+ e.toString());
        }
        return conectar;
    }
}