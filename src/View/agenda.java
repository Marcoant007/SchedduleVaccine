/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author marco
 */
public class agenda extends javax.swing.JFrame {

    /**
     * Creates new form agenda
     */
    public agenda() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LabelId = new javax.swing.JLabel();
        LabelCliente = new javax.swing.JLabel();
        ComboBoxUsuario = new javax.swing.JComboBox<>();
        LabelVacina = new javax.swing.JLabel();
        ComboBoxVacina = new javax.swing.JComboBox<>();
        LabelValor = new javax.swing.JLabel();
        InputIValor = new javax.swing.JTextField();
        LabelData = new javax.swing.JLabel();
        InputIData = new javax.swing.JTextField();
        LabelHora = new javax.swing.JLabel();
        InputIHora = new javax.swing.JTextField();
        LabelObservacao = new javax.swing.JLabel();
        TextAreaObservacao = new javax.swing.JTextField();
        InputObservação = new javax.swing.JTextField();
        ButtonAgendar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(34, 145, 222));
        jTable1.setBorder(null);
        jTable1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(254, 254, 254));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Marco", "Pfizer", "0", "19/11/2021", "17:27", "1- Dose"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Paciente", "Vacina", "Valor Dose", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 568, 1170, 360));

        LabelId.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LabelId.setForeground(new java.awt.Color(53, 53, 53));
        LabelId.setText("Id:");
        getContentPane().add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        LabelCliente.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LabelCliente.setForeground(new java.awt.Color(53, 53, 53));
        LabelCliente.setText("Paciente:");
        getContentPane().add(LabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        ComboBoxUsuario.setEditable(true);
        ComboBoxUsuario.setForeground(new java.awt.Color(76, 203, 223));
        ComboBoxUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alan", "Marco", "Karol", " " }));
        ComboBoxUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 280, 30));

        LabelVacina.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LabelVacina.setForeground(new java.awt.Color(53, 53, 53));
        LabelVacina.setText("Vacina:");
        getContentPane().add(LabelVacina, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        ComboBoxVacina.setEditable(true);
        ComboBoxVacina.setForeground(new java.awt.Color(76, 203, 223));
        ComboBoxVacina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dengue", "PFizer", "CoronaVac", " " }));
        ComboBoxVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxVacinaActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxVacina, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 280, 30));

        LabelValor.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LabelValor.setForeground(new java.awt.Color(53, 53, 53));
        LabelValor.setText("Valor:");
        getContentPane().add(LabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));
        getContentPane().add(InputIValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 280, 30));

        LabelData.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LabelData.setForeground(new java.awt.Color(53, 53, 53));
        LabelData.setText("Data:");
        getContentPane().add(LabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));
        getContentPane().add(InputIData, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 280, 30));

        LabelHora.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LabelHora.setForeground(new java.awt.Color(53, 53, 53));
        LabelHora.setText("Hora:");
        getContentPane().add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        InputIHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIHoraActionPerformed(evt);
            }
        });
        getContentPane().add(InputIHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 280, 30));

        LabelObservacao.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LabelObservacao.setForeground(new java.awt.Color(53, 53, 53));
        LabelObservacao.setText("Observações : ");
        getContentPane().add(LabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        TextAreaObservacao.setText("jTextField1");
        getContentPane().add(TextAreaObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 140, 530, 310));
        getContentPane().add(InputObservação, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 280, 30));

        ButtonAgendar.setBackground(new java.awt.Color(34, 145, 222));
        ButtonAgendar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        ButtonAgendar.setForeground(new java.awt.Color(254, 254, 254));
        ButtonAgendar.setText("Agendar Vacina");
        ButtonAgendar.setToolTipText("");
        getContentPane().add(ButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 530, 50));

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/AgendaFundoo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxUsuarioActionPerformed

    private void ComboBoxVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxVacinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxVacinaActionPerformed

    private void InputIHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputIHoraActionPerformed

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
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgendar;
    private javax.swing.JComboBox<String> ComboBoxUsuario;
    private javax.swing.JComboBox<String> ComboBoxVacina;
    private javax.swing.JTextField InputIData;
    private javax.swing.JTextField InputIHora;
    private javax.swing.JTextField InputIValor;
    private javax.swing.JTextField InputObservação;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelObservacao;
    private javax.swing.JLabel LabelVacina;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JTextField TextAreaObservacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
