/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import ControladorBD.ConexionBD;
import ControladorBD.QuerysProgramas;
import java.awt.Color;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Frank
 */
public class AñadirPrograma extends javax.swing.JFrame {

    /**
     * Creates new form A
     */
    public AñadirPrograma() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        FechaInicio = new javax.swing.JLabel();
        FechaFin = new javax.swing.JLabel();
        Horario = new javax.swing.JLabel();
        MaximoInscritos = new javax.swing.JLabel();
        Costo = new javax.swing.JLabel();
        Instructor = new javax.swing.JLabel();
        DetallesCampo = new java.awt.TextField();
        NombreCampo = new java.awt.TextField();
        FechaInicioCampo = new java.awt.TextField();
        FechaFinCampo = new java.awt.TextField();
        HorarioCampo = new java.awt.TextField();
        MaximoInscritosCampo = new java.awt.TextField();
        CostoCampo = new java.awt.TextField();
        Detalles = new javax.swing.JLabel();
        InstructorComboBox = new javax.swing.JComboBox<>();
        CancelarPanel = new javax.swing.JPanel();
        CancelarBoton = new javax.swing.JLabel();
        GuardarPanel = new javax.swing.JPanel();
        GuardarBoton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(209, 209, 209));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(1050, 650));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Titulo.setText("Añadir un programa");
        PanelPrincipal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 530, 60));

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Nombre.setText("Nombre:");
        PanelPrincipal.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, 50));

        FechaInicio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FechaInicio.setText("Fecha de inicio:");
        PanelPrincipal.add(FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 180, 50));

        FechaFin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FechaFin.setText("Fecha fin:");
        PanelPrincipal.add(FechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 180, 50));

        Horario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Horario.setText("Horario:");
        PanelPrincipal.add(Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 180, 50));

        MaximoInscritos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MaximoInscritos.setText("Nº max inscritos:");
        PanelPrincipal.add(MaximoInscritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 200, 50));

        Costo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Costo.setText("Costo:");
        PanelPrincipal.add(Costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 200, 50));

        Instructor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Instructor.setText("Instructor");
        PanelPrincipal.add(Instructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 200, 50));

        DetallesCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DetallesCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DetallesCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetallesCampoActionPerformed(evt);
            }
        });
        PanelPrincipal.add(DetallesCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 550, 160));

        NombreCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NombreCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NombreCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCampoActionPerformed(evt);
            }
        });
        NombreCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreCampoKeyTyped(evt);
            }
        });
        PanelPrincipal.add(NombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 210, 30));

        FechaInicioCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FechaInicioCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FechaInicioCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaInicioCampoActionPerformed(evt);
            }
        });
        FechaInicioCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaInicioCampoKeyTyped(evt);
            }
        });
        PanelPrincipal.add(FechaInicioCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 210, 30));

        FechaFinCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FechaFinCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FechaFinCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaFinCampoActionPerformed(evt);
            }
        });
        FechaFinCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaFinCampoKeyTyped(evt);
            }
        });
        PanelPrincipal.add(FechaFinCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 210, 30));

        HorarioCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        HorarioCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HorarioCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorarioCampoActionPerformed(evt);
            }
        });
        HorarioCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HorarioCampoKeyTyped(evt);
            }
        });
        PanelPrincipal.add(HorarioCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 210, 30));

        MaximoInscritosCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MaximoInscritosCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MaximoInscritosCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaximoInscritosCampoActionPerformed(evt);
            }
        });
        MaximoInscritosCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MaximoInscritosCampoKeyTyped(evt);
            }
        });
        PanelPrincipal.add(MaximoInscritosCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 210, 30));

        CostoCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CostoCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CostoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoCampoActionPerformed(evt);
            }
        });
        CostoCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CostoCampoKeyTyped(evt);
            }
        });
        PanelPrincipal.add(CostoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 210, 30));

        Detalles.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Detalles.setText("Detalles:");
        PanelPrincipal.add(Detalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 100, 50));

        InstructorComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InstructorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructorComboBoxActionPerformed(evt);
            }
        });
        PanelPrincipal.add(InstructorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 210, 30));

        CancelarPanel.setBackground(new java.awt.Color(80, 200, 120));

        CancelarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelarBoton.setForeground(new java.awt.Color(255, 255, 255));
        CancelarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CancelarBoton.setText("Cancelar");
        CancelarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelarBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CancelarPanelLayout = new javax.swing.GroupLayout(CancelarPanel);
        CancelarPanel.setLayout(CancelarPanelLayout);
        CancelarPanelLayout.setHorizontalGroup(
            CancelarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CancelarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        CancelarPanelLayout.setVerticalGroup(
            CancelarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CancelarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelPrincipal.add(CancelarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 150, 50));

        GuardarPanel.setBackground(new java.awt.Color(80, 200, 120));
        GuardarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GuardarPanelMouseEntered(evt);
            }
        });

        GuardarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarBoton.setForeground(new java.awt.Color(255, 255, 255));
        GuardarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GuardarBoton.setText("Guardar");
        GuardarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GuardarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GuardarBotonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GuardarBotonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GuardarBotonMouseReleased(evt);
            }
        });
        GuardarBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GuardarBotonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout GuardarPanelLayout = new javax.swing.GroupLayout(GuardarPanel);
        GuardarPanel.setLayout(GuardarPanelLayout);
        GuardarPanelLayout.setHorizontalGroup(
            GuardarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuardarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GuardarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        GuardarPanelLayout.setVerticalGroup(
            GuardarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuardarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GuardarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelPrincipal.add(GuardarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DetallesCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetallesCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetallesCampoActionPerformed

    private void NombreCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCampoActionPerformed

    private void FechaInicioCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaInicioCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaInicioCampoActionPerformed

    private void FechaFinCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaFinCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaFinCampoActionPerformed

    private void HorarioCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorarioCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HorarioCampoActionPerformed

    private void MaximoInscritosCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaximoInscritosCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaximoInscritosCampoActionPerformed

    private void CostoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostoCampoActionPerformed

    private void InstructorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstructorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InstructorComboBoxActionPerformed

    private void CancelarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarBotonMouseClicked
        dispose();
        
    }//GEN-LAST:event_CancelarBotonMouseClicked

    private void CancelarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarBotonMouseEntered
        CancelarPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_CancelarBotonMouseEntered

    private void CancelarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarBotonMouseExited
        CancelarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_CancelarBotonMouseExited

    private void GuardarPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarPanelMouseEntered

    private void GuardarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBotonMouseEntered
        GuardarPanel.setBackground(new Color (32,67,114));
        
    }//GEN-LAST:event_GuardarBotonMouseEntered

    private void GuardarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBotonMouseExited
        GuardarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_GuardarBotonMouseExited

    private void GuardarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBotonMouseClicked
        // TODO add your handling code here:
        QuerysProgramas qp= new QuerysProgramas();
        qp.insertarPrograma(NombreCampo.getText(), FechaInicioCampo.getText(), FechaFinCampo.getText(),Integer.parseInt(CostoCampo.getText().trim()) , HorarioCampo.getText() , DetallesCampo.getText(), Integer.parseInt(MaximoInscritosCampo.getText().trim()), obtenerID());
        dispose();
    }//GEN-LAST:event_GuardarBotonMouseClicked

    private void GuardarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarPanelMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_GuardarPanelMouseClicked

    private void GuardarBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBotonMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_GuardarBotonMousePressed

    private void GuardarBotonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBotonMouseReleased
        // TODO add your handling code here:
  
    }//GEN-LAST:event_GuardarBotonMouseReleased

    private void GuardarBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GuardarBotonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarBotonKeyPressed

    private void NombreCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.soloLetras(evt);
    }//GEN-LAST:event_NombreCampoKeyTyped

    private void FechaInicioCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaInicioCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.validarFecha(evt, FechaInicioCampo);
    }//GEN-LAST:event_FechaInicioCampoKeyTyped

    private void MaximoInscritosCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MaximoInscritosCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.soloNumeros(evt);
    }//GEN-LAST:event_MaximoInscritosCampoKeyTyped

    private void CostoCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CostoCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.soloNumeros(evt);
    }//GEN-LAST:event_CostoCampoKeyTyped

    private void HorarioCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HorarioCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.validarHorario(evt, HorarioCampo);
    }//GEN-LAST:event_HorarioCampoKeyTyped

    private void FechaFinCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaFinCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.validarFecha(evt, FechaFinCampo);
    }//GEN-LAST:event_FechaFinCampoKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AñadirPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirPrograma().setVisible(true);
            }
        });
    }
