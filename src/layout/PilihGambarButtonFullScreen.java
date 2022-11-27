/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author ASUS
 */
public class PilihGambarButtonFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButtonFullScreen
     */
    public PilihGambarButtonFullScreen() {
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

        jPanel1 = new javax.swing.JPanel();
        Gambar1Btn = new javax.swing.JButton();
        Gambar2Btn = new javax.swing.JButton();
        Gambar3Btn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        Gambar1lbl = new javax.swing.JLabel();
        Gambar2lbl = new javax.swing.JLabel();
        Gambar3lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Gambar1Btn.setText("Gambar1");
        Gambar1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gambar1BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Gambar1Btn);

        Gambar2Btn.setText("Gambar2");
        Gambar2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gambar2BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Gambar2Btn);

        Gambar3Btn.setText("Gambar3");
        Gambar3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gambar3BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Gambar3Btn);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        Gambar1lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/gambar1.jpg"))); // NOI18N
        Gambar1lbl.setText("jLabel1");
        imagePanel.add(Gambar1lbl, "0");

        Gambar2lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/gambar2.jpg"))); // NOI18N
        Gambar2lbl.setText("jLabel2");
        imagePanel.add(Gambar2lbl, "1");

        Gambar3lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/gambar3.jpg"))); // NOI18N
        imagePanel.add(Gambar3lbl, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Gambar1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gambar1BtnActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
             cl.show(imagePanel,"0");
    }//GEN-LAST:event_Gambar1BtnActionPerformed

    private void Gambar2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gambar2BtnActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
                     cl.show(imagePanel,"1");
    }//GEN-LAST:event_Gambar2BtnActionPerformed

    private void Gambar3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gambar3BtnActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
                     cl.show(imagePanel,"2");
    }//GEN-LAST:event_Gambar3BtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
           System.exit(0);    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              PilihGambarButton fullFrame = new PilihGambarButton();
              
              GraphicsDevice device =
                GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
              device.setFullScreenWindow(fullFrame);
              
              fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gambar1Btn;
    private javax.swing.JLabel Gambar1lbl;
    private javax.swing.JButton Gambar2Btn;
    private javax.swing.JLabel Gambar2lbl;
    private javax.swing.JButton Gambar3Btn;
    private javax.swing.JLabel Gambar3lbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
