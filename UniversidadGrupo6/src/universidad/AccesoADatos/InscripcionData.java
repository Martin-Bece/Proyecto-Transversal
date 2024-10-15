package universidad.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad.Entidades.Alumno;
import universidad.Entidades.Inscripcion;
import universidad.Entidades.Materia;

public class InscripcionData {
    
    private Connection con = null;
    MateriaData matData = new MateriaData();
    AlumnoData aluData = new AlumnoData();
    
    public InscripcionData(){
        con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion ins){
        String sql = "INSERT INTO inscripcion ( nota, idMateria, idAlumno ) VALUES ( ?, ?, ? )";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDouble(1, ins.getNota());
            ps.setInt(2, ins.getMateria().getIdMateria());
            ps.setInt(3, ins.getAlumno().getIdAlumno());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                ins.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscrpcion Realizada");
               
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        
        String sql = "SELECT * FROM inscripcion";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Inscripcion ins = new Inscripcion();
                
                ins.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                ins.setNota(rs.getInt("nota"));
                
                inscripciones.add(ins);
            }
            
            ps.close();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        
        return inscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Inscripcion ins = new Inscripcion();
                
                ins.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                ins.setNota(rs.getInt("nota"));
                
                inscripciones.add(ins);
            }
            
            ps.close();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        
        return inscripciones;
    }
    
    public List<Materia> obtenerMateriasCursadas(int id) {
    ArrayList<Materia> materiasC = new ArrayList<>();
    
    String sql = "SELECT i.idMateria, m.nombre, m.año FROM inscripcion i " +
                 "JOIN materia m ON i.idMateria = m.idMateria " +
                 "WHERE i.idAlumno = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Materia mat = new Materia();
            mat.setIdMateria(rs.getInt("idMateria"));
            mat.setNombre(rs.getString("nombre")); 
            mat.setAnioMateria(rs.getInt("año"));
            mat.setActivo(true);
            
            materiasC.add(mat);
        }
        
        ps.close();
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion: " + ex.getMessage());
    }
    
    return materiasC;
    }
    
    public List<Materia>obtenerMateriasNOCursadas(int id){
        ArrayList<Materia> materiasNOC = new ArrayList();
        
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN " + 
                "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?);";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                Materia mat = new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnioMateria(rs.getInt("año"));
                mat.setActivo(true);
                
                materiasNOC.add(mat);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        
        return materiasNOC;
    
    }
    
    public void borrarInscripcion (int idAlumno, int idMateria){
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inscricion Borrada exitosamente");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inscripcion Actualizada con éxito");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla inscripcion"+ ex.getMessage());
        }
        
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        
        ArrayList<Alumno> alumnos = new ArrayList();
        
        String sql = "SELECT a.idAlumno, a.dni, a.nombre, a.apellido, a.fechaNacimiento, a.estado " + 
                "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Alumno alu = new Alumno();
                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setDni(rs.getInt("dni"));
                alu.setNombre(rs.getString("nombre"));
                alu.setApellido(rs.getString("apellido"));
                alu.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setActivo(rs.getBoolean("estado"));
                
                alumnos.add(alu);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla inscripcion");
        }
        
        return alumnos;
    }
    
}
