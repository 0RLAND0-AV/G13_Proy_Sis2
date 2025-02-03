/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author jhona
 */
public class QuerysEspecialidad {
    public void insertarEspecialidad(String nombre, String descripcion, String nivel) {
    String sqlEspecialidad = "INSERT INTO especialidad (nombre, descripcion, nivel) " +
                        "VALUES (?, ?, ?)";
    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmtEspecialidad = conn.prepareStatement(sqlEspecialidad, PreparedStatement.RETURN_GENERATED_KEYS);) {

        // Setear parámetros para la tabla persona
        stmtEspecialidad.setString(1, nombre);
        stmtEspecialidad.setString(2, descripcion);
        stmtEspecialidad.setString(3, nivel);

        int filasAfectadas = stmtEspecialidad.executeUpdate();
        if (filasAfectadas > 0) {
                mostrarNotificacion("✅ Especialidad registrada con éxito", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        mostrarNotificacion("❌ Error al registrar la especialidad", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } finally {
        conexionBD.desconectar();
    }
}
    
    private void mostrarNotificacion(String mensaje, String titulo, int tipo) {
    JDialog dialog = new JDialog();
    dialog.setAlwaysOnTop(true);
    JOptionPane optionPane = new JOptionPane(mensaje, tipo);
    dialog.setContentPane(optionPane);
    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    dialog.pack();
    
    dialog.setLocationRelativeTo(null); // Centrar ventana
    
    new Timer().schedule(new TimerTask() {
        @Override
        public void run() {
            dialog.dispose();
        }
    }, 2000);  // Cierra la notificación después de 2 segundos

    dialog.setVisible(true);
}
}
