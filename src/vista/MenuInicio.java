package vista;

import com.itextpdf.text.BadElementException;
import controlador.control_cs;
import controlador.controlador;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuInicio extends javax.swing.JFrame {
    
    controlador ctrl = new controlador();
    control_cs ccs = new control_cs();

    public MenuInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnCrearCuenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnIniciarSesion = new javax.swing.JButton();
        BtnHistorial = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();
        BtnGuiaGinecologa = new javax.swing.JButton();
        imgRegistrar = new javax.swing.JLabel();
        imgRegistrar2 = new javax.swing.JLabel();
        imgRegistrar3 = new javax.swing.JLabel();
        imgRegistrar4 = new javax.swing.JLabel();
        imgRegistrar5 = new javax.swing.JLabel();
        BtnCrearRespaldo = new javax.swing.JButton();
        imgRegistrar6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 460));

        BtnCrearCuenta.setBackground(new java.awt.Color(255, 254, 255));
        BtnCrearCuenta.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCrearCuenta.setText("Registrar estudiante");
        BtnCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnCrearCuentaMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(248, 180, 180));
        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("• MENÚ INICIO •");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);

        BtnIniciarSesion.setBackground(new java.awt.Color(255, 254, 255));
        BtnIniciarSesion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnIniciarSesion.setText("Gestionar perfil");
        BtnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnIniciarSesionMousePressed(evt);
            }
        });

        BtnHistorial.setBackground(new java.awt.Color(255, 254, 255));
        BtnHistorial.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnHistorial.setText("Historial");
        BtnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnHistorialMousePressed(evt);
            }
        });

        BtnCerrar.setBackground(new java.awt.Color(255, 254, 255));
        BtnCerrar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCerrar.setText("Cerrar");
        BtnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnCerrarMousePressed(evt);
            }
        });

        BtnGuiaGinecologa.setBackground(new java.awt.Color(255, 254, 255));
        BtnGuiaGinecologa.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnGuiaGinecologa.setText("Guía Ginecóloga");
        BtnGuiaGinecologa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuiaGinecologa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnGuiaGinecologaMousePressed(evt);
            }
        });

        imgRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/registrar.png"))); // NOI18N

        imgRegistrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/gestionar1.png"))); // NOI18N

        imgRegistrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/historial.png"))); // NOI18N

        imgRegistrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/guia.png"))); // NOI18N

        imgRegistrar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cerrar.png"))); // NOI18N

        BtnCrearRespaldo.setBackground(new java.awt.Color(255, 254, 255));
        BtnCrearRespaldo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCrearRespaldo.setText("Crear respaldo");
        BtnCrearRespaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCrearRespaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearRespaldoActionPerformed(evt);
            }
        });

        imgRegistrar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/gestionar2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(imgRegistrar5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(imgRegistrar6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnCrearRespaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(imgRegistrar2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(imgRegistrar4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BtnGuiaGinecologa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(imgRegistrar3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(imgRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgRegistrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnGuiaGinecologa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgRegistrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgRegistrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnCrearRespaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgRegistrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgRegistrar5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
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

    private void BtnCrearCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCrearCuentaMousePressed
        ctrl.btncrearcuenta(BtnCrearCuenta, this);
    }//GEN-LAST:event_BtnCrearCuentaMousePressed

    private void BtnIniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIniciarSesionMousePressed
        ctrl.btniniciarsesion(BtnIniciarSesion, this);
    }//GEN-LAST:event_BtnIniciarSesionMousePressed

    private void BtnGuiaGinecologaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuiaGinecologaMousePressed
        ctrl.guiaginecologa();
    }//GEN-LAST:event_BtnGuiaGinecologaMousePressed

    private void BtnHistorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHistorialMousePressed
        ctrl.btnhistorial(BtnHistorial, this);
    }//GEN-LAST:event_BtnHistorialMousePressed

    private void BtnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarMousePressed
        ctrl.btnmenuinicio_a_loginp(BtnCerrar, this);
    }//GEN-LAST:event_BtnCerrarMousePressed

    private void BtnCrearRespaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearRespaldoActionPerformed
        ccs.crearcopiabd();
    }//GEN-LAST:event_BtnCrearRespaldoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnCrearCuenta;
    private javax.swing.JButton BtnCrearRespaldo;
    private javax.swing.JButton BtnGuiaGinecologa;
    private javax.swing.JButton BtnHistorial;
    private javax.swing.JButton BtnIniciarSesion;
    private javax.swing.JLabel imgRegistrar;
    private javax.swing.JLabel imgRegistrar2;
    private javax.swing.JLabel imgRegistrar3;
    private javax.swing.JLabel imgRegistrar4;
    private javax.swing.JLabel imgRegistrar5;
    private javax.swing.JLabel imgRegistrar6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
