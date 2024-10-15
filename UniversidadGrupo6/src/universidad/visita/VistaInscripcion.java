/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.visita;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.AccesoADatos.AlumnoData;
import universidad.AccesoADatos.InscripcionData;
import universidad.AccesoADatos.MateriaData;
import universidad.Entidades.Alumno;
import universidad.Entidades.Inscripcion;
import universidad.Entidades.Materia;

/**
 *
 * @author Usuario
 */
public class VistaInscripcion extends javax.swing.JInternalFrame {

    
    AlumnoData ad;
    MateriaData md;
    InscripcionData id;
    
    List<Materia> materias;
    List <Alumno> alumnos;
    
    DefaultTableModel model;
    
    public VistaInscripcion() {
        initComponents();
        ad = new AlumnoData();
        md = new MateriaData();
        id = new InscripcionData();
        model = new DefaultTableModel();
        materias = new ArrayList();
        alumnos = ad.listarAlumnos();
        
        CargarCombo();
        CargarModelo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        ComboAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        MateriasInscriptas = new javax.swing.JRadioButton();
        MateriasNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInscripcion = new javax.swing.JTable();
        BotonInscribir = new javax.swing.JButton();
        BotonAnular = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(68, 167, 132));
        jPanel1.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Formulario de Inscripción");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de Materias");

        buttonGroup1.add(MateriasInscriptas);
        MateriasInscriptas.setText("Materias Inscriptas");
        MateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasInscriptasActionPerformed(evt);
            }
        });

        buttonGroup1.add(MateriasNoInscriptas);
        MateriasNoInscriptas.setText("Materias no Inscriptas");
        MateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasNoInscriptasActionPerformed(evt);
            }
        });

        TablaInscripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaInscripcion);

        BotonInscribir.setText("Inscribir");
        BotonInscribir.setEnabled(false);
        BotonInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInscribirActionPerformed(evt);
            }
        });

        BotonAnular.setText("Anular Inscripcion");
        BotonAnular.setEnabled(false);
        BotonAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnularActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MateriasInscriptas)
                                .addGap(59, 59, 59)
                                .addComponent(MateriasNoInscriptas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addComponent(ComboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(BotonInscribir)
                        .addGap(52, 52, 52)
                        .addComponent(BotonAnular)
                        .addGap(50, 50, 50)
                        .addComponent(BotonSalir)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MateriasInscriptas)
                    .addComponent(MateriasNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInscribir)
                    .addComponent(BotonAnular)
                    .addComponent(BotonSalir))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasInscriptasActionPerformed
        // TODO add your handling code here:
        
        borrarFilas();
        
        BotonInscribir.setEnabled(false);
        BotonAnular.setEnabled(true);
        
        CargarInscriptas();
    }//GEN-LAST:event_MateriasInscriptasActionPerformed

    private void MateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasNoInscriptasActionPerformed
        // TODO add your handling code here:
        
        borrarFilas();
        
        BotonInscribir.setEnabled(true);
        BotonAnular.setEnabled(false);
        
        CargarNoInscriptas();
    }//GEN-LAST:event_MateriasNoInscriptasActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        int repuesta = JOptionPane.showConfirmDialog(this, "Esta seguro de Salir ?", "Atencion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

        if (repuesta == 0) {
            dispose();
        }
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInscribirActionPerformed
        // TODO add your handling code here:
        int fs = TablaInscripcion.getSelectedRow();
        
        if (fs != -1) {
            
            Alumno alu = (Alumno) ComboAlumnos.getSelectedItem();
            
            int idMateria = (Integer) TablaInscripcion.getValueAt(fs, 0);
            String NombreMat =(String) TablaInscripcion.getValueAt(fs, 1);
            int AñoMat = (Integer) TablaInscripcion.getValueAt(fs, 2);
            
            Materia mat = new Materia(idMateria,NombreMat,AñoMat, true);

            Inscripcion i = new Inscripcion(alu,mat,0);
            
            id.guardarInscripcion(i);
            
            
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila","Error al seleccionar",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_BotonInscribirActionPerformed

    private void BotonAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnularActionPerformed
        // TODO add your handling code here:
        
        int sr = TablaInscripcion.getSelectedRow();
        
        if (sr != -1) {
            
            int idMateria = (Integer) TablaInscripcion.getValueAt(sr, 0);
            Alumno alu = (Alumno) ComboAlumnos.getSelectedItem();
            
            id.borrarInscripcion(alu.getIdAlumno(),idMateria);
            
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila","Error al seleccionar",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BotonAnularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnular;
    private javax.swing.JButton BotonInscribir;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<Alumno> ComboAlumnos;
    private javax.swing.JRadioButton MateriasInscriptas;
    private javax.swing.JRadioButton MateriasNoInscriptas;
    private javax.swing.JTable TablaInscripcion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables


    private void CargarCombo(){
        for (Alumno aux : alumnos) {
            ComboAlumnos.addItem(aux);
        }
    }

    private void CargarModelo(){
        ArrayList<Object> columnas = new ArrayList();
        
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Año");
        
        for (Object aux : columnas) {
            model.addColumn(aux);
        }
        
        TablaInscripcion.setModel(model);
    }
    
    private void borrarFilas(){
        model.setRowCount(0);
    }
    
    private void CargarNoInscriptas(){
        Alumno aluSel = (Alumno)ComboAlumnos.getSelectedItem();
        materias = (ArrayList) id.obtenerMateriasNOCursadas(aluSel.getIdAlumno());
        for (Materia aux : materias) {
            model.addRow(new Object[] {aux.getIdMateria(),aux.getNombre(),aux.getAnioMateria()});
        }
    }
    
    private void CargarInscriptas(){
        Alumno aluSel = (Alumno)ComboAlumnos.getSelectedItem();
        List<Materia> inscriptas = id.obtenerMateriasCursadas(aluSel.getIdAlumno());
        
        for (Materia aux : inscriptas) {
            model.addRow(new Object[] {aux.getIdMateria(),aux.getNombre(),aux.getAnioMateria()});
        }
    }
}
