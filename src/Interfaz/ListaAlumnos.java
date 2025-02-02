/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.awt.Color;

/**
 *
 * @author Frank
 */
public class ListaAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form A
     */
    public ListaAlumnos() {
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
        NombreCampo = new java.awt.TextField();
        Nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProgramas = new javax.swing.JTable();
        SalirPanel = new javax.swing.JPanel();
        SalirBoton = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(209, 209, 209));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(1050, 650));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo.setText("Programa");
        PanelPrincipal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 400, 30));

        NombreCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NombreCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NombreCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCampoActionPerformed(evt);
            }
        });
        PanelPrincipal.add(NombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 310, 40));

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("o");
        PanelPrincipal.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 30, 50));

        TablaProgramas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido paterno", "Apellido materno", "Nota Examen", "Nota Practica", "Promedio"
            }
        ));
        jScrollPane1.setViewportView(TablaProgramas);

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 1000, 450));

        SalirPanel.setBackground(new java.awt.Color(80, 200, 120));

        SalirBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SalirBoton.setForeground(new java.awt.Color(255, 255, 255));
        SalirBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalirBoton.setText("SALIR");
        SalirBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SalirPanelLayout = new javax.swing.GroupLayout(SalirPanel);
        SalirPanel.setLayout(SalirPanelLayout);
        SalirPanelLayout.setHorizontalGroup(
            SalirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SalirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SalirPanelLayout.setVerticalGroup(
            SalirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SalirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrincipal.add(SalirPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 150, 50));

        Titulo1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Titulo1.setText("Lista de Alumnos:");
        PanelPrincipal.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 410, 60));

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

    private void NombreCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCampoActionPerformed

    private void SalirBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBotonMouseClicked
        dispose();
    }//GEN-LAST:event_SalirBotonMouseClicked

    private void SalirBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBotonMouseEntered
        SalirPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_SalirBotonMouseEntered

    private void SalirBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBotonMouseExited
        SalirPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_SalirBotonMouseExited

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
            java.util.logging.Logger.getLogger(ListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private java.awt.TextField NombreCampo;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel SalirBoton;
    private javax.swing.JPanel SalirPanel;
    private javax.swing.JTable TablaProgramas;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
