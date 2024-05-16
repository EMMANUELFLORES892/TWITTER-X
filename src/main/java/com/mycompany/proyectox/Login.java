/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectox;

import java.awt.*;
import static java.awt.Color.blue;
import static java.awt.Color.cyan;
import static java.awt.Color.gray;
import static java.awt.Color.white;
import javax.swing.JFrame;



/**
 *
 * @author CCCU
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        Imagenes Img = new Imagenes();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false); // Evitar que el usuario modifique el tamaño
            //setVisible(true);
       // setSize(425, 730);
            
            
        initComponents();
        
        this.setLocationRelativeTo(this);
        Img.SetImageLabel(logoX, "src/main/java/Imagenes_Login/X-Logo.png", 404, 236);
        //Img.SetImageButton(Boton_Google, "src/main/java/Imagenes_Login/l_google_mini.png");
        //ImageButtonUtil.addImageToButton(Boton_Google, "src/main/java/Imagenes_Login/l_google_mini.png", 32, 31);
        
        getContentPane().setBackground(Color.WHITE);
        
        this.boton_google.setBackground(blue);
        this.Boton_Apple.setBackground(white);
        
        BotonRedondo.hacerRedondeado(boton_google, 30,white,gray);
        BotonRedondo.hacerRedondeado(Boton_Apple, 30,white,gray);
        //BotonRedondo.hacerRedondeado(cuenta, 30, cuenta.getBackground(),gray);
        
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoX = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Boton_Apple = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Sesion = new javax.swing.JButton();
        boton_google = new javax.swing.JButton();
        cuenta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        logoX.setText(".");
        logoX.setPreferredSize(new java.awt.Dimension(384, 216));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setText("<html>\nLo que esta <br>\npasando ahora\n");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("Unete Hoy");

        Boton_Apple.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Boton_Apple.setText("Registrarse con Apple");
        Boton_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AppleActionPerformed(evt);
            }
        });

        jLabel3.setText("<html>\nAl registrarte, aceptas los <font color= \"rgb(51, 153, 255)\">Términos de servicio</font> y la <font color= \"rgb(51, 153, 255)\">Política <br>\nde privacidad</font>, incluida la <font color= \"rgb(51, 153, 255)\">política de Uso de Cookies</font>.");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("¿Ya tienes cuenta?");

        Sesion.setBackground(new java.awt.Color(51, 204, 255));
        Sesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        Sesion.setForeground(new java.awt.Color(255, 255, 255));
        Sesion.setText("Iniciar Sesión");
        Sesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Sesion.setBorderPainted(false);
        Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SesionActionPerformed(evt);
            }
        });

        boton_google.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        boton_google.setText("Registrarse con Google");
        boton_google.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_googleActionPerformed(evt);
            }
        });

        cuenta.setBackground(new java.awt.Color(0, 204, 255));
        cuenta.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        cuenta.setForeground(new java.awt.Color(255, 255, 255));
        cuenta.setText("Crear Cuenta");
        cuenta.setBorder(null);
        cuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoX, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(boton_google, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Apple, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoX, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_google, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Apple, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AppleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_AppleActionPerformed

    private void SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SesionActionPerformed
        // TODO add your handling code here:
        this.dispose();
    
    // Crear una nueva instancia del JFrame que deseas abrir
    IniciaSesion frame = new IniciaSesion();
    frame.setVisible(true);
    }//GEN-LAST:event_SesionActionPerformed

    private void boton_googleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_googleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_googleActionPerformed

    private void cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuentaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Apple;
    private javax.swing.JButton Sesion;
    public javax.swing.JButton boton_google;
    private javax.swing.JButton cuenta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoX;
    // End of variables declaration//GEN-END:variables
}
