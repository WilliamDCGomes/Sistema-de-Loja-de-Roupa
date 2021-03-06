/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import functioncontroller.GetDate;

/**
 *
 * @author Lenovo
 */
public class AllSchedule extends javax.swing.JFrame {
    int x = 0;
    /**
     * Creates new form AllSchedule
     */
    public AllSchedule() {
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

        txtAllSchedules = new javax.swing.JLabel();
        tableAllSchedules = new javax.swing.JScrollPane();
        tableSchedules = new javax.swing.JTable();
        buttonShow = new javax.swing.JButton();
        inputFirstDateFilter = new javax.swing.JTextField();
        txtSeparatorDate = new javax.swing.JLabel();
        inputSecondDateFilter = new javax.swing.JTextField();
        outputScheduleType = new javax.swing.JComboBox<>();
        buttonPrinter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Todos os Compromissos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        txtAllSchedules.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtAllSchedules.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAllSchedules.setText("TODOS OS COMPROMISSOS");
        getContentPane().add(txtAllSchedules);
        txtAllSchedules.setBounds(180, 10, 400, 32);

        tableSchedules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome do Compromisso", "Dia Marcado", "Horário Marcado"
            }
        ));
        tableAllSchedules.setViewportView(tableSchedules);

        getContentPane().add(tableAllSchedules);
        tableAllSchedules.setBounds(20, 130, 700, 300);

        buttonShow.setText("MOSTRAR");
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });
        getContentPane().add(buttonShow);
        buttonShow.setBounds(520, 80, 90, 30);

        inputFirstDateFilter.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        inputFirstDateFilter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputFirstDateFilterFocusGained(evt);
            }
        });
        getContentPane().add(inputFirstDateFilter);
        inputFirstDateFilter.setBounds(20, 80, 100, 30);

        txtSeparatorDate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSeparatorDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSeparatorDate.setText("A");
        getContentPane().add(txtSeparatorDate);
        txtSeparatorDate.setBounds(120, 80, 40, 30);

        inputSecondDateFilter.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        inputSecondDateFilter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputSecondDateFilterFocusGained(evt);
            }
        });
        getContentPane().add(inputSecondDateFilter);
        inputSecondDateFilter.setBounds(160, 80, 100, 30);

        outputScheduleType.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        outputScheduleType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compromissos do Dia", "Compromissos do Mês", "Todos os Compromissos", "Compromissos Concluídos" }));
        getContentPane().add(outputScheduleType);
        outputScheduleType.setBounds(290, 80, 210, 30);

        buttonPrinter.setText("IMPRIMIR");
        getContentPane().add(buttonPrinter);
        buttonPrinter.setBounds(630, 80, 90, 32);

        setSize(new java.awt.Dimension(747, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        ScheduleScreen scheduleScreen = new ScheduleScreen();
        scheduleScreen.setVisible(true);
    }//GEN-LAST:event_buttonShowActionPerformed

    private void inputFirstDateFilterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputFirstDateFilterFocusGained
        inputFirstDateFilter.selectAll();
    }//GEN-LAST:event_inputFirstDateFilterFocusGained

    private void inputSecondDateFilterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputSecondDateFilterFocusGained
        inputSecondDateFilter.selectAll();
    }//GEN-LAST:event_inputSecondDateFilterFocusGained

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(x==0){
            x++;
            GetDate getDate = new GetDate();
            inputFirstDateFilter.setText(getDate.dateOfSystem());
            inputSecondDateFilter.setText(getDate.dateOfSystem());
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(AllSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPrinter;
    private javax.swing.JButton buttonShow;
    private javax.swing.JTextField inputFirstDateFilter;
    private javax.swing.JTextField inputSecondDateFilter;
    public static javax.swing.JComboBox<String> outputScheduleType;
    private javax.swing.JScrollPane tableAllSchedules;
    private javax.swing.JTable tableSchedules;
    public static javax.swing.JLabel txtAllSchedules;
    private javax.swing.JLabel txtSeparatorDate;
    // End of variables declaration//GEN-END:variables
}
