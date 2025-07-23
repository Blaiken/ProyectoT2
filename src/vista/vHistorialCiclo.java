package vista;

import controlador.control_historial;
import controlador.controlador;

public class vHistorialCiclo extends javax.swing.JFrame {
    
    controlador ctrl = new controlador();
    control_historial ch = new control_historial();
    validaciones val = new validaciones();

    public vHistorialCiclo() {
        initComponents();
        ch.MostrarHistorialDP(TablaDP);
        ch.MostrarHistorialSintomas(TablaS);
        ch.MostrarHistorialCM(TablaCM);
        ch.MostrarHistorialCambios(TablaCaM);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDP = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaS = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaCM = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaCaM = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TextCedula = new javax.swing.JTextField();
        BtnBuscarCedula = new javax.swing.JButton();
        BtnBuscarFecha = new javax.swing.JButton();
        FechaFiltro = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        BtnBuscarNombre = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CboxSintoma = new javax.swing.JComboBox<>();
        BtnBuscarSintoma = new javax.swing.JButton();
        CboxIntensidad = new javax.swing.JComboBox<>();
        CboxDurabilidad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        BtnBuscarCambio = new javax.swing.JButton();
        CboxHumor = new javax.swing.JComboBox<>();
        CboxTipoDolor = new javax.swing.JComboBox<>();
        CboxSensibilidadEmocional = new javax.swing.JComboBox<>();
        BtnCrearInforme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setBackground(new java.awt.Color(248, 180, 180));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("• HISTORIAL •");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("DATOS PERSONALES");
        jLabel16.setOpaque(true);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CICLO MENSTRUAL");
        jLabel17.setOpaque(true);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CAMBIOS");
        jLabel18.setOpaque(true);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("SÍNTOMAS");
        jLabel19.setOpaque(true);

        BtnVolver.setBackground(new java.awt.Color(255, 254, 255));
        BtnVolver.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnVolver.setText("Volver");
        BtnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnVolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        TablaDP.setBackground(new java.awt.Color(255, 254, 255));
        TablaDP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TablaDP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaDP.setToolTipText("");
        TablaDP.getTableHeader().setResizingAllowed(false);
        TablaDP.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaDP);

