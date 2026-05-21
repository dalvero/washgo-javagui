package panel;

import frame.Main_f;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import objek.Pelanggan;
import repository.RepositoryPelanggan;

public class p_tabelutama extends javax.swing.JPanel {

    // DECLARE UNTUK TABEL
    private static int baris = 0;
    private static DefaultTableModel modelTabel;
    private static int pilihanKolom = 0;
    private static int editableRow = -1;
        
    private static ArrayList<Pelanggan> listPelanggan;
    private static ArrayList<Pelanggan> historyPelanggan;
    private static String dataSetTabel = "";
    
    public p_tabelutama() {                
        initComponents();
        
        // CEK DATA PADA REPOSITORY PELANGGAN
        RepositoryPelanggan.checkData();
        listPelanggan = RepositoryPelanggan.getAllPelanggan(); 
        historyPelanggan = RepositoryPelanggan.getAllHistoryPelanggan();
        
        // TAMPILKAN DATA PELANGGAN
        btn_dataPelanggan.doClick();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTabelUtama = new javax.swing.JPanel();
        btn_close = new com.component.MyButton();
        btn_minimize = new com.component.MyButton();
        logoLaundry = new javax.swing.JLabel();
        tabelPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btn_riwayatPelanggan = new com.component.MyButton();
        btn_edit = new com.component.MyButton();
        btn_update = new com.component.MyButton();
        btn_delete = new com.component.MyButton();
        btn_dataPelanggan = new com.component.MyButton();
        btn_dataPesanan = new com.component.MyButton();
        btn_tambahPesanan = new com.component.MyButton();
        backgroundImage = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1378, 780));

        panelTabelUtama.setPreferredSize(new java.awt.Dimension(1378, 780));
        panelTabelUtama.setLayout(null);

        btn_close.setBackground(new java.awt.Color(52, 171, 239));
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
        panelTabelUtama.add(btn_close);
        btn_close.setBounds(1310, 10, 50, 40);

        btn_minimize.setBackground(new java.awt.Color(52, 171, 239));
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
        panelTabelUtama.add(btn_minimize);
        btn_minimize.setBounds(1250, 10, 50, 40);

        logoLaundry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logoLaundry250px.png"))); // NOI18N
        logoLaundry.setText("jLabel1");
        panelTabelUtama.add(logoLaundry);
        logoLaundry.setBounds(40, 60, 230, 170);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Nomor Telepon", "Alamat", "Total Pembayaran"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        javax.swing.GroupLayout tabelPanelLayout = new javax.swing.GroupLayout(tabelPanel);
        tabelPanel.setLayout(tabelPanelLayout);
        tabelPanelLayout.setHorizontalGroup(
            tabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        tabelPanelLayout.setVerticalGroup(
            tabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        panelTabelUtama.add(tabelPanel);
        tabelPanel.setBounds(90, 240, 1200, 380);

        btn_riwayatPelanggan.setBackground(new java.awt.Color(52, 171, 239));
        btn_riwayatPelanggan.setForeground(new java.awt.Color(0, 0, 0));
        btn_riwayatPelanggan.setText("Riwayat Pemesanan");
        btn_riwayatPelanggan.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_riwayatPelanggan.setColor(new java.awt.Color(52, 171, 239));
        btn_riwayatPelanggan.setColorClick(new java.awt.Color(0, 102, 102));
        btn_riwayatPelanggan.setColorOver(new java.awt.Color(102, 255, 255));
        btn_riwayatPelanggan.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_riwayatPelanggan.setRadius(20);
        btn_riwayatPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_riwayatPelangganActionPerformed(evt);
            }
        });
        panelTabelUtama.add(btn_riwayatPelanggan);
        btn_riwayatPelanggan.setBounds(980, 130, 220, 50);

        btn_edit.setBackground(new java.awt.Color(52, 171, 239));
        btn_edit.setForeground(new java.awt.Color(0, 0, 0));
        btn_edit.setText("Edit Tabel");
        btn_edit.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_edit.setColor(new java.awt.Color(52, 171, 239));
        btn_edit.setColorClick(new java.awt.Color(0, 102, 102));
        btn_edit.setColorOver(new java.awt.Color(102, 255, 255));
        btn_edit.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_edit.setRadius(20);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        panelTabelUtama.add(btn_edit);
        btn_edit.setBounds(980, 650, 200, 50);

        btn_update.setBackground(new java.awt.Color(52, 171, 239));
        btn_update.setForeground(new java.awt.Color(0, 0, 0));
        btn_update.setText("Update Tabel");
        btn_update.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_update.setColor(new java.awt.Color(52, 171, 239));
        btn_update.setColorClick(new java.awt.Color(0, 102, 102));
        btn_update.setColorOver(new java.awt.Color(102, 255, 255));
        btn_update.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_update.setRadius(20);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        panelTabelUtama.add(btn_update);
        btn_update.setBounds(730, 650, 210, 50);

        btn_delete.setBackground(new java.awt.Color(52, 171, 239));
        btn_delete.setForeground(new java.awt.Color(0, 0, 0));
        btn_delete.setText("Delete Tabel");
        btn_delete.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_delete.setColor(new java.awt.Color(52, 171, 239));
        btn_delete.setColorClick(new java.awt.Color(0, 102, 102));
        btn_delete.setColorOver(new java.awt.Color(102, 255, 255));
        btn_delete.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_delete.setRadius(20);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        panelTabelUtama.add(btn_delete);
        btn_delete.setBounds(510, 650, 190, 50);

        btn_dataPelanggan.setBackground(new java.awt.Color(52, 171, 239));
        btn_dataPelanggan.setForeground(new java.awt.Color(0, 0, 0));
        btn_dataPelanggan.setText("Data Pelanggan");
        btn_dataPelanggan.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_dataPelanggan.setColor(new java.awt.Color(52, 171, 239));
        btn_dataPelanggan.setColorClick(new java.awt.Color(0, 102, 102));
        btn_dataPelanggan.setColorOver(new java.awt.Color(102, 255, 255));
        btn_dataPelanggan.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_dataPelanggan.setRadius(20);
        btn_dataPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dataPelangganActionPerformed(evt);
            }
        });
        panelTabelUtama.add(btn_dataPelanggan);
        btn_dataPelanggan.setBounds(770, 130, 180, 50);

        btn_dataPesanan.setBackground(new java.awt.Color(52, 171, 239));
        btn_dataPesanan.setForeground(new java.awt.Color(0, 0, 0));
        btn_dataPesanan.setText("Data Pesanan");
        btn_dataPesanan.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_dataPesanan.setColor(new java.awt.Color(52, 171, 239));
        btn_dataPesanan.setColorClick(new java.awt.Color(0, 102, 102));
        btn_dataPesanan.setColorOver(new java.awt.Color(102, 255, 255));
        btn_dataPesanan.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_dataPesanan.setRadius(20);
        btn_dataPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dataPesananActionPerformed(evt);
            }
        });
        panelTabelUtama.add(btn_dataPesanan);
        btn_dataPesanan.setBounds(530, 130, 200, 50);

        btn_tambahPesanan.setBackground(new java.awt.Color(52, 171, 239));
        btn_tambahPesanan.setForeground(new java.awt.Color(0, 0, 0));
        btn_tambahPesanan.setText("Tambah Pesanan");
        btn_tambahPesanan.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_tambahPesanan.setColor(new java.awt.Color(52, 171, 239));
        btn_tambahPesanan.setColorClick(new java.awt.Color(0, 102, 102));
        btn_tambahPesanan.setColorOver(new java.awt.Color(102, 255, 255));
        btn_tambahPesanan.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_tambahPesanan.setRadius(20);
        btn_tambahPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahPesananActionPerformed(evt);
            }
        });
        panelTabelUtama.add(btn_tambahPesanan);
        btn_tambahPesanan.setBounds(300, 130, 200, 50);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bgLaundry_2.png"))); // NOI18N
        backgroundImage.setText("jLabel3");
        panelTabelUtama.add(backgroundImage);
        backgroundImage.setBounds(0, -10, 1390, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTabelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTabelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // METHOD UNTUK MENDAPATKAN PELANGGAN
    public Pelanggan getPelangganByName(String name){
        for (Pelanggan pelanggan : listPelanggan){
            if (pelanggan.getNama().equals(name)) {
                return pelanggan;
            }
        }
        return null;
    }
    
    private void btn_tambahPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahPesananActionPerformed
        Main_f mainFrame = (Main_f) SwingUtilities.getWindowAncestor(this);
        if (mainFrame != null) {
            mainFrame.showTambahPesananPanel();
        }
    }//GEN-LAST:event_btn_tambahPesananActionPerformed

    private void btn_dataPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dataPesananActionPerformed
        dataSetTabel = "Tabel Pesanan";
        
        Object[] kolom = {"ID", "Nama", "Paket", "Tambahan", "Total Harga", " Tanggal Mulai", "Status"};                   
        int idData = 0;
        modelTabel = new DefaultTableModel(kolom, baris){
            @Override
            public boolean isCellEditable(int row, int column) {
                if (editableRow != -1) {
                    return row == editableRow; // AGAR DATA DIDALAM TABLE BISA DIEDIT SESUAI BARIS YANG DIPILIH
                } else {
                    return false;
                }
            }           
        };               
                              
        if (listPelanggan != null) {
        // MEMASUKKAN DATA PELANGGAN KE TABEL
        for (Pelanggan pelanggan : listPelanggan) {
            idData++;
            Object[] row = {
                "ORD-" + idData,
                pelanggan.getNama(),
                pelanggan.getPaket(),
                pelanggan.getTambahan(),
                pelanggan.getTotalHarga(),
                pelanggan.getTanggalMulai(),
                pelanggan.getStatus()
            };
            modelTabel.addRow(row);
        }             
    }
    
