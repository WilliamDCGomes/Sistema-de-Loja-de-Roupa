/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

/**
 *
 * @author Alunos
 */
public class Income extends javax.swing.JFrame {

    /**
     * Creates new form Income
     */
    public Income() {
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

        txtEnter = new javax.swing.JLabel();
        tableIncome = new javax.swing.JScrollPane();
        tableEnterCash = new javax.swing.JTable();
        inputStartDate = new javax.swing.JFormattedTextField();
        inputEndDate = new javax.swing.JFormattedTextField();
        buttonFilter = new javax.swing.JButton();
        txtSeparatorDate = new javax.swing.JLabel();
        outputBillType = new javax.swing.JComboBox<>();
        buttonShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrada no Caixa");
        setResizable(false);
        getContentPane().setLayout(null);

        txtEnter.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEnter.setText("ENTRADA");
        getContentPane().add(txtEnter);
        txtEnter.setBounds(280, 10, 140, 32);

        tableEnterCash.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descrição", "Data", "Valor", "Tipo"
            }
        ));
        tableIncome.setViewportView(tableEnterCash);

        getContentPane().add(tableIncome);
        tableIncome.setBounds(30, 110, 658, 340);

        try {
            inputStartDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputStartDate.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputStartDate);
        inputStartDate.setBounds(30, 60, 89, 30);

        try {
            inputEndDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputEndDate.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputEndDate);
        inputEndDate.setBounds(160, 60, 90, 30);

        buttonFilter.setText("FILTRAR");
        getContentPane().add(buttonFilter);
        buttonFilter.setBounds(430, 60, 80, 30);

        txtSeparatorDate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSeparatorDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSeparatorDate.setText("A");
        getContentPane().add(txtSeparatorDate);
        txtSeparatorDate.setBounds(110, 60, 50, 30);

        outputBillType.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        outputBillType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tudo", "Entrada", "Saída" }));
        getContentPane().add(outputBillType);
        outputBillType.setBounds(270, 60, 130, 30);

        buttonShow.setText("MOSTRAR");
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });
        getContentPane().add(buttonShow);
        buttonShow.setBounds(540, 60, 90, 30);

        setSize(new java.awt.Dimension(721, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        CashDrive cashDrive = new CashDrive();
        cashDrive.setVisible(true);
    }//GEN-LAST:event_buttonShowActionPerformed

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
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Income().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFilter;
    private javax.swing.JButton buttonShow;
    private javax.swing.JFormattedTextField inputEndDate;
    private javax.swing.JFormattedTextField inputStartDate;
    public static javax.swing.JComboBox<String> outputBillType;
    private javax.swing.JTable tableEnterCash;
    private javax.swing.JScrollPane tableIncome;
    public static javax.swing.JLabel txtEnter;
    private javax.swing.JLabel txtSeparatorDate;
    // End of variables declaration//GEN-END:variables
}
