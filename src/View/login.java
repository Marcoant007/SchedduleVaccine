/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author marco
 */
public class login extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        controller = new LoginController(this);
        Banco.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InputUsuario = new javax.swing.JTextField();
        InputSenha = new javax.swing.JPasswordField();
        ButtonEntrar = new javax.swing.JButton();
        TextLogin = new javax.swing.JLabel();
        TextSenha = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InputUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        InputUsuario.setForeground(new java.awt.Color(76, 203, 223));
        InputUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InputUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        InputUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(InputUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 340, 40));

        InputSenha.setForeground(new java.awt.Color(76, 203, 223));
        InputSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(InputSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 340, 40));

        ButtonEntrar.setBackground(new java.awt.Color(76, 203, 223));
        ButtonEntrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEntrar.setText("Entrar");
        ButtonEntrar.setBorder(null);
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 340, 50));

        TextLogin.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        TextLogin.setForeground(new java.awt.Color(76, 203, 223));
        TextLogin.setText("Login");
        getContentPane().add(TextLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        TextSenha.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TextSenha.setForeground(new java.awt.Color(76, 203, 223));
        TextSenha.setText("Senha:");
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 120, 30));

        TextUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TextUsuario.setForeground(new java.awt.Color(76, 203, 223));
        TextUsuario.setText("Usuário: ");
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 120, 30));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Logo_3.png"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 810, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUsuarioActionPerformed

    private void InputSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputSenhaActionPerformed

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
       this.controller.enterTheSystem();
        
    }//GEN-LAST:event_ButtonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JPasswordField InputSenha;
    private javax.swing.JTextField InputUsuario;
    private javax.swing.JLabel TextLogin;
    private javax.swing.JLabel TextSenha;
    private javax.swing.JLabel TextUsuario;
    private javax.swing.JLabel jLabelBackground;
    // End of variables declaration//GEN-END:variables

    public void openMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public JPasswordField getInputSenha() {
        return InputSenha;
    }

    public void setInputSenha(JPasswordField InputSenha) {
        this.InputSenha = InputSenha;
    }

    public JTextField getInputUsuario() {
        return InputUsuario;
    }

    public void setInputUsuario(JTextField InputUsuario) {
        this.InputUsuario = InputUsuario;
    }
    
    
}
