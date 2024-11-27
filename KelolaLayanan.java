
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


public class KelolaLayanan extends javax.swing.JFrame {
    
    private Connection konek;
    
    public KelolaLayanan() throws SQLException {
       initComponents();
       konek = ClassKoneksi.GetConnection();
        getData();
    }
    private void getData(){
        DefaultTableModel model =(DefaultTableModel) tbl_layanan.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "Select * From layanan";
            PreparedStatement st = konek.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                String ID_Layanan = rs.getString("ID_layanan");
                String Jenis_Layanan = rs.getString("jenis_layanan");
                String Harga = rs.getString("harga");
                String ID_Karyawan = rs.getString("ID_karyawan");
                String Layanan_Populer = rs.getString("Layanan_populer");
                
                
                Object[] rowData = {ID_Layanan,Jenis_Layanan,Harga,ID_Karyawan,Layanan_Populer};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        }catch (SQLException ex) {
            Logger.getLogger(KelolaLayanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_jnslyn = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        keltra2 = new javax.swing.JButton();
        keltra3 = new javax.swing.JButton();
        keltra4 = new javax.swing.JButton();
        keltra5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hps = new javax.swing.JButton();
        btn_smpn = new javax.swing.JButton();
        txt_hrg = new javax.swing.JTextField();
        txt_laypop = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_layanan = new javax.swing.JTable();
        txt_jelay = new javax.swing.JTextField();
        txt_IDlay = new javax.swing.JTextField();
        cbx_IDkar = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        txt_jnslyn.setBackground(new java.awt.Color(153, 163, 239));
        txt_jnslyn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_jnslyn.setForeground(new java.awt.Color(255, 255, 255));
        txt_jnslyn.setBorder(null);
        txt_jnslyn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jnslynActionPerformed(evt);
            }
        });

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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 230, 60));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 230, 60));

        keltra2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra2.setBorder(null);
        keltra2.setBorderPainted(false);
        keltra2.setContentAreaFilled(false);
        keltra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra2ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 210, 40));

        keltra3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra3.setBorder(null);
        keltra3.setBorderPainted(false);
        keltra3.setContentAreaFilled(false);
        keltra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra3ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 220, 50));

        keltra4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra4.setBorder(null);
        keltra4.setBorderPainted(false);
        keltra4.setContentAreaFilled(false);
        keltra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra4ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 50));

        keltra5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra5.setBorder(null);
        keltra5.setBorderPainted(false);
        keltra5.setContentAreaFilled(false);
        keltra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra5ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 220, 40));

        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 240, 40));

        btn_edit.setBorder(null);
        btn_edit.setBorderPainted(false);
        btn_edit.setContentAreaFilled(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 140, 30));

        btn_hps.setBorder(null);
        btn_hps.setBorderPainted(false);
        btn_hps.setContentAreaFilled(false);
        btn_hps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hpsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hps, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 130, 30));

        btn_smpn.setBorder(null);
        btn_smpn.setBorderPainted(false);
        btn_smpn.setContentAreaFilled(false);
        btn_smpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_smpnActionPerformed(evt);
            }
        });
        getContentPane().add(btn_smpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 370, 130, 30));

        txt_hrg.setBackground(new java.awt.Color(153, 163, 239));
        txt_hrg.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_hrg.setForeground(new java.awt.Color(255, 255, 255));
        txt_hrg.setBorder(null);
        txt_hrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hrgActionPerformed(evt);
            }
        });
        getContentPane().add(txt_hrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 227, 600, 25));

        txt_laypop.setBackground(new java.awt.Color(153, 163, 239));
        txt_laypop.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_laypop.setForeground(new java.awt.Color(255, 255, 255));
        txt_laypop.setBorder(null);
        txt_laypop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_laypopActionPerformed(evt);
            }
        });
        getContentPane().add(txt_laypop, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 600, 25));

        tbl_layanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Layanan", "Jenis Layanan", "Harga", "ID_Karyawan", "Layanan_Populer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_layanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_layananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_layanan);
        if (tbl_layanan.getColumnModel().getColumnCount() > 0) {
            tbl_layanan.getColumnModel().getColumn(0).setResizable(false);
            tbl_layanan.getColumnModel().getColumn(1).setResizable(false);
            tbl_layanan.getColumnModel().getColumn(2).setResizable(false);
            tbl_layanan.getColumnModel().getColumn(3).setResizable(false);
            tbl_layanan.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 890, 270));

        txt_jelay.setBackground(new java.awt.Color(153, 163, 239));
        txt_jelay.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_jelay.setForeground(new java.awt.Color(255, 255, 255));
        txt_jelay.setBorder(null);
        txt_jelay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jelayActionPerformed(evt);
            }
        });
        getContentPane().add(txt_jelay, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 600, 25));

        txt_IDlay.setBackground(new java.awt.Color(153, 163, 239));
        txt_IDlay.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_IDlay.setForeground(new java.awt.Color(255, 255, 255));
        txt_IDlay.setBorder(null);
        txt_IDlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDlayActionPerformed(evt);
            }
        });
        getContentPane().add(txt_IDlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 135, 600, 25));

        cbx_IDkar.setBackground(new java.awt.Color(153, 163, 239));
        cbx_IDkar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cbx_IDkar.setForeground(new java.awt.Color(255, 255, 255));
        cbx_IDkar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "K1", "K2", "K3", "K4" }));
        cbx_IDkar.setBorder(null);
        cbx_IDkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_IDkarActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_IDkar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 290, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\UMKM\\kelola layanan.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Dashboard dshb = new Dashboard();
        dshb.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Customer ctm = null;
        try {
            ctm = new Customer();
        } catch (SQLException ex) {
            Logger.getLogger(KelolaLayanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        ctm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void keltra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra2ActionPerformed
Profil prf = null;
        try {
            prf = new Profil();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRjual.class.getName()).log(Level.SEVERE, null, ex);
        }
        prf.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_keltra2ActionPerformed

    private void keltra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra3ActionPerformed
        Kelola_TRbeli trb = null;
        try {
            trb = new Kelola_TRbeli();
        } catch (SQLException ex) {
            Logger.getLogger(KelolaLayanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        trb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keltra3ActionPerformed

    private void keltra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra4ActionPerformed
        Barang brg = null;
        try {
            brg = new Barang();
        } catch (SQLException ex) {
            Logger.getLogger(KelolaLayanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        brg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keltra4ActionPerformed

    private void keltra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra5ActionPerformed
      Supplier spp = null;
        try {
            spp = new Supplier();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE, null, ex);
        }
    spp.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_keltra5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Keluar klr = new Keluar();
        klr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int selectedRow = tbl_layanan.getSelectedRow();
        if(selectedRow == -1) {
            JOptionPane.showMessageDialog(this,"Pilih baris yang akan di Perbarui");
            return;
        }

        String ID_Layanan = txt_IDlay.getText();
        String Jenis_Layanan = txt_jelay.getText();
        String Harga = txt_hrg.getText();
        String ID_Karyawan = cbx_IDkar.getSelectedItem().toString();
        String Layanan_Populer = txt_laypop.getText();
        

        if(ID_Layanan.isEmpty() || Jenis_Layanan.isEmpty() || Harga.isEmpty() || ID_Karyawan.isEmpty() || Layanan_Populer.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Semua kolom harus diisi !","Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "UPDATE layanan SET ID_layanan=?, Jenis_Layanan=?, Harga=?, ID_karyawan=?, Layanan_populer=? WHERE ID_layanan=?";
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1,ID_Layanan);
            st.setString(2,Jenis_Layanan);
            st.setString(3,Harga);
            st.setString(4,ID_Karyawan);
            st.setString(5,Layanan_Populer);
            st.setString(6,ID_Layanan);

            int rowUpdate = st.executeUpdate();
            if(rowUpdate > 0) {
                JOptionPane.showMessageDialog(this,"Data Berhasil Diperbarui");
                resetForm();
                getData();
            }

            st.close();
        } catch (Exception e) {
            Logger.getLogger(KelolaLayanan.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hpsActionPerformed
        int selectedRow = tbl_layanan.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this,"Pilih baris yang akan di hapus");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin mengapus data ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String ID_Layanan = tbl_layanan.getValueAt(selectedRow, 0).toString();

            try{
                String sql = "DELETE FROM layanan WHERE ID_layanan=?";
                PreparedStatement st = konek.prepareStatement(sql);
                st.setString(1, ID_Layanan);

                int rowDelete = st.executeUpdate();
                if(rowDelete > 0){
                    JOptionPane.showMessageDialog(this,"Data berhasil dihapus");
                    resetForm();
                    getData();
                }

                st.close();
            }catch (Exception e){
                Logger.getLogger(KelolaLayanan.class.getName()).log(Level.SEVERE,null, e);
            }
        }
    }//GEN-LAST:event_btn_hpsActionPerformed

    private void btn_smpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_smpnActionPerformed
        String ID_Layanan = txt_IDlay.getText();
        String Jenis_Layanan = txt_jelay.getText();
        String Harga = txt_hrg.getText();
        String ID_Karyawan = cbx_IDkar.getSelectedItem().toString();
        String Layanan_Populer = txt_laypop.getText();
        

        if(ID_Layanan.isEmpty() || Jenis_Layanan.isEmpty() || Harga.isEmpty() || ID_Karyawan.isEmpty() || Layanan_Populer.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        }

        try{
            String sql = "INSERT INTO layanan (ID_layanan,jenis_layanan,harga,ID_karyawan,Layanan_populer) VALUES (?,?,?,?,?)";
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1,ID_Layanan);
            st.setString(2,Jenis_Layanan);
            st.setString(3,Harga);
            st.setString(4,ID_Karyawan);
            st.setString(5,Layanan_Populer);
            

            int rowInserted = st.executeUpdate();
            if(rowInserted > 0){
                JOptionPane.showMessageDialog(this,"Data Berhasil Ditambahkan");
                resetForm();
                getData();
            }

            st.close();
        } catch (Exception e) {
            Logger.getLogger(KelolaLayanan.class.getName()).log(Level.SEVERE,null, e);
        }
    }//GEN-LAST:event_btn_smpnActionPerformed

    private void txt_hrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hrgActionPerformed

    private void txt_jnslynActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jnslynActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jnslynActionPerformed

    private void txt_jelayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jelayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jelayActionPerformed

    private void txt_laypopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_laypopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_laypopActionPerformed

    private void txt_IDlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDlayActionPerformed

    private void tbl_layananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_layananMouseClicked
     int selectedRow = tbl_layanan.getSelectedRow();
