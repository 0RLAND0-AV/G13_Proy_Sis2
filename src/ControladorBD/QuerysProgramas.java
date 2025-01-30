/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorBD;

/**
 *
 * @author M.S.I
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class QuerysProgramas {

public void insertarPrograma(String nombrePrograma, String fechaInicio, String fechaFin,
                             int costo, String horario, String descripcion, int maxInscritos, int ID_Instructor) {
    String sqlPrograma = "INSERT INTO programa (nombre, fecha_inicio, fecha_fin, costo, horario, descripcion, Max_inscritos) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?)";

    String sqlActualizarInstructor = "UPDATE instructor SET ID_Programa = ? WHERE ID_Instructor = ?";

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmtPrograma = conn.prepareStatement(sqlPrograma, PreparedStatement.RETURN_GENERATED_KEYS);
         PreparedStatement stmtActualizarInstructor = conn.prepareStatement(sqlActualizarInstructor)) {

        // Insertar datos en la tabla programa
        stmtPrograma.setString(1, nombrePrograma);
        stmtPrograma.setString(2, fechaInicio);
        stmtPrograma.setString(3, fechaFin);
        stmtPrograma.setInt(4, costo);
        stmtPrograma.setString(5, horario);
        stmtPrograma.setString(6, descripcion);
        stmtPrograma.setInt(7, maxInscritos);

        int filasAfectadas = stmtPrograma.executeUpdate();
        if (filasAfectadas > 0) {
            // Obtener el ID_Programa generado automáticamente
            ResultSet generatedKeys = stmtPrograma.getGeneratedKeys();
            if (generatedKeys.next()) {
                int idGenerado = generatedKeys.getInt(1);
                System.out.println("✅ Programa agregado con ID_Programa: " + idGenerado);

                // Actualizar la tabla instructor con el ID_Programa recién generado
                stmtActualizarInstructor.setInt(1, idGenerado);
                stmtActualizarInstructor.setInt(2, ID_Instructor);
                int filasInstructor = stmtActualizarInstructor.executeUpdate();

                if (filasInstructor > 0) {
                    mostrarNotificacion("✅ Programa y Instructor registrados con éxito", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("✅ Instructor con ID " + ID_Instructor + " actualizado con ID_Programa " + idGenerado);
                } else {
                    mostrarNotificacion("❌ No se encontró el instructor con ID " + ID_Instructor, "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("❌ No se encontró el instructor con ID " + ID_Instructor);
                }
            }
        }
    } catch (SQLException e) {
        mostrarNotificacion("❌ Error al insertar el programa", "Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("❌ Error al insertar el programa.");
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


public void actualizarPrograma(int ID_Programa, String nombrePrograma, String fechaInicio, String fechaFin,
                               int costo, String horario, String descripcion, int maxInscritos, int ID_Instructor) {
    String sqlPrograma = "UPDATE programa SET nombre = ?, fecha_inicio = ?, fecha_fin = ?, costo = ?, horario = ?, " +
                         "descripcion = ?, max_inscritos = ? WHERE ID_Programa = ?";

    String sqlActualizarInstructor = "UPDATE instructor SET ID_Programa = ? WHERE ID_Instructor = ?";

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmtPrograma = conn.prepareStatement(sqlPrograma);
         PreparedStatement stmtActualizarInstructor = conn.prepareStatement(sqlActualizarInstructor)) {

        // Actualizar datos en la tabla programa
        stmtPrograma.setString(1, nombrePrograma);
        stmtPrograma.setString(2, fechaInicio);
        stmtPrograma.setString(3, fechaFin);
        stmtPrograma.setInt(4, costo);
        stmtPrograma.setString(5, horario);
        stmtPrograma.setString(6, descripcion);
        stmtPrograma.setInt(7, maxInscritos);
        stmtPrograma.setInt(8, ID_Programa);

        int filasAfectadas = stmtPrograma.executeUpdate();
        if (filasAfectadas > 0) {
            System.out.println("✅ Programa con ID " + ID_Programa + " actualizado correctamente.");

            // Actualizar la tabla instructor con el ID_Programa actualizado
            stmtActualizarInstructor.setInt(1, ID_Programa);
            stmtActualizarInstructor.setInt(2, ID_Instructor);
            int filasInstructor = stmtActualizarInstructor.executeUpdate();

            if (filasInstructor > 0) {
                System.out.println("✅ Instructor con ID " + ID_Instructor + " actualizado con ID_Programa " + ID_Programa);
            } else {
                System.out.println("❌ No se encontró el instructor con ID " + ID_Instructor);
            }
        } else {
            System.out.println("❌ No se encontró el programa con ID " + ID_Programa);
        }
    } catch (SQLException e) {
        System.out.println("❌ Error al actualizar el programa.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar();
    }
}

public void eliminarPrograma(int ID_Programa) {
    String sql = "DELETE FROM programa WHERE ID_Programa = ?";

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, ID_Programa);

        int filasAfectadas = stmt.executeUpdate();
        if (filasAfectadas > 0) {
            System.out.println("✅ Programa con ID " + ID_Programa + " eliminado correctamente.");
        } else {
            System.out.println("❌ No se encontró el programa con ID " + ID_Programa);
        }
    } catch (SQLException e) {
        System.out.println("❌ Error al eliminar el programa.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar();
    }
}


    public static void main(String[] args) {
        // Crear una instancia de la clase donde se encuentran los métodos
        QuerysProgramas programaDAO = new QuerysProgramas();

        // Probar el método insertarPrograma
        System.out.println("Probando insertarPrograma...");
        programaDAO.insertarPrograma("Programa de Ejemplo", "2025-02-01", "2025-03-01", 1000, "10:12:00", 
                                      "Este es un programa de prueba", 30, 6);

        // Probar el método actualizarPrograma
        /*System.out.println("\nProbando actualizarPrograma...");
        programaDAO.actualizarPrograma(1, "Programa de Ejemplo Actualizado", "2025-02-01", "2025-04-01", 1200, 
                                       "Lunes a Viernes 09:00-11:00", "Este es un programa actualizado", 35, 1);

        // Probar el método eliminarPrograma
        System.out.println("\nProbando eliminarPrograma...");
        programaDAO.eliminarPrograma(1);*/
    }
}

