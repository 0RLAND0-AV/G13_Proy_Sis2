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

public class QuerysAlumnos {
    public void insertarAlumno(String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String ci,
                           String fechaNacimiento, String direccion, String correoElectronico) {
    // Consulta para insertar en la tabla persona
    String sqlPersona = "INSERT INTO persona (nombre, apellido_paterno, apellido_materno, telefono, ci, fecha_nacimiento, direccion, correo_electronico) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    // Consulta para insertar en la tabla alumnos, solo con ID_Persona (sin necesidad de ID_Alumno)
    String sqlAlumno = "INSERT INTO alumno (ID_Persona) VALUES (?)";

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmtPersona = conn.prepareStatement(sqlPersona, PreparedStatement.RETURN_GENERATED_KEYS);
         PreparedStatement stmtAlumno = conn.prepareStatement(sqlAlumno)) {

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

                // Insertar en la tabla alumnos con el ID_Persona obtenido
                stmtAlumno.setInt(1, idPersona);
                stmtAlumno.executeUpdate();
                System.out.println("✅ Alumno agregado con ID_Persona: " + idPersona);
            }
        }
    } catch (SQLException e) {
        System.out.println("❌ Error al insertar el alumno.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar(); // Cerrar conexión
    }
}

public void actualizarAlumno(int idAlumno, String nombre, String apellidoPaterno, String apellidoMaterno,
                             String telefono, String ci, String fechaNacimiento, String direccion,
                             String correoElectronico) {
    // Consulta para obtener el ID_Persona relacionado con el ID_Alumno
    String sqlAlumno = "SELECT ID_Persona FROM alumno WHERE ID_Alumno = ?";

    // Consulta para actualizar los datos en la tabla persona
    String sqlPersona = "UPDATE persona SET nombre = ?, apellido_paterno = ?, apellido_materno = ?, telefono = ?, " +
                        "ci = ?, fecha_nacimiento = ?, direccion = ?, correo_electronico = ? WHERE ID_Persona = ?";

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmtAlumnoSelect = conn.prepareStatement(sqlAlumno);
         PreparedStatement stmtPersona = conn.prepareStatement(sqlPersona)) {

        // Obtener el ID_Persona asociado al ID_Alumno
        stmtAlumnoSelect.setInt(1, idAlumno);
        ResultSet rs = stmtAlumnoSelect.executeQuery();
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
            System.out.println("❌ No se encontró el alumno con ID_Alumno: " + idAlumno);
        }

    } catch (SQLException e) {
        System.out.println("❌ Error al actualizar el alumno.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar(); // Cerrar conexión
    }
}

public void eliminarAlumno(int idAlumno) {
    // Consulta para obtener el ID_Persona relacionado con el ID_Alumno
    String sqlAlumno = "SELECT ID_Persona FROM alumno WHERE ID_Alumno = ?";

    // Consulta para eliminar en la tabla alumnos
    String sqlDeleteAlumno = "DELETE FROM alumno WHERE ID_Alumno = ?";

    // Consulta para eliminar en la tabla persona
    String sqlDeletePersona = "DELETE FROM persona WHERE ID_Persona = ?";

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmtAlumnoSelect = conn.prepareStatement(sqlAlumno);
         PreparedStatement stmtDeleteAlumno = conn.prepareStatement(sqlDeleteAlumno);
         PreparedStatement stmtDeletePersona = conn.prepareStatement(sqlDeletePersona)) {

        // Obtener el ID_Persona asociado al ID_Alumno
        stmtAlumnoSelect.setInt(1, idAlumno);
        ResultSet rs = stmtAlumnoSelect.executeQuery();
        int idPersona = -1;
        if (rs.next()) {
            idPersona = rs.getInt("ID_Persona");
        }

        if (idPersona != -1) {
            // Eliminar de la tabla alumnos
            stmtDeleteAlumno.setInt(1, idAlumno);
            int filasAfectadasAlumno = stmtDeleteAlumno.executeUpdate();
            if (filasAfectadasAlumno > 0) {
                System.out.println("✅ Alumno con ID_Alumno " + idAlumno + " eliminado correctamente.");
            }

            // Eliminar de la tabla persona
            stmtDeletePersona.setInt(1, idPersona);
            int filasAfectadasPersona = stmtDeletePersona.executeUpdate();
            if (filasAfectadasPersona > 0) {
                System.out.println("✅ Persona con ID_Persona " + idPersona + " eliminada correctamente.");
            }
        } else {
            System.out.println("❌ No se encontró el alumno con ID_Alumno: " + idAlumno);
        }

    } catch (SQLException e) {
        System.out.println("❌ Error al eliminar el alumno.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar(); // Cerrar conexión
    }
}
public static void main(String[] args) {
    QuerysAlumnos dao = new QuerysAlumnos();

    // Insertar un alumno
    dao.insertarAlumno("Ana", "López", "Martínez", "123456789", "98765432", "1995-04-25", 
                       "Calle Imaginaria 456", "ana.lopez@mail.com");

    // Actualizar un alumno con ID_Alumno 1 (asegúrate de que el alumno con este ID exista)
   /* dao.actualizarAlumno(4, "Ana", "López", "Martínez", "987654321", "98765432", "1995-04-25", 
                         "Calle Nueva 789", "ana.lopez.updated@mail.com");

    // Eliminar un alumno con ID_Alumno 1 (asegúrate de que el alumno con este ID exista)
    dao.eliminarAlumno(4);*/
}

}
