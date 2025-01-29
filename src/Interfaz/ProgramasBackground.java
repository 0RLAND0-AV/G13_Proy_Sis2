/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import java.awt.Color;

/**
 *
 * @author jhona
 */
public class ProgramasBackground extends javax.swing.JPanel {

    /**
     * Creates new form ProgramasBackground
     */
    public ProgramasBackground() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EliminarPanel = new javax.swing.JPanel();
        EliminarBoton = new javax.swing.JLabel();
        EditarPanel = new javax.swing.JPanel();
        EditarBoton = new javax.swing.JLabel();
        AgregarPanel = new javax.swing.JPanel();
        AgregarBoton = new javax.swing.JLabel();
        programatxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProgramas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        EliminarBckgColor1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        EditarBckgColor1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        AgregarBckgColor1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        programatxt1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProgramas1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(209, 209, 209));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 720));

        EliminarPanel.setBackground(new java.awt.Color(80, 200, 120));

        EliminarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EliminarBoton.setForeground(new java.awt.Color(255, 255, 255));
        EliminarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EliminarBoton.setText("ELIMINAR");
        EliminarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EliminarPanelLayout = new javax.swing.GroupLayout(EliminarPanel);
        EliminarPanel.setLayout(EliminarPanelLayout);
        EliminarPanelLayout.setHorizontalGroup(
            EliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EliminarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        EliminarPanelLayout.setVerticalGroup(
            EliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EliminarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        EditarPanel.setBackground(new java.awt.Color(80, 200, 120));

        EditarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EditarBoton.setForeground(new java.awt.Color(255, 255, 255));
        EditarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditarBoton.setText("EDITAR");
        EditarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditarBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EditarPanelLayout = new javax.swing.GroupLayout(EditarPanel);
        EditarPanel.setLayout(EditarPanelLayout);
        EditarPanelLayout.setHorizontalGroup(
            EditarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        EditarPanelLayout.setVerticalGroup(
            EditarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        AgregarPanel.setBackground(new java.awt.Color(80, 200, 120));

        AgregarBoton.setBackground(new java.awt.Color(255, 255, 255));
        AgregarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarBoton.setForeground(new java.awt.Color(255, 255, 255));
        AgregarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgregarBoton.setText("AGREGAR");
        AgregarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AgregarPanelLayout = new javax.swing.GroupLayout(AgregarPanel);
        AgregarPanel.setLayout(AgregarPanelLayout);
        AgregarPanelLayout.setHorizontalGroup(
            AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgregarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        AgregarPanelLayout.setVerticalGroup(
            AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgregarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        programatxt.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        programatxt.setForeground(new java.awt.Color(55, 67, 66));
        programatxt.setText("Programas");

        TablaProgramas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Estado", "No. Inscritos", "Horario", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaProgramas);

        jPanel1.setBackground(new java.awt.Color(209, 209, 209));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 720));

        EliminarBckgColor1.setBackground(new java.awt.Color(80, 200, 120));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ELIMINAR");

        javax.swing.GroupLayout EliminarBckgColor1Layout = new javax.swing.GroupLayout(EliminarBckgColor1);
        EliminarBckgColor1.setLayout(EliminarBckgColor1Layout);
        EliminarBckgColor1Layout.setHorizontalGroup(
            EliminarBckgColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarBckgColor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        EliminarBckgColor1Layout.setVerticalGroup(
            EliminarBckgColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarBckgColor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        EditarBckgColor1.setBackground(new java.awt.Color(80, 200, 120));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EDITAR");

        javax.swing.GroupLayout EditarBckgColor1Layout = new javax.swing.GroupLayout(EditarBckgColor1);
        EditarBckgColor1.setLayout(EditarBckgColor1Layout);
        EditarBckgColor1Layout.setHorizontalGroup(
            EditarBckgColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarBckgColor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        EditarBckgColor1Layout.setVerticalGroup(
            EditarBckgColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarBckgColor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        AgregarBckgColor1.setBackground(new java.awt.Color(80, 200, 120));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AGREGAR");

        javax.swing.GroupLayout AgregarBckgColor1Layout = new javax.swing.GroupLayout(AgregarBckgColor1);
        AgregarBckgColor1.setLayout(AgregarBckgColor1Layout);
        AgregarBckgColor1Layout.setHorizontalGroup(
            AgregarBckgColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarBckgColor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        AgregarBckgColor1Layout.setVerticalGroup(
            AgregarBckgColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarBckgColor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        programatxt1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        programatxt1.setForeground(new java.awt.Color(55, 67, 66));
        programatxt1.setText("Programas");

        TablaProgramas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Estado", "No. Inscritos", "Horario", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaProgramas1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(programatxt1)
                                .addGap(0, 626, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EliminarBckgColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(EditarBckgColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(AgregarBckgColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(programatxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditarBckgColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarBckgColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarBckgColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(programatxt)
                                .addGap(0, 626, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EliminarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(EditarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(AgregarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(programatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarBotonMouseEntered
        // TODO add your handling code here:
        EliminarPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_EliminarBotonMouseEntered

    private void EliminarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarBotonMouseExited
        // TODO add your handling code here:
        EliminarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_EliminarBotonMouseExited

    private void EditarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarBotonMouseEntered
        // TODO add your handling code here:
        EditarPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_EditarBotonMouseEntered

    private void EditarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarBotonMouseExited
        // TODO add your handling code here:
        EditarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_EditarBotonMouseExited

    private void AgregarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBotonMouseEntered
        // TODO add your handling code here:
        AgregarPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_AgregarBotonMouseEntered

    private void AgregarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBotonMouseExited
        // TODO add your handling code here:
        AgregarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_AgregarBotonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarBckgColor1;
    private javax.swing.JLabel AgregarBoton;
    private javax.swing.JPanel AgregarPanel;
    private javax.swing.JPanel EditarBckgColor1;
    private javax.swing.JLabel EditarBoton;
    private javax.swing.JPanel EditarPanel;
    private javax.swing.JPanel EliminarBckgColor1;
    private javax.swing.JLabel EliminarBoton;
    private javax.swing.JPanel EliminarPanel;
    private javax.swing.JTable TablaProgramas;
    private javax.swing.JTable TablaProgramas1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel programatxt;
    private javax.swing.JLabel programatxt1;
    // End of variables declaration//GEN-END:variables
}