        TablaS.setBackground(new java.awt.Color(255, 254, 255));
        TablaS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TablaS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaS.getTableHeader().setResizingAllowed(false);
        TablaS.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TablaS);

        TablaCM.setBackground(new java.awt.Color(255, 254, 255));
        TablaCM.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TablaCM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaCM.getTableHeader().setResizingAllowed(false);
        TablaCM.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TablaCM);

        TablaCaM.setBackground(new java.awt.Color(255, 254, 255));
        TablaCaM.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TablaCaM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaCaM.getTableHeader().setResizingAllowed(false);
        TablaCaM.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TablaCaM);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Cédula:");

        TextCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextCedulaKeyTyped(evt);
            }
        });

        BtnBuscarCedula.setBackground(new java.awt.Color(255, 254, 255));
        BtnBuscarCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/lupa.png"))); // NOI18N
        BtnBuscarCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarCedulaActionPerformed(evt);
            }
        });

        BtnBuscarFecha.setBackground(new java.awt.Color(255, 254, 255));
        BtnBuscarFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/lupa.png"))); // NOI18N
        BtnBuscarFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarFechaActionPerformed(evt);
            }
        });

        FechaFiltro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FechaFiltro.setMaxSelectableDate(new java.util.Date(1924923715000L));
        FechaFiltro.setMinSelectableDate(new java.util.Date(1704085315000L));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Fecha de registro:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Nombre/Apellido:");

        TextNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNombreKeyTyped(evt);
            }
        });

        BtnBuscarNombre.setBackground(new java.awt.Color(255, 254, 255));
        BtnBuscarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/lupa.png"))); // NOI18N
        BtnBuscarNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarNombreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Síntoma:");

        CboxSintoma.setBackground(new java.awt.Color(255, 254, 255));
        CboxSintoma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CboxSintoma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Tipo -", "Calambres", "Dolor en los senos", "Brotes de acné", "Fatiga", "Hinchazón abdominal", "Dolor lumbar", "Retención de líquidos", "Vómito" }));

        BtnBuscarSintoma.setBackground(new java.awt.Color(255, 254, 255));
        BtnBuscarSintoma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/lupa.png"))); // NOI18N
        BtnBuscarSintoma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscarSintoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarSintomaActionPerformed(evt);
            }
        });

        CboxIntensidad.setBackground(new java.awt.Color(255, 254, 255));
        CboxIntensidad.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CboxIntensidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Intensidad -", "Minutos", "Horas", "Un día", "Varios días", "Una semana", "Varias semanas" }));

        CboxDurabilidad.setBackground(new java.awt.Color(255, 254, 255));
        CboxDurabilidad.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CboxDurabilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Durabilidad -", "Bajo", "Medio", "Alto" }));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Cambio:");

        BtnBuscarCambio.setBackground(new java.awt.Color(255, 254, 255));
        BtnBuscarCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/lupa.png"))); // NOI18N
        BtnBuscarCambio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarCambioActionPerformed(evt);
            }
        });

        CboxHumor.setBackground(new java.awt.Color(255, 254, 255));
        CboxHumor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CboxHumor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Humor -", "Alegre", "Ansiosa", "Triste", "Depresiva", "Agresiva", "Molesta" }));

        CboxTipoDolor.setBackground(new java.awt.Color(255, 254, 255));
        CboxTipoDolor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CboxTipoDolor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Tipo de dolor -", "Cabeza", "Espalda", "Abdominal" }));

        CboxSensibilidadEmocional.setBackground(new java.awt.Color(255, 254, 255));
        CboxSensibilidadEmocional.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CboxSensibilidadEmocional.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Sensibilidad -", "Bajo", "Medio", "Alto" }));

        BtnCrearInforme.setBackground(new java.awt.Color(255, 254, 255));
        BtnCrearInforme.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCrearInforme.setText("Crear informe");
        BtnCrearInforme.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCrearInforme.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCrearInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCrearInforme))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CboxSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CboxIntensidad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CboxDurabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscarSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CboxHumor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CboxTipoDolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CboxSensibilidadEmocional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscarCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CboxSintoma)
                        .addComponent(CboxIntensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CboxDurabilidad)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BtnBuscarSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(CboxHumor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CboxTipoDolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CboxSensibilidadEmocional)
                        .addComponent(BtnBuscarCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnVolver)
                    .addComponent(BtnCrearInforme))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        ctrl.btnhistorialciclo_a_menuinicio(BtnVolver, this);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void BtnBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarCedulaActionPerformed
        ch.BuscarPorCedula(TablaDP, TablaS, TablaCM, TablaCaM, TextCedula);
    }//GEN-LAST:event_BtnBuscarCedulaActionPerformed

    private void TextCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCedulaKeyTyped
        val.ReglaN6(TextCedula, evt);
        ch.Rcedula(TextCedula, TablaDP);
    }//GEN-LAST:event_TextCedulaKeyTyped

    private void BtnBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarFechaActionPerformed
        ch.BuscarPorFecha(TablaDP, TablaS, TablaCM, TablaCaM, FechaFiltro);
    }//GEN-LAST:event_BtnBuscarFechaActionPerformed

    private void TextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNombreKeyTyped
        val.ReglaN1(TextNombre, evt);
        ch.Rnombreapellido(TextNombre, TablaDP);
    }//GEN-LAST:event_TextNombreKeyTyped

    private void BtnBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarNombreActionPerformed
        ch.BuscarPorNombre(TablaDP, TextNombre);
    }//GEN-LAST:event_BtnBuscarNombreActionPerformed

    private void BtnBuscarSintomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarSintomaActionPerformed
        ch.BuscarPorSintoma(TablaS, CboxSintoma, CboxIntensidad, CboxDurabilidad);
    }//GEN-LAST:event_BtnBuscarSintomaActionPerformed

    private void BtnBuscarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarCambioActionPerformed
        ch.BuscarPorCambio(TablaCaM, CboxHumor, CboxTipoDolor, CboxSensibilidadEmocional);
    }//GEN-LAST:event_BtnBuscarCambioActionPerformed

    private void BtnCrearInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearInformeActionPerformed
        ch.btninforme();
    }//GEN-LAST:event_BtnCrearInformeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarCambio;
    private javax.swing.JButton BtnBuscarCedula;
    private javax.swing.JButton BtnBuscarFecha;
    private javax.swing.JButton BtnBuscarNombre;
    private javax.swing.JButton BtnBuscarSintoma;
    private javax.swing.JButton BtnCrearInforme;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JComboBox<String> CboxDurabilidad;
    private javax.swing.JComboBox<String> CboxHumor;
    private javax.swing.JComboBox<String> CboxIntensidad;
    private javax.swing.JComboBox<String> CboxSensibilidadEmocional;
    private javax.swing.JComboBox<String> CboxSintoma;
    private javax.swing.JComboBox<String> CboxTipoDolor;
    private com.toedter.calendar.JDateChooser FechaFiltro;
    private javax.swing.JTable TablaCM;
    private javax.swing.JTable TablaCaM;
    public javax.swing.JTable TablaDP;
    private javax.swing.JTable TablaS;
    private javax.swing.JTextField TextCedula;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
