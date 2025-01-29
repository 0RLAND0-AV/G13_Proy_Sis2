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

public class QuerysProgramas {

    public void insertarPrograma(String nombrePrograma, String fechaInicio, String fechaFin,
                                 int costo, String horario, String descripcion, int maxInscritos) {
        String sql = "INSERT INTO programa (nombre, fecha_inicio, fecha_fin, costo, horario, descripcion, Max_inscritos) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";

        ConexionBD conexionBD = new ConexionBD(); // Crear instancia de la conexión
        conexionBD.conectar(); // Establecer conexión
        Connection conn = conexionBD.getConexion();

        try (PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, nombrePrograma);
            stmt.setString(2, fechaInicio);  // Formato: YYYY-MM-DD
            stmt.setString(3, fechaFin);     // Formato: YYYY-MM-DD
            stmt.setInt(4, costo);
            stmt.setString(5, horario);      // Formato: HH:mm:ss
            stmt.setString(6, descripcion);
            stmt.setInt(7, maxInscritos);

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                // Obtener el ID generado automáticamente
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idGenerado = generatedKeys.getInt(1);
                    System.out.println("✅ Programa agregado con ID_Programa: " + idGenerado);
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al insertar el programa.");
            e.printStackTrace();
        } finally {
            conexionBD.desconectar(); // Cerrar conexión
        }
    }
    
    // Método para actualizar un programa
    public void actualizarPrograma(int ID_Programa, String nombrePrograma, String fechaInicio, String fechaFin,
                                   int costo, String horario, String descripcion, int maxInscritos) {
        // Consulta SQL para actualizar los datos
        String sql = "UPDATE programa SET nombre = ?, fecha_inicio = ?, fecha_fin = ?, costo = ?, horario = ?, " +
                     "descripcion = ?, max_inscritos = ? WHERE ID_Programa = ?";

        // Crear instancia de ConexionBD y establecer conexión
        ConexionBD conexionBD = new ConexionBD();
        conexionBD.conectar();
        Connection conn = conexionBD.getConexion();

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Establecer los parámetros para la consulta SQL
            stmt.setString(1, nombrePrograma);
            stmt.setString(2, fechaInicio);  // Formato: YYYY-MM-DD
            stmt.setString(3, fechaFin);     // Formato: YYYY-MM-DD
            stmt.setInt(4, costo);
            stmt.setString(5, horario);      // Formato: HH:mm:ss
            stmt.setString(6, descripcion);
            stmt.setInt(7, maxInscritos);
            stmt.setInt(8, ID_Programa);     // Establecer el ID del programa que se va a actualizar

            // Ejecutar la consulta de actualización
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("✅ Programa con ID " + ID_Programa + " actualizado correctamente.");
            } else {
                System.out.println("❌ No se encontró el programa con ID " + ID_Programa);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al actualizar el programa.");
            e.printStackTrace();
        } finally {
            // Cerrar la conexión después de la operación
            conexionBD.desconectar();
        }
    }

    // Método para eliminar un programa
    public void eliminarPrograma(int ID_Programa) {
        // Consulta SQL para eliminar un programa por su ID
        String sql = "DELETE FROM programa WHERE ID_Programa = ?";

        // Crear instancia de ConexionBD y establecer conexión
        ConexionBD conexionBD = new ConexionBD();
        conexionBD.conectar();
        Connection conn = conexionBD.getConexion();

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Establecer el parámetro para la consulta SQL
            stmt.setInt(1, ID_Programa);  // Pasamos el ID del programa a eliminar

            // Ejecutar la consulta de eliminación
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
            // Cerrar la conexión después de la operación
            conexionBD.desconectar();
        }
    }

    public static void main(String[] args) {
        QuerysProgramas dao = new QuerysProgramas();
        //dao.insertarPrograma("Desarrollo Web", "2025-01-08", "2025-06-30", 500, "03:20:39", "Curso intensivo de desarrollo web.", 30);
        //dao.actualizarPrograma(11, "Desarrollo Web Avanzado", "2025-02-01", "2025-07-31", 600, "04:00:00", "Curso avanzado de desarrollo web.", 25);
        //dao.eliminarPrograma(11);
    }
}

