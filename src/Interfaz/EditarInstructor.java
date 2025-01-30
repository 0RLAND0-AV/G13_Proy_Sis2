/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.awt.Color;

/**
 *
 * @author Frank
 */
public class EditarInstructor extends javax.swing.JFrame {

    /**
     * Creates new form A
     */
    public EditarInstructor() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        FechaNacimientoCampo = new java.awt.TextField();
        NombreCampo = new java.awt.TextField();
        ApellidoPaternoCampo = new java.awt.TextField();
        ApellidoMaternoCampo = new java.awt.TextField();
        CICampo = new java.awt.TextField();
        FechaNacimiento = new javax.swing.JLabel();
        SubtituloDP = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        CorreoElectronico = new javax.swing.JLabel();
        DatosContactoPanel = new javax.swing.JPanel();
        SubTituloDC = new javax.swing.JLabel();
        CorreoElectronicoCampo = new java.awt.TextField();
        DireccionCampo = new java.awt.TextField();
        TelefonoCampo = new java.awt.TextField();
        EspecialidadPanel = new javax.swing.JPanel();
        especialidadComboBox = new javax.swing.JComboBox<>();
        Especialidad = new javax.swing.JLabel();
        Fotografia = new javax.swing.JPanel();
        UsuarioPanel = new javax.swing.JPanel();
        Usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Nombre.setText("Nombre:");

        ApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ApellidoPaterno.setText("Apellido paterno:");

        ApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ApellidoMaterno.setText("Apellido materno:");

        CI.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CI.setText("CI:");

        FechaNacimientoCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FechaNacimientoCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FechaNacimientoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaNacimientoCampoActionPerformed(evt);
            }
        });
        FechaNacimientoCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaNacimientoCampoKeyTyped(evt);
            }
        });

        NombreCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NombreCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        ApellidoPaternoCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ApellidoPaternoCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        ApellidoMaternoCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ApellidoMaternoCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        CICampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CICampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        FechaNacimiento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FechaNacimiento.setText("Fecha de nacimiento:");

        SubtituloDP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SubtituloDP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubtituloDP.setText("Datos Personales");

        javax.swing.GroupLayout DatosPersonalesPanelLayout = new javax.swing.GroupLayout(DatosPersonalesPanel);
        DatosPersonalesPanel.setLayout(DatosPersonalesPanelLayout);
        DatosPersonalesPanelLayout.setHorizontalGroup(
            DatosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubtituloDP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DatosPersonalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ApellidoPaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ApellidoPaternoCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(FechaNacimientoCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CICampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApellidoMaternoCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        DatosPersonalesPanelLayout.setVerticalGroup(
            DatosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosPersonalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SubtituloDP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DatosPersonalesPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(NombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(DatosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DatosPersonalesPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ApellidoPaternoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(DatosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DatosPersonalesPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ApellidoMaternoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(DatosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DatosPersonalesPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(CICampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(DatosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DatosPersonalesPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(FechaNacimientoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

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

        SubTituloDC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SubTituloDC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTituloDC.setText("Datos Contacto");

        CorreoElectronicoCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CorreoElectronicoCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CorreoElectronicoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoElectronicoCampoActionPerformed(evt);
            }
        });

        DireccionCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DireccionCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DireccionCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionCampoActionPerformed(evt);
            }
        });

        TelefonoCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TelefonoCampo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TelefonoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoCampoActionPerformed(evt);
            }
        });
        TelefonoCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoCampoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout DatosContactoPanelLayout = new javax.swing.GroupLayout(DatosContactoPanel);
        DatosContactoPanel.setLayout(DatosContactoPanelLayout);
        DatosContactoPanelLayout.setHorizontalGroup(
            DatosContactoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubTituloDC, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosContactoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DatosContactoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TelefonoCampo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DireccionCampo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CorreoElectronicoCampo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        DatosContactoPanelLayout.setVerticalGroup(
            DatosContactoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosContactoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SubTituloDC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TelefonoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(DireccionCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CorreoElectronicoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("+");

        javax.swing.GroupLayout FotografiaLayout = new javax.swing.GroupLayout(Fotografia);
        Fotografia.setLayout(FotografiaLayout);
        FotografiaLayout.setHorizontalGroup(
            FotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FotografiaLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(FotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FotografiaLayout.createSequentialGroup()
                        .addComponent(UsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FotografiaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        FotografiaLayout.setVerticalGroup(
            FotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FotografiaLayout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

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

    private void FechaNacimientoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaNacimientoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaNacimientoCampoActionPerformed

    private void NombreCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCampoActionPerformed

    private void ApellidoPaternoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoPaternoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoPaternoCampoActionPerformed

    private void ApellidoMaternoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoMaternoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoMaternoCampoActionPerformed

    private void CICampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CICampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CICampoActionPerformed

    private void CorreoElectronicoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoElectronicoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoElectronicoCampoActionPerformed

    private void DireccionCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionCampoActionPerformed

    private void TelefonoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoCampoActionPerformed

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

    private void NombreCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.soloLetras(evt);
    }//GEN-LAST:event_NombreCampoKeyTyped

    private void ApellidoPaternoCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoPaternoCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.soloLetras(evt);
    }//GEN-LAST:event_ApellidoPaternoCampoKeyTyped

    private void ApellidoMaternoCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoMaternoCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.soloLetras(evt);
    }//GEN-LAST:event_ApellidoMaternoCampoKeyTyped

    private void CICampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CICampoKeyTyped
        // TODO add your handling code here:
        Validaciones.soloNumeros(evt);
    }//GEN-LAST:event_CICampoKeyTyped

    private void FechaNacimientoCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaNacimientoCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.validarFecha(evt, FechaNacimientoCampo);
    }//GEN-LAST:event_FechaNacimientoCampoKeyTyped

    private void TelefonoCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoCampoKeyTyped
        // TODO add your handling code here:
        Validaciones.soloNumeros(evt);
    }//GEN-LAST:event_TelefonoCampoKeyTyped

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
                new EditarInstructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoMaterno;
    private java.awt.TextField ApellidoMaternoCampo;
    private javax.swing.JLabel ApellidoPaterno;
    private java.awt.TextField ApellidoPaternoCampo;
    private javax.swing.JLabel CI;
    private java.awt.TextField CICampo;
    private javax.swing.JLabel CancelarBoton1;
    private javax.swing.JPanel CancelarPanel;
    private javax.swing.JLabel CorreoElectronico;
    private java.awt.TextField CorreoElectronicoCampo;
    private javax.swing.JPanel DatosContactoPanel;
    private javax.swing.JPanel DatosPersonalesPanel;
    private javax.swing.JLabel Direccion;
    private java.awt.TextField DireccionCampo;
    private javax.swing.JLabel Especialidad;
    private javax.swing.JPanel EspecialidadPanel;
    private javax.swing.JLabel FechaNacimiento;
    private java.awt.TextField FechaNacimientoCampo;
    private javax.swing.JPanel Fotografia;
    private javax.swing.JLabel GuardarBoton;
    private javax.swing.JPanel GuardarPanel;
    private javax.swing.JLabel Nombre;
    private java.awt.TextField NombreCampo;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel SubTituloDC;
    private javax.swing.JLabel SubtituloDP;
    private javax.swing.JLabel Telefono;
    private java.awt.TextField TelefonoCampo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Usuario;
    private javax.swing.JPanel UsuarioPanel;
    private javax.swing.JComboBox<String> especialidadComboBox;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
