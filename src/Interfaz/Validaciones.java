/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Frank
 */
public class Validaciones {
    /*// Permitir solo letras y espacios
    public static void soloLetras(KeyEvent evt) {     
        char c = evt.getKeyChar();
        
        // No mostrar mensaje de error al borrar
        if (c == KeyEvent.VK_BACK_SPACE ) {
           // txt.setForeground(Color.BLACK);
            return ; // Permite borrar sin mostrar errores
        }
        
        if (!Character.isLetter(c) && c != ' ') {
            evt.consume();
          //  txt.setForeground(Color.red);
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
*/
// Validar que el horario tenga el formato correcto
   public static void validarHorario(KeyEvent evt, JTextField txt) {
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
     public static void validarFecha(KeyEvent evt, JTextField txt) {
         SoloNumeros(txt, "yyyy-mm-dd");
         String texto = txt.getText();
        char c = evt.getKeyChar();
        int num = texto.length();
            if (c == KeyEvent.VK_BACK_SPACE) {
            txt.setForeground(Color.BLACK);
        return;
        }        
        switch (num) {
            case 4 -> {
                int año = Integer.parseInt(texto);
                if(año<=1950 || año>=2025){
                    txt.setForeground(Color.red);
                    evt.consume();
                    return;
                }   txt.setText(txt.getText()+"-");
            }
            case 7 -> {
                int mes = Integer.parseInt(texto.substring(5, 7));
                if(mes<=0 || mes>=13){
                    txt.setForeground(Color.red);
                    evt.consume();
                    return;
                }   txt.setText(txt.getText()+"-");
            }
            case 10 -> {
                int dia = Integer.parseInt(texto.substring(8, 10));
                if(dia<=0 || dia>=32){
                    txt.setForeground(Color.red);
                    evt.consume();
                    return;
                }   evt.consume();
                
            }
            default -> {
            }
        }
     }   
    
     public static void AñadirFotogra(JLabel foto){
                 JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "png", "jpeg"));
        int seleccion = fileChooser.showOpenDialog(foto);
    
        if (seleccion == JFileChooser.APPROVE_OPTION) {
        File archivo = fileChooser.getSelectedFile();
        ImageIcon imagenOriginal = new ImageIcon(archivo.getAbsolutePath());

        // Obtener las dimensiones del JLabel
        int anchoLabel = foto.getWidth();
        int altoLabel = foto.getHeight();

        // Escalar la imagen al tamaño del JLabel
        Image imgEscalada = imagenOriginal.getImage().getScaledInstance(anchoLabel, altoLabel, Image.SCALE_SMOOTH);
        
        // Asignar la imagen escalada al JLabel
        foto.setIcon(new ImageIcon(imgEscalada));
        foto.revalidate();
        foto.repaint();
    }
    }

         // Método genérico para validar que el campo solo tenga texto
    public static void SoloTexto(JTextField textField, String mensajeEjemplo) {
        
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validarCampo(textField, mensajeEjemplo);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validarCampo(textField, mensajeEjemplo);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validarCampo(textField, mensajeEjemplo);
            }

            private void validarCampo(JTextField field, String mensajeEjemplo) {
                String texto = field.getText();
                field.setToolTipText("Ingrese su " + mensajeEjemplo + "  (solo texto)");
                // Verificar si hay números en el texto
                if (texto.matches(".*\\d.*")) {
                    // Si hay un número, mostrar el error y poner el borde y texto en rojo
                    field.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); // Borde rojo
                    field.setForeground(Color.RED); // Texto rojo
                    field.setToolTipText("Error: El campo solo acepta texto.");
                } else{
                    // Si no hay números, restaurar el estado normal
                    field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); // Borde original
                    field.setForeground(Color.BLACK); // Texto negro
                    field.setToolTipText("Ejemplo: " + mensajeEjemplo + "  (solo texto)"); // Tooltip con el mensaje personalizado
                }
            }
        });
    }
    
    // Método genérico para validar que el campo solo tenga números
    public static void SoloNumeros(JTextField textField, String mensajeEjemplo) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validarCampo(textField, mensajeEjemplo);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validarCampo(textField, mensajeEjemplo);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validarCampo(textField, mensajeEjemplo);
            }

            private void validarCampo(JTextField field, String mensajeEjemplo) {
                String texto = field.getText();

                // Verificar si el texto contiene algo que no sea un número
                if (!texto.matches("\\d*")) {
                    // Si contiene algo que no es un número, mostrar el error y poner el borde y texto en rojo
                    field.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); // Borde rojo
                    field.setForeground(Color.RED); // Texto rojo
                    field.setToolTipText("Error:  El campo solo acepta números.");
                } else {
                    // Si el texto solo tiene números, restaurar el estado normal
                    field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); // Borde original
                    field.setForeground(Color.BLACK); // Texto negro
                    field.setToolTipText("Ejemplo: " + mensajeEjemplo + " (solo números)"); // Tooltip con el mensaje personalizado
                }
            }
        });
    }
    
    
}

