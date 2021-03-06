/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import functioncontroller.FirstDayOfMonth;
import functioncontroller.GetDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class CommissionScreen extends javax.swing.JFrame {
    int x = 0;
    int x2 = 0;
    /**
     * Creates new form CommissionScreen
     */
    public CommissionScreen() {
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

        txtCommissionControl = new javax.swing.JLabel();
        inputFirstDateFilter = new javax.swing.JTextField();
        txtSeparatorDate = new javax.swing.JLabel();
        inputSecondDateFilter = new javax.swing.JTextField();
        txtPeriod = new javax.swing.JLabel();
        txtPercentageOfCommission = new javax.swing.JLabel();
        outputPercentageOfCommission = new javax.swing.JTextField();
        txtSales = new javax.swing.JLabel();
        buttonShow = new javax.swing.JButton();
        outputCommission = new javax.swing.JLabel();
        txtSalesAmount = new javax.swing.JLabel();
        outputSalesAmount = new javax.swing.JLabel();
        txtCommission = new javax.swing.JLabel();
        buttonAltern = new javax.swing.JButton();
        tableCommissionScreen = new javax.swing.JScrollPane();
        tableSales = new javax.swing.JTable();
        inputCPFEmployee = new javax.swing.JTextField();
        inputCodeEmployee = new javax.swing.JTextField();
        buttonLocale = new javax.swing.JButton();
        buttonPrinter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Comissão");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        txtCommissionControl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtCommissionControl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCommissionControl.setText("CONTROLE DE COMISSÃO");
        getContentPane().add(txtCommissionControl);
        txtCommissionControl.setBounds(170, 20, 360, 32);

        inputFirstDateFilter.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        inputFirstDateFilter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputFirstDateFilterFocusGained(evt);
            }
        });
        getContentPane().add(inputFirstDateFilter);
        inputFirstDateFilter.setBounds(20, 160, 100, 30);

        txtSeparatorDate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSeparatorDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSeparatorDate.setText("A");
        getContentPane().add(txtSeparatorDate);
        txtSeparatorDate.setBounds(120, 160, 40, 30);

        inputSecondDateFilter.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        inputSecondDateFilter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputSecondDateFilterFocusGained(evt);
            }
        });
        getContentPane().add(inputSecondDateFilter);
        inputSecondDateFilter.setBounds(160, 160, 100, 30);

        txtPeriod.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtPeriod.setText("Período");
        getContentPane().add(txtPeriod);
        txtPeriod.setBounds(20, 130, 80, 20);

        txtPercentageOfCommission.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtPercentageOfCommission.setText("Porcentagem da Comissão");
        getContentPane().add(txtPercentageOfCommission);
        txtPercentageOfCommission.setBounds(390, 130, 210, 20);

        outputPercentageOfCommission.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(outputPercentageOfCommission);
        outputPercentageOfCommission.setBounds(390, 160, 100, 30);

        txtSales.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtSales.setText("Vendas");
        getContentPane().add(txtSales);
        txtSales.setBounds(20, 220, 60, 20);

        buttonShow.setText("MOSTRAR");
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });
        getContentPane().add(buttonShow);
        buttonShow.setBounds(20, 480, 110, 32);

        outputCommission.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        outputCommission.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        outputCommission.setText("0,00");
        getContentPane().add(outputCommission);
        outputCommission.setBounds(580, 450, 110, 20);

        txtSalesAmount.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtSalesAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSalesAmount.setText("Total de Venda");
        getContentPane().add(txtSalesAmount);
        txtSalesAmount.setBounds(570, 350, 120, 20);

        outputSalesAmount.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        outputSalesAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        outputSalesAmount.setText("0,00");
        getContentPane().add(outputSalesAmount);
        outputSalesAmount.setBounds(580, 380, 110, 20);

        txtCommission.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtCommission.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtCommission.setText("Comissão");
        getContentPane().add(txtCommission);
        txtCommission.setBounds(560, 420, 130, 20);

        buttonAltern.setText("ALTERAR");
        buttonAltern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlternActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAltern);
        buttonAltern.setBounds(510, 160, 100, 32);

        tableSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código da Venda", "Valor", "Data", "Forma de Pagamento"
            }
        ));
        tableCommissionScreen.setViewportView(tableSales);

        getContentPane().add(tableCommissionScreen);
        tableCommissionScreen.setBounds(20, 250, 540, 220);

        inputCPFEmployee.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        inputCPFEmployee.setText("CPF DO FUNCIONÁRIO");
        inputCPFEmployee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCPFEmployeeFocusGained(evt);
            }
        });
        inputCPFEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputCPFEmployeeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputCPFEmployeeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCPFEmployeeKeyTyped(evt);
            }
        });
        getContentPane().add(inputCPFEmployee);
        inputCPFEmployee.setBounds(310, 80, 256, 30);

        inputCodeEmployee.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        inputCodeEmployee.setText("CÓDIGO DO FUNCIONÁRIO");
        inputCodeEmployee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCodeEmployeeFocusGained(evt);
            }
        });
        inputCodeEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputCodeEmployeeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputCodeEmployeeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCodeEmployeeKeyTyped(evt);
            }
        });
        getContentPane().add(inputCodeEmployee);
        inputCodeEmployee.setBounds(20, 80, 256, 30);

        buttonLocale.setText("LOCALIZAR");
        getContentPane().add(buttonLocale);
        buttonLocale.setBounds(590, 80, 100, 32);

        buttonPrinter.setText("IMPRIMIR");
        getContentPane().add(buttonPrinter);
        buttonPrinter.setBounds(170, 480, 90, 32);

        setSize(new java.awt.Dimension(718, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputFirstDateFilterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputFirstDateFilterFocusGained
        inputFirstDateFilter.selectAll();
    }//GEN-LAST:event_inputFirstDateFilterFocusGained

    private void inputSecondDateFilterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputSecondDateFilterFocusGained
        inputSecondDateFilter.selectAll();
    }//GEN-LAST:event_inputSecondDateFilterFocusGained

    private void inputCPFEmployeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCPFEmployeeFocusGained
        inputCPFEmployee.selectAll();
    }//GEN-LAST:event_inputCPFEmployeeFocusGained

    private void inputCPFEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCPFEmployeeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCPFEmployeeKeyPressed

    private void inputCPFEmployeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCPFEmployeeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCPFEmployeeKeyReleased

    private void inputCPFEmployeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCPFEmployeeKeyTyped
        if(inputCPFEmployee.getText().equals("")){
            inputCPFEmployee.setText("CPF DO FUNCIONÁRIO");
            x=0;
        }
        else if(x==0){
            x++;
            inputCPFEmployee.setText("");
        }
    }//GEN-LAST:event_inputCPFEmployeeKeyTyped

    private void inputCodeEmployeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodeEmployeeFocusGained
        inputCodeEmployee.selectAll();
    }//GEN-LAST:event_inputCodeEmployeeFocusGained

    private void inputCodeEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodeEmployeeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodeEmployeeKeyPressed

    private void inputCodeEmployeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodeEmployeeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodeEmployeeKeyReleased

    private void inputCodeEmployeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodeEmployeeKeyTyped
        if(inputCodeEmployee.getText().equals("")){
            inputCodeEmployee.setText("CPF DO FUNCIONÁRIO");
            x=0;
        }
        else if(x==0){
            x++;
            inputCodeEmployee.setText("");
        }
    }//GEN-LAST:event_inputCodeEmployeeKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(x2==0){
            x2++;
            GetDate getDate = new GetDate();
            FirstDayOfMonth firstDayOfMonth = new FirstDayOfMonth();
            inputFirstDateFilter.setText(firstDayOfMonth.getDate());
            inputSecondDateFilter.setText(getDate.dateOfSystem());
        }
    }//GEN-LAST:event_formWindowActivated

    private void buttonAlternActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlternActionPerformed
        JOptionPane.showMessageDialog(null, "PORCENTAGEM DE COMISSÃO ALTERADA COM SUCESSO");
    }//GEN-LAST:event_buttonAlternActionPerformed

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        SaleScreen saleScreen = new SaleScreen();
        saleScreen.setVisible(true);
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
            java.util.logging.Logger.getLogger(CommissionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommissionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommissionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommissionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommissionScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAltern;
    private javax.swing.JButton buttonLocale;
    private javax.swing.JButton buttonPrinter;
    private javax.swing.JButton buttonShow;
    private javax.swing.JTextField inputCPFEmployee;
    private javax.swing.JTextField inputCodeEmployee;
    private javax.swing.JTextField inputFirstDateFilter;
    private javax.swing.JTextField inputSecondDateFilter;
    private javax.swing.JLabel outputCommission;
    private javax.swing.JTextField outputPercentageOfCommission;
    private javax.swing.JLabel outputSalesAmount;
    private javax.swing.JScrollPane tableCommissionScreen;
    private javax.swing.JTable tableSales;
    private javax.swing.JLabel txtCommission;
    private javax.swing.JLabel txtCommissionControl;
    private javax.swing.JLabel txtPercentageOfCommission;
    private javax.swing.JLabel txtPeriod;
    private javax.swing.JLabel txtSales;
    private javax.swing.JLabel txtSalesAmount;
    private javax.swing.JLabel txtSeparatorDate;
    // End of variables declaration//GEN-END:variables
}
