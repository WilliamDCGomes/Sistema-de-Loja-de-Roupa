/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class NewProduct extends javax.swing.JFrame {
    int x = 0;
    /**
     * Creates new form NewProduct
     */
    public NewProduct() {
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

        txtCode = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtDescription = new javax.swing.JLabel();
        txtExpense = new javax.swing.JLabel();
        txtProfit = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JLabel();
        txtProvider = new javax.swing.JLabel();
        txtBarCode = new javax.swing.JLabel();
        txtLocalization = new javax.swing.JLabel();
        inputProvider = new javax.swing.JTextField();
        inputQuantity = new javax.swing.JTextField();
        inputBrand = new javax.swing.JTextField();
        inputCode = new javax.swing.JTextField();
        inputProfitPercentage = new javax.swing.JTextField();
        inputExpense = new javax.swing.JTextField();
        txtProftPercentage = new javax.swing.JLabel();
        inputLocalization = new javax.swing.JTextField();
        txtPrice = new javax.swing.JLabel();
        inputProfit = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        inputPrice = new javax.swing.JTextField();
        inputBarCode = new javax.swing.JTextField();
        inputPhoto = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        txtBrand = new javax.swing.JLabel();
        tableNewProduct = new javax.swing.JScrollPane();
        inputDescription = new javax.swing.JTextArea();
        txtNewProduct = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Produto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        txtCode.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtCode.setText("Código");
        getContentPane().add(txtCode);
        txtCode.setBounds(20, 100, 60, 19);

        txtName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtName.setText("Nome");
        getContentPane().add(txtName);
        txtName.setBounds(390, 100, 80, 19);

        txtDescription.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtDescription.setText("Descrição");
        getContentPane().add(txtDescription);
        txtDescription.setBounds(20, 380, 80, 19);

        txtExpense.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtExpense.setText("Custo");
        getContentPane().add(txtExpense);
        txtExpense.setBounds(180, 170, 80, 19);

        txtProfit.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtProfit.setText("Lucro");
        getContentPane().add(txtProfit);
        txtProfit.setBounds(20, 240, 50, 19);

        txtQuantity.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtQuantity.setText("Quantidade");
        getContentPane().add(txtQuantity);
        txtQuantity.setBounds(20, 170, 110, 19);

        txtProvider.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtProvider.setText("Fornecedor");
        getContentPane().add(txtProvider);
        txtProvider.setBounds(180, 310, 110, 19);

        txtBarCode.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtBarCode.setText("Código de Barras");
        getContentPane().add(txtBarCode);
        txtBarCode.setBounds(180, 100, 140, 19);

        txtLocalization.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtLocalization.setText("Localização");
        getContentPane().add(txtLocalization);
        txtLocalization.setBounds(390, 240, 110, 19);

        inputProvider.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputProvider);
        inputProvider.setBounds(180, 340, 150, 25);

        inputQuantity.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputQuantity);
        inputQuantity.setBounds(20, 200, 50, 25);

        inputBrand.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputBrand);
        inputBrand.setBounds(20, 340, 130, 25);

        inputCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputCode);
        inputCode.setBounds(20, 130, 100, 25);

        inputProfitPercentage.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputProfitPercentage);
        inputProfitPercentage.setBounds(180, 270, 70, 25);

        inputExpense.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputExpense);
        inputExpense.setBounds(180, 200, 70, 25);

        txtProftPercentage.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtProftPercentage.setText("Porcentagem de Lucro");
        getContentPane().add(txtProftPercentage);
        txtProftPercentage.setBounds(180, 240, 180, 19);

        inputLocalization.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputLocalization);
        inputLocalization.setBounds(390, 270, 70, 25);

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtPrice.setText("Preço de Venda");
        getContentPane().add(txtPrice);
        txtPrice.setBounds(390, 170, 130, 19);

        inputProfit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputProfit);
        inputProfit.setBounds(20, 270, 70, 25);

        inputName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputName);
        inputName.setBounds(390, 130, 150, 25);

        inputPrice.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputPrice);
        inputPrice.setBounds(390, 200, 70, 25);

        inputBarCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputBarCode);
        inputBarCode.setBounds(180, 130, 130, 25);

        inputPhoto.setText("FOTO");
        getContentPane().add(inputPhoto);
        inputPhoto.setBounds(560, 100, 140, 170);

        buttonCancel.setText("CANCELAR");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancel);
        buttonCancel.setBounds(601, 530, 100, 32);

        txtBrand.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtBrand.setText("Marca");
        getContentPane().add(txtBrand);
        txtBrand.setBounds(20, 310, 80, 19);

        inputDescription.setColumns(20);
        inputDescription.setRows(5);
        tableNewProduct.setViewportView(inputDescription);

        getContentPane().add(tableNewProduct);
        tableNewProduct.setBounds(20, 410, 480, 140);

        txtNewProduct.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNewProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNewProduct.setText("NOVO PRODUTO");
        getContentPane().add(txtNewProduct);
        txtNewProduct.setBounds(240, 10, 220, 60);

        buttonSave.setText("SALVAR");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSave);
        buttonSave.setBounds(510, 530, 80, 32);

        setSize(new java.awt.Dimension(716, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(x==0){
            x++;
            inputCode.requestFocus();
        }
    }//GEN-LAST:event_formWindowActivated

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        if(txtNewProduct.getText().equals("NOVO PRODUTO")){
            JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO COM SUCESSO");
            ProductScreen productScreen = new ProductScreen();
            this.dispose();
            productScreen.setVisible(true);
        }
        else if(txtNewProduct.getText().equals("EDITAR PRODUTO")){
            JOptionPane.showMessageDialog(null, "PRODUTO ATUALIZADO COM SUCESSO");
            ProductScreen productScreen = new ProductScreen();
            this.dispose();
            productScreen.setVisible(true);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JTextField inputBarCode;
    private javax.swing.JTextField inputBrand;
    private javax.swing.JTextField inputCode;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JTextField inputExpense;
    private javax.swing.JTextField inputLocalization;
    private javax.swing.JTextField inputName;
    private javax.swing.JButton inputPhoto;
    private javax.swing.JTextField inputPrice;
    private javax.swing.JTextField inputProfit;
    private javax.swing.JTextField inputProfitPercentage;
    private javax.swing.JTextField inputProvider;
    private javax.swing.JTextField inputQuantity;
    private javax.swing.JScrollPane tableNewProduct;
    private javax.swing.JLabel txtBarCode;
    private javax.swing.JLabel txtBrand;
    private javax.swing.JLabel txtCode;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtExpense;
    private javax.swing.JLabel txtLocalization;
    private javax.swing.JLabel txtName;
    public static javax.swing.JLabel txtNewProduct;
    private javax.swing.JLabel txtPrice;
    private javax.swing.JLabel txtProfit;
    private javax.swing.JLabel txtProftPercentage;
    private javax.swing.JLabel txtProvider;
    private javax.swing.JLabel txtQuantity;
    // End of variables declaration//GEN-END:variables
}
