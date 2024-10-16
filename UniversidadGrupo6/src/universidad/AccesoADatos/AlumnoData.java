package universidad.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidad.Entidades.Alumno;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
        int x = 0;
    }

    public Connection getCon() {
        return con;
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac())); //localDate a Date
            ps.setBoolean(5, alumno.isActivo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));   // O usar rs.getInt("idAlumno") esto no me funciono

                JOptionPane.showMessageDialog(null, "Alumno añadido con éxito.");
                System.out.println("Alumno añadido con éxito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
            System.out.println(ex.getMessage() + "no se permiten Dni repetidos ");
        }
    }

    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
        }

        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
        }

        return alumno;
    }

    public List<Alumno> listarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();

        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
        }

        return alumnos;
    }

    public void modificarAlumno(Alumno alumno) {

        String sql = "UPDATE alumno SET apellido = ?, nombre = ?, fechaNacimiento = ?, estado = ? WHERE dni = ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            //ps.setInt(1, alumno.getDni());
            ps.setString(1, alumno.getApellido()); // apellido
            ps.setString(2, alumno.getNombre());   // nombre
            ps.setDate(3, Date.valueOf(alumno.getFechaNac())); // fechaNacimiento
            ps.setBoolean(4, alumno.isActivo());
            ps.setInt(5, alumno.getDni());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
                System.out.println("Modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
        }
    }

    public void eliminarAlumnoXdni(int doc) {
        try {
            String sql = "DELETE FROM alumno WHERE dni=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, doc);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el alumno.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }
    }

    public void eliminarAlumno(int id) {
        try {
            String sql = "DELETE FROM alumno WHERE idAlumno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el alumno.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }
    }
}
