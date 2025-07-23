package vista;

import controlador.control_ec;
import controlador.controlador;

public class EnviarCorreo extends javax.swing.JFrame {
    
    controlador ctrl = new controlador();
    control_ec cec = new control_ec();

    public EnviarCorreo() {
        initComponents();
        LblCedula.setText(ctrl.cedula);
        cec.MostrarCorreo(LblCedula, TextCorreo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LblArchivoSeleccionado = new javax.swing.JLabel();
        TextCorreo = new javax.swing.JTextField();
        BtnSeleccionar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnEnviar = new javax.swing.JButton();
        BtnSeleccionar2 = new javax.swing.JButton();
        LblCedula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setBackground(new java.awt.Color(248, 180, 180));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("• ENVIAR AL CORREO •");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);

        LblArchivoSeleccionado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LblArchivoSeleccionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblArchivoSeleccionado.setText("Ninguno seleccionado...");

        TextCorreo.setEditable(false);
        TextCorreo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        BtnSeleccionar.setBackground(new java.awt.Color(255, 254, 255));
        BtnSeleccionar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnSeleccionar.setText("Selecciona el diágnostico");
        BtnSeleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSeleccionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Correo electrónico:");

        BtnEnviar.setBackground(new java.awt.Color(255, 254, 255));
        BtnEnviar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnEnviar.setText("Enviar");
        BtnEnviar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEnviar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarActionPerformed(evt);
            }
        });

        BtnSeleccionar2.setBackground(new java.awt.Color(255, 254, 255));
        BtnSeleccionar2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnSeleccionar2.setText("Volver");
        BtnSeleccionar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSeleccionar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSeleccionar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnSeleccionar2MousePressed(evt);
            }
        });

        LblCedula.setForeground(new java.awt.Color(255, 204, 204));
        LblCedula.setText("Cedula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblArchivoSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(BtnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(BtnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(BtnSeleccionar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LblCedula)
                        .addGap(127, 127, 127))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(LblCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnSeleccionar)
                .addGap(18, 18, 18)
                .addComponent(LblArchivoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(BtnEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSeleccionar2)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel3)
                    .addContainerGap(210, Short.MAX_VALUE)))
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

    private void BtnSeleccionar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSeleccionar2MousePressed
        ctrl.btnenviarcorreo_a_diagnostico(this);
    }//GEN-LAST:event_BtnSeleccionar2MousePressed

    private void BtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarActionPerformed
        ctrl.btnmostrararchivo(LblArchivoSeleccionado, this);
    }//GEN-LAST:event_BtnSeleccionarActionPerformed

    private void BtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarActionPerformed
        ctrl.btncompartir(TextCorreo, LblCedula);
    }//GEN-LAST:event_BtnEnviarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEnviar;
    private javax.swing.JButton BtnSeleccionar;
    private javax.swing.JButton BtnSeleccionar2;
    private javax.swing.JLabel LblArchivoSeleccionado;
    private javax.swing.JLabel LblCedula;
    public javax.swing.JTextField TextCorreo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
