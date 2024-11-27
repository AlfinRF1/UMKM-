package Karyawan;

import Koneksi.ClassKoneksi;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.sql.ResultSet;




public final class Profil extends javax.swing.JFrame {
    
    private Connection konek;
    
    public Profil() throws SQLException {
        initComponents();
        konek = ClassKoneksi.GetConnection(); 
        loadUserData();
    }
    
    public void loadUserData() {
        try {
            String username = Session.getUsername();
            String sql = "SELECT * FROM karyawan WHERE username=?";
            Connection ClassKoneksi = konek;
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                // Isi form dengan data dari database
                txt_nama.setText(rs.getString("Nama_Karyawan"));
                txt_idkar.setText(rs.getString("ID_karyawan"));
                txt_email.setText(rs.getString("Email"));
                txt_alamat.setText(rs.getString("Alamat"));
                txt_user.setText(rs.getString("username"));
                txt_pass.setText(rs.getString("password"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        kelpropil = new javax.swing.JButton();
        keltra = new javax.swing.JButton();
        kelba = new javax.swing.JButton();
        keltra3 = new javax.swing.JButton();
        keltra2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_tmplkan = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        txt_nama = new javax.swing.JTextField();
        txt_idkar = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_pass = new javax.swing.JTextField();
        txt_user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, 50));

        kelpropil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kelpropil.setBorder(null);
        kelpropil.setBorderPainted(false);
        kelpropil.setContentAreaFilled(false);
        kelpropil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelpropilActionPerformed(evt);
            }
        });
        getContentPane().add(kelpropil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 220, 50));

        keltra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra.setBorder(null);
        keltra.setBorderPainted(false);
        keltra.setContentAreaFilled(false);
        keltra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltraActionPerformed(evt);
            }
        });
        getContentPane().add(keltra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 220, 40));

        kelba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kelba.setBorder(null);
        kelba.setBorderPainted(false);
        kelba.setContentAreaFilled(false);
        kelba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelbaActionPerformed(evt);
            }
        });
        getContentPane().add(kelba, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 220, 50));

        keltra3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra3.setBorder(null);
        keltra3.setBorderPainted(false);
        keltra3.setContentAreaFilled(false);
        keltra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra3ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 210, 50));

        keltra2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra2.setBorder(null);
        keltra2.setBorderPainted(false);
        keltra2.setContentAreaFilled(false);
        keltra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra2ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 220, 50));

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 200, 50));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 230, 50));

        btn_tmplkan.setBorder(null);
        btn_tmplkan.setBorderPainted(false);
        btn_tmplkan.setContentAreaFilled(false);
        btn_tmplkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tmplkanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tmplkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 640, 130, 50));

        btn_simpan.setBorder(null);
        btn_simpan.setBorderPainted(false);
        btn_simpan.setContentAreaFilled(false);
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 650, 140, 50));

        btn_cancel.setBorder(null);
        btn_cancel.setBorderPainted(false);
        btn_cancel.setContentAreaFilled(false);
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 640, 140, 50));

        txt_nama.setBackground(new java.awt.Color(153, 163, 239));
        txt_nama.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_nama.setForeground(new java.awt.Color(255, 255, 255));
        txt_nama.setBorder(null);
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 229, 620, 40));

        txt_idkar.setBackground(new java.awt.Color(153, 163, 239));
        txt_idkar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_idkar.setForeground(new java.awt.Color(255, 255, 255));
        txt_idkar.setBorder(null);
        txt_idkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idkarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_idkar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 295, 620, 40));

        txt_email.setBackground(new java.awt.Color(153, 163, 239));
        txt_email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setBorder(null);
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 620, 40));

        txt_alamat.setBackground(new java.awt.Color(153, 163, 239));
        txt_alamat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_alamat.setForeground(new java.awt.Color(255, 255, 255));
        txt_alamat.setBorder(null);
        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });
        getContentPane().add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 427, 620, 40));

        txt_pass.setBackground(new java.awt.Color(153, 163, 239));
        txt_pass.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(255, 255, 255));
        txt_pass.setBorder(null);
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 559, 620, 40));

        txt_user.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 620, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\UMKM\\profile.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Customer ctm = null;
        try {
            ctm = new Customer();
        } catch (SQLException ex) {
            Logger.getLogger(Profil.class.getName()).log(Level.SEVERE, null, ex);
        }
        ctm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void kelpropilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelpropilActionPerformed

        KelolaLayanan klly = null;
        try {
            klly = new KelolaLayanan();
        } catch (SQLException ex) {
            Logger.getLogger(Profil.class.getName()).log(Level.SEVERE, null, ex);
        }
        klly.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kelpropilActionPerformed

    private void keltraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltraActionPerformed
        Kelola_TRbeli trb = null;
        try {
            trb = new Kelola_TRbeli();
        } catch (SQLException ex) {
            Logger.getLogger(Profil.class.getName()).log(Level.SEVERE, null, ex);
        }
        trb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keltraActionPerformed

    private void kelbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelbaActionPerformed
        Barang brg = null;
        try {
            brg = new Barang();
        } catch (SQLException ex) {
            Logger.getLogger(Profil.class.getName()).log(Level.SEVERE, null, ex);
        }
        brg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kelbaActionPerformed

    private void keltra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra3ActionPerformed
    Supplier brg = null;
        try {
            brg = new Supplier();
        } catch (SQLException ex) {
            Logger.getLogger(Profil.class.getName()).log(Level.SEVERE, null, ex);
        }
        brg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keltra3ActionPerformed

    private void keltra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keltra2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Keluar klr = new Keluar();
        klr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Dashboard dshb = new Dashboard();
        dshb.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        Dashboard dshb = new Dashboard();
        dshb.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
    Connection ClassKoneksi = null;
    PreparedStatement pst = null;
    try {
        
        String nama = txt_nama.getText();
        String ID_Karyawan = txt_idkar.getText();
        String email = txt_email.getText();
        String alamat = txt_alamat.getText();
        String username = txt_user.getText();
        String password = txt_pass.getText();
        
   
        if (ID_Karyawan.isEmpty() || nama.isEmpty() || email.isEmpty() || 
            alamat.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
            return;
        }
        
        ClassKoneksi = konek;
        
      
        String sql = "UPDATE karyawan SET Nama_Karyawan=?, Email=?, Alamat=?, "
                  + "username=?, password=? WHERE ID_karyawan=?";
        pst = ClassKoneksi.prepareStatement(sql);
        pst.setString(1, nama);
        pst.setString(2, email);
        pst.setString(3, alamat);
        pst.setString(4, username);
        pst.setString(5, password);
        pst.setString(6, ID_Karyawan);
        
        int rowsUpdated = pst.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");

        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    } finally {

        try {
            if (pst != null) pst.close();
            if (konek != null) konek.close();
        } catch (SQLException ex) {
            
        }
    }

    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_tmplkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tmplkanActionPerformed
        
    }//GEN-LAST:event_btn_tmplkanActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void txt_idkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idkarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idkarActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Profil().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Profil.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tmplkan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton kelba;
    private javax.swing.JButton kelpropil;
    private javax.swing.JButton keltra;
    private javax.swing.JButton keltra2;
    private javax.swing.JButton keltra3;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_idkar;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JLabel txt_user;
    // End of variables declaration//GEN-END:variables

    private void getData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
