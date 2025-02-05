/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorBD;

/**
 *
 * @author M.S.I
 */
import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
public class QuerysCronograma {
        public void insertarCronograma(String lugar, String fecha, String hora, String tipo, int ID_Programa) {
        String sql = "INSERT INTO cronograma (Lugar, Fecha, Hora, Tipo, ID_Programa) VALUES (?, ?, ?, ?, ?)";
        
        ConexionBD conexionBD = new ConexionBD();
        conexionBD.conectar();
        Connection conn = conexionBD.getConexion();

        try (PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, lugar);
            stmt.setString(2, fecha);
            stmt.setString(3, hora);
            stmt.setString(4, tipo);
            stmt.setInt(5, ID_Programa);

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idGenerado = generatedKeys.getInt(1);
                    System.out.println("✅ Cronograma agregado con ID_Cronograma: " + idGenerado);
                    mostrarNotificacion("✅ Cronograma registrado con éxito", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException e) {
            mostrarNotificacion("❌ Error al insertar el cronograma", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            conexionBD.desconectar();
        }
    }

    public void actualizarCronograma(int ID_Cronograma, String lugar, String fecha, String hora, String tipo, int ID_Programa) {
        String sql = "UPDATE cronograma SET Lugar = ?, Fecha = ?, Hora = ?, Tipo = ?, ID_Programa = ? WHERE ID_Cronograma = ?";
        
        ConexionBD conexionBD = new ConexionBD();
        conexionBD.conectar();
        Connection conn = conexionBD.getConexion();

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, lugar);
            stmt.setString(2, fecha);
            stmt.setString(3, hora);
            stmt.setString(4, tipo);
            stmt.setInt(5, ID_Programa);
            stmt.setInt(6, ID_Cronograma);

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("✅ Cronograma con ID " + ID_Cronograma + " actualizado correctamente.");
            } else {
                System.out.println("❌ No se encontró el cronograma con ID " + ID_Cronograma);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al actualizar el cronograma.");
            e.printStackTrace();
        } finally {
            conexionBD.desconectar();
        }
    }

    public void eliminarCronograma(int ID_Cronograma) {
        String sql = "DELETE FROM cronograma WHERE ID_Cronograma = ?";
        
        ConexionBD conexionBD = new ConexionBD();
        conexionBD.conectar();
        Connection conn = conexionBD.getConexion();

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ID_Cronograma);

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("✅ Cronograma con ID " + ID_Cronograma + " eliminado correctamente.");
            } else {
                System.out.println("❌ No se encontró el cronograma con ID " + ID_Cronograma);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar el cronograma.");
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
        dialog.setLocationRelativeTo(null);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                dialog.dispose();
            }
        }, 2000);
        dialog.setVisible(true);
    }
        public static void main(String[] args) {
        QuerysCronograma querys = new QuerysCronograma();

        // Insertar un cronograma
       // querys.insertarCronograma("Sala A", "2025-02-10", "10:00:00", "Conferencia", 1);

        // Actualizar el cronograma (suponiendo que el ID generado fue 1)
        querys.actualizarCronograma(1, "Sala B", "2025-02-12", "15:30:00", "Taller", 2);

        // Eliminar el cronograma con ID 1
        //querys.eliminarCronograma(1);
    }
}
