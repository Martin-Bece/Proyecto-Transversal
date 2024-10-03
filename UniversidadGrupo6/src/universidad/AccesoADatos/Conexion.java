package universidad.AccesoADatos;

import java.sql.*;


public class Conexion {


    private static Connection connection;

    public Conexion() {
    }

    public static Connection getConexion() {

        if (connection == null) {

            try {
                // Cargar el controlador
                Class.forName("org.mariadb.jdbc.Driver");

                // Establecer la conexión
                String url = "jdbc:mariadb://localhost:3306/universidadulp";
                String usuario = "root";
                String contrasena = "";

                connection = DriverManager.getConnection(url, usuario, contrasena);
                System.out.println("Conexión exitosa!");

            } catch (ClassNotFoundException e) {
                System.err.println("Controlador no encontrado: " + e.getMessage());
            } catch (SQLException e) {
                System.err.println("Error de conexión: " + e.getMessage());
            } 
        }
        return connection;

    }
}
