package Karyawan;

import Koneksi.ClassKoneksi;
import Karyawan.Dashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

private Connection konek;

     public Login() throws SQLException {
        initComponents();
        sbmt.setVisible(true);
        konek = ClassKoneksi.GetConnection(); 
        
        lb_hidepass.setVisible(false);
    }   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_showpass = new javax.swing.JLabel();
        lb_hidepass = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        sbmt = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        ext = new javax.swing.JButton();
        pswrd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_showpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eye_2.png"))); // NOI18N
        lb_showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_showpassMouseClicked(evt);
            }
        });
        getContentPane().add(lb_showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 440, 50, 50));

        lb_hidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Invisible_1.png"))); // NOI18N
        lb_hidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_hidepassMouseClicked(evt);
            }
        });
        getContentPane().add(lb_hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 440, 50, 50));

        user.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(null);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 335, 460, 50));

        sbmt.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        sbmt.setBorder(null);
        sbmt.setBorderPainted(false);
        sbmt.setContentAreaFilled(false);
        sbmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmtActionPerformed(evt);
            }
        });
        getContentPane().add(sbmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 550, 460, 40));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancel.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, -1, -1));

        ext.setBorder(null);
        ext.setBorderPainted(false);
        ext.setContentAreaFilled(false);
        ext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extActionPerformed(evt);
            }
        });
        getContentPane().add(ext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 500, 110, 10));

        pswrd.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pswrd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pswrd.setToolTipText("");
        pswrd.setBorder(null);
        pswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswrdActionPerformed(evt);
            }
        });
        getContentPane().add(pswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 400, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\UMKM\\log in.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void extActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extActionPerformed
        GantiSandi rstpw = new GantiSandi();
        rstpw.setVisible(true);
        dispose();
    }//GEN-LAST:event_extActionPerformed

    private void sbmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmtActionPerformed
try {
            String sql = "SELECT * FROM karyawan WHERE username=? AND password=?";
            PreparedStatement st = konek.prepareStatement(sql);
            st.setString(1, user.getText());
            st.setString(2, pswrd.getText());
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Session.setUsername(user.getText());
                new Dashboard().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Username atau Password salah!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Error: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    

    }//GEN-LAST:event_sbmtActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed

    }//GEN-LAST:event_userActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Welcome wlcm = new Welcome();
        wlcm.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void lb_showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_showpassMouseClicked
        lb_showpass.setVisible(false);
        lb_hidepass.setVisible(true);
        pswrd.setEchoChar((char)0);
    }//GEN-LAST:event_lb_showpassMouseClicked

    private void lb_hidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_hidepassMouseClicked
        lb_showpass.setVisible(true);
        lb_hidepass.setVisible(false);
        pswrd.setEchoChar('*');
    }//GEN-LAST:event_lb_hidepassMouseClicked

    private void pswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswrdActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Login().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton ext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_hidepass;
    private javax.swing.JLabel lb_showpass;
    private javax.swing.JPasswordField pswrd;
    private javax.swing.JButton sbmt;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
