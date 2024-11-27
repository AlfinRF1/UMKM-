package Karyawan;

import Koneksi.ClassKoneksi;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Apk_Laundry {
    public static void main(String[] args) {
        Connection konek = null;
        
        try {
            konek = ClassKoneksi.GetConnection();
            if (konek != null) {
                Welcome pageWelcome = new Welcome();
                pageWelcome.setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Error" + e.getMessage());
        }
    }
}
