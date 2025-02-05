/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import ControladorBD.ConexionBD;
import ControladorBD.QuerysInstructores;
import java.awt.Color;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Frank
 */
public class EditarInstructor extends javax.swing.JFrame {

    /**
     * Creates new form A
     */
    private final int ID_Instructor;
    public EditarInstructor(int ID_Instructor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ID_Instructor = ID_Instructor; // Guardar el ID en la variable
        Validaciones.aplicarFormatoFecha(FechaNacimientoCampo);
        cargarDatosInstructor(); // Llenar los campos con los datos del programa
        //cargarEspecialidades();  // Llenar el ComboBox con los instructores
        
    }
    
    

private void cargarEspecialidades(java.sql.Connection conn) {
    // Consulta para obtener todas las especialidades
    String sqlEspecialidades = "SELECT Nombre FROM especialidad";

    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

    try (PreparedStatement stmt = conn.prepareStatement(sqlEspecialidades);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            String nombreEspecialidad = rs.getString("Nombre");
            model.addElement(nombreEspecialidad);  // Agregar el nombre de la especialidad al ComboBox
        }

        especialidadComboBox.setModel(model);  // Establecer el modelo del ComboBox

    } catch (SQLException e) {
        System.out.println("❌ Error al cargar las especialidades.");
        e.printStackTrace();
    }
}
private void cargarDatosInstructor() {
    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    java.sql.Connection conn = conexionBD.getConexion();

    if (conn == null) {
        System.out.println("❌ Error: No se pudo conectar a la BD.");
        return;
    }

    // Consulta para obtener los datos del instructor y la especialidad asociada
    String sqlInstructor = "SELECT p.Nombre, p.Apellido_paterno, p.Apellido_materno, p.Telefono, p.CI, p.Fecha_nacimiento, p.Direccion, p.Correo_electronico, " +
                           "i.ID_Especialidad, e.Nombre AS EspecialidadNombre " +
                           "FROM instructor i " +
                           "INNER JOIN persona p ON i.ID_Persona = p.ID_Persona " +
                           "INNER JOIN especialidad e ON i.ID_Especialidad = e.ID_Especialidad " +
                           "WHERE i.ID_Instructor = ?";

    try (PreparedStatement stmt = conn.prepareStatement(sqlInstructor)) {
        stmt.setInt(1, ID_Instructor);  // Establecer el ID_Instructor

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                // Llenar los JTextField con los datos obtenidos
                NombreCampo.setText(rs.getString("Nombre"));
                ApellidoPaternoCampo.setText(rs.getString("Apellido_paterno"));
                ApellidoMaternoCampo.setText(rs.getString("Apellido_materno"));
                TelefonoCampo.setText(rs.getString("Telefono"));
                CICampo.setText(rs.getString("CI"));
                FechaNacimientoCampo.setText(rs.getString("Fecha_nacimiento"));
                DireccionCampo.setText(rs.getString("Direccion"));
                CorreoElectronicoCampo.setText(rs.getString("Correo_electronico"));

                // Obtener el ID_Especialidad del instructor y seleccionar el nombre correcto en el ComboBox
                int idEspecialidad = rs.getInt("ID_Especialidad");

                // Primero cargar todas las especialidades en el ComboBox
                cargarEspecialidades(conn);

                // Luego, seleccionar la especialidad correspondiente en el ComboBox
                seleccionarEspecialidadComboBox(idEspecialidad);
            }
        }
    } catch (SQLException e) {
        System.out.println("❌ Error al obtener los datos del instructor.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar(); // Desconectar de la base de datos
    }
}

private void seleccionarEspecialidadComboBox(int idEspecialidad) {
    // Buscar la especialidad correspondiente por ID
    for (int i = 0; i < especialidadComboBox.getItemCount(); i++) {
        String especialidad = especialidadComboBox.getItemAt(i);
        
        // Hacemos la comparación con el nombre de la especialidad, si lo encontramos, lo seleccionamos
        if (especialidad.equals(getNombreEspecialidadById(idEspecialidad))) {
            especialidadComboBox.setSelectedIndex(i);
            break;
        }
    }
}