if(selectedRow != -1) {
    
    Object idLayananObj = tbl_layanan.getValueAt(selectedRow, 0);
    Object jenisLayananObj = tbl_layanan.getValueAt(selectedRow, 1);
    Object hargaObj = tbl_layanan.getValueAt(selectedRow, 2);
    Object idKaryawanObj = tbl_layanan.getValueAt(selectedRow, 3);
    Object layananPopulerObj = tbl_layanan.getValueAt(selectedRow, 4);

    String ID_Layanan = (idLayananObj != null) ? idLayananObj.toString() : "";
    String Jenis_Layanan = (jenisLayananObj != null) ? jenisLayananObj.toString() : "";
    String Harga = (hargaObj != null) ? hargaObj.toString() : "";
    String ID_Karyawan = (idKaryawanObj != null) ? idKaryawanObj.toString() : "";
    String Layanan_Populer = (layananPopulerObj != null) ? layananPopulerObj.toString() : "";

    txt_IDlay.setText(ID_Layanan);
    txt_jelay.setText(Jenis_Layanan);
    txt_hrg.setText(Harga);
    cbx_IDkar.setSelectedItem(ID_Karyawan);
    txt_laypop.setText(Layanan_Populer);
}
    }//GEN-LAST:event_tbl_layananMouseClicked

    private void cbx_IDkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_IDkarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_IDkarActionPerformed

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
            java.util.logging.Logger.getLogger(KelolaLayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaLayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaLayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaLayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new KelolaLayanan().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(KelolaLayanan.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hps;
    private javax.swing.JButton btn_smpn;
    private javax.swing.JComboBox<String> cbx_IDkar;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keltra2;
    private javax.swing.JButton keltra3;
    private javax.swing.JButton keltra4;
    private javax.swing.JButton keltra5;
    private javax.swing.JTable tbl_layanan;
    private javax.swing.JTextField txt_IDlay;
    private javax.swing.JTextField txt_hrg;
    private javax.swing.JTextField txt_jelay;
    private javax.swing.JTextField txt_jnslyn;
    private javax.swing.JTextField txt_laypop;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        txt_IDlay.setText("");
        txt_jelay.setText("");
        txt_hrg.setText("");
        cbx_IDkar.setSelectedItem("");
        txt_laypop.setText("");
    }
}
