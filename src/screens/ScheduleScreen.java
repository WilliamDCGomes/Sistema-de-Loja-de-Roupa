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
public class ScheduleScreen extends javax.swing.JFrame {

    /**
     * Creates new form ScheduleScreen
     */
    public ScheduleScreen() {
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

        txtAppointment = new javax.swing.JLabel();
        txtNameAppointment = new javax.swing.JLabel();
        outputNameAppointment = new javax.swing.JTextField();
        txtAppointmentDate = new javax.swing.JLabel();
        outputAppointmentDate = new javax.swing.JTextField();
        txtAppointmentHour = new javax.swing.JLabel();
        outputAppointmentHour = new javax.swing.JTextField();
        txtAppointmentDescription = new javax.swing.JLabel();
        tableNewSchedule = new javax.swing.JScrollPane();
        outputAppointmentDescription = new javax.swing.JTextArea();
        buttonEdit = new javax.swing.JButton();
        buttonAllSchedules = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonFinishTask = new javax.swing.JButton();
        txtStatus = new javax.swing.JLabel();
        outputStatus = new javax.swing.JTextField();
        buttonPrinter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compromisso");
        setResizable(false);
        getContentPane().setLayout(null);

        txtAppointment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtAppointment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAppointment.setText("COMPRIMISSO");
        getContentPane().add(txtAppointment);
        txtAppointment.setBounds(110, 10, 260, 29);

        txtNameAppointment.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtNameAppointment.setText("Nome do Compromisso");
        getContentPane().add(txtNameAppointment);
        txtNameAppointment.setBounds(30, 70, 170, 19);

        outputNameAppointment.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        outputNameAppointment.setEnabled(false);
        getContentPane().add(outputNameAppointment);
        outputNameAppointment.setBounds(30, 100, 220, 25);

        txtAppointmentDate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtAppointmentDate.setText("Data do Compromisso");
        getContentPane().add(txtAppointmentDate);
        txtAppointmentDate.setBounds(310, 70, 150, 19);

        outputAppointmentDate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        outputAppointmentDate.setEnabled(false);
        getContentPane().add(outputAppointmentDate);
        outputAppointmentDate.setBounds(310, 100, 100, 25);

        txtAppointmentHour.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtAppointmentHour.setText("Horário do Compromisso");
        getContentPane().add(txtAppointmentHour);
        txtAppointmentHour.setBounds(30, 140, 180, 19);

        outputAppointmentHour.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        outputAppointmentHour.setEnabled(false);
        getContentPane().add(outputAppointmentHour);
        outputAppointmentHour.setBounds(30, 170, 60, 25);

        txtAppointmentDescription.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtAppointmentDescription.setText("Descrição do Compromisso");
        getContentPane().add(txtAppointmentDescription);
        txtAppointmentDescription.setBounds(30, 220, 180, 19);

        outputAppointmentDescription.setColumns(20);
        outputAppointmentDescription.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        outputAppointmentDescription.setRows(5);
        tableNewSchedule.setViewportView(outputAppointmentDescription);

        getContentPane().add(tableNewSchedule);
        tableNewSchedule.setBounds(30, 250, 430, 160);

        buttonEdit.setText("EDITAR");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEdit);
        buttonEdit.setBounds(30, 440, 80, 32);

        buttonAllSchedules.setText("TODOS OS COMPROMISSOS");
        buttonAllSchedules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAllSchedulesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAllSchedules);
        buttonAllSchedules.setBounds(130, 440, 210, 32);

        buttonDelete.setText("APAGAR");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDelete);
        buttonDelete.setBounds(360, 440, 100, 32);

        buttonFinishTask.setText("FINALIZAR COMPROMISSO");
        buttonFinishTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinishTaskActionPerformed(evt);
            }
        });
        getContentPane().add(buttonFinishTask);
        buttonFinishTask.setBounds(30, 470, 190, 32);

        txtStatus.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtStatus.setText("Status");
        getContentPane().add(txtStatus);
        txtStatus.setBounds(310, 140, 50, 19);

        outputStatus.setEnabled(false);
        getContentPane().add(outputStatus);
        outputStatus.setBounds(310, 170, 110, 25);

        buttonPrinter.setText("IMPRIMIR");
        getContentPane().add(buttonPrinter);
        buttonPrinter.setBounds(230, 470, 90, 32);

        setSize(new java.awt.Dimension(500, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        NewSchedule newSchedule = new NewSchedule();
        this.dispose();
        newSchedule.txtNewAppointment.setText("EDITAR COMPROMISSO");
        newSchedule.setTitle("Editar Compromisso");
        newSchedule.buttonCancel.setText("APAGAR");
        newSchedule.setVisible(true);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonAllSchedulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAllSchedulesActionPerformed
        AllSchedule allSchedule = new AllSchedule();
        allSchedule.setVisible(true);
    }//GEN-LAST:event_buttonAllSchedulesActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        JOptionPane.showMessageDialog(null, "COMPROMISSO APAGADO COM SUCESSO");
        this.dispose();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonFinishTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinishTaskActionPerformed
        JOptionPane.showMessageDialog(null, "COMPROMISSO MARCADO COMO CONCLUIDO");
        this.dispose();
    }//GEN-LAST:event_buttonFinishTaskActionPerformed

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
            java.util.logging.Logger.getLogger(ScheduleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScheduleScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAllSchedules;
    public static javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonFinishTask;
    private javax.swing.JButton buttonPrinter;
    private javax.swing.JTextField outputAppointmentDate;
    private javax.swing.JTextArea outputAppointmentDescription;
    private javax.swing.JTextField outputAppointmentHour;
    private javax.swing.JTextField outputNameAppointment;
    private javax.swing.JTextField outputStatus;
    private javax.swing.JScrollPane tableNewSchedule;
    private javax.swing.JLabel txtAppointment;
    private javax.swing.JLabel txtAppointmentDate;
    private javax.swing.JLabel txtAppointmentDescription;
    private javax.swing.JLabel txtAppointmentHour;
    private javax.swing.JLabel txtNameAppointment;
    private javax.swing.JLabel txtStatus;
    // End of variables declaration//GEN-END:variables
}
