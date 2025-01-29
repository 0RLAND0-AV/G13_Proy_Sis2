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

public class QuerysInstructores {
public void insertarInstructor(String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String ci,
                               String fechaNacimiento, String direccion, String correoElectronico) {
    // Consulta para insertar en la tabla persona
    String sqlPersona = "INSERT INTO persona (nombre, apellido_paterno, apellido_materno, telefono, ci, fecha_nacimiento, direccion, correo_electronico) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    // Consulta para insertar en la tabla instructores, con ID_Especialidad como NULL
    String sqlInstructor = "INSERT INTO instructor (ID_Persona, ID_Especialidad, Usuario, Contraseña) " +
                           "VALUES (?, NULL, NULL, NULL)"; // Dejamos ID_Especialidad como NULL

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmtPersona = conn.prepareStatement(sqlPersona, PreparedStatement.RETURN_GENERATED_KEYS);
         PreparedStatement stmtInstructor = conn.prepareStatement(sqlInstructor)) {

        // Insertar datos en la tabla persona
        stmtPersona.setString(1, nombre);
        stmtPersona.setString(2, apellidoPaterno);
        stmtPersona.setString(3, apellidoMaterno);
        stmtPersona.setString(4, telefono);
        stmtPersona.setString(5, ci);
        stmtPersona.setString(6, fechaNacimiento); // Formato: YYYY-MM-DD
        stmtPersona.setString(7, direccion);
        stmtPersona.setString(8, correoElectronico);

        int filasAfectadas = stmtPersona.executeUpdate();
        if (filasAfectadas > 0) {
            // Obtener el ID_Persona generado automáticamente
            ResultSet generatedKeys = stmtPersona.getGeneratedKeys();
            if (generatedKeys.next()) {
                int idPersona = generatedKeys.getInt(1);
                System.out.println("✅ Persona agregada con ID_Persona: " + idPersona);

                // Insertar en la tabla instructores con el ID_Persona obtenido y NULL para las demás columnas
                stmtInstructor.setInt(1, idPersona); // Solo pasamos ID_Persona
                stmtInstructor.executeUpdate();
                System.out.println("✅ Instructor agregado con ID_Persona: " + idPersona);
            }
        }
    } catch (SQLException e) {
        System.out.println("❌ Error al insertar el instructor.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar(); // Cerrar conexión
    }
}
public void actualizarInstructor(int idInstructor, String nombre, String apellidoPaterno, String apellidoMaterno,
                                 String telefono, String ci, String fechaNacimiento, String direccion,
                                 String correoElectronico) {
    // Consulta para obtener el ID_Persona relacionado con el ID_Instructor
    String sqlInstructor = "SELECT ID_Persona FROM instructor WHERE ID_Instructor = ?";

    // Consulta para actualizar los datos en la tabla persona
    String sqlPersona = "UPDATE persona SET nombre = ?, apellido_paterno = ?, apellido_materno = ?, telefono = ?, " +
                        "ci = ?, fecha_nacimiento = ?, direccion = ?, correo_electronico = ? WHERE ID_Persona = ?";

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmtInstructorSelect = conn.prepareStatement(sqlInstructor);
         PreparedStatement stmtPersona = conn.prepareStatement(sqlPersona)) {

        // Obtener el ID_Persona asociado al ID_Instructor
        stmtInstructorSelect.setInt(1, idInstructor);
        ResultSet rs = stmtInstructorSelect.executeQuery();
        int idPersona = -1;
        if (rs.next()) {
            idPersona = rs.getInt("ID_Persona");
        }

        if (idPersona != -1) {
            // Actualizar datos en la tabla persona
            stmtPersona.setString(1, nombre);
            stmtPersona.setString(2, apellidoPaterno);
            stmtPersona.setString(3, apellidoMaterno);
            stmtPersona.setString(4, telefono);
            stmtPersona.setString(5, ci);
            stmtPersona.setString(6, fechaNacimiento);  // Formato: YYYY-MM-DD
            stmtPersona.setString(7, direccion);
            stmtPersona.setString(8, correoElectronico);
            stmtPersona.setInt(9, idPersona);
            stmtPersona.executeUpdate();
            System.out.println("✅ Datos de la persona actualizados correctamente.");
        } else {
            System.out.println("❌ No se encontró el instructor con ID_Instructor: " + idInstructor);
        }

    } catch (SQLException e) {
        System.out.println("❌ Error al actualizar el instructor.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar(); // Cerrar conexión
    }
}
public void eliminarInstructor(int idInstructor) {
    // Consulta para obtener el ID_Persona relacionado con el ID_Instructor
    String sqlInstructor = "SELECT ID_Persona FROM instructor WHERE ID_Instructor = ?";

    // Consulta para eliminar en la tabla instructores
    String sqlDeleteInstructor = "DELETE FROM instructor WHERE ID_Instructor = ?";

    // Consulta para eliminar en la tabla persona
    String sqlDeletePersona = "DELETE FROM persona WHERE ID_Persona = ?";

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmtInstructorSelect = conn.prepareStatement(sqlInstructor);
         PreparedStatement stmtDeleteInstructor = conn.prepareStatement(sqlDeleteInstructor);
         PreparedStatement stmtDeletePersona = conn.prepareStatement(sqlDeletePersona)) {

        // Obtener el ID_Persona asociado al ID_Instructor
        stmtInstructorSelect.setInt(1, idInstructor);
        ResultSet rs = stmtInstructorSelect.executeQuery();
        int idPersona = -1;
        if (rs.next()) {
            idPersona = rs.getInt("ID_Persona");
        }

        if (idPersona != -1) {
            // Eliminar de la tabla instructores
            stmtDeleteInstructor.setInt(1, idInstructor);
            int filasAfectadasInstructor = stmtDeleteInstructor.executeUpdate();
            if (filasAfectadasInstructor > 0) {
                System.out.println("✅ Instructor con ID_Instructor " + idInstructor + " eliminado correctamente.");
            }

            // Eliminar de la tabla persona
            stmtDeletePersona.setInt(1, idPersona);
            int filasAfectadasPersona = stmtDeletePersona.executeUpdate();
            if (filasAfectadasPersona > 0) {
                System.out.println("✅ Persona con ID_Persona " + idPersona + " eliminada correctamente.");
            }
        } else {
            System.out.println("❌ No se encontró el instructor con ID_Instructor: " + idInstructor);
        }

    } catch (SQLException e) {
        System.out.println("❌ Error al eliminar el instructor.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar(); // Cerrar conexión
    }
}
public static void main(String[] args) {
    QuerysInstructores dao = new QuerysInstructores();

    // Insertar un instructor sin especialidad (ID_Especialidad será NULL)
    /*dao.insertarInstructor("Juan", "Pérez", "González", "123456789", "98765432", "1985-05-15", 
                           "Calle Ficticia 123", "juan.perez@mail.com");*/

    // Actualizar un instructor con ID_Instructor 1 (asegúrate de que el instructor con este ID exista)
    /*dao.actualizarInstructor(5, "Juan", "Pérez", "González", "987654321", "98765432", "1985-05-15", 
                             "Calle Real 456", "juan.perez.updated@mail.com");*/

    // Eliminar un instructor con ID_Instructor 1 (asegúrate de que el instructor con este ID exista)
    dao.eliminarInstructor(5);
}



}
