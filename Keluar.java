package Karyawan;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class Keluar extends javax.swing.JFrame {


    public Keluar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        kelpropil = new javax.swing.JButton();
        keltra = new javax.swing.JButton();
        kelba = new javax.swing.JButton();
        keltra2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        keltra3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 120, 40));

        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 120, 30));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 240, 50));

        kelpropil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kelpropil.setBorder(null);
        kelpropil.setBorderPainted(false);
        kelpropil.setContentAreaFilled(false);
        kelpropil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelpropilActionPerformed(evt);
            }
        });
        getContentPane().add(kelpropil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, 50));

        keltra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra.setBorder(null);
        keltra.setBorderPainted(false);
        keltra.setContentAreaFilled(false);
        keltra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltraActionPerformed(evt);
            }
        });
        getContentPane().add(keltra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 220, 50));

        kelba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kelba.setBorder(null);
        kelba.setBorderPainted(false);
        kelba.setContentAreaFilled(false);
        kelba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelbaActionPerformed(evt);
            }
        });
        getContentPane().add(kelba, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 220, 50));

        keltra2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra2.setBorder(null);
        keltra2.setBorderPainted(false);
        keltra2.setContentAreaFilled(false);
        keltra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra2ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 220, 60));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 230, 60));

        keltra3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra3.setBorder(null);
        keltra3.setBorderPainted(false);
        keltra3.setContentAreaFilled(false);
        keltra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra3ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 210, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\UMKM\\keluar.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           int result = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar dari akun?", "Konfirmasi", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (result) {
            case JOptionPane.YES_OPTION:
                new Welcome().setVisible(true);
                this.dispose();
                break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dashboard dshb = new Dashboard();
        dshb.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Dashboard dshb = new Dashboard();
        dshb.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void kelpropilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelpropilActionPerformed
   
        KelolaLayanan klly = null;
        try {
            klly = new KelolaLayanan();
        } catch (SQLException ex) {
            Logger.getLogger(Keluar.class.getName()).log(Level.SEVERE, null, ex);
        }
        klly.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kelpropilActionPerformed

    private void keltraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltraActionPerformed
        Kelola_TRbeli trb = null;
        try {
            trb = new Kelola_TRbeli();
        } catch (SQLException ex) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
        trb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keltraActionPerformed

    private void kelbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelbaActionPerformed
        Barang brg = null;
        try {
            brg = new Barang();
        } catch (SQLException ex) {
            Logger.getLogger(Keluar.class.getName()).log(Level.SEVERE, null, ex);
        }
        brg.setVisible(true);
        this.dispose();           
    }//GEN-LAST:event_kelbaActionPerformed

    private void keltra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra2ActionPerformed
    Supplier spp = null;
        try {
            spp = new Supplier();
        } catch (SQLException ex) {
            Logger.getLogger(Keluar.class.getName()).log(Level.SEVERE, null, ex);
        }
    spp.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_keltra2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Customer cstmr = null;
        try {
            cstmr = new Customer();
        } catch (SQLException ex) {
            Logger.getLogger(Keluar.class.getName()).log(Level.SEVERE, null, ex);
        }
        cstmr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void keltra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra3ActionPerformed
        Profil prf = null;
        try {
            prf = new Profil();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        prf.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_keltra3ActionPerformed

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
            java.util.logging.Logger.getLogger(Keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Keluar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton kelba;
    private javax.swing.JButton kelpropil;
    private javax.swing.JButton keltra;
    private javax.swing.JButton keltra2;
    private javax.swing.JButton keltra3;
    // End of variables declaration//GEN-END:variables
}
