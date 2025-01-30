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
public class QuerysAlumnos {
    
public void insertarAlumno(String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String ci,
                           String fechaNacimiento, String direccion, String correoElectronico, int idPrograma) {
    String sqlPersona = "INSERT INTO persona (nombre, apellido_paterno, apellido_materno, telefono, ci, fecha_nacimiento, direccion, correo_electronico) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    String sqlAlumno = "INSERT INTO alumno (ID_Persona, ID_Programa) VALUES (?, ?)";
    
    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmtPersona = conn.prepareStatement(sqlPersona, PreparedStatement.RETURN_GENERATED_KEYS);
         PreparedStatement stmtAlumno = conn.prepareStatement(sqlAlumno)) {
        
        stmtPersona.setString(1, nombre);
        stmtPersona.setString(2, apellidoPaterno);
        stmtPersona.setString(3, apellidoMaterno);
        stmtPersona.setString(4, telefono);
        stmtPersona.setString(5, ci);
        stmtPersona.setString(6, fechaNacimiento);
        stmtPersona.setString(7, direccion);
        stmtPersona.setString(8, correoElectronico);
        
        int filasAfectadas = stmtPersona.executeUpdate();
        if (filasAfectadas > 0) {
            ResultSet generatedKeys = stmtPersona.getGeneratedKeys();
            if (generatedKeys.next()) {
                int idPersona = generatedKeys.getInt(1);
                stmtAlumno.setInt(1, idPersona);
                stmtAlumno.setInt(2, idPrograma);
                stmtAlumno.executeUpdate();

                mostrarNotificacion("✅ Alumno registrado con éxito", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("✅ Alumno agregado con ID_Persona: " + idPersona);
            }
        }
    } catch (SQLException e) {
        mostrarNotificacion("❌ Error al registrar el alumno", "Error", JOptionPane.ERROR_MESSAGE);
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
    
    // Centrar la ventana en pantalla
    dialog.setLocationRelativeTo(null);
    
    // Usar un Timer para cerrar automáticamente después de 2 segundos
    new Timer().schedule(new TimerTask() {
        @Override
        public void run() {
            dialog.dispose();
        }
    }, 2000);  // 2000 ms = 2 segundos
    
    dialog.setVisible(true);
}


public void actualizarAlumno(int idAlumno, String nombre, String apellidoPaterno, String apellidoMaterno,
                             String telefono, String ci, String fechaNacimiento, String direccion,
                             String correoElectronico, int idPrograma) {
    String sqlAlumno = "SELECT ID_Persona FROM alumno WHERE ID_Alumno = ?";
    String sqlPersona = "UPDATE persona SET nombre = ?, apellido_paterno = ?, apellido_materno = ?, telefono = ?, " +
                        "ci = ?, fecha_nacimiento = ?, direccion = ?, correo_electronico = ? WHERE ID_Persona = ?";
    String sqlUpdateAlumno = "UPDATE alumno SET ID_Programa = ? WHERE ID_Alumno = ?";
    
    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();
    
    try (PreparedStatement stmtAlumnoSelect = conn.prepareStatement(sqlAlumno);
         PreparedStatement stmtPersona = conn.prepareStatement(sqlPersona);
         PreparedStatement stmtUpdateAlumno = conn.prepareStatement(sqlUpdateAlumno)) {
        stmtAlumnoSelect.setInt(1, idAlumno);
        ResultSet rs = stmtAlumnoSelect.executeQuery();
        int idPersona = -1;
        if (rs.next()) {
            idPersona = rs.getInt("ID_Persona");
        }
        if (idPersona != -1) {
            stmtPersona.setString(1, nombre);
            stmtPersona.setString(2, apellidoPaterno);
            stmtPersona.setString(3, apellidoMaterno);
            stmtPersona.setString(4, telefono);
            stmtPersona.setString(5, ci);
            stmtPersona.setString(6, fechaNacimiento);
            stmtPersona.setString(7, direccion);
            stmtPersona.setString(8, correoElectronico);
            stmtPersona.setInt(9, idPersona);
            stmtPersona.executeUpdate();
            
            stmtUpdateAlumno.setInt(1, idPrograma);
            stmtUpdateAlumno.setInt(2, idAlumno);
            stmtUpdateAlumno.executeUpdate();
            System.out.println("✅ Datos del alumno actualizados correctamente.");
        } else {
            System.out.println("❌ No se encontró el alumno con ID_Alumno: " + idAlumno);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        conexionBD.desconectar();
    }
}

public void eliminarAlumno(int idAlumno) {
    String sqlAlumno = "SELECT ID_Persona FROM alumno WHERE ID_Alumno = ?";
    String sqlDeleteAlumno = "DELETE FROM alumno WHERE ID_Alumno = ?";
    String sqlDeletePersona = "DELETE FROM persona WHERE ID_Persona = ?";
    
    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();
    
    try (PreparedStatement stmtAlumnoSelect = conn.prepareStatement(sqlAlumno);
         PreparedStatement stmtDeleteAlumno = conn.prepareStatement(sqlDeleteAlumno);
         PreparedStatement stmtDeletePersona = conn.prepareStatement(sqlDeletePersona)) {
        stmtAlumnoSelect.setInt(1, idAlumno);
        ResultSet rs = stmtAlumnoSelect.executeQuery();
        int idPersona = -1;
        if (rs.next()) {
            idPersona = rs.getInt("ID_Persona");
        }
        if (idPersona != -1) {
            stmtDeleteAlumno.setInt(1, idAlumno);
            int filasAfectadasAlumno = stmtDeleteAlumno.executeUpdate();
            if (filasAfectadasAlumno > 0) {
                stmtDeletePersona.setInt(1, idPersona);
                stmtDeletePersona.executeUpdate();
                System.out.println("✅ Alumno y persona eliminados correctamente.");
            }
        } else {
            System.out.println("❌ No se encontró el alumno con ID_Alumno: " + idAlumno);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        conexionBD.desconectar();
    }
}

    public static void main(String[] args) {
        // Crear instancia de la clase que maneja la BD
        QuerysAlumnos alumnoDAO = new QuerysAlumnos(); 

        // Prueba de inserción de un alumno
        /*System.out.println("\n🔹 Insertando un nuevo alumno...");
        alumnoDAO.insertarAlumno("Juan", "Pérez", "Gómez", "789456123", "12345678",
                "2000-05-10", "Calle Falsa 123", "juan@example.com", 2);*/

        // Prueba de actualización de un alumno
        System.out.println("\n🔹 Actualizando alumno con ID 1...");
        alumnoDAO.actualizarAlumno(5, "Juan Carlos", "Pérez", "Gómez", "789456123",
                "12345678", "2000-05-10", "Avenida Siempre Viva", "juan_carlos@example.com", 3);

        // Prueba de eliminación de un alumno
        /*System.out.println("\n🔹 Eliminando alumno con ID 1...");
        alumnoDAO.eliminarAlumno(5);*/
    }
}



