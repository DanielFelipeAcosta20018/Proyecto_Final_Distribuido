/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sistema_distribuido;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class FormularioRegistro extends javax.swing.JFrame {
 private int control = 0;
    /**
     * Creates new form FormularioRegistro
     */
    public FormularioRegistro() {
        initComponents();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoEstu = new javax.swing.JTextField();
        txtNombreEst = new javax.swing.JTextField();
        txtTelefonoEstu = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        cmbRegion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        Calcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Bienvenido a Corhuila ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 310, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Codigo Estudiante");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 60, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 80, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Usuario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 60, -1));

        txtCodigoEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEstuActionPerformed(evt);
            }
        });
        txtCodigoEstu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoEstuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoEstuKeyTyped(evt);
            }
        });
        getContentPane().add(txtCodigoEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 200, -1));

        txtNombreEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEstActionPerformed(evt);
            }
        });
        txtNombreEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreEstKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEstKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 200, -1));

        txtTelefonoEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEstuActionPerformed(evt);
            }
        });
        txtTelefonoEstu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoEstuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEstuKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefonoEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 200, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 200, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, -1));

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 200, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contraseña");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 110, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 110, 60));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6645.jpg"))); // NOI18N
        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 150, 60));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recyclebin-vacio-icono-9473-32.png"))); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setMaximumSize(new java.awt.Dimension(126, 44));
        jButton3.setMinimumSize(new java.awt.Dimension(126, 44));
        jButton3.setPreferredSize(new java.awt.Dimension(126, 44));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 140, 60));

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Limpiar ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 110, 60));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ciudad ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 70, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Region ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 220, 60, -1));

        cmbCiudad.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbCiudad.setForeground(new java.awt.Color(0, 0, 0));
        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Selecione-----", "Bogota", "Cartagena ", "Neiva", "Santa Marta", "Medellin", "Cucuta", "Cali ", "Bucaramanga", "Villavicencion " }));
        getContentPane().add(cmbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 200, -1));

        cmbRegion.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbRegion.setForeground(new java.awt.Color(0, 0, 0));
        cmbRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Seleccione----", "Region Amazonia ", "Region Caribe", "Region Insular", "Region Orinoquia ", "Region Pacifico" }));
        getContentPane().add(cmbRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, -1));

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblRegistros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 380, 90));

        Calcular.setBackground(new java.awt.Color(0, 153, 153));
        Calcular.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Calcular.setForeground(new java.awt.Color(0, 0, 0));
        Calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir-de-mi-perfil-icono-3964-48.png"))); // NOI18N
        Calcular.setText("Salir");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 140, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newComplex1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       //  objMySQL.conexion();
        
        // Creo el modelo para del JTable
        DefaultTableModel modelo = (DefaultTableModel) tblRegistros.getModel();
        // Defino un vector para el cargue del JTable
        String vector[] = new String[6];
               
        // Limpio el JTable antes del cargue
        modelo.setColumnCount(0);
        modelo.setNumRows(0);
        
        // Cargo las columnas de titulo al Jtable
        modelo.addColumn("CÓDIGO");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("CORREO ELECTRONICO");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Region");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("ESTADO");
        
        
     
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        txtCodigoEstu.setText(null);
        txtNombreEst.setText(null);
        txtTelefonoEstu.setText(null);
        txtEmail.setText(null);
        txtUsuario.setText(null);
        txtContraseña.setText(null);
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNombreEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstKeyTyped
        // TODO add your handling code here:
   
        char  validar = evt.getKeyChar();
    if(Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();

        JOptionPane.showMessageDialog(rootPane,"Ingresa tu nombre");
}
    }//GEN-LAST:event_txtNombreEstKeyTyped

    private void txtCodigoEstuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEstuKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume(); {
        
        }                               
    char validar=evt.getKeyChar();
    if(Character.isLetter(validar)){
    getToolkit().beep();
    evt.consume();
    JOptionPane.showMessageDialog(rootPane,"Ingrensar su codigo");
            }
        
    }//GEN-LAST:event_txtCodigoEstuKeyTyped

    private void txtTelefonoEstuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEstuKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume(); {
        
        }      
        
         char validar=evt.getKeyChar();
    if(Character.isLetter(validar)){
    getToolkit().beep();
    evt.consume();
    JOptionPane.showMessageDialog(rootPane,"Ingrensar su numero ");
        }
    }//GEN-LAST:event_txtTelefonoEstuKeyTyped

    private void txtCodigoEstuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEstuKeyPressed
        // TODO add your handling code here:
   
       
    }//GEN-LAST:event_txtCodigoEstuKeyPressed

    private void txtNombreEstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstKeyPressed
        // TODO add your handling code here:
           if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        txtTelefonoEstu.requestFocus();
        txtTelefonoEstu.setBackground(Color.yellow);
        txtTelefonoEstu.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_txtNombreEstKeyPressed

    private void txtTelefonoEstuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEstuKeyPressed
        // TODO add your handling code here:
           if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        txtCodigoEstu.requestFocus();
        txtCodigoEstu.setBackground(Color.yellow);
        txtCodigoEstu.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_txtTelefonoEstuKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
           if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        txtEmail.requestFocus();
        txtEmail.setBackground(Color.yellow);
        txtEmail.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
           if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        txtUsuario.requestFocus();
        txtUsuario.setBackground(Color.yellow);
        txtUsuario.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtCodigoEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEstuActionPerformed
        // TODO add your handling code here:
          txtCodigoEstu.transferFocus();
    }//GEN-LAST:event_txtCodigoEstuActionPerformed

    private void txtNombreEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEstActionPerformed
        // TODO add your handling code here:
          txtNombreEst.transferFocus();
    }//GEN-LAST:event_txtNombreEstActionPerformed

    private void txtTelefonoEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEstuActionPerformed
        // TODO add your handling code here:
          txtTelefonoEstu.transferFocus();
    }//GEN-LAST:event_txtTelefonoEstuActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
          txtUsuario.transferFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
          txtContraseña.transferFocus();
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (txtCodigoEstu.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite Cedula ");
            txtCodigoEstu.requestFocus();
            return;

        }
        if (txtNombreEst.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite Nombre ");
            txtNombreEst.requestFocus();
            return;

        }
        if (txtTelefonoEstu.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite cantidad ");
            txtTelefonoEstu.requestFocus();
            return;

        }
        if (txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite cantidad ");
            txtEmail.requestFocus();
            return;

        }
        if (cmbCiudad.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"selecione un producto ");
            cmbCiudad.requestFocus();
            return;
        }
        if (cmbRegion.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"selecione un producto ");
            cmbRegion.requestFocus();
            return;
        }
        
        if (txtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite cantidad ");
            txtEmail.requestFocus();
            return;

        }
        if (txtContraseña.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite cantidad ");
            txtEmail.requestFocus();
            return;

        }
        
        DefaultTableModel modelo =(DefaultTableModel) tblRegistros.getModel();
        if(control == 0){
            modelo.addColumn("Codigo");
            modelo.addColumn(" Nombre");
            modelo.addColumn(" Telefono ");
            modelo.addColumn("Email ");
            modelo.addColumn(" Ciudad ");
            modelo.addColumn(" Region ");
            modelo.addColumn("Usuario ");
            modelo.addColumn("Contraseña");
            modelo.addColumn(" Estado ");

            control = control + 1;
        }
        //Carga las filas
        String vector[] = new String[5];
        vector[0] = txtCodigoEstu.getText();
        vector[1] = txtNombreEst.getText();
        vector[2] = txtTelefonoEstu.getText();
        vector[3] = txtEmail.getText();
        vector[4] = (String) cmbCiudad.getSelectedItem();
        vector[5] = (String) cmbRegion.getSelectedItem();
        vector[6] = txtUsuario.getText();
        vector[7] = txtContraseña.getText();
        
        modelo.addRow(vector);
        
        
        // *** Limpio los Campos ***   
        txtCodigoEstu.setText("");
        txtNombreEst.setText("");
        txtTelefonoEstu.setText("");
        txtEmail.setText("");
        cmbCiudad.setSelectedIndex(0);
        cmbRegion.setSelectedIndex(0);
        txtUsuario.setText("");
        txtContraseña.setText("");
        txtCodigoEstu.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         int elementoEliminar = tblRegistros.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblRegistros.getModel();

        modelo.removeRow(elementoEliminar);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CalcularActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbRegion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTextField txtCodigoEstu;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreEst;
    private javax.swing.JTextField txtTelefonoEstu;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