//    // MENGHAPUS DATA PADA TABEL YANG STATUSNYA "Selesai"
//    for (int i = modelTabel.getRowCount() - 1; i >= 0; i--) {
//        String status = (String) modelTabel.getValueAt(i, 6);
//        if ("Selesai".equals(status)) {
//            for (Pelanggan pelanggan : listPelanggan){
//                if (pelanggan.getStatus().equals(status)) {
//                    RepositoryPelanggan.moveFromRepoPelangganToHistory(pelanggan);
//                    RepositoryPelanggan.testDataHistory();
//                }
//            }
//            modelTabel.removeRow(i); // MENGHAPUS BARIS
//        }
//    }
   
        tabel.setModel(modelTabel);   
    }//GEN-LAST:event_btn_dataPesananActionPerformed

    private void btn_dataPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dataPelangganActionPerformed
       dataSetTabel = "Tabel Pelanggan";
        
        Object[] kolomPelanggan = {"ID", "Nama", "Nomor Telepon", "Alamat", "Total Pembayaran"};
        int idData = 0;
        modelTabel = new DefaultTableModel(kolomPelanggan, baris){
            @Override
            public boolean isCellEditable(int row, int column) {
                if (editableRow != -1) {
                    return row == editableRow; // AGAR DATA DIDALAM TABLE BISA DIEDIT SESUAI BARIS YANG DIPILIH
                } else {
                    return false;
                }
            }
        };
                
        if (listPelanggan != null) {
            // MEMASUKAN DATA PELANGGAN KE TABEL
            for (Pelanggan pelanggan : listPelanggan) {
                idData++;
                Object[] row = {
                    "PLG-" + idData,
                    pelanggan.getNama(),
                    pelanggan.getNoTelepon(),
                    pelanggan.getAlamat(),                
                    pelanggan.getTotalHarga(),                
                };
                modelTabel.addRow(row);
            }
        }                                
        tabel.setModel(modelTabel);  
    }//GEN-LAST:event_btn_dataPelangganActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
       pilihanKolom = tabel.getSelectedRow();
        
        if (pilihanKolom == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan didelete!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        modelTabel.removeRow(pilihanKolom);
        if (dataSetTabel.equals("Tabel Pesanan") || dataSetTabel.equals("Tabel Pelanggan")) {
            RepositoryPelanggan.getAllPelanggan().remove(pilihanKolom);
        } else if (dataSetTabel.equals("Tabel Riwayat")) {
            RepositoryPelanggan.getAllHistoryPelanggan().remove(pilihanKolom);
        }
        
        
        JOptionPane.showMessageDialog(this, "Data tabel berhasil didelete!", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        if (editableRow == -1) {
            JOptionPane.showMessageDialog(this, "Silahkan edit data terlebih dahulu!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (this.dataSetTabel.equals("Tabel Pesanan")) {                        
            String nama = tabel.getValueAt(pilihanKolom, 1).toString();
            String paket = tabel.getValueAt(pilihanKolom, 2).toString();
            String tambahan = tabel.getValueAt(pilihanKolom, 3).toString();
            String totalHarga = tabel.getValueAt(pilihanKolom, 4).toString();
            String tanggalMulai = tabel.getValueAt(pilihanKolom, 5).toString();
            String status = tabel.getValueAt(pilihanKolom, 6).toString();
            
            System.out.println("\nDATA TABEL YANG DITAMBILKAN ADALAH TABEL PESANAN\n");
            
            editableRow = pilihanKolom;
            System.out.println("KOLOM YANG SUDAH DIEDIT " + editableRow);
            modelTabel.fireTableDataChanged();
           
            Pelanggan editedPelanggan = RepositoryPelanggan.pelangganDummy.get(0);

            // MENGAMBIL DATA YANG SUDAH DIEDIT DAN MEMASUKAN KEDALAM PELANGGAN 
            System.out.println("=====DATA YANG SUDAH DIEDIT=======");
            System.out.println("Nama\t\t: " + nama);          
            editedPelanggan.setNama(nama);
            System.out.println("Paket\t\t: " + paket);
            editedPelanggan.setPaket(paket);
            System.out.println("Tambahan\t: " + tambahan);
            editedPelanggan.setTambahan(tambahan);
            System.out.println("Total Harga\t: " + totalHarga);
            editedPelanggan.setTotalHarga(Integer.parseInt(totalHarga));
            System.out.println("Tanggal Mulai\t: " + tanggalMulai);
            editedPelanggan.setTanggalMulai(tanggalMulai);
            System.out.println("Status\t\t: " + status);
            editedPelanggan.setStatus(status);
            System.out.println("=====DATA YANG SUDAH DIEDIT=======");
                        
            System.out.println("\n=====DATA PELANGGAN TERBARU=======");                        
            System.out.println("Nama\t\t: " + editedPelanggan.getNama());
            System.out.println("Paket\t\t: " + editedPelanggan.getPaket());
            System.out.println("Tambahan\t: " + editedPelanggan.getTambahan());
            System.out.println("TotalHarga\t: " + editedPelanggan.getTotalHarga());
            System.out.println("TanggalMulai\t: " + editedPelanggan.getTanggalMulai());
            System.out.println("Status\t\t: " + editedPelanggan.getStatus());
            System.out.println("=====DATA PELANGGAN TERBARU=======");                    
            Iterator<Pelanggan> iterator = listPelanggan.iterator();
                        
            // MENGHAPUS DATA PADA TABEL YANG STATUSNYA "Selesai"
            for (int i = modelTabel.getRowCount() - 1; i >= 0; i--) {                
                if ("Selesai".equals(status)) {
                    for (Pelanggan pelanggan : listPelanggan){
                        if (pelanggan.getStatus().equals((String) modelTabel.getValueAt(i, 6))) {
                            RepositoryPelanggan.moveFromRepoPelangganToHistory(pelanggan);
                            RepositoryPelanggan.testDataHistory();
                        }
                    }
                    modelTabel.removeRow(i); // MENGHAPUS BARIS
                }
            }
            
            
            // LIST DATA PELANGGAN
            System.out.println("\n===========LIST DATA PELANGGAN=========");
            int i = 1;
            for(Pelanggan pelanggan : RepositoryPelanggan.getAllPelanggan()){
                System.out.println("========PELANGGAN KE-" + i  + "=======");
                System.out.println("1.  " + pelanggan.getNama());
                System.out.println("2.  " + pelanggan.getNoTelepon());
                System.out.println("3.  " + pelanggan.getAlamat());
                System.out.println("4.  " + pelanggan.getLayanan());
                System.out.println("5.  " + pelanggan.getPaket());
                System.out.println("6.  " + pelanggan.getTambahan());
                System.out.println("7.  " + pelanggan.getTipeOrder());
                System.out.println("8.  " + pelanggan.getBerat());
                System.out.println("9.  " + pelanggan.getHargaTambahan());
                System.out.println("10. " + pelanggan.getTotalHarga());   
                System.out.println("11. " + pelanggan.getTanggalMulai());
                System.out.println("========PELANGGAN KE-" + i  + "=======");
                i++;
            }
            
            
            
            
            JOptionPane.showMessageDialog(this, "Baris ke-" + (editableRow + 1) + " berhasil diedit." , "Information", JOptionPane.INFORMATION_MESSAGE);
            
        } else if (this.dataSetTabel.equals("Tabel Pelanggan")) {
            String nama = tabel.getValueAt(pilihanKolom, 1).toString();
            String noTelepon = tabel.getValueAt(pilihanKolom, 2).toString();
            String alamat = tabel.getValueAt(pilihanKolom, 3).toString();
            String totalPembayaran = tabel.getValueAt(pilihanKolom, 4).toString();
            
            System.out.println("\nDATA TABEL YANG DITAMBILKAN ADALAH TABEL PELANGGAN\n");
            
            editableRow = pilihanKolom;
            System.out.println("KOLOM YANG SUDAH DIEDIT " + editableRow);
            modelTabel.fireTableDataChanged();
       
            Pelanggan editedPelanggan = RepositoryPelanggan.pelangganDummy.get(0);
            
            // MENGAMBIL DATA DARI TABEL                                                
            System.out.println("=====DATA YANG SUDAH DIEDIT=======");
            System.out.println("Nama\t\t\t: " + nama);
            editedPelanggan.setNama(nama);
            System.out.println("No Telepon\t\t: " + noTelepon);
            editedPelanggan.setNoTelepon(noTelepon);
            System.out.println("Alamat\t\t\t: " + alamat);
            editedPelanggan.setAlamat(alamat);
            System.out.println("Total Pembayaran\t: " + totalPembayaran);            
            editedPelanggan.setTotalHarga(Integer.parseInt(totalPembayaran));
            System.out.println("=====DATA YANG SUDAH DIEDIT=======");
            
            System.out.println("\n=====DATA PELANGGAN TERBARU=======");    
            System.out.println("Nama\t\t\t: " + editedPelanggan.getNama()); 
            System.out.println("No Telepon\t\t: " + editedPelanggan.getNoTelepon());
            System.out.println("Alamat\t\t\t: " + editedPelanggan.getAlamat());
            System.out.println("Total Pembayaran\t: " + editedPelanggan.getTotalHarga());
            System.out.println("=====DATA PELANGGAN TERBARU=======");    
            
            JOptionPane.showMessageDialog(this, "Baris ke-" + (editableRow + 1) + " berhasil diedit." , "Information", JOptionPane.INFORMATION_MESSAGE);
        }       
        editableRow = -1;
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        pilihanKolom = tabel.getSelectedRow();                
        
        if (pilihanKolom == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan diedit!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (this.dataSetTabel.equals("Tabel Pesanan")) {                        
            System.out.println("\nDATA TABEL YANG DITAMBILKAN ADALAH TABEL PESANAN\n");
            
            editableRow = pilihanKolom;
            System.out.println("KOLOM YANG AKAN DIEDIT " + editableRow);
            modelTabel.fireTableDataChanged();           
            // MENGAMBIL DATA DARI TABEL                                                
            System.out.println("========DATA YANG DIAMBIL=========");
            System.out.println("Nama\t\t: " + tabel.getValueAt(pilihanKolom, 1).toString());
            System.out.println("Paket\t\t: " + tabel.getValueAt(pilihanKolom, 2).toString());
            System.out.println("Tambahan\t: " + tabel.getValueAt(pilihanKolom, 3).toString());
            System.out.println("Total Harga\t: " + tabel.getValueAt(pilihanKolom, 4).toString());
            System.out.println("Tanggal Mulai\t: " + tabel.getValueAt(pilihanKolom, 5).toString());
            System.out.println("========DATA YANG DIAMBIL=========");

            RepositoryPelanggan.addToPelangganDummyByName(tabel.getValueAt(pilihanKolom, 1).toString());                       
            
            JOptionPane.showMessageDialog(this, "Baris ke-" + (editableRow + 1) + " sekarang bisa diedit." , "Information", JOptionPane.INFORMATION_MESSAGE);
            
        } else if (this.dataSetTabel.equals("Tabel Pelanggan")) {
            System.out.println("\nDATA TABEL YANG DITAMBILKAN ADALAH TABEL PELANGGAN\n");
            
            editableRow = pilihanKolom;
            System.out.println("KOLOM YANG AKAN DIEDIT " + editableRow);
            modelTabel.fireTableDataChanged();
       
            // MENGAMBIL DATA DARI TABEL                                                
            System.out.println("========DATA YANG DIAMBIL=========");
            System.out.println("Nama\t\t\t: " + tabel.getValueAt(pilihanKolom, 1).toString());
            System.out.println("No Telepon\t\t: " + tabel.getValueAt(pilihanKolom, 2).toString());
            System.out.println("Alamat\t\t\t: " + tabel.getValueAt(pilihanKolom, 3).toString());
            System.out.println("Total Pembayaran\t: " + tabel.getValueAt(pilihanKolom, 4).toString());            
            System.out.println("========DATA YANG DIAMBIL=========");
            
            RepositoryPelanggan.addToPelangganDummyByName(tabel.getValueAt(pilihanKolom, 1).toString());
            
            JOptionPane.showMessageDialog(this, "Baris ke-" + (editableRow + 1) + " sekarang bisa diedit." , "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_editActionPerformed

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

    private void btn_riwayatPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_riwayatPelangganActionPerformed
       dataSetTabel = "Tabel Riwayat";
        
        Object[] kolom = {"ID", "Nama", "Paket", "Tambahan", "Total Harga", " Tanggal Mulai", "Status"};                   
        int idData = 0;
        modelTabel = new DefaultTableModel(kolom, baris){
            @Override
            public boolean isCellEditable(int row, int column) {
                if (editableRow != -1) {
                    return row == editableRow; // AGAR DATA DIDALAM TABLE BISA DIEDIT SESUAI BARIS YANG DIPILIH
                } else {
                    return false;
                }
            }           
        };               
                              
        if (historyPelanggan != null) {
            // MEMASUKKAN DATA PELANGGAN KE TABEL
            for (Pelanggan pelanggan : historyPelanggan) {
                idData++;
                Object[] row = {
                    "ORD-" + idData,
                    pelanggan.getNama(),
                    pelanggan.getPaket(),
                    pelanggan.getTambahan(),
                    pelanggan.getTotalHarga(),
                    pelanggan.getTanggalMulai(),
                    pelanggan.getStatus()
                };
                modelTabel.addRow(row);
            }             
        } else {
            JOptionPane.showMessageDialog(this, "Data pemesanan belum ada yang selesai!", "Information", JOptionPane.INFORMATION_MESSAGE);                        
        }
        tabel.setModel(modelTabel);
    }//GEN-LAST:event_btn_riwayatPelangganActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private com.component.MyButton btn_close;
    private com.component.MyButton btn_dataPelanggan;
    private com.component.MyButton btn_dataPesanan;
    private com.component.MyButton btn_delete;
    private com.component.MyButton btn_edit;
    private com.component.MyButton btn_minimize;
    private com.component.MyButton btn_riwayatPelanggan;
    private com.component.MyButton btn_tambahPesanan;
    private com.component.MyButton btn_update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLaundry;
    private javax.swing.JPanel panelTabelUtama;
    private javax.swing.JTable tabel;
    private javax.swing.JPanel tabelPanel;
    // End of variables declaration//GEN-END:variables
}
