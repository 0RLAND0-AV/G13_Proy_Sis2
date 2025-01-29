/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/fgi";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private Connection conexion;

    // Método para conectar a la base de datos
    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Cargar el driver de MySQL
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conexión establecida con éxito.");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: No se encontró el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar con la base de datos.");
            e.printStackTrace();
        }
    }

    // Método para desconectar de la base de datos
    public void desconectar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("✅ Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al cerrar la conexión.");
            e.printStackTrace();
        }
    }

    // Método para obtener la conexión actual
    public Connection getConexion() {
        return conexion;
    }
    
    public static void main(String[] args) {
        // Probar conexión y desconexión
        ConexionBD bd=new ConexionBD();
        bd.conectar();
        bd.desconectar();
    }
}
