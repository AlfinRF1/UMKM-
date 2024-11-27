
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


public class Kelola_TRbeli extends javax.swing.JFrame {
    
    private Connection konek;
    
    public Kelola_TRbeli() throws SQLException{
        initComponents();
        konek = ClassKoneksi.GetConnection();
        getData();
    }
    
    private void getData(){
        DefaultTableModel model =(DefaultTableModel) tbl_TRbeli.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "Select * From transaksi_beli";
            PreparedStatement st = konek.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                String ID_Barang = rs.getString("ID_barang");
                String Nama_Supplier = rs.getString("Nama_Supplier");
                String Nama_Barang = rs.getString("Nama_Barang");
                String Alamat_Supplier = rs.getString("Alamat_Supplier");
                String Total_Harga = rs.getString("Total_Harga");
                String Jumlah_Barang = rs.getString("Jumlah_Barang");
                
                
                Object[] rowData = {ID_Barang,Nama_Supplier,Nama_Barang,Alamat_Supplier,Total_Harga,Jumlah_Barang};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        }catch (Exception e){
            Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_dashboard = new javax.swing.JButton();
        btn_cus = new javax.swing.JButton();
        btn_lay = new javax.swing.JButton();
        btn_TRjual = new javax.swing.JButton();
        btn_brg = new javax.swing.JButton();
        btn_profile = new javax.swing.JButton();
        btn_klr = new javax.swing.JButton();
        txt_ID = new javax.swing.JTextField();
        txt_namabrg = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_ttlhrg = new javax.swing.JTextField();
        txt_jmlbrg = new javax.swing.JTextField();
        btn_smpn = new javax.swing.JButton();
        btn_hps = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_TRbeli = new javax.swing.JTable();
        keltra = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        keltra5 = new javax.swing.JButton();
        cbx_nasup = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_dashboard.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_dashboard.setBorderPainted(false);
        btn_dashboard.setContentAreaFilled(false);
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 50));

        btn_cus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_cus.setBorder(null);
        btn_cus.setBorderPainted(false);
        btn_cus.setContentAreaFilled(false);
        btn_cus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 50));

        btn_lay.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_lay.setBorder(null);
        btn_lay.setBorderPainted(false);
        btn_lay.setContentAreaFilled(false);
        btn_lay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_layActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 220, 50));

        btn_TRjual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_TRjual.setBorder(null);
        btn_TRjual.setBorderPainted(false);
        btn_TRjual.setContentAreaFilled(false);
        btn_TRjual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TRjualActionPerformed(evt);
            }
        });
        getContentPane().add(btn_TRjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 210, 30));

        btn_brg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_brg.setBorder(null);
        btn_brg.setBorderPainted(false);
        btn_brg.setContentAreaFilled(false);
        btn_brg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_brgActionPerformed(evt);
            }
        });
        getContentPane().add(btn_brg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 190, 50));

        btn_profile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_profile.setBorder(null);
        btn_profile.setBorderPainted(false);
        btn_profile.setContentAreaFilled(false);
        btn_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_profileActionPerformed(evt);
            }
        });
        getContentPane().add(btn_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 200, 40));

        btn_klr.setBorder(null);
        btn_klr.setBorderPainted(false);
        btn_klr.setContentAreaFilled(false);
        btn_klr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_klrActionPerformed(evt);
            }
        });
        getContentPane().add(btn_klr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 200, 50));

        txt_ID.setBackground(new java.awt.Color(153, 163, 239));
        txt_ID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_ID.setForeground(new java.awt.Color(255, 255, 255));
        txt_ID.setBorder(null);
        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 230, 30));

        txt_namabrg.setBackground(new java.awt.Color(153, 163, 239));
        txt_namabrg.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_namabrg.setForeground(new java.awt.Color(255, 255, 255));
        txt_namabrg.setBorder(null);
        getContentPane().add(txt_namabrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 200, 30));

        txt_alamat.setBackground(new java.awt.Color(153, 163, 239));
        txt_alamat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_alamat.setForeground(new java.awt.Color(255, 255, 255));
        txt_alamat.setBorder(null);
        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });
        getContentPane().add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, 180, 30));

        txt_ttlhrg.setBackground(new java.awt.Color(153, 163, 239));
        txt_ttlhrg.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_ttlhrg.setForeground(new java.awt.Color(255, 255, 255));
        txt_ttlhrg.setBorder(null);
        getContentPane().add(txt_ttlhrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 200, 220, 30));

        txt_jmlbrg.setBackground(new java.awt.Color(153, 163, 239));
        txt_jmlbrg.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_jmlbrg.setForeground(new java.awt.Color(255, 255, 255));
        txt_jmlbrg.setBorder(null);
        getContentPane().add(txt_jmlbrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 290, 190, 30));

        btn_smpn.setBorder(null);
        btn_smpn.setBorderPainted(false);
        btn_smpn.setContentAreaFilled(false);
        btn_smpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_smpnActionPerformed(evt);
            }
        });
        getContentPane().add(btn_smpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, 130, 40));

        btn_hps.setBorder(null);
        btn_hps.setBorderPainted(false);
        btn_hps.setContentAreaFilled(false);
        btn_hps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hpsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hps, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 130, 40));

        tbl_TRbeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_Barang", "Nama Supplier", "Nama Barang", "Alamat Supplier", "Total Harga", "Jumlah Barang"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_TRbeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TRbeliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_TRbeli);
        if (tbl_TRbeli.getColumnModel().getColumnCount() > 0) {
            tbl_TRbeli.getColumnModel().getColumn(0).setResizable(false);
            tbl_TRbeli.getColumnModel().getColumn(1).setResizable(false);
            tbl_TRbeli.getColumnModel().getColumn(2).setResizable(false);
            tbl_TRbeli.getColumnModel().getColumn(3).setResizable(false);
            tbl_TRbeli.getColumnModel().getColumn(4).setResizable(false);
            tbl_TRbeli.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 900, 240));

        keltra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra.setBorder(null);
        keltra.setBorderPainted(false);
        keltra.setContentAreaFilled(false);
        keltra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltraActionPerformed(evt);
            }
        });
        getContentPane().add(keltra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 210, 40));

        btn_edit.setBorder(null);
        btn_edit.setBorderPainted(false);
        btn_edit.setContentAreaFilled(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 140, 40));

        keltra5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra5.setBorder(null);
        keltra5.setBorderPainted(false);
        keltra5.setContentAreaFilled(false);
        keltra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra5ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 220, 50));

        cbx_nasup.setBackground(new java.awt.Color(153, 163, 239));
        cbx_nasup.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cbx_nasup.setForeground(new java.awt.Color(255, 255, 255));
        cbx_nasup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Griya Wangi Parfum", "Berkah Jaya Plastik" }));
        cbx_nasup.setBorder(null);
        cbx_nasup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_nasupActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_nasup, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\UMKM\\kelola transaksi beli.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        Dashboard dshb = new Dashboard();
        dshb.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_cusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cusActionPerformed
      try {
            Customer ctm = new Customer();
            ctm.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_cusActionPerformed

    private void btn_layActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_layActionPerformed
        KelolaLayanan klly = null;
        try {
            klly = new KelolaLayanan();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE, null, ex);
        }
        klly.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_layActionPerformed

    private void btn_TRjualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TRjualActionPerformed
        Kelola_TRjual trj = null;
        try {
            trj = new Kelola_TRjual();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE, null, ex);
        }
        trj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_TRjualActionPerformed

    private void btn_brgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_brgActionPerformed
        Barang brg = null;
        try {
            brg = new Barang();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE, null, ex);
        }
        brg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_brgActionPerformed

    private void btn_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_profileActionPerformed
         Profil prf = null;
        try {
            prf = new Profil();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        prf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_profileActionPerformed

    private void btn_klrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_klrActionPerformed
        Keluar klr = new Keluar();
        klr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_klrActionPerformed

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void btn_smpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_smpnActionPerformed
        String ID_Barang = txt_ID.getText();
        String Nama_Supplier = cbx_nasup.getSelectedItem().toString();
        String Nama_Barang = txt_namabrg.getText();
        String Alamat_Supplier = txt_alamat.getText();
        String Total_Harga = txt_ttlhrg.getText();
        String Jumlah_Barang = txt_jmlbrg.getText();

        if(ID_Barang.isEmpty() || Nama_Supplier.isEmpty() || Nama_Barang.isEmpty() || Alamat_Supplier.isEmpty() || Total_Harga.isEmpty() || Jumlah_Barang.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        }

        try{
            String sql = "INSERT INTO transaksi_beli (ID_barang,Nama_Supplier,Nama_Barang,Alamat_Supplier,Total_Harga,Jumlah_Barang) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1,ID_Barang);
            st.setString(2,Nama_Supplier);
            st.setString(3,Nama_Barang);
            st.setString(4,Alamat_Supplier);
            st.setString(5,Total_Harga);
            st.setString(6,Jumlah_Barang);

            int rowInserted = st.executeUpdate();
            if(rowInserted > 0){
                JOptionPane.showMessageDialog(this,"Data Berhasil Ditambahkan");
                resetForm();
                getData();
            }

            st.close();
        }catch (Exception e) {
            Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE,null, e);
        }
    }//GEN-LAST:event_btn_smpnActionPerformed

    private void btn_hpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hpsActionPerformed
        int selectedRow = tbl_TRbeli.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this,"Pilih baris yang akan di hapus");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin mengapus data ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String ID_Barang = tbl_TRbeli.getValueAt(selectedRow, 0).toString();
            
            try{
                String sql = "DELETE FROM transaksi_beli WHERE ID_barang=?";
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
                Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE,null, e);
            }
        }
    }//GEN-LAST:event_btn_hpsActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void keltraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltraActionPerformed
        Kelola_TRjual trj = null;
        try {
            trj = new Kelola_TRjual();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE, null, ex);
        }
        trj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keltraActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int selectedRow = tbl_TRbeli.getSelectedRow();
        if(selectedRow == -1) {
            JOptionPane.showMessageDialog(this,"Pilih baris yang akan di Perbarui");
            return;
        }

        String ID_Barang = txt_ID.getText();
        String Nama_Supplier = cbx_nasup.getSelectedItem().toString();
        String Nama_Barang = txt_namabrg.getText();
        String Alamat_Supplier = txt_alamat.getText();
        String Total_Harga = txt_ttlhrg.getText();
        String Jumlah_Barang = txt_jmlbrg.getText();

        if(ID_Barang.isEmpty() || Nama_Supplier.isEmpty() || Nama_Barang.isEmpty() || Alamat_Supplier.isEmpty() || Total_Harga.isEmpty() || Jumlah_Barang.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Semua kolom harus diisi !","Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "UPDATE transaksi_beli SET ID_barang=?, Nama_Supplier=?, Nama_Barang=?, Alamat_Supplier=?, total_harga=?, Jumlah_Barang=? WHERE ID_barang=?";
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1,ID_Barang);
            st.setString(2,Nama_Supplier);
            st.setString(3,Nama_Barang);
            st.setString(4,Alamat_Supplier);
            st.setString(5,Total_Harga);
            st.setString(6,Jumlah_Barang);
            st.setString(7,ID_Barang);

            int rowUpdate = st.executeUpdate();
            if(rowUpdate > 0) {
                JOptionPane.showMessageDialog(this,"Data Berhasil Diperbarui");
                resetForm();
                getData();
            }

            st.close();
        } catch (Exception e) {
            Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void tbl_TRbeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TRbeliMouseClicked
        int selectedRow = tbl_TRbeli.getSelectedRow();
if(selectedRow != -1) {

    Object idBarangObj = tbl_TRbeli.getValueAt(selectedRow, 0);
    Object namaSupplierObj = tbl_TRbeli.getValueAt(selectedRow, 1);
    Object namaBarangObj = tbl_TRbeli.getValueAt(selectedRow, 2);
    Object alamatObj = tbl_TRbeli.getValueAt(selectedRow, 3);
    Object totalHargaObj = tbl_TRbeli.getValueAt(selectedRow, 4);
    Object jumlahBarangObj = tbl_TRbeli.getValueAt(selectedRow, 5);

    String ID_Barang = (idBarangObj != null) ? idBarangObj.toString() : "";
    String Nama_Supplier = (namaSupplierObj != null) ? namaSupplierObj.toString() : "";
    String Nama_Barang = (namaBarangObj != null) ? namaBarangObj.toString() : "";
    String Alamat = (alamatObj != null) ? alamatObj.toString() : "";
    String Total_Harga = (totalHargaObj != null) ? totalHargaObj.toString() : "";
    String Jumlah_Barang = (jumlahBarangObj != null) ? jumlahBarangObj.toString() : "";

    txt_ID.setText(ID_Barang);
    cbx_nasup.setSelectedItem(Nama_Supplier);
    txt_namabrg.setText(Nama_Barang);
    txt_alamat.setText(Alamat);
    txt_ttlhrg.setText(Total_Harga);
    txt_jmlbrg.setText(Jumlah_Barang);
}
    }//GEN-LAST:event_tbl_TRbeliMouseClicked

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

    private void cbx_nasupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_nasupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_nasupActionPerformed

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
            java.util.logging.Logger.getLogger(Kelola_TRbeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kelola_TRbeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kelola_TRbeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kelola_TRbeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Kelola_TRbeli().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_TRjual;
    private javax.swing.JButton btn_brg;
    private javax.swing.JButton btn_cus;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hps;
    private javax.swing.JButton btn_klr;
    private javax.swing.JButton btn_lay;
    private javax.swing.JButton btn_profile;
    private javax.swing.JButton btn_smpn;
    private javax.swing.JComboBox<String> cbx_nasup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keltra;
    private javax.swing.JButton keltra5;
    private javax.swing.JTable tbl_TRbeli;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_jmlbrg;
    private javax.swing.JTextField txt_namabrg;
    private javax.swing.JTextField txt_ttlhrg;
    // End of variables declaration//GEN-END:variables
  private void resetForm() {
        txt_ID.setText("");
        cbx_nasup.setSelectedItem("");
        txt_namabrg.setText("");
        txt_alamat.setText("");
        txt_ttlhrg.setText("");
        txt_jmlbrg.setText("");
    }
}
