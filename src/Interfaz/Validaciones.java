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
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author Frank
 */
public class Validaciones {     
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

    // Método para validar que el campo solo tenga texto
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
    
    // Método para validar que el campo solo tenga números
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
    
    public static void aplicarFormatoFecha(JFormattedTextField field) {
        try {
            MaskFormatter formatter = new MaskFormatter("####-##-##");
            formatter.setPlaceholderCharacter(' ');
            formatter.setValidCharacters("0123456789");
            field.setFormatterFactory(new DefaultFormatterFactory(formatter));

            // Agregar listener para validar automáticamente al escribir los 10 caracteres
            field.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
                public void insertUpdate(javax.swing.event.DocumentEvent e) {
                    validarFecha(field);
                }
                public void removeUpdate(javax.swing.event.DocumentEvent e) {
                    validarFecha(field);
                }
                public void changedUpdate(javax.swing.event.DocumentEvent e) {
                    validarFecha(field);
                }
            });

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    private static void validarFecha(JFormattedTextField field) {
        String fecha = field.getText().trim();

        if (fecha.length() != 10) {
            field.setForeground(Color.BLACK); // Mientras no complete los 10 caracteres, se mantiene normal
            field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            return;
        }
        String[] partes = fecha.split("-");
        try {
            int año = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int dia = Integer.parseInt(partes[2]);
            boolean fechaValida = año >= 1900 && año <= 2200 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31;
            if (fechaValida) {
                field.setForeground(Color.BLACK);
                field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            } else {
                field.setForeground(Color.RED);
                field.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            }
        } catch (NumberFormatException e) {
            field.setForeground(Color.RED);
            field.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }
    
    public static void aplicarFormatoHora(JFormattedTextField field) {
        try {
            MaskFormatter formatter = new MaskFormatter("##:##");
            formatter.setPlaceholderCharacter(' ');
            formatter.setValidCharacters("0123456789");
            field.setFormatterFactory(new DefaultFormatterFactory(formatter));

            // Agregar listener para validar automáticamente cuando el usuario escriba
            field.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
                public void insertUpdate(javax.swing.event.DocumentEvent e) {
                    validarHora(field);
                }
                public void removeUpdate(javax.swing.event.DocumentEvent e) {
                    validarHora(field);
                }
                public void changedUpdate(javax.swing.event.DocumentEvent e) {
                    validarHora(field);
                }
            });

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    private static void validarHora(JFormattedTextField field) {
        String hora = field.getText().trim();

        if (hora.length() != 5) {
            field.setForeground(Color.BLACK); // Mientras no complete los 5 caracteres, se mantiene normal
            return;
        }
        String[] partes = hora.split(":");
        try {
            int horaInt = Integer.parseInt(partes[0]);
            int minutosInt = Integer.parseInt(partes[1]);
            boolean horaValida = horaInt >= 0 && horaInt <= 23 && minutosInt >= 0 && minutosInt <= 59;
            if (horaValida) {
                field.setForeground(Color.BLACK);
                field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            } else {
                field.setForeground(Color.RED);
                field.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            }
        } catch (NumberFormatException e) {
            field.setForeground(Color.RED);
            field.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }    
    public static void filtrarTabla(JTable tabla, JTextField buscador) {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabla.getModel());
        tabla.setRowSorter(sorter);

        String textoFiltro = buscador.getText().trim();
        if (textoFiltro.length() == 0) {
            sorter.setRowFilter(null); // Sin filtro
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoFiltro)); // Filtrar ignorando mayúsculas/minúsculas
        }
    }

    
}