private String getNombreEspecialidadById(int idEspecialidad) {
    // Método para obtener el nombre de la especialidad por ID
    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    java.sql.Connection conn = conexionBD.getConexion();
    String nombreEspecialidad = "";

    String sql = "SELECT Nombre FROM especialidad WHERE ID_Especialidad = ?";

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, idEspecialidad);

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                nombreEspecialidad = rs.getString("Nombre");
            }
        }
    } catch (SQLException e) {
        System.out.println("❌ Error al obtener el nombre de la especialidad por ID.");
        e.printStackTrace();
    } finally {
        conexionBD.desconectar();
    }
    return nombreEspecialidad;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        CancelarPanel = new javax.swing.JPanel();
        CancelarBoton1 = new javax.swing.JLabel();
        GuardarPanel = new javax.swing.JPanel();
        GuardarBoton = new javax.swing.JLabel();
        DatosPersonalesPanel = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        ApellidoPaterno = new javax.swing.JLabel();
        ApellidoMaterno = new javax.swing.JLabel();
        CI = new javax.swing.JLabel();
        FechaNacimiento = new javax.swing.JLabel();
        SubtituloDP = new javax.swing.JLabel();
        ApellidoPaternoCampo = new javax.swing.JTextField();
        NombreCampo = new javax.swing.JTextField();
        CICampo = new javax.swing.JTextField();
        ApellidoMaternoCampo = new javax.swing.JTextField();
        FechaNacimientoCampo = new javax.swing.JFormattedTextField();
        Titulo = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        CorreoElectronico = new javax.swing.JLabel();
        DatosContactoPanel = new javax.swing.JPanel();
        SubTituloDC = new javax.swing.JLabel();
        TelefonoCampo = new javax.swing.JTextField();
        CorreoElectronicoCampo = new javax.swing.JTextField();
        DireccionCampo = new javax.swing.JTextField();
        EspecialidadPanel = new javax.swing.JPanel();
        especialidadComboBox = new javax.swing.JComboBox<>();
        Especialidad = new javax.swing.JLabel();
        Fotografia = new javax.swing.JPanel();
        UsuarioPanel = new javax.swing.JPanel();
        Usuario = new javax.swing.JLabel();
        AñadirFotografia = new javax.swing.JLabel();
        FotografiaCampo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(209, 209, 209));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(1050, 650));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CancelarPanel.setBackground(new java.awt.Color(80, 200, 120));

        CancelarBoton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelarBoton1.setForeground(new java.awt.Color(255, 255, 255));
        CancelarBoton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CancelarBoton1.setText("Cancelar");
        CancelarBoton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarBoton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelarBoton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelarBoton1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout CancelarPanelLayout = new javax.swing.GroupLayout(CancelarPanel);
        CancelarPanel.setLayout(CancelarPanelLayout);
        CancelarPanelLayout.setHorizontalGroup(
            CancelarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CancelarBoton1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        CancelarPanelLayout.setVerticalGroup(
            CancelarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CancelarBoton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelPrincipal.add(CancelarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 150, 50));

        GuardarPanel.setBackground(new java.awt.Color(80, 200, 120));

        GuardarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarBoton.setForeground(new java.awt.Color(255, 255, 255));
        GuardarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GuardarBoton.setText("Guardar");
        GuardarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GuardarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GuardarBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout GuardarPanelLayout = new javax.swing.GroupLayout(GuardarPanel);
        GuardarPanel.setLayout(GuardarPanelLayout);
        GuardarPanelLayout.setHorizontalGroup(
            GuardarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuardarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GuardarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        GuardarPanelLayout.setVerticalGroup(
            GuardarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuardarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GuardarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelPrincipal.add(GuardarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, -1, -1));

        DatosPersonalesPanel.setBackground(new java.awt.Color(232, 227, 223));
        DatosPersonalesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Nombre.setText("Nombre:");
        DatosPersonalesPanel.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, 164, 50));

        ApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ApellidoPaterno.setText("Apellido paterno:");
        DatosPersonalesPanel.add(ApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 110, 241, 50));

        ApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ApellidoMaterno.setText("Apellido materno:");
        DatosPersonalesPanel.add(ApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 160, 241, 50));

        CI.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CI.setText("CI:");
        DatosPersonalesPanel.add(CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 210, 241, 50));

        FechaNacimiento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FechaNacimiento.setText("Fecha de nacimiento:");
        DatosPersonalesPanel.add(FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, -1, 50));

        SubtituloDP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SubtituloDP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubtituloDP.setText("Datos Personales");
        DatosPersonalesPanel.add(SubtituloDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 470, 48));

        ApellidoPaternoCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ApellidoPaternoCampo.setToolTipText("Ingrese el apellido paterno del Instructor");
        ApellidoPaternoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoPaternoCampoActionPerformed(evt);
            }
        });
        ApellidoPaternoCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoPaternoCampoKeyTyped(evt);
            }
        });
        DatosPersonalesPanel.add(ApellidoPaternoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 200, 30));

        NombreCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NombreCampo.setToolTipText("Ingrese el nombre del Instructor");
        NombreCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCampoActionPerformed(evt);
            }
        });
        NombreCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreCampoKeyTyped(evt);
            }
        });
        DatosPersonalesPanel.add(NombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 200, 30));

        CICampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CICampo.setToolTipText("Ingrese el ci del Instructor");
        CICampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CICampoActionPerformed(evt);
            }
        });
        CICampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CICampoKeyTyped(evt);
            }
        });
        DatosPersonalesPanel.add(CICampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 200, 30));

        ApellidoMaternoCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ApellidoMaternoCampo.setToolTipText("Ingrese el apellido materno del Instructor");
        ApellidoMaternoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoMaternoCampoActionPerformed(evt);
            }
        });
        ApellidoMaternoCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoMaternoCampoKeyTyped(evt);
            }
        });
        DatosPersonalesPanel.add(ApellidoMaternoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 200, 30));

        FechaNacimientoCampo.setToolTipText("Ingrese la fecha de nacimiento del Instructor");
        FechaNacimientoCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FechaNacimientoCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechaNacimientoCampoMouseClicked(evt);
            }
        });
        DatosPersonalesPanel.add(FechaNacimientoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 200, 30));

        PanelPrincipal.add(DatosPersonalesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 470, 330));

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Editar instructor");
        PanelPrincipal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 560, 60));

        Telefono.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Telefono.setText("Telefono:");
        PanelPrincipal.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 250, 50));

        Direccion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Direccion.setText("Direccion:");
        PanelPrincipal.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 250, 50));

        CorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CorreoElectronico.setText("Correo electronico:");
        PanelPrincipal.add(CorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 250, 50));

        DatosContactoPanel.setBackground(new java.awt.Color(232, 227, 223));
        DatosContactoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTituloDC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SubTituloDC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTituloDC.setText("Datos Contacto");
        DatosContactoPanel.add(SubTituloDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 470, 48));

        TelefonoCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TelefonoCampo.setToolTipText("Ingrese el teléfono del Instructor");
        TelefonoCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoCampoKeyTyped(evt);
            }
        });
        DatosContactoPanel.add(TelefonoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 200, 30));

        CorreoElectronicoCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CorreoElectronicoCampo.setToolTipText("Ingrese el correo electrónico del Instructor");
        CorreoElectronicoCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorreoElectronicoCampoMouseClicked(evt);
            }
        });
        CorreoElectronicoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoElectronicoCampoActionPerformed(evt);
            }
        });
        DatosContactoPanel.add(CorreoElectronicoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 200, 30));

        DireccionCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DireccionCampo.setToolTipText("Ingrese la dirección del Instructor");
        DireccionCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionCampoActionPerformed(evt);
            }
        });
        DatosContactoPanel.add(DireccionCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 200, 30));

        PanelPrincipal.add(DatosContactoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 470, 230));

        EspecialidadPanel.setBackground(new java.awt.Color(232, 227, 223));

        especialidadComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        especialidadComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadComboBoxActionPerformed(evt);
            }
        });

        Especialidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Especialidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Especialidad.setText("Especialidad:");

        javax.swing.GroupLayout EspecialidadPanelLayout = new javax.swing.GroupLayout(EspecialidadPanel);
        EspecialidadPanel.setLayout(EspecialidadPanelLayout);
        EspecialidadPanelLayout.setHorizontalGroup(
            EspecialidadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EspecialidadPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(especialidadComboBox, 0, 237, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        EspecialidadPanelLayout.setVerticalGroup(
            EspecialidadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspecialidadPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(EspecialidadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especialidadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Especialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        PanelPrincipal.add(EspecialidadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 400, 60));

        Fotografia.setBackground(new java.awt.Color(232, 227, 223));
        Fotografia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario.setText("USUARIO");

        javax.swing.GroupLayout UsuarioPanelLayout = new javax.swing.GroupLayout(UsuarioPanel);
        UsuarioPanel.setLayout(UsuarioPanelLayout);
        UsuarioPanelLayout.setHorizontalGroup(
            UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        UsuarioPanelLayout.setVerticalGroup(
            UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        Fotografia.add(UsuarioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 218, -1, -1));

        AñadirFotografia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AñadirFotografia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AñadirFotografia.setText("+");
        AñadirFotografia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AñadirFotografiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AñadirFotografiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AñadirFotografiaMouseExited(evt);
            }
        });
        Fotografia.add(AñadirFotografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 30, 30));

        FotografiaCampo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fotografia.add(FotografiaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 190));

        PanelPrincipal.add(Fotografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 240, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void especialidadComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadComboBoxActionPerformed

    private void CancelarBoton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarBoton1MouseClicked
        dispose();
    }//GEN-LAST:event_CancelarBoton1MouseClicked

    private void CancelarBoton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarBoton1MouseEntered
        CancelarPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_CancelarBoton1MouseEntered

    private void CancelarBoton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarBoton1MouseExited
        CancelarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_CancelarBoton1MouseExited

    private void GuardarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBotonMouseEntered
        GuardarPanel.setBackground(new Color (32,67,114));
    }//GEN-LAST:event_GuardarBotonMouseEntered

    private void GuardarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBotonMouseExited
        GuardarPanel.setBackground(new Color (80,200,120));
    }//GEN-LAST:event_GuardarBotonMouseExited

    private void GuardarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBotonMouseClicked
        if (NombreCampo.getText().equals("") || ApellidoPaternoCampo.getText().equals("") ||
            ApellidoMaternoCampo.getText().equals("") || CICampo.getText().equals("") ||
            FechaNacimientoCampo.getText().equals("    -  -  ") || TelefonoCampo.getText().equals("") ||
            DireccionCampo.getText().equals("") || CorreoElectronicoCampo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pot favor rellene todos los campos");
        }else if(NombreCampo.getForeground().equals(Color.RED) || ApellidoPaternoCampo.getForeground().equals(Color.RED) ||
                 ApellidoMaternoCampo.getForeground().equals(Color.RED) || CICampo.getForeground().equals(Color.RED) ||
                 FechaNacimientoCampo.getForeground().equals(Color.RED) || TelefonoCampo.getForeground().equals(Color.RED)){
                 JOptionPane.showMessageDialog(null, "Por favor verifique los campos de color rojo");
        }else {
            int ID_Especialidad = obtenerIDEspecialidad();
            QuerysInstructores qi= new QuerysInstructores();
            qi.actualizarInstructor(ID_Instructor,NombreCampo.getText(), ApellidoPaternoCampo.getText(), ApellidoMaternoCampo.getText(), TelefonoCampo.getText(), CICampo.getText(), FechaNacimientoCampo.getText(), DireccionCampo.getText(), CorreoElectronicoCampo.getText(),ID_Especialidad);
            JOptionPane.showMessageDialog(null, "✅ Instructor editado correctamente.");
            dispose();
        }       
    }//GEN-LAST:event_GuardarBotonMouseClicked

    private void AñadirFotografiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirFotografiaMouseClicked
        Validaciones.AñadirFotogra(FotografiaCampo);
    }//GEN-LAST:event_AñadirFotografiaMouseClicked

    private void AñadirFotografiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirFotografiaMouseEntered
        AñadirFotografia.setForeground(Color.white);
    }//GEN-LAST:event_AñadirFotografiaMouseEntered

    private void AñadirFotografiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirFotografiaMouseExited
        AñadirFotografia.setForeground(Color.BLACK);
    }//GEN-LAST:event_AñadirFotografiaMouseExited

    private void ApellidoPaternoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoPaternoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoPaternoCampoActionPerformed

    private void NombreCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCampoActionPerformed

    private void CICampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CICampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CICampoActionPerformed

    private void ApellidoMaternoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoMaternoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoMaternoCampoActionPerformed

    private void CorreoElectronicoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoElectronicoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoElectronicoCampoActionPerformed

    private void DireccionCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionCampoActionPerformed

    private void NombreCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.SoloTexto(NombreCampo, "Jose, Maria, etc.");
    }//GEN-LAST:event_NombreCampoKeyTyped

    private void ApellidoPaternoCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoPaternoCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.SoloTexto(ApellidoPaternoCampo, "Paredes, Gomes, Mamani, etc.");
    }//GEN-LAST:event_ApellidoPaternoCampoKeyTyped

    private void ApellidoMaternoCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoMaternoCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.SoloTexto(ApellidoMaternoCampo, "Paredes, Gomes, Mamani, etc.");
    }//GEN-LAST:event_ApellidoMaternoCampoKeyTyped

    private void CICampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CICampoKeyTyped
        // TODO add your handling code here:
        Validaciones.SoloNumeros(CICampo, "15124342");
    }//GEN-LAST:event_CICampoKeyTyped

    private void TelefonoCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.SoloNumeros(TelefonoCampo, "63422343");
    }//GEN-LAST:event_TelefonoCampoKeyTyped

    private void FechaNacimientoCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaNacimientoCampoMouseClicked
        // TODO add your handling code here:
        FechaNacimientoCampo.setToolTipText("El formato es YYYY-MM-DD, Ejemplo: 2021-11-23");
    }//GEN-LAST:event_FechaNacimientoCampoMouseClicked

    private void CorreoElectronicoCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoElectronicoCampoMouseClicked
        // TODO add your handling code here:
        CorreoElectronicoCampo.setToolTipText("Ejemplo: joseRamires1@gmail.com");
    }//GEN-LAST:event_CorreoElectronicoCampoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarInstructor(1).setVisible(true);
            }
        });
    }