public void cargarInstructoresEnComboBox() {
    // Crear el ComboBox si no está creado aún
    InstructorComboBox.removeAllItems(); // Limpiar el ComboBox antes de agregar nuevos elementos

    // Consulta SQL para obtener los nombres completos de los instructores
    String sql = "SELECT CONCAT(persona.nombre, ' ', persona.apellido_paterno, ' ', persona.apellido_materno) AS nombre_completo " +
                 "FROM instructor " +
                 "INNER JOIN persona ON instructor.ID_Persona = persona.ID_Persona";

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (java.sql.Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
            String nombreCompleto = rs.getString("nombre_completo");
            InstructorComboBox.addItem(nombreCompleto); // Añadir el nombre completo al ComboBox
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        conexionBD.desconectar();
    }
} 

public int obtenerID() {
    int ID=0;
    String sql = "SELECT CONCAT(ID_Instructor) AS nombre_completo " +
                 "FROM instructor " +
                 "INNER JOIN persona ON instructor.ID_Persona = persona.ID_Persona";

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (java.sql.Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
            ID = Integer.parseInt(rs.getString("nombre_completo")); 
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        conexionBD.desconectar();
    }
    return ID;
}
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CancelarBoton;
    private javax.swing.JPanel CancelarPanel;
    private javax.swing.JLabel Costo;
    private java.awt.TextField CostoCampo;
    private javax.swing.JLabel Detalles;
    private java.awt.TextField DetallesCampo;
    private javax.swing.JLabel FechaFin;
    private java.awt.TextField FechaFinCampo;
    private javax.swing.JLabel FechaInicio;
    private java.awt.TextField FechaInicioCampo;
    private javax.swing.JLabel GuardarBoton;
    private javax.swing.JPanel GuardarPanel;
    private javax.swing.JLabel Horario;
    private java.awt.TextField HorarioCampo;
    private javax.swing.JLabel Instructor;
    public javax.swing.JComboBox<String> InstructorComboBox;
    private javax.swing.JLabel MaximoInscritos;
    private java.awt.TextField MaximoInscritosCampo;
    private javax.swing.JLabel Nombre;
    private java.awt.TextField NombreCampo;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
