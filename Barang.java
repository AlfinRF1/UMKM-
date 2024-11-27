
package Karyawan;

import Koneksi.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Barang extends javax.swing.JFrame {

    private Connection konek;

    public Barang() throws SQLException {
        initComponents();
        konek = ClassKoneksi.GetConnection();
        getData();
    }
    private void getData(){
        DefaultTableModel model =(DefaultTableModel) tbl_barang.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "Select * From barang";
            PreparedStatement st = konek.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                String ID_Barang = rs.getString("ID_barang");
                String Nama_Barang = rs.getString("Nama_Barang");
                String Jenis = rs.getString("Jenis");
                String Harga = rs.getString("Harga");
                String Stok = rs.getString("Stok");
                
                Object[] rowData = {ID_Barang,Nama_Barang,Jenis,Harga,Stok};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        }catch (SQLException ex) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        kelpropil = new javax.swing.JButton();
        keltra = new javax.swing.JButton();
        keltra2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btn_hps = new javax.swing.JButton();
        btn_smpn = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        txt_namabrg = new javax.swing.JTextField();
        txt_jns = new javax.swing.JTextField();
        txt_hrg = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        keltra3 = new javax.swing.JButton();
        keltra4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 60));

        kelpropil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kelpropil.setBorder(null);
        kelpropil.setBorderPainted(false);
        kelpropil.setContentAreaFilled(false);
        kelpropil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelpropilActionPerformed(evt);
            }
        });
        getContentPane().add(kelpropil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 230, 50));

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

        keltra2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra2.setBorder(null);
        keltra2.setBorderPainted(false);
        keltra2.setContentAreaFilled(false);
        keltra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra2ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 220, 50));

        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 240, 40));

        btn_hps.setBorder(null);
        btn_hps.setBorderPainted(false);
        btn_hps.setContentAreaFilled(false);
        btn_hps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hpsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hps, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 130, 40));

        btn_smpn.setBorder(null);
        btn_smpn.setBorderPainted(false);
        btn_smpn.setContentAreaFilled(false);
        btn_smpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_smpnActionPerformed(evt);
            }
        });
        getContentPane().add(btn_smpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 330, 130, 40));

        txt_id.setBackground(new java.awt.Color(153, 163, 239));
        txt_id.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_id.setBorder(null);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 133, 230, 30));

        txt_namabrg.setBackground(new java.awt.Color(153, 163, 239));
        txt_namabrg.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_namabrg.setForeground(new java.awt.Color(255, 255, 255));
        txt_namabrg.setBorder(null);
        getContentPane().add(txt_namabrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 205, 200, 30));

        txt_jns.setBackground(new java.awt.Color(153, 163, 239));
        txt_jns.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_jns.setForeground(new java.awt.Color(255, 255, 255));
        txt_jns.setBorder(null);
        getContentPane().add(txt_jns, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 275, 260, 30));

        txt_hrg.setBackground(new java.awt.Color(153, 163, 239));
        txt_hrg.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_hrg.setForeground(new java.awt.Color(255, 255, 255));
        txt_hrg.setBorder(null);
        getContentPane().add(txt_hrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 137, 270, 30));

        txt_stok.setBackground(new java.awt.Color(153, 163, 239));
        txt_stok.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_stok.setForeground(new java.awt.Color(255, 255, 255));
        txt_stok.setBorder(null);
        getContentPane().add(txt_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 204, 280, 30));

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Jenis", "Harga", "Stok"
            }
        ));
        tbl_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_barang);
        if (tbl_barang.getColumnModel().getColumnCount() > 0) {
            tbl_barang.getColumnModel().getColumn(0).setResizable(false);
            tbl_barang.getColumnModel().getColumn(1).setResizable(false);
            tbl_barang.getColumnModel().getColumn(2).setResizable(false);
            tbl_barang.getColumnModel().getColumn(3).setResizable(false);
            tbl_barang.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 790, 290));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 250, 50));

        btn_edit.setBorder(null);
        btn_edit.setBorderPainted(false);
        btn_edit.setContentAreaFilled(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 140, 40));

        keltra3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra3.setBorder(null);
        keltra3.setBorderPainted(false);
        keltra3.setContentAreaFilled(false);
        keltra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra3ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 220, 50));

        keltra4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra4.setBorder(null);
        keltra4.setBorderPainted(false);
        keltra4.setContentAreaFilled(false);
        keltra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra4ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 220, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\UMKM\\barang.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
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

    private void keltra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra2ActionPerformed
        Profil prf = null;
        try {
            prf = new Profil();
        } catch (SQLException ex) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
        prf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keltra2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Keluar klr = new Keluar();
        klr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            Customer ctm = new Customer();
            ctm.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_smpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_smpnActionPerformed
        String ID_Barang = txt_id.getText();
        String Nama_Barang = txt_namabrg.getText();
        String Jenis = txt_jns.getText();
        String Harga = txt_hrg.getText();
        String Stok = txt_stok.getText();
        
        if(ID_Barang.isEmpty() || Nama_Barang.isEmpty() || Jenis.isEmpty() || Harga.isEmpty() || Stok.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        try{
            String sql = "INSERT INTO barang (ID_Barang,Nama_Barang,Jenis,Harga,Stok) VALUES (?,?,?,?,?)";
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1,ID_Barang);
            st.setString(2,Nama_Barang);
            st.setString(3,Jenis);
            st.setString(4,Harga);
            st.setString(5,Stok);
            
            int rowInserted = st.executeUpdate();
            if(rowInserted > 0){
                JOptionPane.showMessageDialog(this,"Data Berhasil Ditambahkan");
                resetForm();
                getData();
            }
            
            st.close();
        }catch (Exception e) { 
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE,null, e);
        }
    }//GEN-LAST:event_btn_smpnActionPerformed

    private void btn_hpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hpsActionPerformed
        int selectedRow = tbl_barang.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this,"Pilih baris yang akan di hapus");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin mengapus data ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String ID_Barang = tbl_barang.getValueAt(selectedRow, 0).toString();
            
            try{
                String sql = "DELETE FROM barang WHERE ID_barang=?";
                PreparedStatement st = konek.prepareStatement(sql);
                st.setString(1, ID_Barang);
                
                int rowDelete = st.executeUpdate();
                if(rowDelete > 0){
                    JOptionPane.showMessageDialog(this,"Data berhasil dihapus");
                    resetForm();
                    getData();
                }
                
                st.close();
            }catch (Exception e){
                Logger.getLogger(Barang.class.getName()).log(Level.SEVERE,null, e);
            }
        }
    }//GEN-LAST:event_btn_hpsActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int selectedRow = tbl_barang.getSelectedRow();
        if(selectedRow == -1) {
            JOptionPane.showMessageDialog(this,"Pilih baris yang akan di Perbarui");
            return;
        }

        String ID_Barang = txt_id.getText();
        String Nama_Barang = txt_namabrg.getText();
        String Jenis = txt_jns.getText();
        String Harga = txt_hrg.getText();
        String Stok = txt_stok.getText();
        

        if(ID_Barang.isEmpty() || Nama_Barang.isEmpty() || Jenis.isEmpty() || Harga.isEmpty() || Stok.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Semua kolom harus diisi !","Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "UPDATE barang SET ID_barang=?, Nama_Barang=?, Jenis=?, Harga=?, Stok=? WHERE ID_barang=?";
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1,ID_Barang);
            st.setString(2,Nama_Barang);
            st.setString(3,Jenis);
            st.setString(4,Harga);
            st.setString(5,Stok);
            st.setString(6,ID_Barang);
            

            int rowUpdate = st.executeUpdate();
            if(rowUpdate > 0) {
                JOptionPane.showMessageDialog(this,"Data Berhasil Diperbarui");
                resetForm();
                getData();
            }

            st.close();
        } catch (Exception e) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        int selectedRow = tbl_barang.getSelectedRow();
        if(selectedRow != -1){
            String ID_Barang = tbl_barang.getValueAt(selectedRow, 0).toString();
            String Nama_Barang = tbl_barang.getValueAt(selectedRow, 1).toString();
            String Jenis = tbl_barang.getValueAt(selectedRow, 2).toString();
            String Harga = tbl_barang.getValueAt(selectedRow, 3).toString();   
            String Stok = tbl_barang.getValueAt(selectedRow, 4).toString();
            
            txt_id.setText(ID_Barang);
            txt_namabrg.setText(Nama_Barang);
            txt_jns.setText(Jenis);
            txt_hrg.setText(Harga);
            txt_stok.setText(Stok);
            
        }
    }//GEN-LAST:event_tbl_barangMouseClicked

    private void keltra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra3ActionPerformed
     Supplier spp = null;
        try {
            spp = new Supplier();
        } catch (SQLException ex) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    spp.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_keltra3ActionPerformed

    private void keltra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra4ActionPerformed
        Barang brg = null;
        try {
            brg = new Barang();
        } catch (SQLException ex) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
        brg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keltra4ActionPerformed

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
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Barang().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hps;
    private javax.swing.JButton btn_smpn;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kelpropil;
    private javax.swing.JButton keltra;
    private javax.swing.JButton keltra2;
    private javax.swing.JButton keltra3;
    private javax.swing.JButton keltra4;
    private javax.swing.JTable tbl_barang;
    private javax.swing.JTextField txt_hrg;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jns;
    private javax.swing.JTextField txt_namabrg;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        txt_id.setText("");
        txt_namabrg.setText("");
        txt_hrg.setText("");
        txt_jns.setText("");
        txt_stok.setText("");
    }
}
