package vista;

import controlador.controlador;
import controlador.validaciones;

public class EditarDatosAcceso extends javax.swing.JFrame {
    
    controlador ctrl = new controlador();
    validaciones val = new validaciones();

    public EditarDatosAcceso() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnEditarDatosAcceso = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        pAnteriores = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TextUsuariaAnterior = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextContraseñaAnterior = new javax.swing.JPasswordField();
        CheckVerContraAnterior = new javax.swing.JCheckBox();
        pNuevos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TextUsuariaNuevo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextContraseñaNuevo = new javax.swing.JPasswordField();
        CheckVerContraNuevo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setBackground(new java.awt.Color(255, 165, 165));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VINMES");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EDITAR DATOS DE ACCESO");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        BtnEditarDatosAcceso.setBackground(new java.awt.Color(255, 254, 255));
        BtnEditarDatosAcceso.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnEditarDatosAcceso.setText("Editar");
        BtnEditarDatosAcceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEditarDatosAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarDatosAccesoActionPerformed(evt);
            }
        });

        BtnLimpiar.setBackground(new java.awt.Color(255, 254, 255));
        BtnLimpiar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnAtras.setBackground(new java.awt.Color(255, 254, 255));
        BtnAtras.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnAtras.setText("Atrás");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        pAnteriores.setBackground(new java.awt.Color(249, 185, 185));
        pAnteriores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Anteriores:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 16))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuaria:");
        jLabel2.setToolTipText("");

        TextUsuariaAnterior.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextUsuariaAnterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextUsuariaAnteriorKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña:");
        jLabel3.setToolTipText("");

        TextContraseñaAnterior.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextContraseñaAnterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextContraseñaAnteriorKeyTyped(evt);
            }
        });

        CheckVerContraAnterior.setBackground(new java.awt.Color(249, 185, 185));
        CheckVerContraAnterior.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CheckVerContraAnterior.setText("Ver");
        CheckVerContraAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckVerContraAnterior.setOpaque(true);
        CheckVerContraAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckVerContraAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pAnterioresLayout = new javax.swing.GroupLayout(pAnteriores);
        pAnteriores.setLayout(pAnterioresLayout);
        pAnterioresLayout.setHorizontalGroup(
            pAnterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAnterioresLayout.createSequentialGroup()
                .addGroup(pAnterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pAnterioresLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(TextContraseñaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckVerContraAnterior)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(pAnterioresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pAnterioresLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(TextUsuariaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pAnterioresLayout.setVerticalGroup(
            pAnterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAnterioresLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(TextUsuariaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(pAnterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextContraseñaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckVerContraAnterior))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pNuevos.setBackground(new java.awt.Color(249, 185, 185));
        pNuevos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 16))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Usuaria:");
        jLabel9.setToolTipText("");

        TextUsuariaNuevo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextUsuariaNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextUsuariaNuevoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Contraseña:");
        jLabel10.setToolTipText("");

        TextContraseñaNuevo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextContraseñaNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextContraseñaNuevoKeyTyped(evt);
            }
        });

        CheckVerContraNuevo.setBackground(new java.awt.Color(249, 185, 185));
        CheckVerContraNuevo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CheckVerContraNuevo.setText("Ver");
        CheckVerContraNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckVerContraNuevo.setOpaque(true);
        CheckVerContraNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckVerContraNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pNuevosLayout = new javax.swing.GroupLayout(pNuevos);
        pNuevos.setLayout(pNuevosLayout);
        pNuevosLayout.setHorizontalGroup(
            pNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNuevosLayout.createSequentialGroup()
                .addGroup(pNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pNuevosLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(TextContraseñaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckVerContraNuevo)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(pNuevosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pNuevosLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(TextUsuariaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pNuevosLayout.setVerticalGroup(
            pNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNuevosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(TextUsuariaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(pNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextContraseñaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckVerContraNuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(pNuevos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEditarDatosAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pAnteriores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pNuevos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnLimpiar)
                            .addComponent(BtnAtras))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnEditarDatosAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsuariaAnteriorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextUsuariaAnteriorKeyTyped
        val.ReglaN1(TextUsuariaAnterior, evt);
    }//GEN-LAST:event_TextUsuariaAnteriorKeyTyped

    private void BtnEditarDatosAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarDatosAccesoActionPerformed
        val.BtnValidacionEDA(BtnAtras, TextUsuariaAnterior, TextContraseñaAnterior, TextUsuariaNuevo, TextContraseñaNuevo);
    }//GEN-LAST:event_BtnEditarDatosAccesoActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        ctrl.btnlimpiareditardatosacceso(TextUsuariaAnterior, TextContraseñaAnterior, TextUsuariaNuevo, TextContraseñaNuevo);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void TextContraseñaAnteriorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextContraseñaAnteriorKeyTyped
        val.ReglaN5(TextContraseñaAnterior, evt);
    }//GEN-LAST:event_TextContraseñaAnteriorKeyTyped

    private void CheckVerContraAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckVerContraAnteriorActionPerformed
        val.VerContraseña(TextContraseñaAnterior, CheckVerContraAnterior);
    }//GEN-LAST:event_CheckVerContraAnteriorActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        ctrl.btneditardatosacceso_a_loginp(BtnAtras, this);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void TextUsuariaNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextUsuariaNuevoKeyTyped
        val.ReglaN1(TextUsuariaNuevo, evt);
    }//GEN-LAST:event_TextUsuariaNuevoKeyTyped

    private void TextContraseñaNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextContraseñaNuevoKeyTyped
        val.ReglaN5(TextContraseñaNuevo, evt);
    }//GEN-LAST:event_TextContraseñaNuevoKeyTyped

    private void CheckVerContraNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckVerContraNuevoActionPerformed
        val.VerContraseña(TextContraseñaNuevo, CheckVerContraNuevo);
    }//GEN-LAST:event_CheckVerContraNuevoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnEditarDatosAcceso;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JCheckBox CheckVerContra1;
    private javax.swing.JCheckBox CheckVerContraAnterior;
    private javax.swing.JCheckBox CheckVerContraNuevo;
    private javax.swing.JPasswordField TextContraseña1;
    private javax.swing.JPasswordField TextContraseñaAnterior;
    private javax.swing.JPasswordField TextContraseñaNuevo;
    private javax.swing.JTextField TextUsuaria1;
    private javax.swing.JTextField TextUsuariaAnterior;
    private javax.swing.JTextField TextUsuariaNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pAnteriores;
    private javax.swing.JPanel pNuevos;
    // End of variables declaration//GEN-END:variables
}
