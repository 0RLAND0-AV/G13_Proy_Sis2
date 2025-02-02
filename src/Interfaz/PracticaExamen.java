/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import ControladorBD.QuerysAlumnos;
import ControladorBD.QuerysInstructores;
import ControladorBD.QuerysProgramas;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Frank
 */
public class PracticaExamen extends javax.swing.JFrame {

     
    /**
     * Creates new form AlertaEliminar
     */
    public PracticaExamen() {
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
        Mensaje = new javax.swing.JLabel();
        ParcticaPanel = new javax.swing.JPanel();
        PracticaBoton = new javax.swing.JLabel();
        ExamenPanel = new javax.swing.JPanel();
        ExamenBoton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(209, 209, 209));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mensaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensaje.setText("¿Estas seguro que quieres eliminar?");
        PanelPrincipal.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, -1));

        ParcticaPanel.setBackground(new java.awt.Color(80, 200, 120));

        PracticaBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PracticaBoton.setForeground(new java.awt.Color(255, 255, 255));
        PracticaBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PracticaBoton.setText("Practica");
        PracticaBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PracticaBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PracticaBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PracticaBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ParcticaPanelLayout = new javax.swing.GroupLayout(ParcticaPanel);
        ParcticaPanel.setLayout(ParcticaPanelLayout);
        ParcticaPanelLayout.setHorizontalGroup(
            ParcticaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParcticaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PracticaBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        ParcticaPanelLayout.setVerticalGroup(
            ParcticaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParcticaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PracticaBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelPrincipal.add(ParcticaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        ExamenPanel.setBackground(new java.awt.Color(80, 200, 120));

        ExamenBoton.setBackground(new java.awt.Color(255, 255, 255));
        ExamenBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExamenBoton.setForeground(new java.awt.Color(255, 255, 255));
        ExamenBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExamenBoton.setText("Examen");
        ExamenBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExamenBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExamenBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExamenBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExamenPanelLayout = new javax.swing.GroupLayout(ExamenPanel);
        ExamenPanel.setLayout(ExamenPanelLayout);
        ExamenPanelLayout.setHorizontalGroup(
            ExamenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExamenPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExamenBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ExamenPanelLayout.setVerticalGroup(
            ExamenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExamenPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExamenBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelPrincipal.add(ExamenPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PracticaBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PracticaBotonMouseClicked
        
    }//GEN-LAST:event_PracticaBotonMouseClicked

    private void ExamenBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamenBotonMouseClicked
        dispose();
    }//GEN-LAST:event_ExamenBotonMouseClicked

    private void PracticaBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PracticaBotonMouseEntered
        ParcticaPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_PracticaBotonMouseEntered

    private void PracticaBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PracticaBotonMouseExited
        ParcticaPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_PracticaBotonMouseExited

    private void ExamenBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamenBotonMouseEntered
        ExamenPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_ExamenBotonMouseEntered

    private void ExamenBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamenBotonMouseExited
        ExamenPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_ExamenBotonMouseExited

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
            java.util.logging.Logger.getLogger(PracticaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PracticaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PracticaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PracticaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PracticaExamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExamenBoton;
    private javax.swing.JPanel ExamenPanel;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel ParcticaPanel;
    private javax.swing.JLabel PracticaBoton;
    // End of variables declaration//GEN-END:variables
}
