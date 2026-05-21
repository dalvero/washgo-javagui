package panel;

import frame.Main_f;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import objek.Pengguna;
import repository.RepositoryPengguna;
  

public class p_login extends javax.swing.JPanel {
    private static RepositoryPengguna repoPengguna = new RepositoryPengguna();
    private static Pengguna penggunaPertama = new Pengguna("Daniel Jefry", "daniel", "daniel123");
    private static ArrayList<Pengguna> dataPengguna = new ArrayList<>();
            
    public p_login() {
        initComponents();        
        repoPengguna.addToRepo(penggunaPertama);
        dataPengguna = repoPengguna.dataPengguna;
    }            
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_minimize = new com.component.MyButton();
        btn_close = new com.component.MyButton();
        panel_login = new com.component.MyPanel();
        lbl_login = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        line1 = new javax.swing.JPanel();
        lbl_greet1 = new javax.swing.JLabel();
        lbl_greet2 = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txt_password = new com.component.MyPasswordField();
        btn_login = new com.component.MyButton();
        lbl_greet3 = new javax.swing.JLabel();
        btn_register = new com.component.MyLabel();
        btn_google = new com.component.MyLabel();
        btn_facebook = new com.component.MyLabel();
        txt_username = new com.component.MyTextField();
        logoImage = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1378, 780));
        jPanel1.setLayout(null);

        btn_minimize.setForeground(new java.awt.Color(0, 0, 0));
        btn_minimize.setText("-");
        btn_minimize.setBorderColor(new java.awt.Color(52, 171, 239));
        btn_minimize.setColor(new java.awt.Color(52, 171, 239));
        btn_minimize.setColorOver(new java.awt.Color(153, 255, 255));
        btn_minimize.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_minimize.setRadius(30);
        btn_minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_minimize);
        btn_minimize.setBounds(1250, 10, 50, 40);

        btn_close.setForeground(new java.awt.Color(0, 0, 0));
        btn_close.setText("X");
        btn_close.setBorderColor(new java.awt.Color(52, 171, 239));
        btn_close.setColor(new java.awt.Color(52, 171, 239));
        btn_close.setColorOver(new java.awt.Color(153, 255, 255));
        btn_close.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_close.setRadius(30);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_close);
        btn_close.setBounds(1310, 10, 50, 40);

        panel_login.setBackgroundColor(new java.awt.Color(4, 149, 222));
        panel_login.setBorderWidth(5);
        panel_login.setCornerRadius(50);

        lbl_login.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(0, 0, 0));
        lbl_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_login.setText("Login");

        lbl_username.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(0, 0, 0));
        lbl_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon/username.png"))); // NOI18N
        lbl_username.setText("Username");

        line1.setBackground(new java.awt.Color(0, 0, 0));
        line1.setForeground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout line1Layout = new javax.swing.GroupLayout(line1);
        line1.setLayout(line1Layout);
        line1Layout.setHorizontalGroup(
            line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        line1Layout.setVerticalGroup(
            line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        lbl_greet1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lbl_greet1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_greet1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_greet1.setText("Silahkan masukan Username");

        lbl_greet2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lbl_greet2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_greet2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_greet2.setText("dan Password!");

        lbl_password.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(0, 0, 0));
        lbl_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon/password.png"))); // NOI18N
        lbl_password.setText("Password");

        txt_password.setBackground(new java.awt.Color(52, 171, 239));
        txt_password.setForeground(new java.awt.Color(0, 0, 0));
        txt_password.setColorDefault(new java.awt.Color(52, 171, 239));
        txt_password.setColorFocus(new java.awt.Color(51, 204, 255));
        txt_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btn_login.setBackground(new java.awt.Color(52, 171, 239));
        btn_login.setForeground(new java.awt.Color(0, 0, 0));
        btn_login.setText("Login");
        btn_login.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_login.setColor(new java.awt.Color(52, 171, 239));
        btn_login.setColorClick(new java.awt.Color(0, 102, 102));
        btn_login.setColorOver(new java.awt.Color(102, 255, 255));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setRadius(15);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        lbl_greet3.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lbl_greet3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_greet3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_greet3.setText("Belum punya akun?");

        btn_register.setText("Daftar");
        btn_register.setColorClick(new java.awt.Color(0, 102, 102));
        btn_register.setColorOver(new java.awt.Color(102, 255, 255));
        btn_register.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        btn_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registerMouseClicked(evt);
            }
        });

        btn_google.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon/google.png"))); // NOI18N
        btn_google.setText("Google");
        btn_google.setColorClick(new java.awt.Color(0, 102, 102));
        btn_google.setColorOver(new java.awt.Color(102, 255, 255));
        btn_google.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N

        btn_facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon/facebook.png"))); // NOI18N
        btn_facebook.setText("Facebook");
        btn_facebook.setColorClick(new java.awt.Color(0, 102, 102));
        btn_facebook.setColorOver(new java.awt.Color(102, 255, 255));
        btn_facebook.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N

        txt_username.setForeground(new java.awt.Color(0, 0, 0));
        txt_username.setColorDefault(new java.awt.Color(52, 171, 239));
        txt_username.setColorFocus(new java.awt.Color(51, 204, 255));
        txt_username.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N

        javax.swing.GroupLayout panel_loginLayout = new javax.swing.GroupLayout(panel_login);
        panel_login.setLayout(panel_loginLayout);
        panel_loginLayout.setHorizontalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(line1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_loginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_greet1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(lbl_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_loginLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_facebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panel_loginLayout.createSequentialGroup()
                                            .addComponent(btn_google, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panel_loginLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lbl_greet3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_loginLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbl_greet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panel_loginLayout.setVerticalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lbl_greet1)
                .addGap(30, 30, 30)
                .addComponent(lbl_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_google, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_facebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_greet3)
                    .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_loginLayout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(lbl_greet2)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        jPanel1.add(panel_login);
        panel_login.setBounds(520, 290, 340, 420);

        logoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logoLaundry.png"))); // NOI18N
        jPanel1.add(logoImage);
        logoImage.setBounds(490, 30, 400, 250);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bgLaundry_1.png"))); // NOI18N
        backgroundImage.setText("jLabel1");
        jPanel1.add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1380, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // METHOD LOGIN
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        if (txt_username.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Silahkan isi username!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (txt_password.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "Silahkan isi password!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            char[] passwordChars = txt_password.getPassword();
            String pass = new String(passwordChars);    
            
            for (int i = 0; i < repoPengguna.dataPengguna.size(); i++) {
                if (txt_username.getText().equals(repoPengguna.dataPengguna.get(i).getUsername())) {
                    if (pass.equals(repoPengguna.dataPengguna.get(i).getPassword())) {
                        Main_f laman = (Main_f)SwingUtilities.getWindowAncestor(this);
                        if (laman!=null) {
                            laman.showTabelUtamaPanel();
                        }

                        txt_password.setText("");
                        txt_username.setText("");
                        return;
                    }
                }
            }
                        
            JOptionPane.showMessageDialog(this, "Akun tidak ditemukan", "Warning", JOptionPane.WARNING_MESSAGE);
            
            txt_password.setText("");
            txt_username.setText("");
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    
    
    // METHOD REGISTER
    private void btn_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseClicked
        Main_f laman = (Main_f)SwingUtilities.getWindowAncestor(this);
        if (laman!=null) {
            laman.showRegisterPanel();
        } 
    }//GEN-LAST:event_btn_registerMouseClicked

    // METHOD CLOSE
    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        int result = JOptionPane.showConfirmDialog(
            null, 
            "Apakah anda ingin keluar?", 
            "Konfirmasi Keluar", 
            JOptionPane.YES_NO_OPTION
        );
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_closeActionPerformed

    // METHOD MINIMIZE
    private void btn_minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizeActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(btn_minimize);
        if (frame != null) {
            frame.setState(JFrame.ICONIFIED); // Set window to minimized state
        }
    }//GEN-LAST:event_btn_minimizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private com.component.MyButton btn_close;
    private com.component.MyLabel btn_facebook;
    private com.component.MyLabel btn_google;
    private com.component.MyButton btn_login;
    private com.component.MyButton btn_minimize;
    private com.component.MyLabel btn_register;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_greet1;
    private javax.swing.JLabel lbl_greet2;
    private javax.swing.JLabel lbl_greet3;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPanel line1;
    private javax.swing.JLabel logoImage;
    private com.component.MyPanel panel_login;
    private com.component.MyPasswordField txt_password;
    private com.component.MyTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
