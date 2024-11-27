package Karyawan;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dashboard extends javax.swing.JFrame {
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kelpropil = new javax.swing.JButton();
        keltra = new javax.swing.JButton();
        kelba = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        keltra2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        keltra3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kelpropil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kelpropil.setBorder(null);
        kelpropil.setBorderPainted(false);
        kelpropil.setContentAreaFilled(false);
        kelpropil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelpropilActionPerformed(evt);
            }
        });
        getContentPane().add(kelpropil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, 40));

        keltra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra.setBorder(null);
        keltra.setBorderPainted(false);
        keltra.setContentAreaFilled(false);
        keltra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltraActionPerformed(evt);
            }
        });
        getContentPane().add(keltra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 220, 40));

        kelba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kelba.setBorder(null);
        kelba.setBorderPainted(false);
        kelba.setContentAreaFilled(false);
        kelba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelbaActionPerformed(evt);
            }
        });
        getContentPane().add(kelba, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 220, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 230, 60));

        keltra2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra2.setBorder(null);
        keltra2.setBorderPainted(false);
        keltra2.setContentAreaFilled(false);
        keltra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra2ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 220, 50));

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 200, 40));

        keltra3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra3.setBorder(null);
        keltra3.setBorderPainted(false);
        keltra3.setContentAreaFilled(false);
        keltra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra3ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 210, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\UMKM\\dashboard.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kelbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelbaActionPerformed
        Barang brg = null;
        try {
            brg = new Barang();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        brg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kelbaActionPerformed

    private void kelpropilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelpropilActionPerformed

        KelolaLayanan klly = null;
        try {
            klly = new KelolaLayanan();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        klly.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kelpropilActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Customer ctm = null;
        try {
            ctm = new Customer();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        ctm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void keltra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra2ActionPerformed
        Profil prf = null;
        try {
            prf = new Profil();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        prf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keltra2ActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Keluar klr = new Keluar();
        klr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void keltra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra3ActionPerformed
    Supplier spp = null;
        try {
            spp = new Supplier();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    spp.setVisible(true);
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton kelba;
    private javax.swing.JButton kelpropil;
    private javax.swing.JButton keltra;
    private javax.swing.JButton keltra2;
    private javax.swing.JButton keltra3;
    // End of variables declaration//GEN-END:variables
}