private int obtenerIDEspecialidad() {
    // Obtener el nombre de la especialidad seleccionada en el JComboBox
    String nombreEspecialidad = (String) especialidadComboBox.getSelectedItem();

    // Consulta SQL para obtener el ID_Especialidad según el nombre
    String sql = "SELECT ID_Especialidad FROM especialidad WHERE Nombre = ?";

    ConexionBD conexionBD = new ConexionBD();
    conexionBD.conectar();
    Connection conn = conexionBD.getConexion();

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, nombreEspecialidad);  // Establecer el nombre seleccionado en la consulta

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            // Devolver el ID_Especialidad si se encuentra
            return rs.getInt("ID_Especialidad");
        } else {
            System.out.println("❌ No se encontró la especialidad con nombre: " + nombreEspecialidad);
            return -1;  // Retorna -1 si no se encuentra
        }
    } catch (SQLException e) {
        System.out.println("❌ Error al obtener el ID_Especialidad.");
        e.printStackTrace();
        return -1;  // Retorna -1 si ocurre un error
    } finally {
        conexionBD.desconectar();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoMaterno;
    private javax.swing.JTextField ApellidoMaternoCampo;
    private javax.swing.JLabel ApellidoPaterno;
    private javax.swing.JTextField ApellidoPaternoCampo;
    private javax.swing.JLabel AñadirFotografia;
    private javax.swing.JLabel CI;
    private javax.swing.JTextField CICampo;
    private javax.swing.JLabel CancelarBoton1;
    private javax.swing.JPanel CancelarPanel;
    private javax.swing.JLabel CorreoElectronico;
    private javax.swing.JTextField CorreoElectronicoCampo;
    private javax.swing.JPanel DatosContactoPanel;
    private javax.swing.JPanel DatosPersonalesPanel;
    private javax.swing.JLabel Direccion;
    private javax.swing.JTextField DireccionCampo;
    private javax.swing.JLabel Especialidad;
    private javax.swing.JPanel EspecialidadPanel;
    private javax.swing.JLabel FechaNacimiento;
    private javax.swing.JFormattedTextField FechaNacimientoCampo;
    private javax.swing.JPanel Fotografia;
    private javax.swing.JLabel FotografiaCampo;
    private javax.swing.JLabel GuardarBoton;
    private javax.swing.JPanel GuardarPanel;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField NombreCampo;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel SubTituloDC;
    private javax.swing.JLabel SubtituloDP;
    private javax.swing.JLabel Telefono;
    private javax.swing.JTextField TelefonoCampo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Usuario;
    private javax.swing.JPanel UsuarioPanel;
    public javax.swing.JComboBox<String> especialidadComboBox;
    // End of variables declaration//GEN-END:variables
}
