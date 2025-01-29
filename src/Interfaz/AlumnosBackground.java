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
public class AlumnosBackground extends javax.swing.JPanel {

    /**
     * Creates new form ProgramasBackground
     */
    public AlumnosBackground() {
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
        ElimnarBoton = new javax.swing.JLabel();
        EditarPanel = new javax.swing.JPanel();
        EditarBoton = new javax.swing.JLabel();
        AgregarPanel = new javax.swing.JPanel();
        AgreagarBoton = new javax.swing.JLabel();
        Alumnostxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAlumnos = new javax.swing.JTable();
        BuscadorAlumnos = new javax.swing.JTextField();
        Busqueda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(209, 209, 209));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EliminarPanel.setBackground(new java.awt.Color(80, 200, 120));

        ElimnarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ElimnarBoton.setForeground(new java.awt.Color(255, 255, 255));
        ElimnarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ElimnarBoton.setText("ELIMINAR");
        ElimnarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElimnarBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ElimnarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ElimnarBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EliminarPanelLayout = new javax.swing.GroupLayout(EliminarPanel);
        EliminarPanel.setLayout(EliminarPanelLayout);
        EliminarPanelLayout.setHorizontalGroup(
            EliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ElimnarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EliminarPanelLayout.setVerticalGroup(
            EliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ElimnarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(EliminarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 615, -1, -1));

        EditarPanel.setBackground(new java.awt.Color(80, 200, 120));

        EditarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EditarBoton.setForeground(new java.awt.Color(255, 255, 255));
        EditarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditarBoton.setText("EDITAR");
        EditarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarBotonMouseClicked(evt);
            }
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

        add(EditarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 615, -1, -1));

        AgregarPanel.setBackground(new java.awt.Color(80, 200, 120));

        AgreagarBoton.setBackground(new java.awt.Color(255, 255, 255));
        AgreagarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgreagarBoton.setForeground(new java.awt.Color(255, 255, 255));
        AgreagarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgreagarBoton.setText("AGREGAR");
        AgreagarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgreagarBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgreagarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgreagarBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AgregarPanelLayout = new javax.swing.GroupLayout(AgregarPanel);
        AgregarPanel.setLayout(AgregarPanelLayout);
        AgregarPanelLayout.setHorizontalGroup(
            AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgreagarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        AgregarPanelLayout.setVerticalGroup(
            AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgreagarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(AgregarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 615, -1, -1));

        Alumnostxt.setBackground(new java.awt.Color(55, 67, 66));
        Alumnostxt.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Alumnostxt.setForeground(new java.awt.Color(55, 67, 66));
        Alumnostxt.setText("Alumnos");
        add(Alumnostxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 46, -1, 65));

        TablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Nombre", "Programa", "Correo", "Horario", "Seleccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaAlumnos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 780, 442));

        BuscadorAlumnos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add(BuscadorAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 46, 250, 50));

        Busqueda.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Busqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Busqueda.setText("o");
        add(Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 51, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void AgreagarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgreagarBotonMouseClicked
        AñadirAlumno ventanaEmergente = new AñadirAlumno();
        ventanaEmergente.setVisible(true);
    }//GEN-LAST:event_AgreagarBotonMouseClicked

    private void EditarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarBotonMouseClicked
        EditarAlumno ventanaEmergente = new EditarAlumno();
        ventanaEmergente.setVisible(true);
    }//GEN-LAST:event_EditarBotonMouseClicked

    private void ElimnarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElimnarBotonMouseClicked
        AlertaEliminar ventanaEmergente = new AlertaEliminar();
        ventanaEmergente.setVisible(true);
    }//GEN-LAST:event_ElimnarBotonMouseClicked

    private void ElimnarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElimnarBotonMouseEntered
         EliminarPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_ElimnarBotonMouseEntered

    private void ElimnarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElimnarBotonMouseExited
        EliminarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_ElimnarBotonMouseExited

    private void EditarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarBotonMouseEntered
         EditarPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_EditarBotonMouseEntered

    private void EditarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarBotonMouseExited
        EditarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_EditarBotonMouseExited

    private void AgreagarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgreagarBotonMouseEntered
         AgregarPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_AgreagarBotonMouseEntered

    private void AgreagarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgreagarBotonMouseExited
        AgregarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_AgreagarBotonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgreagarBoton;
    private javax.swing.JPanel AgregarPanel;
    private javax.swing.JLabel Alumnostxt;
    private javax.swing.JTextField BuscadorAlumnos;
    private javax.swing.JLabel Busqueda;
    private javax.swing.JLabel EditarBoton;
    private javax.swing.JPanel EditarPanel;
    private javax.swing.JPanel EliminarPanel;
    private javax.swing.JLabel ElimnarBoton;
    private javax.swing.JTable TablaAlumnos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
