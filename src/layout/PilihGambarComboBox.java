/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.CardLayout;

/**
 *
 * @author ASUS
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarComboBox
     */
    public PilihGambarComboBox() {
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
        pilihanGambarcmb = new javax.swing.JComboBox<>();
        pCardLayout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pilihanGambarcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gambar 1", "Gambar 2", "Gambar 3", " " }));
        pilihanGambarcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanGambarcmbActionPerformed(evt);
            }
        });
        jPanel1.add(pilihanGambarcmb);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pCardLayout.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/gambar1.jpg"))); // NOI18N
        pCardLayout.add(jLabel1, "0");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/gambar2.jpg"))); // NOI18N
        pCardLayout.add(jLabel2, "1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/gambar3.jpg"))); // NOI18N
        pCardLayout.add(jLabel3, "2");

        getContentPane().add(pCardLayout, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanGambarcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanGambarcmbActionPerformed
        CardLayout cl = (CardLayout)(pCardLayout.getLayout());
        cl.show(pCardLayout,String.valueOf(pilihanGambarcmb.getSelectedIndex()));
    }//GEN-LAST:event_pilihanGambarcmbActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pCardLayout;
    private javax.swing.JComboBox<String> pilihanGambarcmb;
    // End of variables declaration//GEN-END:variables
}