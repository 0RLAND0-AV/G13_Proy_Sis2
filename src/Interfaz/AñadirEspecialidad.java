/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import ControladorBD.QuerysEspecialidad;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Frank
 */
public class AñadirEspecialidad extends javax.swing.JFrame {

    /**
     * Creates new form A
     */
    public AñadirEspecialidad() {
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
        NivelEspecialidad = new javax.swing.JLabel();
        Detalles = new javax.swing.JLabel();
        nivelEspecialidadComboBox = new javax.swing.JComboBox<>();
        CancelarPanel = new javax.swing.JPanel();
        CancelarBoton = new javax.swing.JLabel();
        GuardarPanel = new javax.swing.JPanel();
        GuardarBoton = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        NombreCampo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DetallesCampo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(209, 209, 209));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(1050, 650));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Titulo.setText("Añadir Especialidad");
        PanelPrincipal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 530, 60));

        NivelEspecialidad.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NivelEspecialidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NivelEspecialidad.setText("Nivel de especializacion:");
        PanelPrincipal.add(NivelEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 290, 50));

        Detalles.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Detalles.setText("Detalles:");
        PanelPrincipal.add(Detalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 100, 50));

        nivelEspecialidadComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nivelEspecialidadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principiante", "Intermedio", "Avanzado" }));
        nivelEspecialidadComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelEspecialidadComboBoxActionPerformed(evt);
            }
        });
        PanelPrincipal.add(nivelEspecialidadComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 210, 30));

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

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("Nombre:");
        PanelPrincipal.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 290, 50));

        NombreCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NombreCampo.setToolTipText("Ingrese el nombre de la Especialidad");
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
        PanelPrincipal.add(NombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 210, 30));

        DetallesCampo.setColumns(20);
        DetallesCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DetallesCampo.setRows(5);
        jScrollPane1.setViewportView(DetallesCampo);

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 550, 120));

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

    private void nivelEspecialidadComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelEspecialidadComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelEspecialidadComboBoxActionPerformed

    private void CancelarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarBotonMouseClicked
        dispose();
    }//GEN-LAST:event_CancelarBotonMouseClicked

    private void CancelarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarBotonMouseEntered
         CancelarPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_CancelarBotonMouseEntered

    private void CancelarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarBotonMouseExited
         CancelarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_CancelarBotonMouseExited

    private void GuardarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBotonMouseEntered
         GuardarPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_GuardarBotonMouseEntered

    private void GuardarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBotonMouseExited
         GuardarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_GuardarBotonMouseExited

    private void NombreCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCampoActionPerformed

    private void NombreCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.SoloTexto(NombreCampo, "Jose, Maria, etc.");
    }//GEN-LAST:event_NombreCampoKeyTyped

    private void GuardarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBotonMouseClicked
        if (NombreCampo.getText().equals("") || DetallesCampo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pot favor rellene todos los campos");
        }else if(NombreCampo.getForeground().equals(Color.RED) || DetallesCampo.getForeground().equals(Color.RED)){
                 JOptionPane.showMessageDialog(null, "Por favor verifique los campos de color rojo");
        }else {
            QuerysEspecialidad qe = new QuerysEspecialidad();
            String seleccionado = (String) nivelEspecialidadComboBox.getSelectedItem();
            qe.insertarEspecialidad(NombreCampo.getText(), DetallesCampo.getText(), seleccionado);
            dispose();  
        }
        
    }//GEN-LAST:event_GuardarBotonMouseClicked

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
            java.util.logging.Logger.getLogger(AñadirEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirEspecialidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CancelarBoton;
    private javax.swing.JPanel CancelarPanel;
    private javax.swing.JLabel Detalles;
    private javax.swing.JTextArea DetallesCampo;
    private javax.swing.JLabel GuardarBoton;
    private javax.swing.JPanel GuardarPanel;
    private javax.swing.JLabel NivelEspecialidad;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField NombreCampo;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nivelEspecialidadComboBox;
    // End of variables declaration//GEN-END:variables
}
