
package com.mycompany.proyectox;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Registro extends javax.swing.JFrame {


    public Registro() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtRegistroNombre = new javax.swing.JTextField();
        txtRegistroApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRegistroTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRegistroUserHandle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRegistroEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre: ");

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido:");

        txtRegistroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefono:");

        jLabel4.setText("Nombre de usuario:");

        txtRegistroUserHandle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroUserHandleActionPerformed(evt);
            }
        });

        jLabel5.setText("E-mail:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRegistroNombre)
                    .addComponent(jButton1)
                    .addComponent(txtRegistroApellido)
                    .addComponent(txtRegistroTelefono)
                    .addComponent(txtRegistroUserHandle, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txtRegistroEmail))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRegistroUserHandle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRegistroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRegistroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRegistroApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRegistroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegistroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //String url = "jdbc:ucanaccess://C://Users//PC//Documentos//NetBeansProjects//TWITTER-X//X.accdb";
        String url = "jdbc:ucanaccess://C://Users//CCCU//Documents//NetBeansProjects//TWITTER-X//X.accdb";
        String usuario = ""; // Usuario de la base de datos, si es necesario
        String contraseña = ""; // Contraseña de la base de datos, si es necesario

        
        String userHandle = txtRegistroUserHandle.getText();
        String email = txtRegistroEmail.getText();
        String nombre = txtRegistroNombre.getText();
        String apellido = txtRegistroApellido.getText();
        String telefono = txtRegistroTelefono.getText();
        
         try (Connection con = DriverManager.getConnection(url, usuario, contraseña)) {
            // Sentencia SQL para insertar datos en la tabla "usuarios"
            String sql = "INSERT INTO usuarios (user_handle, email, nombre, apellido, telefono, creado_en) VALUES (?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                // Establecer los valores de los parámetros en la sentencia SQL
                pstmt.setString(1, userHandle);
                pstmt.setString(2, email);
                pstmt.setString(3, nombre);
                pstmt.setString(4, apellido);
                pstmt.setString(5, telefono);
                
                // Obtener la fecha y hora actuales del sistema
                 java.util.Date fechaActual = new java.util.Date();
                 java.sql.Date fechaSQL = new java.sql.Date(fechaActual.getTime());
        
                 // Establecer la fecha actual como valor para la columna de creado_en
                 pstmt.setDate(6, fechaSQL);
                
                // Ejecutar la sentencia SQL
                int filasInsertadas = pstmt.executeUpdate();
                
                // Comprobar si se insertaron filas
                if (filasInsertadas > 0) {
                    System.out.println("Se insertaron correctamente los datos en la tabla usuarios.");
                } else {
                    System.out.println("No se insertaron datos en la tabla usuarios.");
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
        
        /*try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO usuarios (user_handle, email,nombre,apellido,telefono) VALUES(?,?,?,?,?)");
            ps.setString(1,userHandle);
            ps.setString(2,email);
            ps.setString(3,nombre);
            ps.setString(4,apellido);
            ps.setString(5,telefono);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro guardado");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }*/
                
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRegistroUserHandleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroUserHandleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroUserHandleActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtRegistroApellido;
    private javax.swing.JTextField txtRegistroEmail;
    private javax.swing.JTextField txtRegistroNombre;
    private javax.swing.JTextField txtRegistroTelefono;
    private javax.swing.JTextField txtRegistroUserHandle;
    // End of variables declaration//GEN-END:variables
}
