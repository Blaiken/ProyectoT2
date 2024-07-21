package vista;
import controlador.controlador;

public class MenuInicio extends javax.swing.JFrame {
    
    controlador ctrl = new controlador();

    public MenuInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnGinecologa = new javax.swing.JButton();
        BtnCrearCuenta = new javax.swing.JButton();
        BtnPrivacidad = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnIniciarSesion = new javax.swing.JButton();
        BtnHistorial = new javax.swing.JButton();
        BtnCerrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 460));

        BtnGinecologa.setBackground(new java.awt.Color(255, 254, 255));
        BtnGinecologa.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnGinecologa.setText("Ginecóloga");
        BtnGinecologa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGinecologa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGinecologaActionPerformed(evt);
            }
        });

        BtnCrearCuenta.setBackground(new java.awt.Color(255, 254, 255));
        BtnCrearCuenta.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCrearCuenta.setText("Registrar estudiante");
        BtnCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearCuentaActionPerformed(evt);
            }
        });

        BtnPrivacidad.setBackground(new java.awt.Color(255, 254, 255));
        BtnPrivacidad.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnPrivacidad.setText("Privacidad");
        BtnPrivacidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPrivacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrivacidadActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(248, 180, 180));
        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENÚ INICIO");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);

        BtnIniciarSesion.setBackground(new java.awt.Color(255, 254, 255));
        BtnIniciarSesion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnIniciarSesion.setText("Gestionar perfil");
        BtnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarSesionActionPerformed(evt);
            }
        });

        BtnHistorial.setBackground(new java.awt.Color(255, 254, 255));
        BtnHistorial.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnHistorial.setText("Historial");
        BtnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistorialActionPerformed(evt);
            }
        });

        BtnCerrar1.setBackground(new java.awt.Color(255, 254, 255));
        BtnCerrar1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCerrar1.setText("Cerrar");
        BtnCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGinecologa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPrivacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnGinecologa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnPrivacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarSesionActionPerformed
        ctrl.btniniciarsesion(BtnIniciarSesion, this);
    }//GEN-LAST:event_BtnIniciarSesionActionPerformed

    private void BtnPrivacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrivacidadActionPerformed
        ctrl.btnprivacidad_a_confidencialidad(BtnPrivacidad, this);
    }//GEN-LAST:event_BtnPrivacidadActionPerformed

    private void BtnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearCuentaActionPerformed
        ctrl.btncrearcuenta(BtnCrearCuenta, this);
    }//GEN-LAST:event_BtnCrearCuentaActionPerformed

    private void BtnGinecologaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGinecologaActionPerformed
        ctrl.btnginecologa(BtnGinecologa, this);
    }//GEN-LAST:event_BtnGinecologaActionPerformed

    private void BtnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialActionPerformed
        ctrl.btnhistorial(BtnHistorial, this);
    }//GEN-LAST:event_BtnHistorialActionPerformed

    private void BtnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrar1ActionPerformed
        ctrl.btnsalir();
    }//GEN-LAST:event_BtnCerrar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar1;
    private javax.swing.JButton BtnCrearCuenta;
    private javax.swing.JButton BtnGinecologa;
    private javax.swing.JButton BtnHistorial;
    private javax.swing.JButton BtnIniciarSesion;
    private javax.swing.JButton BtnPrivacidad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
