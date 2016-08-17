/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jhonatan
 */
public class DESVew extends javax.swing.JFrame {

    private Boolean opcionMetodo = true;
    private Boolean opcionTipo = true;

    public void limpiar() {
        txt1.setText("");
        txt2.setText("");
       // txtClave.setText("");
    }

    public void cambiarLabel() {
        if (opcionTipo) {
            lbl1.setText("Ingrese el texto que desea encriptar");
            lbl2.setText("Texto cifrado");
        } else {
            lbl1.setText("Ingrese el texto cifrado que desea desencriptar");
            lbl2.setText("Texto desencriptado");
        }
    }

    public DESVew(Menu menu) {
        initComponents();
        cambiarLabel();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grbtnMetodo = new javax.swing.ButtonGroup();
        grbtnTipo = new javax.swing.ButtonGroup();
        txtClave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtnDES = new javax.swing.JRadioButton();
        rbtn3DES = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rbtnEncriptar = new javax.swing.JRadioButton();
        rbtnDesencriptar = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextArea();
        btnAtras = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtClave.setText("IHCkrmhA9Gs");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Encriptación y desencriptacion con metodo DES y 3DES");

        grbtnMetodo.add(rbtnDES);
        rbtnDES.setSelected(true);
        rbtnDES.setText("Metodo DES");
        rbtnDES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDESActionPerformed(evt);
            }
        });

        grbtnMetodo.add(rbtn3DES);
        rbtn3DES.setText("Metodo 3DES");
        rbtn3DES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn3DESActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnDES)
                    .addComponent(rbtn3DES))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(rbtnDES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn3DES)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        grbtnTipo.add(rbtnEncriptar);
        rbtnEncriptar.setSelected(true);
        rbtnEncriptar.setText("Encriptar");
        rbtnEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEncriptarActionPerformed(evt);
            }
        });

        grbtnTipo.add(rbtnDesencriptar);
        rbtnDesencriptar.setText("Desencriptar");
        rbtnDesencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDesencriptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnEncriptar)
                    .addComponent(rbtnDesencriptar))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnEncriptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnDesencriptar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        txt1.setColumns(20);
        txt1.setRows(5);
        jScrollPane1.setViewportView(txt1);

        txt2.setEditable(false);
        txt2.setColumns(20);
        txt2.setRows(5);
        jScrollPane2.setViewportView(txt2);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lbl1.setText("jLabel2");

        jLabel3.setText("Ingrese la clave");

        lbl2.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(txtClave))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEjecutar)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1)
                            .addComponent(lbl2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEjecutar)
                            .addComponent(btnLimpiar))))
                .addGap(18, 18, 18)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ejecutar(String key, String texto) {
        Metodos metodo = new Metodos();
        int accion;
        if (opcionTipo) {
                accion = 2;
            } else {
                accion = 1;
            }
        if (opcionMetodo) {   
            try {
                texto = metodo.procesoDES(accion, key, texto);
                
            } catch (Exception ex) {
                Logger.getLogger(DESVew.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            try {
                texto = metodo.procesoTresDES(key, accion, texto);       
            } catch (Exception ex) {
                Logger.getLogger(DESVew.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        txt2.setText(texto);

    }

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:
        if (!txtClave.equals("") && !txt1.equals("")) {
            String key = txtClave.getText();
            String texto = txt1.getText();
            ejecutar(key, texto);
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void rbtnDESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDESActionPerformed
        // TODO add your handling code here:
        opcionMetodo = true;
        cambiarLabel();
    }//GEN-LAST:event_rbtnDESActionPerformed

    private void rbtn3DESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn3DESActionPerformed
        // TODO add your handling code here:
        opcionMetodo = false;
        cambiarLabel();
    }//GEN-LAST:event_rbtn3DESActionPerformed

    private void rbtnEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEncriptarActionPerformed
        // TODO add your handling code here:
        opcionTipo = true;
    }//GEN-LAST:event_rbtnEncriptarActionPerformed

    private void rbtnDesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDesencriptarActionPerformed
        // TODO add your handling code here:
        opcionTipo = false;
    }//GEN-LAST:event_rbtnDesencriptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup grbtnMetodo;
    private javax.swing.ButtonGroup grbtnTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JRadioButton rbtn3DES;
    private javax.swing.JRadioButton rbtnDES;
    private javax.swing.JRadioButton rbtnDesencriptar;
    private javax.swing.JRadioButton rbtnEncriptar;
    private javax.swing.JTextArea txt1;
    private javax.swing.JTextArea txt2;
    private javax.swing.JTextField txtClave;
    // End of variables declaration//GEN-END:variables
}
