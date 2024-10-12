/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.visita;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import universidad.AccesoADatos.AlumnoData;
import universidad.Entidades.Alumno;

/**
 *
 * @author Mila
 */
public class VistaAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaAlumno
     */
    AlumnoData alumnosD;
    Alumno alumno;

    public VistaAlumno() {
        initComponents();
        alumnosD = new AlumnoData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonesGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFnombre = new javax.swing.JTextField();
        jTFapellido = new javax.swing.JTextField();
        jTFdocumento = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jRBactivo = new javax.swing.JRadioButton();
        jBnuevo = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jRBinactivo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        ActualizarAlumno = new javax.swing.JButton();

        setBackground(new java.awt.Color(68, 167, 132));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(68, 167, 132));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jTFdocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFdocumentoKeyTyped(evt);
            }
        });

        jBbuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

        jRBactivo.setBackground(new java.awt.Color(68, 167, 132));
        BotonesGrupo.add(jRBactivo);
        jRBactivo.setText(" Activo");

        jBnuevo.setBackground(new java.awt.Color(255, 255, 255));
        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBeliminar.setBackground(new java.awt.Color(255, 255, 255));
        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jBsalir.setBackground(new java.awt.Color(255, 255, 255));
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jRBinactivo.setBackground(new java.awt.Color(68, 167, 132));
        BotonesGrupo.add(jRBinactivo);
        jRBinactivo.setText("Inactivo");
        jRBinactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBinactivoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento:");

        ActualizarAlumno.setText("Actualizar");
        ActualizarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTFdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(jBbuscar))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jRBinactivo)
                                                .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jRBactivo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(ActualizarAlumno)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBeliminar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBsalir))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(91, 91, 91))))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBnuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBbuscar))
                        .addGap(13, 13, 13)
                        .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRBactivo)
                        .addComponent(jRBinactivo)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBeliminar)
                    .addComponent(jButton3)
                    .addComponent(jBsalir)
                    .addComponent(ActualizarAlumno))
                .addGap(30, 30, 30))
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

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        int repuesta = JOptionPane.showConfirmDialog(this, "Esta seguro de Salir ?", "Atencion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

        if (repuesta == 0) {
            dispose();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jTFdocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFdocumentoKeyTyped
        char car = evt.getKeyChar();
        if (!Character.isDigit(car)) {
            evt.consume();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jTFdocumentoKeyTyped

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // Buscamo alumno por dni.
        if (!jTFdocumento.getText().isEmpty()) {

            int dni = Integer.parseInt(jTFdocumento.getText());

            if (esDNIValido(String.valueOf(dni))) // Validar dni
            {
                alumno = alumnosD.buscarAlumnoPorDni(dni);
                if (alumno != null) {

                    jTFapellido.setText(alumno.getApellido());
                    jTFnombre.setText(alumno.getNombre());
                    if (alumno.isActivo()) {
                        jRBactivo.setSelected(true);
                    } else {
                        jRBinactivo.setSelected(false);
                    }

                    Date date = Date.from(alumno.getFechaNac().atStartOfDay(ZoneId.systemDefault()).toInstant());

                    jDateChooser1.setDate(date);

                } else {
                    //
                    jTFdocumento.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un Dni a Valido   ", "Atencion!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un Dni Buscar ", "Atencion!", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed

        if (!jTFdocumento.getText().isEmpty() && (esDNIValido(jTFdocumento.getText()))) {
            alumnosD.eliminarAlumnoXdni(Integer.parseInt(jTFdocumento.getText()));
            limpiarCampos();
        } else {
            int test = 1;
        }

    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!chequeo()) {

            Date fechaSeleccionada = jDateChooser1.getDate();
            LocalDate localDate = fechaSeleccionada.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();

         boolean seleccionado = false;
         if (jRBactivo.isSelected())
         {
             seleccionado=true;
             alumno = new Alumno(Integer.parseInt(jTFdocumento.getText()), jTFapellido.getText(), jTFnombre.getText(), localDate, seleccionado);
            alumnosD.guardarAlumno(alumno);
         } else if (!jRBactivo.isSelected() && !jRBinactivo.isSelected()){
             JOptionPane.showMessageDialog(this, "Porfavor Seleccione un Estado","Error",JOptionPane.WARNING_MESSAGE);
         }
         
        } else {
            JOptionPane.showMessageDialog(this, "Por favor complete los campos obligatorios ", "Atencion!", JOptionPane.WARNING_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ActualizarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarAlumnoActionPerformed
        if (!chequeo()) {

            Date fechaSeleccionada = jDateChooser1.getDate();
            LocalDate localDate = fechaSeleccionada.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();

         boolean seleccionado = false;
         if (jRBactivo.isSelected())
         {
             seleccionado=true;
         }
            
            
            alumno = new Alumno(Integer.parseInt(jTFdocumento.getText()), jTFapellido.getText(), jTFnombre.getText(), localDate, seleccionado);

            int opcionElegida = JOptionPane.showOptionDialog(
                    null,
                    "¿Quieres Actilizar el alumno con Dni ?" + jTFdocumento.getText(),
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"Aceptar", "Cancelar"},
                    "Aceptar"
            );

            if (opcionElegida == 0) {
                alumnosD.modificarAlumno(alumno);
            } else {
                limpiarCampos();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Por favor complete los campos ", "Atencion!", JOptionPane.WARNING_MESSAGE);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarAlumnoActionPerformed

    private void jRBinactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBinactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBinactivoActionPerformed
    public boolean chequeo() {

        return (jTFdocumento.getText().isEmpty() || jTFapellido.getText().isEmpty() || jTFnombre.getText().isEmpty());
    }

    public static boolean esDNIValido(String dni) {
        // Patrón para validar el DNI: 8 dígitos seguidos de una letra
        String regex = "^[0-9]{8,9}$";
        return Pattern.matches(regex, dni);
    }

    public void limpiarCampos() {
        jTFapellido.setText("");
        jTFdocumento.setText("");
        jTFnombre.setText("");
        jDateChooser1.setDate(null);
        jRBactivo.setSelected(false);
        jRBinactivo.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarAlumno;
    private javax.swing.ButtonGroup BotonesGrupo;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBactivo;
    private javax.swing.JRadioButton jRBinactivo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFdocumento;
    private javax.swing.JTextField jTFnombre;
    // End of variables declaration//GEN-END:variables
}
