/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submenus;

import screens.CashOut;
import screens.Income;

/**
 *
 * @author Alunos
 */
public class BillMenu extends javax.swing.JFrame {

    /**
     * Creates new form BillMenu
     */
    public BillMenu() {
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

        txtAddOS = new javax.swing.JLabel();
        buttonAddOS = new javax.swing.JButton();
        txtAddOS1 = new javax.swing.JLabel();
        buttonAddOS1 = new javax.swing.JButton();
        txtAddOS2 = new javax.swing.JLabel();
        buttonAddOS2 = new javax.swing.JButton();
        txtAddOS3 = new javax.swing.JLabel();
        buttonAddOS3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        txtAddOS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAddOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAddOS.setText("ENTRADA");
        txtAddOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddOSMouseClicked(evt);
            }
        });

        buttonAddOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enterMoney.png"))); // NOI18N
        buttonAddOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddOSActionPerformed(evt);
            }
        });

        txtAddOS1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAddOS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAddOS1.setText("SAÍDA");
        txtAddOS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddOS1MouseClicked(evt);
            }
        });

        buttonAddOS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outMoney.png"))); // NOI18N
        buttonAddOS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddOS1ActionPerformed(evt);
            }
        });

        txtAddOS2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAddOS2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAddOS2.setText("ALTERAR");
        txtAddOS2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddOS2MouseClicked(evt);
            }
        });

        buttonAddOS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editMoney.png"))); // NOI18N
        buttonAddOS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddOS2ActionPerformed(evt);
            }
        });

        txtAddOS3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAddOS3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAddOS3.setText("FLUXO");
        txtAddOS3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddOS3MouseClicked(evt);
            }
        });

        buttonAddOS3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cashFlow.png"))); // NOI18N
        buttonAddOS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddOS3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddOS, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddOS, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddOS1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddOS1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddOS2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddOS2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddOS3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddOS3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAddOS2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddOS2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAddOS3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddOS3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAddOS1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddOS1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAddOS, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddOS)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 190, 489, 140);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddOSMouseClicked

    }//GEN-LAST:event_txtAddOSMouseClicked

    private void buttonAddOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddOSActionPerformed
        Income income = new Income();
        income.setVisible(true);
    }//GEN-LAST:event_buttonAddOSActionPerformed

    private void txtAddOS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddOS1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddOS1MouseClicked

    private void buttonAddOS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddOS1ActionPerformed
        CashOut cashOut = new CashOut();
        cashOut.setVisible(true);
    }//GEN-LAST:event_buttonAddOS1ActionPerformed

    private void txtAddOS2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddOS2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddOS2MouseClicked

    private void buttonAddOS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddOS2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddOS2ActionPerformed

    private void txtAddOS3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddOS3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddOS3MouseClicked

    private void buttonAddOS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddOS3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddOS3ActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

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
            java.util.logging.Logger.getLogger(BillMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddOS;
    private javax.swing.JButton buttonAddOS1;
    private javax.swing.JButton buttonAddOS2;
    private javax.swing.JButton buttonAddOS3;
    private javax.swing.JLabel txtAddOS;
    private javax.swing.JLabel txtAddOS1;
    private javax.swing.JLabel txtAddOS2;
    private javax.swing.JLabel txtAddOS3;
    // End of variables declaration//GEN-END:variables
}
