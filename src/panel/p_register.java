package panel;

import frame.Main_f;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import objek.Pengguna;
import repository.RepositoryPengguna;

public class p_register extends javax.swing.JPanel {

    public p_register() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_close = new com.component.MyButton();
        btn_minimize = new com.component.MyButton();
        myPanel1 = new com.component.MyPanel();
        L_register = new javax.swing.JLabel();
        gr_punyaAkun = new javax.swing.JLabel();
        btn_login = new com.component.MyLabel();
        btn_register = new com.component.MyButton();
        L_namalengkap = new javax.swing.JLabel();
        txt_namalengkap = new com.component.MyTextField();
        txt_username = new com.component.MyTextField();
        txt_password = new com.component.MyPasswordField();
        L_username = new javax.swing.JLabel();
        L_password = new javax.swing.JLabel();
        check_privasikeamanan = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        lbl_greet1 = new javax.swing.JLabel();
        lbl_greet2 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1378, 780));

        jPanel1.setPreferredSize(new java.awt.Dimension(1378, 780));
        jPanel1.setLayout(null);

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

        myPanel1.setBackground(new java.awt.Color(4, 149, 222));
        myPanel1.setBackgroundColor(new java.awt.Color(4, 149, 222));
        myPanel1.setBorderWidth(5);
        myPanel1.setCornerRadius(50);

        L_register.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        L_register.setForeground(new java.awt.Color(0, 0, 0));
        L_register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_register.setText("Register");

        gr_punyaAkun.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        gr_punyaAkun.setForeground(new java.awt.Color(0, 0, 0));
        gr_punyaAkun.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gr_punyaAkun.setText("Sudah punya akun? ");

        btn_login.setText("Login");
        btn_login.setColorClick(new java.awt.Color(0, 102, 102));
        btn_login.setColorOver(new java.awt.Color(0, 255, 255));
        btn_login.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });

        btn_register.setBackground(new java.awt.Color(52, 171, 239));
        btn_register.setForeground(new java.awt.Color(0, 0, 0));
        btn_register.setText("Register");
        btn_register.setToolTipText("");
        btn_register.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_register.setColor(new java.awt.Color(52, 171, 239));
        btn_register.setColorClick(new java.awt.Color(0, 102, 102));
        btn_register.setColorOver(new java.awt.Color(102, 255, 255));
        btn_register.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btn_register.setRadius(15);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        L_namalengkap.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        L_namalengkap.setForeground(new java.awt.Color(0, 0, 0));
        L_namalengkap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_namalengkap.setText("Nama Lengkap");

        txt_namalengkap.setBackground(new java.awt.Color(52, 171, 239));
        txt_namalengkap.setForeground(new java.awt.Color(0, 0, 0));
        txt_namalengkap.setColorDefault(new java.awt.Color(52, 171, 239));
        txt_namalengkap.setColorFocus(new java.awt.Color(51, 204, 255));
        txt_namalengkap.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N

        txt_username.setBackground(new java.awt.Color(52, 171, 239));
        txt_username.setForeground(new java.awt.Color(0, 0, 0));
        txt_username.setColorDefault(new java.awt.Color(52, 171, 239));
        txt_username.setColorFocus(new java.awt.Color(51, 204, 255));
        txt_username.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N

        txt_password.setBackground(new java.awt.Color(52, 171, 239));
        txt_password.setForeground(new java.awt.Color(0, 0, 0));
        txt_password.setColorDefault(new java.awt.Color(52, 171, 239));
        txt_password.setColorFocus(new java.awt.Color(51, 204, 255));
        txt_password.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N

        L_username.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        L_username.setForeground(new java.awt.Color(0, 0, 0));
        L_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_username.setText("Username");

        L_password.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        L_password.setForeground(new java.awt.Color(0, 0, 0));
        L_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_password.setText("Password");

        check_privasikeamanan.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        check_privasikeamanan.setForeground(new java.awt.Color(0, 0, 0));
        check_privasikeamanan.setText("Kebijakan Privasi dan Keamanan");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        lbl_greet1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lbl_greet1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_greet1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_greet1.setText("Silahkan lengkapi data anda");

        lbl_greet2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lbl_greet2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_greet2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_greet2.setText("dan ayo buat akun");

        javax.swing.GroupLayout myPanel1Layout = new javax.swing.GroupLayout(myPanel1);
        myPanel1.setLayout(myPanel1Layout);
        myPanel1Layout.setHorizontalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                            .addComponent(txt_namalengkap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_namalengkap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(myPanel1Layout.createSequentialGroup()
                                .addComponent(check_privasikeamanan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(myPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(myPanel1Layout.createSequentialGroup()
                                .addComponent(gr_punyaAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_greet1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_greet2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        myPanel1Layout.setVerticalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(L_register)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_greet1)
                .addGap(0, 0, 0)
                .addComponent(lbl_greet2)
                .addGap(18, 18, 18)
                .addComponent(L_namalengkap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_namalengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(L_username)
                .addGap(8, 8, 8)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(L_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_privasikeamanan))
                .addGap(36, 36, 36)
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gr_punyaAkun)
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel1.add(myPanel1);
        myPanel1.setBounds(150, 110, 460, 530);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bgLaundry_2.png"))); // NOI18N
        backgroundImage.setText("jLabel3");
        jPanel1.add(backgroundImage);
        backgroundImage.setBounds(-3, -4, 1390, 790);

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

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        Main_f mainFrame = (Main_f) SwingUtilities.getWindowAncestor(btn_login);
        if (mainFrame != null) {
            mainFrame.showLoginPanel();
        }
    }//GEN-LAST:event_btn_loginMouseClicked

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        if (txt_namalengkap.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silahkan isi nama lengkap!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (txt_username.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Silahkan isi username!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (txt_password.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "Silahkan isi password!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (!check_privasikeamanan.isSelected()) {
            JOptionPane.showMessageDialog(this, "Silahkan isi persetujui privasi dan keamanan!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {   
            JOptionPane.showMessageDialog(this, "Selamat anda berhasil membuat akun!", "Information", JOptionPane.INFORMATION_MESSAGE);
            RepositoryPengguna repoPengguna = new RepositoryPengguna();
            Pengguna pengguna = new Pengguna(txt_namalengkap.getText(), txt_username.getText(), new String(txt_password.getPassword()));
            
            repoPengguna.addToRepo(pengguna);
            
            Main_f mainFrame = (Main_f) SwingUtilities.getWindowAncestor(btn_login);
            if (mainFrame != null) {
                mainFrame.showLoginPanel();
            }
            
            
            check_privasikeamanan.setSelected(false);
            txt_namalengkap.setText("");
            txt_password.setText("");
            txt_username.setText("");
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizeActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(btn_minimize);
        if (frame != null) {
            frame.setState(JFrame.ICONIFIED); // Set window to minimized state
        }
    }//GEN-LAST:event_btn_minimizeActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_namalengkap;
    private javax.swing.JLabel L_password;
    private javax.swing.JLabel L_register;
    private javax.swing.JLabel L_username;
    private javax.swing.JLabel backgroundImage;
    private com.component.MyButton btn_close;
    private com.component.MyLabel btn_login;
    private com.component.MyButton btn_minimize;
    private com.component.MyButton btn_register;
    private javax.swing.JCheckBox check_privasikeamanan;
    private javax.swing.JLabel gr_punyaAkun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_greet1;
    private javax.swing.JLabel lbl_greet2;
    private com.component.MyPanel myPanel1;
    private com.component.MyTextField txt_namalengkap;
    private com.component.MyPasswordField txt_password;
    private com.component.MyTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
