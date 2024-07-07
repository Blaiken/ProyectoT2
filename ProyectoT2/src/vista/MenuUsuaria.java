package vista;

import controlador.controlador;

public class MenuUsuaria extends javax.swing.JFrame {
    
    controlador ctrl = new controlador();

    public MenuUsuaria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnCicloMenstrual = new javax.swing.JButton();
        BtnCambiosySintomas = new javax.swing.JButton();
        BtnGinecologa = new javax.swing.JButton();
        BtnHistorial = new javax.swing.JButton();
        BtnEditarPerfil = new javax.swing.JButton();
        BtnEditarPerfil1 = new javax.swing.JButton();
        BtnMenuInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(248, 180, 180));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENÚ DE USUARIA");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(2, 2, 2)));
        jLabel1.setOpaque(true);

        BtnCicloMenstrual.setBackground(new java.awt.Color(255, 254, 255));
        BtnCicloMenstrual.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCicloMenstrual.setText("Ciclo Menstrual");
        BtnCicloMenstrual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCicloMenstrualActionPerformed(evt);
            }
        });

        BtnCambiosySintomas.setBackground(new java.awt.Color(255, 254, 255));
        BtnCambiosySintomas.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCambiosySintomas.setText("Cambios y Sintomas");
        BtnCambiosySintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambiosySintomasActionPerformed(evt);
            }
        });

        BtnGinecologa.setBackground(new java.awt.Color(255, 254, 255));
        BtnGinecologa.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnGinecologa.setText("Ginecóloga");
        BtnGinecologa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGinecologaActionPerformed(evt);
            }
        });

        BtnHistorial.setBackground(new java.awt.Color(255, 254, 255));
        BtnHistorial.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnHistorial.setText("Historial");
        BtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistorialActionPerformed(evt);
            }
        });

        BtnEditarPerfil.setBackground(new java.awt.Color(255, 254, 255));
        BtnEditarPerfil.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnEditarPerfil.setText("Editar perfil");
        BtnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarPerfilActionPerformed(evt);
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
        BtnMenuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGinecologa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCambiosySintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCicloMenstrual, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnMenuInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnEditarPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCicloMenstrual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCambiosySintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGinecologa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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
        ctrl.salir();
    }//GEN-LAST:event_BtnEditarPerfil1ActionPerformed

    private void BtnCicloMenstrualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCicloMenstrualActionPerformed
        ctrl.btnmenuusuaria_a_ciclomenstrual(BtnCicloMenstrual, this);
    }//GEN-LAST:event_BtnCicloMenstrualActionPerformed

    private void BtnCambiosySintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambiosySintomasActionPerformed
        ctrl.btnmenuusuaria_a_sintomasycambios(BtnCambiosySintomas, this);
    }//GEN-LAST:event_BtnCambiosySintomasActionPerformed

    private void BtnGinecologaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGinecologaActionPerformed
        ctrl.btnmenuusuaria_a_ginecologa(BtnGinecologa, this);
    }//GEN-LAST:event_BtnGinecologaActionPerformed

    private void BtnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialActionPerformed
        ctrl.btnmenuusuaria_a_historial(BtnHistorial, this);
    }//GEN-LAST:event_BtnHistorialActionPerformed

    private void BtnMenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuInicioActionPerformed
        ctrl.btnmenuusuaria_a_menuinicio(BtnMenuInicio, this);
    }//GEN-LAST:event_BtnMenuInicioActionPerformed

    private void BtnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarPerfilActionPerformed
        ctrl.btnmenuusuaria_a_editarperfil(BtnEditarPerfil, this);
    }//GEN-LAST:event_BtnEditarPerfilActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCambiosySintomas;
    private javax.swing.JButton BtnCicloMenstrual;
    private javax.swing.JButton BtnEditarPerfil;
    private javax.swing.JButton BtnEditarPerfil1;
    private javax.swing.JButton BtnGinecologa;
    private javax.swing.JButton BtnHistorial;
    private javax.swing.JButton BtnMenuInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
