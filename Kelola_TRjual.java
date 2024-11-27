
package Karyawan;

import Koneksi.ClassKoneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Kelola_TRjual extends javax.swing.JFrame {

    private Connection konek;
    
    
    public Kelola_TRjual() throws SQLException{
        initComponents();
        konek = ClassKoneksi.GetConnection();
        getData();
              
    }
    
    
      private void showHarga() {
        try {
            String selectedID = cbx_A.getSelectedItem().toString();
            String sql = "SELECT harga FROM layanan WHERE ID_layanan = ?";
            PreparedStatement pst = konek.prepareStatement(sql);
            pst.setString(1, selectedID);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                int harga = rs.getInt("harga");
                lb_hrglyn.setText(String.valueOf(harga)); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      
    private void getData(){
        DefaultTableModel model =(DefaultTableModel) tbl_TRjual.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "Select * From transaksi_jual";
            PreparedStatement st = konek.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                String ID_Customer = rs.getString("ID_customer");
                String ID_Layanan = rs.getString("ID_layanan");
                String No_Nota = rs.getString("no_nota");
                String Tgl_Masuk = rs.getString("tgl_masuk");
                String Tgl_Terima = rs.getString("tgl_terima");
                String Harga_Layanan = rs.getString("harga_layanan");
                
                
                Object[] rowData = {ID_Customer,ID_Layanan,No_Nota,Tgl_Masuk,Tgl_Terima,Harga_Layanan};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        }catch (Exception e){
            Logger.getLogger(Kelola_TRjual.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        kelpropil = new javax.swing.JButton();
        keltra2 = new javax.swing.JButton();
        keltra3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_ID = new javax.swing.JTextField();
        txt_nota = new javax.swing.JTextField();
        txt_masuk = new javax.swing.JTextField();
        txt_terima = new javax.swing.JTextField();
        btn_hps = new javax.swing.JButton();
        btn_smpn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_TRjual = new javax.swing.JTable();
        btn_edit = new javax.swing.JButton();
        btn_TRjual1 = new javax.swing.JButton();
        keltra5 = new javax.swing.JButton();
        keltra6 = new javax.swing.JButton();
        cbx_A = new javax.swing.JComboBox<>();
        lb_hrglyn = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        dateChooser1.setForeground(new java.awt.Color(153, 153, 255));
        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setTextRefernce(txt_masuk);

        dateChooser2.setForeground(new java.awt.Color(153, 153, 255));
        dateChooser2.setDateFormat("yyyy-MM-dd");
        dateChooser2.setTextRefernce(txt_terima);

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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 230, 60));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, 40));

        kelpropil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kelpropil.setBorder(null);
        kelpropil.setBorderPainted(false);
        kelpropil.setContentAreaFilled(false);
        kelpropil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelpropilActionPerformed(evt);
            }
        });
        getContentPane().add(kelpropil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 240, 40));

        keltra2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra2.setBorder(null);
        keltra2.setBorderPainted(false);
        keltra2.setContentAreaFilled(false);
        keltra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra2ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 220, 50));

        keltra3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra3.setBorder(null);
        keltra3.setBorderPainted(false);
        keltra3.setContentAreaFilled(false);
        keltra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra3ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 210, 40));

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 200, 50));

        txt_ID.setBackground(new java.awt.Color(153, 163, 239));
        txt_ID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_ID.setForeground(new java.awt.Color(255, 255, 255));
        txt_ID.setBorder(null);
        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 147, 210, 30));

        txt_nota.setBackground(new java.awt.Color(153, 163, 239));
        txt_nota.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_nota.setForeground(new java.awt.Color(255, 255, 255));
        txt_nota.setBorder(null);
        getContentPane().add(txt_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 295, 240, 30));

        txt_masuk.setBackground(new java.awt.Color(153, 163, 239));
        txt_masuk.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_masuk.setForeground(new java.awt.Color(255, 255, 255));
        txt_masuk.setBorder(null);
        txt_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_masukActionPerformed(evt);
            }
        });
        getContentPane().add(txt_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, 190, 40));

        txt_terima.setBackground(new java.awt.Color(153, 163, 239));
        txt_terima.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_terima.setForeground(new java.awt.Color(255, 255, 255));
        txt_terima.setBorder(null);
        txt_terima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_terimaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_terima, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, 190, 40));

        btn_hps.setBorder(null);
        btn_hps.setBorderPainted(false);
        btn_hps.setContentAreaFilled(false);
        btn_hps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hpsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hps, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 140, 40));

        btn_smpn.setBorder(null);
        btn_smpn.setBorderPainted(false);
        btn_smpn.setContentAreaFilled(false);
        btn_smpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_smpnActionPerformed(evt);
            }
        });
        getContentPane().add(btn_smpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, 130, 40));

        tbl_TRjual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Customer", "ID Layanan", "No Nota", "Tgl Terima", "Tgl Selesai", "Harga Layanan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_TRjual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TRjualMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_TRjual);
        if (tbl_TRjual.getColumnModel().getColumnCount() > 0) {
            tbl_TRjual.getColumnModel().getColumn(0).setResizable(false);
            tbl_TRjual.getColumnModel().getColumn(1).setResizable(false);
            tbl_TRjual.getColumnModel().getColumn(2).setResizable(false);
            tbl_TRjual.getColumnModel().getColumn(3).setResizable(false);
            tbl_TRjual.getColumnModel().getColumn(4).setResizable(false);
            tbl_TRjual.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 900, 260));

        btn_edit.setBorder(null);
        btn_edit.setBorderPainted(false);
        btn_edit.setContentAreaFilled(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 140, 40));

        btn_TRjual1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_TRjual1.setBorder(null);
        btn_TRjual1.setBorderPainted(false);
        btn_TRjual1.setContentAreaFilled(false);
        btn_TRjual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TRjual1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_TRjual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 210, 30));

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

        keltra6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        keltra6.setBorder(null);
        keltra6.setBorderPainted(false);
        keltra6.setContentAreaFilled(false);
        keltra6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keltra6ActionPerformed(evt);
            }
        });
        getContentPane().add(keltra6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 220, 50));

        cbx_A.setBackground(new java.awt.Color(153, 163, 239));
        cbx_A.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cbx_A.setForeground(new java.awt.Color(255, 255, 255));
        cbx_A.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Cuci Basah", "2. Cuci Kering", "3. Setrika", "4. Cuci Setrika", "5. Dry Clean" }));
        cbx_A.setBorder(null);
        cbx_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_AActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 210, 30));

        lb_hrglyn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lb_hrglyn.setForeground(new java.awt.Color(255, 255, 255));
        lb_hrglyn.setText("0");
        getContentPane().add(lb_hrglyn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 290, 170, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 210, 30));

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 140, 40, 40));

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 210, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\UMKM\\kelola transaksi jual.jpg")); // NOI18N
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
            Logger.getLogger(Kelola_TRjual.class.getName()).log(Level.SEVERE, null, ex);
        }
        ctm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void kelpropilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelpropilActionPerformed
        KelolaLayanan klly = null;
        try {
            klly = new KelolaLayanan();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRjual.class.getName()).log(Level.SEVERE, null, ex);
        }
        klly.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kelpropilActionPerformed

    private void keltra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra2ActionPerformed
        Barang brg = null;
        try {
            brg = new Barang();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRjual.class.getName()).log(Level.SEVERE, null, ex);
        }
        brg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keltra2ActionPerformed

    private void keltra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra3ActionPerformed
        Profil prf = null;
        try {
            prf = new Profil();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRjual.class.getName()).log(Level.SEVERE, null, ex);
        }
        prf.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_keltra3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Keluar klr = new Keluar();
        klr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void txt_masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_masukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_masukActionPerformed

    private void btn_hpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hpsActionPerformed
    int selectedRow = tbl_TRjual.getSelectedRow();
    if(selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan di hapus");
        return;
    }
    
    int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin mengapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if(confirm == JOptionPane.YES_OPTION) {
        String No_Nota = tbl_TRjual.getValueAt(selectedRow, 2).toString();
        
        try {
            String sql = "DELETE FROM transaksi_jual WHERE no_nota=?";
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1, No_Nota);
            
            int rowDelete = st.executeUpdate();
            if(rowDelete > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                resetForm();
                getData();
            }
            
            st.close();
        } catch (SQLException e) {
            Logger.getLogger(Kelola_TRjual.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    }//GEN-LAST:event_btn_hpsActionPerformed

    private void btn_smpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_smpnActionPerformed
        String ID_Customer = txt_ID.getText();
        String ID_Layanan = cbx_A.getSelectedItem().toString();
        String No_Nota = txt_nota.getText();
        String Tgl_Masuk = txt_masuk.getText();
        String Tgl_Terima = txt_terima.getText();
        String Harga_Layanan = lb_hrglyn.getText();

        if(ID_Customer.isEmpty() || ID_Layanan.isEmpty() || No_Nota.isEmpty() || Tgl_Masuk.isEmpty() || Tgl_Terima.isEmpty() || Harga_Layanan.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        }

        try{
            String sql = "INSERT INTO transaksi_jual (ID_customer,ID_layanan,no_nota,tgl_masuk,tgl_terima,harga_layanan) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1,ID_Customer);
            st.setString(2,ID_Layanan);
            st.setString(3,No_Nota);
            st.setString(4,Tgl_Masuk);
            st.setString(5,Tgl_Terima);
            st.setString(6,Harga_Layanan);

            int rowInserted = st.executeUpdate();
            if(rowInserted > 0){
                JOptionPane.showMessageDialog(this,"Data Berhasil Ditambahkan");
                resetForm();
                getData();
            }

            st.close();
        } catch (Exception e) {
            Logger.getLogger(Kelola_TRjual.class.getName()).log(Level.SEVERE,null, e);
        }
    }//GEN-LAST:event_btn_smpnActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int selectedRow = tbl_TRjual.getSelectedRow();
        if(selectedRow == -1) {
            JOptionPane.showMessageDialog(this,"Pilih baris yang akan di Perbarui");
            return;
        }

        String ID_Customer = txt_ID.getText();
        String ID_Layanan = cbx_A.getSelectedItem().toString();
        String No_Nota = txt_nota.getText();
        String Tgl_Masuk = txt_masuk.getText();
        String Tgl_Terima = txt_terima.getText();
        String Harga_Layanan = lb_hrglyn.getText();

        if(ID_Customer.isEmpty() || ID_Layanan.isEmpty() || No_Nota.isEmpty() || Tgl_Masuk.isEmpty() || Tgl_Terima.isEmpty() || Harga_Layanan.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Semua kolom harus diisi !","Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "UPDATE transaksi_jual SET ID_customer=?, ID_layanan=?, no_nota=?, tgl_masuk=?, tgl_terima=?, harga_layanan=? WHERE ID_customer=?";
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1,ID_Customer);
            st.setString(2,ID_Layanan);
            st.setString(3,No_Nota);
            st.setString(4,Tgl_Masuk);
            st.setString(5,Tgl_Terima);
            st.setString(6,Harga_Layanan);
            st.setString(7,ID_Customer);

            int rowUpdate = st.executeUpdate();
            if(rowUpdate > 0) {
                JOptionPane.showMessageDialog(this,"Data Berhasil Diperbarui");
                resetForm();
                getData();
            }

            st.close();
        } catch (Exception e) {
            Logger.getLogger(Kelola_TRjual.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void tbl_TRjualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TRjualMouseClicked
        int selectedRow = tbl_TRjual.getSelectedRow();
        if(selectedRow != -1){
            String ID_Customer = tbl_TRjual.getValueAt(selectedRow, 0).toString();
            String ID_Layanan = tbl_TRjual.getValueAt(selectedRow, 1).toString();
            String No_Nota = tbl_TRjual.getValueAt(selectedRow, 2).toString();
            String Tgl_Masuk = tbl_TRjual.getValueAt(selectedRow, 3).toString();   
            String Tgl_Terima = tbl_TRjual.getValueAt(selectedRow, 4).toString();
            String Harga_Layanan = tbl_TRjual.getValueAt(selectedRow, 5).toString();

            txt_ID.setText(ID_Customer);
            cbx_A.setSelectedItem(ID_Layanan);
            txt_nota.setText(No_Nota);
            txt_masuk.setText(Tgl_Terima);
            txt_terima.setText(Tgl_Terima);
            lb_hrglyn.setText(Harga_Layanan);
            
        }
    }//GEN-LAST:event_tbl_TRjualMouseClicked

    private void btn_TRjual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TRjual1ActionPerformed
        Kelola_TRbeli trb = null;
        try {
            trb = new Kelola_TRbeli();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRbeli.class.getName()).log(Level.SEVERE, null, ex);
        }
        trb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_TRjual1ActionPerformed

    private void keltra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra5ActionPerformed
    Supplier spp = null;
        try {
            spp = new Supplier();
        } catch (SQLException ex) {
            Logger.getLogger(Kelola_TRjual.class.getName()).log(Level.SEVERE, null, ex);
        }
    spp.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_keltra5ActionPerformed

    private void keltra6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keltra6ActionPerformed

    }//GEN-LAST:event_keltra6ActionPerformed

    private void cbx_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_AActionPerformed
        showHarga();
    }//GEN-LAST:event_cbx_AActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dateChooser1.showPopup();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_terimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_terimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_terimaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dateChooser2.showPopup();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Kelola_TRjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kelola_TRjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kelola_TRjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kelola_TRjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Kelola_TRjual().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Kelola_TRjual.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_TRjual1;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hps;
    private javax.swing.JButton btn_smpn;
    private javax.swing.JComboBox<String> cbx_A;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kelpropil;
    private javax.swing.JButton keltra2;
    private javax.swing.JButton keltra3;
    private javax.swing.JButton keltra5;
    private javax.swing.JButton keltra6;
    private javax.swing.JLabel lb_hrglyn;
    private javax.swing.JTable tbl_TRjual;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_masuk;
    private javax.swing.JTextField txt_nota;
    private javax.swing.JTextField txt_terima;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        txt_ID.setText("");
        cbx_A.setSelectedItem("");
        txt_nota.setText("");
        txt_masuk.setText("");
        txt_terima.setText("");
        lb_hrglyn.setText("");
    }
}
