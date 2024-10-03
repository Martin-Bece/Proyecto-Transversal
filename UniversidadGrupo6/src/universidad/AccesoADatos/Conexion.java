
package universidad.AccesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL="jdbc:mysql://localhost/";
    private static final String DB="universidadGrupo6";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    private static Connection connection;

    public Conexion() {
    }
    
    public static Connection getConexion(){
    
        if (connection == null) {
           
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager
                        .getConnection(URL+DB,USUARIO,PASSWORD);
                JOptionPane.showMessageDialog(null, "Conectado");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Driver");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Error al conectarse a la BD");
            }
               
            
        }
        return connection;
        
}

}