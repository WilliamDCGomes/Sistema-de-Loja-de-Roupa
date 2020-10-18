/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import com.googlecode.javacv.cpp.opencv_highgui;
import static com.googlecode.javacv.cpp.opencv_highgui.*;
import functioncontroller.ScreenUserSize;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class TakePicture extends javax.swing.JFrame {
    int x = 0;
    Export export = new Export();
    CanvasFrame canvas;
    /**
     * Creates new form javacv_image
     */
    public TakePicture() {
        initComponents();
    }
    private void openWebcam(){
        ScreenUserSize screenUserSize = new ScreenUserSize();
        String[] vect = screenUserSize.sizeOfScreen().split(";");
        int x = (Integer.parseInt(vect[0])/2)-300;
        int y = (Integer.parseInt(vect[1])/2)-380;
        Thread webcam = new Thread(){
            public void run(){
                CvCapture capture = opencv_highgui.cvCreateCameraCapture(0);
                opencv_highgui.cvSetCaptureProperty(capture, opencv_highgui.CV_CAP_PROP_FRAME_HEIGHT, 600);
                opencv_highgui.cvSetCaptureProperty(capture, opencv_highgui.CV_CAP_PROP_FRAME_WIDTH, 480);
                IplImage grabbedImage = opencv_highgui.cvQueryFrame(capture);
                CanvasFrame frame = new CanvasFrame("Webcam");
                frame.setLocation(x, y);
                canvas = frame;
                while(frame.isVisible() && (grabbedImage = opencv_highgui.cvQueryFrame(capture))!=null){
                    frame.showImage(grabbedImage);
                }
            }
        };
        webcam.start();
    }
    public File export() throws IOException{
        String userDir = System.getProperty("user.home");
        JFileChooser fc = new JFileChooser(userDir +"/Desktop");
        fc.showSaveDialog(export.fileChooser);
        File file =  new File(fc.getSelectedFile() + ".png");
        if(file.exists()){
            Object[] options = { "Sim", "Não" };
            int opt = JOptionPane.showOptionDialog(null,"ESTE ARQUIVO JÁ EXISTE. DESEJA SOBREESCREVER ELE?", "ATENÇÃO!!!",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,options, options[0]);
            if (opt == JOptionPane.YES_OPTION) {   
                return file;
            }     
        }
        else{
            return file;
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonTakePicture = new javax.swing.JButton();
        buttonDeletePicture = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Captura de Imagem");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        buttonTakePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/takePicture.png"))); // NOI18N
        buttonTakePicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTakePictureActionPerformed(evt);
            }
        });
        getContentPane().add(buttonTakePicture);
        buttonTakePicture.setBounds(20, 10, 88, 91);

        buttonDeletePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deletePicture.png"))); // NOI18N
        getContentPane().add(buttonDeletePicture);
        buttonDeletePicture.setBounds(20, 130, 90, 90);

        setSize(new java.awt.Dimension(142, 267));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTakePictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTakePictureActionPerformed
        OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
        try{
            grabber.start();
            IplImage img = grabber.grab();
            JOptionPane.showMessageDialog(null, "FOTO TIRADA");
            String userDir = System.getProperty("user.home");
            String dir = userDir + "\\Pictures\\temp.png";
            System.out.println(dir);
            cvSaveImage(dir, img);
            ImageScreen imageScreen = new ImageScreen();
            imageScreen.adress = dir;
            imageScreen.setVisible(true);
            canvas.setVisible(false);
            if(img!=null){
                File whereToSave = export();
                if(whereToSave!=null){
                    cvSaveImage(whereToSave.toString(), img);
                    JOptionPane.showMessageDialog(null, "FOTO SALVA");
                    this.dispose();
                }
            }
            File del = new File(dir);
            del.delete();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
        }
    }//GEN-LAST:event_buttonTakePictureActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(x==0){
            x++;
            openWebcam();
        }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        canvas.dispose();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(TakePicture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakePicture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakePicture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakePicture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakePicture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDeletePicture;
    private javax.swing.JButton buttonTakePicture;
    // End of variables declaration//GEN-END:variables
}