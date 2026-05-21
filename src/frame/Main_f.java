package frame;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import panel.p_login;
import panel.p_register;
import panel.p_tabelutama;
import panel.p_tambahpesanan;

public class Main_f extends javax.swing.JFrame {    
    // MENDEKLARASI PANEL
    private p_login p_login;
    private p_register p_register;
    private p_tabelutama p_tabelutama;
    private p_tambahpesanan p_tambahpesanan;

    public Main_f() {
        setUndecorated(true);
        initComponents();
        desain_tambahan();
        
        // Atur ukuran frame berdasarkan layar
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.width); // 80% dari lebar layar
        int height = (int) (screenSize.height); // 80% dari tinggi layar
        setSize(width, height);
        setLocationRelativeTo(null);
    }

    // DESAIN TAMBAHAN
    private void desain_tambahan(){
        // MERUBAH LAYOUT MENJADI CARD LAYOUT
        getContentPane().setLayout(new CardLayout());        
        
        // MENAMPILKAN PANEL LOGIN
        showLoginPanel();
    }
    
    // METHOD SHOW LOGIN PANEL
    public void showLoginPanel(){
        // MEMANGGIL PANEL LOGIN
        p_login = new p_login();
        getContentPane().add(p_login, "p_login");
        // MENAMPILKAN PANEL LOGIN
        CardLayout cardlayout = (CardLayout)getContentPane().getLayout();
        cardlayout.show(getContentPane(), "p_login");
    }
    
    // METHOD SHOW REGISTER PANEL
    public void showRegisterPanel(){
        // MEMANGGIL PANEL REGISTER
        p_register = new p_register();
        getContentPane().add(p_register, "p_register");
        // MENAMPILKAN PANEL REGISTER
        CardLayout cardlayout = (CardLayout)getContentPane().getLayout();
        cardlayout.show(getContentPane(), "p_register");
    }
    
    // METHOD SHOW TABEL UTAMA PANEL
    public void showTabelUtamaPanel(){
        // MEMANGGIL PANEL TABEL UTAMA   
        p_tabelutama = new p_tabelutama();
        getContentPane().add(p_tabelutama, "p_tabelutama");
        
        // MENAMPILKAN PANEL TABEL UTAMA
        CardLayout cardlayout = (CardLayout)getContentPane().getLayout();
        cardlayout.show(getContentPane(), "p_tabelutama");
    }
    
    // METHOD SHOW TAMBAH PESANAN PANEL
    public void showTambahPesananPanel(){
        // MEMANGGIL PANEL TAMBAH PESANAN
        p_tambahpesanan = new p_tambahpesanan();
        getContentPane().add(p_tambahpesanan, "p_tambahpesanan");
        
        // MENAMPILKAN PANEL TAMBAH PESANAN
        CardLayout cardlayout = (CardLayout)getContentPane().getLayout();
        cardlayout.show(getContentPane(), "p_tambahpesanan");
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1378, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Main_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_f().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
