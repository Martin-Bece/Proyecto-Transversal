package universidad.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidad.Entidades.Materia;

public class MateriaData {
    
    private Connection con = null;
    
    public MateriaData(){
        con = Conexion.getConexion();
    }
    
    public void GuardarMateria(Materia materia){
    
        
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
        
        try{
            PreparedStatement ps1 = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps1.setString(1, materia.getNombre());
            ps1.setInt(2, materia.getAnioMateria());
            ps1.setBoolean(3, materia.isActivo());
            ps1.executeUpdate();
            ResultSet rs1 = ps1.getGeneratedKeys();
            if (rs1.next()) {
                materia.setIdMateria(rs1.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia agregada con exito");
            }
            ps1.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia"+ex.getMessage());
        }
    }
    
    
    public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE idMateria = ? AND estado = 1";
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe la Materia");
                ps.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia"+ex.getMessage());
        }
        
        
        
        return materia;
    }
    
    
    public void modificarMateria(Materia materia){
        
        String sql = "UPDATE materia SET nombre = ?, año = ? WHERE idMateria = ?";
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setInt(3, materia.getIdMateria());
            
            ps.executeUpdate();
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada Exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No existe la Materia");
        }
        
    }
    
    
    public void eliminarMateria(int id){
        try{
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la Materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia"+ex.getMessage());
        }
    }
    
    
    public List<Materia> listarMaterias(){
        List<Materia> materias = new ArrayList();
        
        try{
            String sql = "SELECT * FROM materia WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));
                
                materias.add(materia);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia"+ex.getMessage());
        }
        
        return materias;
    }
    
}
