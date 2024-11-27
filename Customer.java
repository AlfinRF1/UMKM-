
package Karyawan;

import Koneksi.ClassKoneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customer extends javax.swing.JFrame {

    private Connection konek;
    
    public Customer() throws SQLException{
        initComponents();
        konek = ClassKoneksi.GetConnection();
        getData();
    }
    
    private void getData(){
        DefaultTableModel model =(DefaultTableModel) tbl_customer.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "Select * From customer";
            PreparedStatement st = konek.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                String ID_Customer = rs.getString("ID_customer");
                String Nama_Customer = rs.getString("Nama_Customer");
                String No_Telepon = rs.getString("No_Telp");
                String Alamat = rs.getString("Alamat");
                String Jenis_Layanan = rs.getString("Jenis_Layanan");
                String Berat_Barang = rs.getString("Berat_Barang");
                
                Object[] rowData = {ID_Customer,Nama_Customer,No_Telepon,Alamat,Jenis_Layanan,Berat_Barang};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        }catch (Exception e){
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE,null, e);
        }
    }
        
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        kelpropil = new javax.swing.JButton();
        keltra = new javax.swing.JButton();
        kelba = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        keltra2 = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        txt_ID = new javax.swing.JTextField();
        txt_telepon = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_jenislyn = new javax.swing.JTextField();
        txt_beratbrg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_customer = new javax.swing.JTable();
        txt_nama = new javax.swing.JTextField();
        btn_edit = new javax.swing.JButton();
        keltra3 = new javax.swing.JButton();
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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 230, 50));

        kelpropil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kelpropil.setBorder(null);
        kelpropil.setBorderPainted(false);
        kelpropil.setContentAreaFilled(false);
        kelpropil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelpropilActionPerformed(evt);
            }
        });
        getContentPane().add(kelpropil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 50));

        keltra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra.setBorder(null);
        keltra.setBorderPainted(false);
        keltra.setContentAreaFilled(false);
        keltra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltraActionPerformed(evt);
            }
        });
        getContentPane().add(keltra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 220, 40));

        kelba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kelba.setBorder(null);
        kelba.setBorderPainted(false);
        kelba.setContentAreaFilled(false);
        kelba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelbaActionPerformed(evt);
            }
        });
        getContentPane().add(kelba, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 220, 40));

        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 240, 50));

        keltra2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra2.setBorder(null);
        keltra2.setBorderPainted(false);
        keltra2.setContentAreaFilled(false);
        keltra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra2ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 220, 50));

        btn_hapus.setBorder(null);
        btn_hapus.setBorderPainted(false);
        btn_hapus.setContentAreaFilled(false);
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 130, 30));

        btn_simpan.setBorder(null);
        btn_simpan.setBorderPainted(false);
        btn_simpan.setContentAreaFilled(false);
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 420, 140, 30));

        txt_ID.setBackground(new java.awt.Color(153, 163, 239));
        txt_ID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_ID.setForeground(new java.awt.Color(255, 255, 255));
        txt_ID.setBorder(null);
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 135, 590, 25));
        txt_ID.getAccessibleContext().setAccessibleName("");

        txt_telepon.setBackground(new java.awt.Color(153, 163, 239));
        txt_telepon.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_telepon.setForeground(new java.awt.Color(255, 255, 255));
        txt_telepon.setBorder(null);
        getContentPane().add(txt_telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 225, 590, 25));

        txt_alamat.setBackground(new java.awt.Color(153, 163, 239));
        txt_alamat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_alamat.setForeground(new java.awt.Color(255, 255, 255));
        txt_alamat.setBorder(null);
        getContentPane().add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 590, 25));

        txt_jenislyn.setBackground(new java.awt.Color(153, 163, 239));
        txt_jenislyn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_jenislyn.setForeground(new java.awt.Color(255, 255, 255));
        txt_jenislyn.setBorder(null);
        txt_jenislyn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jenislynActionPerformed(evt);
            }
        });
        getContentPane().add(txt_jenislyn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 313, 590, 26));

        txt_beratbrg.setBackground(new java.awt.Color(153, 163, 239));
        txt_beratbrg.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_beratbrg.setForeground(new java.awt.Color(255, 255, 255));
        txt_beratbrg.setBorder(null);
        getContentPane().add(txt_beratbrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 358, 590, -1));

        tbl_customer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Customer", "Nama Customer", "No. Telepon", "Alamat", "Jenis Layanan", "Berat Barang"
            }
        ));
        tbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_customerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_customer);
        if (tbl_customer.getColumnModel().getColumnCount() > 0) {
            tbl_customer.getColumnModel().getColumn(0).setResizable(false);
            tbl_customer.getColumnModel().getColumn(1).setResizable(false);
            tbl_customer.getColumnModel().getColumn(2).setResizable(false);
            tbl_customer.getColumnModel().getColumn(3).setResizable(false);
            tbl_customer.getColumnModel().getColumn(4).setResizable(false);
            tbl_customer.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 920, 220));

        txt_nama.setBackground(new java.awt.Color(153, 163, 239));
        txt_nama.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_nama.setForeground(new java.awt.Color(255, 255, 255));
        txt_nama.setBorder(null);
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 590, 25));

        btn_edit.setBorder(null);
        btn_edit.setBorderPainted(false);
        btn_edit.setContentAreaFilled(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 140, 30));

        keltra3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra3.setBorder(null);
        keltra3.setBorderPainted(false);
        keltra3.setContentAreaFilled(false);
        keltra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra3ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 210, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\UMKM\\CUSTOMER.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Dashboard dshb = new Dashboard();
        dshb.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void kelpropilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelpropilActionPerformed
        // TODO add your handling code here:
        KelolaLayanan klly = null;
        try {
            klly = new KelolaLayanan();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        brg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kelbaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Keluar klr = new Keluar();
        klr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String ID_Customer = txt_ID.getText();
        String Nama_Customer = txt_nama.getText();
        String No_Telepon = txt_telepon.getText();
        String Alamat = txt_alamat.getText();
        String Jenis_Layanan = txt_jenislyn.getText();
        String Berat_Barang = txt_beratbrg.getText();
        
        if(ID_Customer.isEmpty() || Nama_Customer.isEmpty() || No_Telepon.isEmpty() || Alamat.isEmpty() || Jenis_Layanan.isEmpty() || Berat_Barang.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        try{
            String sql = "INSERT INTO customer (ID_Customer,Nama_Customer,No_Telp,Alamat,Jenis_Layanan,Berat_Barang) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1,ID_Customer);
            st.setString(2,Nama_Customer);
            st.setString(3,No_Telepon);
            st.setString(4,Alamat);
            st.setString(5,Jenis_Layanan);
            st.setString(6,Berat_Barang);
            
            int rowInserted = st.executeUpdate();
            if(rowInserted > 0){
                JOptionPane.showMessageDialog(this,"Data Berhasil Ditambahkan");
                resetForm();
                getData();
            }
            
            st.close();
        }catch(Exception e) { 
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE,null, e);
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void tbl_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customerMouseClicked
        int selectedRow = tbl_customer.getSelectedRow();
        if(selectedRow != -1){
            String ID_Customer = tbl_customer.getValueAt(selectedRow, 0).toString();
            String Nama_Customer = tbl_customer.getValueAt(selectedRow, 1).toString();
            String Alamat = tbl_customer.getValueAt(selectedRow, 2).toString();
            String No_Telepon = tbl_customer.getValueAt(selectedRow, 3).toString();   
            String Jenis_Layanan = tbl_customer.getValueAt(selectedRow, 4).toString();
            String Berat_Barang = tbl_customer.getValueAt(selectedRow, 5).toString();
            
            txt_ID.setText(ID_Customer);
            txt_nama.setText(Nama_Customer);
            txt_telepon.setText(No_Telepon);
            txt_alamat.setText(Alamat);
            txt_jenislyn.setText(Jenis_Layanan);
            txt_beratbrg.setText(Berat_Barang);
        }
    }//GEN-LAST:event_tbl_customerMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int selectedRow = tbl_customer.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this,"Pilih baris yang akan di hapus");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin mengapus data ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String ID_Customer = tbl_customer.getValueAt(selectedRow, 0).toString();
            
            try{
                String sql = "DELETE FROM customer WHERE ID_customer=?";
                PreparedStatement st = konek.prepareStatement(sql);
                st.setString(1, ID_Customer);
                
                int rowDelete = st.executeUpdate();
                if(rowDelete > 0){
                    JOptionPane.showMessageDialog(this,"Data berhasil dihapus");
                    resetForm();
                    getData();
                }
                
                st.close();
            }catch (Exception e){
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE,null, e);
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
     int selectedRow = tbl_customer.getSelectedRow();
     if(selectedRow == -1) {
         JOptionPane.showMessageDialog(this,"Pilih baris yang akan di Perbarui");
         return;
     }
     
     String ID_Customer = txt_ID.getText();
     String Nama_Customer = txt_nama.getText();
     String Alamat = txt_alamat.getText();
     String No_Telepon = txt_telepon.getText();
     String Jenis_Layanan = txt_jenislyn.getText();
     String Berat_Barang = txt_beratbrg.getText();
     
     if(ID_Customer.isEmpty() || Nama_Customer.isEmpty() || Alamat.isEmpty() || No_Telepon.isEmpty() || Jenis_Layanan.isEmpty() || Berat_Barang.isEmpty()) {
         JOptionPane.showMessageDialog(this,"Semua kolom harus diisi !","Validasi",JOptionPane.ERROR_MESSAGE);
         return;
     }
     
     try {
         String sql = "UPDATE customer SET ID_customer=?, Nama_Customer=?, No_Telp=?, Alamat=?, Jenis_Layanan=?, Berat_Barang=? WHERE ID_customer=?";
         PreparedStatement st = konek.prepareStatement(sql);
         st.setString(1,ID_Customer);
         st.setString(2,Nama_Customer);
         st.setString(3,Alamat);
         st.setString(4,No_Telepon);
         st.setString(5,Jenis_Layanan);
         st.setString(6,Berat_Barang);
         st.setString(7,ID_Customer);
         
         int rowUpdate = st.executeUpdate();
         if(rowUpdate > 0) {
             JOptionPane.showMessageDialog(this,"Data Berhasil Diperbarui");
             resetForm();
             getData();
         }
         
         st.close();
     } catch (Exception e) {
         Logger.getLogger(Customer.class.getName()).log(Level.SEVERE,null,e);
     }
    }//GEN-LAST:event_btn_editActionPerformed

    private void keltra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra3ActionPerformed
    Supplier spp = null;
        try {
            spp = new Supplier();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    spp.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_keltra3ActionPerformed

    private void txt_jenislynActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jenislynActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jenislynActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Customer().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kelba;
    private javax.swing.JButton kelpropil;
    private javax.swing.JButton keltra;
    private javax.swing.JButton keltra2;
    private javax.swing.JButton keltra3;
    private javax.swing.JTable tbl_customer;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_beratbrg;
    private javax.swing.JTextField txt_jenislyn;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_telepon;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        txt_ID.setText("");
        txt_nama.setText("");
        txt_telepon.setText("");
        txt_alamat.setText("");
        txt_jenislyn.setText("");
        txt_beratbrg.setText("");
    }

}

