/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import java.awt.Color;
import javax.swing.JTable;
import ControladorBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

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
        actualizarTablaProgramas();
        iniciarActualizacionAutomatica();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        EliminarPanel = new javax.swing.JPanel();
        EliminarBoton = new javax.swing.JLabel();
        EditarPanel = new javax.swing.JPanel();
        EditarBoton = new javax.swing.JLabel();
        AgregarPanel = new javax.swing.JPanel();
        AgregarBoton = new javax.swing.JLabel();
        programatxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProgramas = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(209, 209, 209));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EliminarPanel.setBackground(new java.awt.Color(80, 200, 120));

        EliminarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EliminarBoton.setForeground(new java.awt.Color(255, 255, 255));
        EliminarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EliminarBoton.setText("ELIMINAR");
        EliminarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarBotonMouseClicked(evt);
            }
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
                .addComponent(EliminarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        EliminarPanelLayout.setVerticalGroup(
            EliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EliminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(EliminarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 160, -1));

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
                .addComponent(EditarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        EditarPanelLayout.setVerticalGroup(
            EditarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(EditarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, 160, -1));

        AgregarPanel.setBackground(new java.awt.Color(80, 200, 120));

        AgregarBoton.setBackground(new java.awt.Color(255, 255, 255));
        AgregarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarBoton.setForeground(new java.awt.Color(255, 255, 255));
        AgregarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgregarBoton.setText("AGREGAR");
        AgregarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarBotonMouseClicked(evt);
            }
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
                .addComponent(AgregarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        AgregarPanelLayout.setVerticalGroup(
            AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(AgregarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, 160, -1));

        programatxt.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        programatxt.setForeground(new java.awt.Color(55, 67, 66));
        programatxt.setText("Programas");
        add(programatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 46, -1, 65));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 123, 807, 442));
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

    private void AgregarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBotonMouseClicked
        AñadirPrograma ap= new AñadirPrograma();
        ap.setVisible(true);
        ap.cargarInstructoresEnComboBox();
    }//GEN-LAST:event_AgregarBotonMouseClicked

    private void EliminarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarBotonMouseClicked
        AlertaEliminar ventanaEmergente = new AlertaEliminar();
        ventanaEmergente.setVisible(true);
        ventanaEmergente.setlistaEliminar(getSelectedIds(TablaProgramas),"Programa");
    }//GEN-LAST:event_EliminarBotonMouseClicked

    public List<Integer> getSelectedIds(JTable table) {
        List<Integer> selectedIds = new ArrayList<>();
        for (int i = 0; i < table.getRowCount(); i++) {
            Boolean isChecked = (Boolean) table.getValueAt(i, 5); // Columna de checkbox
            if (Boolean.TRUE.equals(isChecked)) {
                Integer id = (Integer) table.getValueAt(i, 0); // Columna de ID
                selectedIds.add(id);
            }
        }
        return selectedIds;
    }
    
    private void EditarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarBotonMouseClicked
    List<Integer> selectedIds = getSelectedIds(TablaProgramas);

    if (selectedIds.isEmpty()) { 
        JOptionPane.showMessageDialog(null, "⚠️ No has seleccionado ningún registro.", "Error", JOptionPane.WARNING_MESSAGE);
    } else if (selectedIds.size() > 1) { 
        JOptionPane.showMessageDialog(null, "⚠️ Solo puedes editar un registro a la vez.", "Error", JOptionPane.WARNING_MESSAGE);
    } else { 
        int ID_Programa = selectedIds.get(0); 
        EditarPrograma ventanaEmergente = new EditarPrograma(ID_Programa);
        ventanaEmergente.setVisible(true);
    }
    }//GEN-LAST:event_EditarBotonMouseClicked

        private void iniciarActualizacionAutomatica() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                actualizarTablaProgramas();
            }
        }, 0, 3000);
    }
    public void actualizarTablaProgramas() {
    System.out.println("🔄 Actualizando tabla de programas...");

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    if (conn == null) {
        System.out.println("❌ Error: No se pudo establecer conexión con la BD.");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) TablaProgramas.getModel();
    model.setRowCount(0); // Limpiar la tabla antes de llenarla
    System.out.println("🗑️ Tabla vaciada.");

    String sql = "SELECT ID_Programa, Nombre, Fecha_Fin, Horario FROM programa";

    // Lista para almacenar los datos antes de llenar la tabla
    List<Object[]> datosProgramas = new ArrayList<>();

    try (PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        System.out.println("📊 Consulta ejecutada.");

        int contador = 0;
        while (rs.next()) {
            int idPrograma = rs.getInt("ID_Programa");
            String nombrePrograma = rs.getString("Nombre");
            String fechaFin = rs.getString("Fecha_Fin");
            String horario = rs.getString("Horario");

            // Comprobar el estado de acuerdo a la fecha de fin
            String estado = determinarEstado(fechaFin);

            // No. Inscritos y "null" lo dejamos como vacíos
            Object[] fila = { idPrograma, nombrePrograma, estado, null, horario, null };
            datosProgramas.add(fila);
            contador++;
        }

        System.out.println("✅ Total de registros obtenidos: " + contador);

    } catch (SQLException e) {
        System.out.println("❌ Error al ejecutar la consulta.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar();
        System.out.println("🔌 Desconectado de la BD.");
    }

    // Ahora llenamos la tabla usando los datos obtenidos
    for (Object[] programa : datosProgramas) {
        model.addRow(programa);
    }
}

private String determinarEstado(String fechaFin) {
    String estado = "INACTIVO";
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date fechaFinDate = null;
    Date fechaActual = new Date(); // Fecha actual del sistema

    try {
        fechaFinDate = dateFormat.parse(fechaFin);
        // Si la fecha de fin es superior a la fecha actual, está activo
        if (fechaFinDate.after(fechaActual)) {
            estado = "ACTIVO";
        }
    } catch (ParseException e) {
        System.out.println("❌ Error al parsear la fecha.");
        e.printStackTrace();
    }

    return estado;
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgregarBoton;
    private javax.swing.JPanel AgregarPanel;
    private javax.swing.JLabel EditarBoton;
    private javax.swing.JPanel EditarPanel;
    private javax.swing.JLabel EliminarBoton;
    private javax.swing.JPanel EliminarPanel;
    private javax.swing.JTable TablaProgramas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel programatxt;
    // End of variables declaration//GEN-END:variables
}
