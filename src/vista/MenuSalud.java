package vista;

import controlador.controlador;

public class MenuSalud extends javax.swing.JFrame {
    
    controlador ctrl = new controlador();

    public MenuSalud() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnCicloMenstrual = new javax.swing.JButton();
        BtnCambiosySintomas = new javax.swing.JButton();
        BtnEditarPerfil = new javax.swing.JButton();
        BtnEditarPerfil1 = new javax.swing.JButton();
        BtnMenuInicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnDiagnostico = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnPruebaEmbarazo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setBackground(new java.awt.Color(248, 180, 180));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("• MENÚ DE SALUD •");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 2, 2)));
        jLabel1.setOpaque(true);

        BtnCicloMenstrual.setBackground(new java.awt.Color(255, 254, 255));
        BtnCicloMenstrual.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCicloMenstrual.setText("Añadir Ciclo Menstrual");
        BtnCicloMenstrual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnCicloMenstrualMousePressed(evt);
            }
        });

        BtnCambiosySintomas.setBackground(new java.awt.Color(255, 254, 255));
        BtnCambiosySintomas.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCambiosySintomas.setText("Añadir Cambios y Síntomas");
        BtnCambiosySintomas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnCambiosySintomasMousePressed(evt);
            }
        });

        BtnEditarPerfil.setBackground(new java.awt.Color(255, 254, 255));
        BtnEditarPerfil.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnEditarPerfil.setText("Editar perfil");
        BtnEditarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnEditarPerfilMousePressed(evt);
            }
        });

        BtnEditarPerfil1.setBackground(new java.awt.Color(255, 254, 255));
        BtnEditarPerfil1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnEditarPerfil1.setText("Salir");
        BtnEditarPerfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarPerfil1ActionPerformed(evt);
            }
        });

        BtnMenuInicio.setBackground(new java.awt.Color(255, 254, 255));
        BtnMenuInicio.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnMenuInicio.setText("Menú inicio");
        BtnMenuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnMenuInicioMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/gestionar2.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/calendario.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cambiosysintomas.png"))); // NOI18N

        BtnDiagnostico.setBackground(new java.awt.Color(255, 254, 255));
        BtnDiagnostico.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnDiagnostico.setText("Diagnóstico");
        BtnDiagnostico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnDiagnosticoMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/Diagnostico.png"))); // NOI18N

        BtnPruebaEmbarazo.setBackground(new java.awt.Color(255, 254, 255));
        BtnPruebaEmbarazo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnPruebaEmbarazo.setText("Añadir fecha último periodo");
        BtnPruebaEmbarazo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnPruebaEmbarazoMousePressed(evt);
            }
        });
        BtnPruebaEmbarazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPruebaEmbarazoActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/calendario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnMenuInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEditarPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPruebaEmbarazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCicloMenstrual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnEditarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCambiosySintomas)))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCicloMenstrual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPruebaEmbarazo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnCambiosySintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditarPerfil1)
                    .addComponent(BtnMenuInicio))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEditarPerfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarPerfil1ActionPerformed
        ctrl.btnsalir();
    }//GEN-LAST:event_BtnEditarPerfil1ActionPerformed

    private void BtnCicloMenstrualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCicloMenstrualMousePressed
        ctrl.btnmenuusuaria_a_ciclomenstrual(BtnCicloMenstrual, this);
    }//GEN-LAST:event_BtnCicloMenstrualMousePressed

    private void BtnCambiosySintomasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCambiosySintomasMousePressed
        ctrl.btnmenuusuaria_a_sintomasycambios(BtnCambiosySintomas, this);
    }//GEN-LAST:event_BtnCambiosySintomasMousePressed

    private void BtnEditarPerfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarPerfilMousePressed
        ctrl.btnmenuusuaria_a_editarperfil(BtnEditarPerfil, this);
    }//GEN-LAST:event_BtnEditarPerfilMousePressed

    private void BtnMenuInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenuInicioMousePressed
        ctrl.btnmenuusuaria_a_menuinicio(BtnMenuInicio, this);
    }//GEN-LAST:event_BtnMenuInicioMousePressed

    private void BtnDiagnosticoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDiagnosticoMousePressed
        ctrl.btnmenuusuaria_a_diagnostico(BtnDiagnostico, this);
    }//GEN-LAST:event_BtnDiagnosticoMousePressed

    private void BtnPruebaEmbarazoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPruebaEmbarazoMousePressed
        ctrl.btnmenuusuaria_a_pruebaembazaro(this);
    }//GEN-LAST:event_BtnPruebaEmbarazoMousePressed

    private void BtnPruebaEmbarazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPruebaEmbarazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPruebaEmbarazoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCambiosySintomas;
    public javax.swing.JButton BtnCicloMenstrual;
    private javax.swing.JButton BtnDiagnostico;
    private javax.swing.JButton BtnEditarPerfil;
    private javax.swing.JButton BtnEditarPerfil1;
    private javax.swing.JButton BtnMenuInicio;
    private javax.swing.JButton BtnPruebaEmbarazo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
