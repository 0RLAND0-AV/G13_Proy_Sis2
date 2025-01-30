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
import java.util.*;

public class InformaciondeTablaProgramas {

    public static LinkedHashMap<String, Object[]> obtenerDatosDeTabla(String nameTable) {
    LinkedHashMap<String, Object[]> datosTabla = new LinkedHashMap<>();
    String sql = "SELECT * FROM " + nameTable;
    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
        ResultSetMetaData metaData = rs.getMetaData();
        int numColumnas = metaData.getColumnCount();
        List<List<Object>> columnas = new ArrayList<>();
        for (int i = 1; i <= numColumnas; i++) {
            columnas.add(new ArrayList<>());
        }

        while (rs.next()) {
            for (int i = 1; i <= numColumnas; i++) {
                Object valor = rs.getObject(i);
                if (valor instanceof java.sql.Date) {
                    String fechaStr = valor.toString();
                    if (fechaStr.equals("0000-00-00")) {
                        valor = null;
                    }
                }
                columnas.get(i - 1).add(valor);
            }
        }

        // Depuración: Imprimir los datos obtenidos
        for (int i = 1; i <= numColumnas; i++) {
            String nombreColumna = metaData.getColumnName(i);
            System.out.println("Columna: " + nombreColumna + " - Datos: " + columnas.get(i - 1));
            datosTabla.put(nombreColumna, columnas.get(i - 1).toArray());
        }

    } catch (SQLException e) {
        System.out.println("❌ Error al obtener los datos de la tabla.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar();
    }

    return datosTabla;
}

    public static void main(String[] args) {
        String nombreTabla = "programa";  
        LinkedHashMap<String, Object[]> datos = obtenerDatosDeTabla(nombreTabla);

        // Mostrar los datos obtenidos con nombres de columnas
        for (Map.Entry<String, Object[]> entry : datos.entrySet()) {
            System.out.println("Columna: " + entry.getKey());
            System.out.println(Arrays.toString(entry.getValue()));
        }
    }
}

