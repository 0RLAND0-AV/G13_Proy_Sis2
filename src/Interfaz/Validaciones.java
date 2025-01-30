/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.TextField;
/**
 *
 * @author jhona
 */
public class Validaciones {
    // Permitir solo letras y espacios
    public static void soloLetras(KeyEvent evt) {
        char c = evt.getKeyChar();
        
        // No mostrar mensaje de error al borrar
        if (c == KeyEvent.VK_BACK_SPACE ) {
            return; // Permite borrar sin mostrar errores
        }
        
        if (!Character.isLetter(c) && c != ' ') {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras");
        }
    }

    // Permitir solo números enteros positivos
    public static void soloNumeros(KeyEvent evt) {
        char c = evt.getKeyChar();
        
        // No mostrar mensaje de error al borrar
        if (c == KeyEvent.VK_BACK_SPACE ) {
            return; // Permite borrar sin mostrar errores
        }
        
        if (!Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
        }
    }   

// Validar que el horario tenga el formato correcto
   public static void validarHorario(KeyEvent evt, TextField txt) {
        String texto = txt.getText();
        char c = evt.getKeyChar();

        // No mostrar mensaje de error al borrar
        if (c == KeyEvent.VK_BACK_SPACE && texto.length() > 0) {
            return; // Permite borrar sin mostrar errores
        }
        
        if ((c != ':' && !Character.isDigit(c)) || texto.length() > 7) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números y ':' en formato hh:mm:ss.");
            return;
        }

        if (texto.length() == 2 || texto.length() == 5) {
            if (c != ':') {
                evt.consume();
                JOptionPane.showMessageDialog(null, "El guion ':' debe ir en la posición correcta (hh:mm:ss).");
            }
        }

        if (texto.length() == 3 || texto.length() == 6) {
            if ((texto.length() == 3 && Integer.parseInt(texto.substring(0, 2)) > 23) ||
                (texto.length() == 6 && Integer.parseInt(texto.substring(3, 5)) > 59) ||
                (texto.length() == 8 && Integer.parseInt(texto.substring(6)) > 59)) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Horas deben estar entre 00-23, minutos y segundos entre 00-59.");
            }
        }
    }   

// Validar que una fecha ingresada tenga el formato correcto
     public static void validarFecha(KeyEvent evt, TextField txt) {
        String texto = txt.getText();
        char c = evt.getKeyChar();

        // No mostrar mensaje de error al borrar
        if (c == KeyEvent.VK_BACK_SPACE && texto.length() > 0) {
            return; // Permite borrar sin mostrar errores
        }

        // Solo permitir números y el guion '-'
        if ((c != '-' && !Character.isDigit(c)) || texto.length() > 9) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números y '-' en formato yyyy-MM-dd.");
            return;
        }

        // Validar la posición del guion '-'
        if ((texto.length() == 4 || texto.length() == 7) && c != '-') {
            evt.consume();
            JOptionPane.showMessageDialog(null, "El guion '-' debe ir en la posición correcta (yyyy-MM-dd).");
            return;
        }

        // Validación de año, mes y día
        if (texto.length() == 5 || texto.length() == 8) {
            try {
                if (texto.length() >= 5) {
                    int year = Integer.parseInt(texto.substring(0, 4));
                    if (year < 1000 || year > 9999) {
                        evt.consume();
                        JOptionPane.showMessageDialog(null, "El año debe ser un valor válido entre 1000 y 9999.");
                        return;
                    }
                }

                if (texto.length() >= 7) {
                    // Validación del mes entre 01 y 12
                    int month = Integer.parseInt(texto.substring(5, 7));
                    if (month < 1 || month > 12) {
                        evt.consume();
                        JOptionPane.showMessageDialog(null, "El mes debe estar entre 01 y 12.");
                        return;
                    }

                    // Validación del día entre 01 y 31
                    if (texto.length() == 10) {
                        int day = Integer.parseInt(texto.substring(8, 10));
                        if (day < 1 || day > 31) {
                            evt.consume();
                            JOptionPane.showMessageDialog(null, "El día debe estar entre 01 y 31.");
                        }
                    }
                }
            } catch (NumberFormatException e) {
                // Si ocurre un error al convertir a número, no hacemos nada
            }
        }
    }
}
