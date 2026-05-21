package panel;

import frame.Main_f;
import java.awt.Color;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import objek.Pelanggan;
import repository.RepositoryPelanggan;

public class p_tambahpesanan extends javax.swing.JPanel {
    // DECLARE UNTUK FORMAT RUPIAH
    private static NumberFormat rupiahFormat = NumberFormat.getInstance(new Locale("id", "ID"));
    
    // DECLARE UNTUK COMBO BOX 
    private static DefaultComboBoxModel<String> comBoxModelPaket = new DefaultComboBoxModel<>();
    private static DefaultComboBoxModel<String> comBoxModelJenisLayanan = new DefaultComboBoxModel<>();
    private static DefaultComboBoxModel<String> comBoxModelTambahan = new DefaultComboBoxModel<>();     
    
    // DECLARE UNTUK KEPENTINGAN WAKTU
    private static LocalDate date; // MENGAMBIL TANGGAL HARI INI
    private static LocalDateTime time; // MENGAMBIL WAKTU HARI INI
    private static LocalTime now; // MENGAMBIL WAKTU SEKARANG SECARA REAL TIME
    private static DateTimeFormatter format; // FORMAT PENULISAN TANGGAL DAN WAKTU
    private static Timer timer; // TIMER AGAR WAKTU DAPAT BERJALAN SECARA REAL TIME
    
    // DECLARE UNTUK SLIDE IMAGE
    private static ArrayList<String> imageTambahanPaths = new ArrayList<>(); 
    private static ArrayList<String> imagePaketPaths = new ArrayList<>(); 
    private static int indexSaatIni = 0;
    
    // DECLARE UNTUK KEPENTINGAN PERHITUNGAN DAN MEKANISME PEMESANAN LAUNDRY
    // DECLARE PAKET
    private static final int PER_KG = 5000;
    
    // DECLARE TIPE PAKET
    private static String[] paketOrder = {
        "Paket Kilat", "Paket Express", "Paket Reguler",
    };
    
    // DECLARE HARGA PAKET PALING MURAH
    private static int[] hargaDasar = { // -> DIAMBIL DARI PAKET REGULER
        5000,  // CUCI KERING LIPAT
        10000, // CUCI KERING SETRIKA   
    };
        
    // DECLARE JENIS LAYANAN
    private static String[] jenisLayanan = {
        "Cuci Kering Lipat",  
        "Cuci Kering Setrika"
    };
            
    // DECLARE TAMBAHAN/LAIN-LAIN
    private static String[] tambahan = {
        "Tidak Ada",
        "Sprei 2 Set", 
        "Sprei 1 Set",
        "Bedcover Besar",
        "Bedcover Sedang",
        "Bedcover Kecil",
        "Selimut Besar",
        "Selimut Sedang",
        "Selimut Kecil",
    };
    
    private static int[] hargaTambahan ={
      0, 
      20000, 
      14000, 
      33000, 
      28000, 
      21000, 
      23000, 
      18000, 
      14000, 
    };
    
    private static int baris = 0;
    private static DefaultTableModel modelTabel;
    
    
    public p_tambahpesanan() {        
        initComponents();
        
        try {
            comBoxModelPaket.removeAllElements();
            comBoxModelJenisLayanan.removeAllElements();
            comBoxModelTambahan.removeAllElements();
        } catch(Exception e){
            System.out.println("Pilihan Paket, Layanan, Tambahan Baru Saja Ditambahkan");
        }
        
        myInits();
    }

    public void myInits(){
        // MENGATUR DATA DI COMBOBOX DETAIL ORDER
        comBoxModelPaket.addElement("-Pilih Paket-");
        for (int i = 0; i < paketOrder.length; i++) {
            comBoxModelPaket.addElement(paketOrder[i]);
        }
        cbx_paket.setModel(comBoxModelPaket);

        // MENGATUR DATA DI COMBOBOX JENIS LAYANAN        
        comBoxModelJenisLayanan.addElement("-Jenis Layanan-");
        for (int i = 0; i < jenisLayanan.length; i++) {
            comBoxModelJenisLayanan.addElement(jenisLayanan[i]);
        }        
        cbx_layanan.setModel(comBoxModelJenisLayanan);

        // MENGATUR DATA DI COMBOBOX TAMBAHAN        
        comBoxModelTambahan.addElement("-Tambahan-");
        for (int i = 0; i < tambahan.length; i++) {
            comBoxModelTambahan.addElement(tambahan[i]);
        }        
        cbx_tambahan.setModel(comBoxModelTambahan);

        // MENGATUR JUMLAH BERAT AGAR TIDAK BISA DIBAWAH 0
        spin_berat.addChangeListener(e -> {
            if ((int) spin_berat.getValue() < 0) {
                spin_berat.setValue(0);
            }
        });        
        
        // MENAMBAHKAN IMAGE PATH KE ARRAY LIST
        imageTambahanPaths.add("/gambar/sprei_1.png");
        imageTambahanPaths.add("/gambar/sprei_2.png");
        imageTambahanPaths.add("/gambar/bedcover_1.png");
        imageTambahanPaths.add("/gambar/bedcover_2.png");
        imageTambahanPaths.add("/gambar/bedcover_3.png");
        imageTambahanPaths.add("/gambar/selimut_1.png");
        imageTambahanPaths.add("/gambar/selimut_2.png");
        imageTambahanPaths.add("/gambar/selimut_3.png");
        
        // MENAMBAHKAN IMAGE PAKET PATH KE ARRAY LIST
        imagePaketPaths.add("/gambar/paket_kilat.png");
        imagePaketPaths.add("/gambar/paket_express.png");
        imagePaketPaths.add("/gambar/paket_reguler.png");
        
        txt_nota.setText("");
        txt_total.setText("");
        txt_total.setEditable(false);
        txt_hargaTambahan.setEditable(false);                                
        spin_berat.setBackground(new Color(135, 206, 235));
        spin_berat.setForeground(Color.BLACK);
   }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrup_pengiriman = new javax.swing.ButtonGroup();
        panelTabelUtama = new javax.swing.JPanel();
        sb_imgtambahan = new javax.swing.JPanel();
        img_tambahan = new javax.swing.JLabel();
        btn_proses = new com.component.MyButton();
        txt_total = new com.component.MyTextField();
        cbx_deliver = new javax.swing.JCheckBox();
        cbx_pickup = new javax.swing.JCheckBox();
        spin_berat = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_nota = new javax.swing.JTextArea();
        lbl_total = new javax.swing.JLabel();
        lbl_kilogram = new javax.swing.JLabel();
        sb_imgpaket = new javax.swing.JPanel();
        img_paket = new javax.swing.JLabel();
        txt_nama = new com.component.MyTextField();
        lbl_berat = new javax.swing.JLabel();
        lbl_layanan = new javax.swing.JLabel();
        cbx_layanan = new javax.swing.JComboBox<>();
        cbx_tambahan = new javax.swing.JComboBox<>();
        cbx_paket = new javax.swing.JComboBox<>();
        lbl_hargatambahan = new javax.swing.JLabel();
        lbl_tambahan = new javax.swing.JLabel();
        lbl_paket = new javax.swing.JLabel();
        lbl_alamat = new javax.swing.JLabel();
        lbl_notelpon = new javax.swing.JLabel();
        titlePesanan = new javax.swing.JLabel();
        lbl_nama = new javax.swing.JLabel();
        logoLaundry = new javax.swing.JLabel();
        txt_notelepon = new com.component.MyTextField();
        txt_hargaTambahan = new com.component.MyTextField();
        txt_alamat = new com.component.MyTextField();
        btn_lihattabel = new com.component.MyButton();
        btn_logout = new com.component.MyButton();
        btn_minimize = new com.component.MyButton();
        btn_close = new com.component.MyButton();
        btn_printNota = new com.component.MyButton();
        backgroundImage = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1378, 780));

        panelTabelUtama.setPreferredSize(new java.awt.Dimension(1378, 780));
        panelTabelUtama.setLayout(null);

        sb_imgtambahan.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout sb_imgtambahanLayout = new javax.swing.GroupLayout(sb_imgtambahan);
        sb_imgtambahan.setLayout(sb_imgtambahanLayout);
        sb_imgtambahanLayout.setHorizontalGroup(
            sb_imgtambahanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sb_imgtambahanLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(img_tambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        sb_imgtambahanLayout.setVerticalGroup(
            sb_imgtambahanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sb_imgtambahanLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(img_tambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelTabelUtama.add(sb_imgtambahan);
        sb_imgtambahan.setBounds(730, 250, 210, 170);

        btn_proses.setBackground(new java.awt.Color(52, 171, 239));
        btn_proses.setForeground(new java.awt.Color(0, 0, 0));
        btn_proses.setText("Proses");
        btn_proses.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_proses.setColor(new java.awt.Color(52, 171, 239));
        btn_proses.setColorClick(new java.awt.Color(0, 102, 102));
        btn_proses.setColorOver(new java.awt.Color(51, 255, 255));
        btn_proses.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_proses.setRadius(20);
        btn_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesActionPerformed(evt);
            }
        });
        panelTabelUtama.add(btn_proses);
        btn_proses.setBounds(220, 590, 220, 40);

        txt_total.setBackground(new java.awt.Color(52, 171, 239));
        txt_total.setForeground(new java.awt.Color(0, 0, 0));
        txt_total.setColorDefault(new java.awt.Color(52, 171, 239));
        txt_total.setColorFocus(new java.awt.Color(51, 255, 255));
        txt_total.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        panelTabelUtama.add(txt_total);
        txt_total.setBounds(220, 650, 500, 40);

        btngrup_pengiriman.add(cbx_deliver);
        cbx_deliver.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cbx_deliver.setForeground(new java.awt.Color(0, 0, 0));
        cbx_deliver.setText("Delivered");
        panelTabelUtama.add(cbx_deliver);
        cbx_deliver.setBounds(320, 550, 100, 30);

        btngrup_pengiriman.add(cbx_pickup);
        cbx_pickup.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cbx_pickup.setForeground(new java.awt.Color(0, 0, 0));
        cbx_pickup.setText("Pick Up");
        panelTabelUtama.add(cbx_pickup);
        cbx_pickup.setBounds(220, 550, 100, 30);
        panelTabelUtama.add(spin_berat);
        spin_berat.setBounds(220, 490, 190, 40);

        txt_nota.setColumns(20);
        txt_nota.setRows(5);
        jScrollPane1.setViewportView(txt_nota);

        panelTabelUtama.add(jScrollPane1);
        jScrollPane1.setBounds(960, 130, 380, 560);

        lbl_total.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(0, 0, 0));
        lbl_total.setText("Total");
        panelTabelUtama.add(lbl_total);
        lbl_total.setBounds(90, 650, 80, 40);

        lbl_kilogram.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_kilogram.setForeground(new java.awt.Color(0, 0, 0));
        lbl_kilogram.setText("Kg");
        panelTabelUtama.add(lbl_kilogram);
        lbl_kilogram.setBounds(420, 490, 30, 40);

        sb_imgpaket.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout sb_imgpaketLayout = new javax.swing.GroupLayout(sb_imgpaket);
        sb_imgpaket.setLayout(sb_imgpaketLayout);
        sb_imgpaketLayout.setHorizontalGroup(
            sb_imgpaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sb_imgpaketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_paket, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        sb_imgpaketLayout.setVerticalGroup(
            sb_imgpaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sb_imgpaketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_paket, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelTabelUtama.add(sb_imgpaket);
        sb_imgpaket.setBounds(490, 250, 210, 170);

        txt_nama.setBackground(new java.awt.Color(52, 171, 239));
        txt_nama.setForeground(new java.awt.Color(0, 0, 0));
        txt_nama.setColorDefault(new java.awt.Color(52, 171, 239));
        txt_nama.setColorFocus(new java.awt.Color(51, 255, 255));
        txt_nama.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        panelTabelUtama.add(txt_nama);
        txt_nama.setBounds(220, 250, 230, 40);

        lbl_berat.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_berat.setForeground(new java.awt.Color(0, 0, 0));
        lbl_berat.setText("Berat");
        panelTabelUtama.add(lbl_berat);
        lbl_berat.setBounds(90, 490, 100, 40);

        lbl_layanan.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_layanan.setForeground(new java.awt.Color(0, 0, 0));
        lbl_layanan.setText("Layanan");
        panelTabelUtama.add(lbl_layanan);
        lbl_layanan.setBounds(90, 430, 100, 40);

        cbx_layanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_layanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_layananActionPerformed(evt);
            }
        });
        panelTabelUtama.add(cbx_layanan);
        cbx_layanan.setBounds(220, 430, 230, 40);

        cbx_tambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_tambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tambahanActionPerformed(evt);
            }
        });
        panelTabelUtama.add(cbx_tambahan);
        cbx_tambahan.setBounds(730, 430, 210, 40);

        cbx_paket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_paketActionPerformed(evt);
            }
        });
        panelTabelUtama.add(cbx_paket);
        cbx_paket.setBounds(490, 430, 210, 40);

        lbl_hargatambahan.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_hargatambahan.setForeground(new java.awt.Color(0, 0, 0));
        lbl_hargatambahan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_hargatambahan.setText("Harga Tambahan");
        panelTabelUtama.add(lbl_hargatambahan);
        lbl_hargatambahan.setBounds(490, 490, 210, 40);

        lbl_tambahan.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_tambahan.setForeground(new java.awt.Color(0, 0, 0));
        lbl_tambahan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tambahan.setText("Tambahan");
        panelTabelUtama.add(lbl_tambahan);
        lbl_tambahan.setBounds(730, 210, 210, 40);

        lbl_paket.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_paket.setForeground(new java.awt.Color(0, 0, 0));
        lbl_paket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_paket.setText("Paket");
        panelTabelUtama.add(lbl_paket);
        lbl_paket.setBounds(490, 210, 210, 40);

        lbl_alamat.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_alamat.setForeground(new java.awt.Color(0, 0, 0));
        lbl_alamat.setText("Alamat");
        panelTabelUtama.add(lbl_alamat);
        lbl_alamat.setBounds(90, 370, 80, 40);

        lbl_notelpon.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_notelpon.setForeground(new java.awt.Color(0, 0, 0));
        lbl_notelpon.setText("No. Telp");
        panelTabelUtama.add(lbl_notelpon);
        lbl_notelpon.setBounds(90, 310, 80, 40);

        titlePesanan.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        titlePesanan.setForeground(new java.awt.Color(0, 0, 0));
        titlePesanan.setText("TAMBAH PESANAN");
        panelTabelUtama.add(titlePesanan);
        titlePesanan.setBounds(270, 110, 460, 60);

        lbl_nama.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_nama.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nama.setText("Nama");
        panelTabelUtama.add(lbl_nama);
        lbl_nama.setBounds(90, 250, 80, 40);

        logoLaundry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logoLaundry250px.png"))); // NOI18N
        logoLaundry.setText("jLabel1");
        panelTabelUtama.add(logoLaundry);
        logoLaundry.setBounds(40, 60, 230, 170);

        txt_notelepon.setBackground(new java.awt.Color(52, 171, 239));
        txt_notelepon.setForeground(new java.awt.Color(0, 0, 0));
        txt_notelepon.setColorDefault(new java.awt.Color(52, 171, 239));
        txt_notelepon.setColorFocus(new java.awt.Color(51, 255, 255));
        txt_notelepon.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        panelTabelUtama.add(txt_notelepon);
        txt_notelepon.setBounds(220, 310, 230, 40);

        txt_hargaTambahan.setBackground(new java.awt.Color(52, 171, 239));
        txt_hargaTambahan.setForeground(new java.awt.Color(0, 0, 0));
        txt_hargaTambahan.setColorDefault(new java.awt.Color(52, 171, 239));
        txt_hargaTambahan.setColorFocus(new java.awt.Color(51, 255, 255));
        txt_hargaTambahan.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        panelTabelUtama.add(txt_hargaTambahan);
        txt_hargaTambahan.setBounds(730, 490, 210, 40);

        txt_alamat.setBackground(new java.awt.Color(52, 171, 239));
        txt_alamat.setForeground(new java.awt.Color(0, 0, 0));
        txt_alamat.setColorDefault(new java.awt.Color(52, 171, 239));
        txt_alamat.setColorFocus(new java.awt.Color(51, 255, 255));
        txt_alamat.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        panelTabelUtama.add(txt_alamat);
        txt_alamat.setBounds(220, 370, 230, 40);

        btn_lihattabel.setBackground(new java.awt.Color(52, 171, 239));
        btn_lihattabel.setForeground(new java.awt.Color(0, 0, 0));
        btn_lihattabel.setText("Lihat Tabel");
        btn_lihattabel.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_lihattabel.setColor(new java.awt.Color(52, 171, 239));
        btn_lihattabel.setColorClick(new java.awt.Color(0, 102, 102));
        btn_lihattabel.setColorOver(new java.awt.Color(51, 255, 255));
        btn_lihattabel.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_lihattabel.setRadius(20);
        btn_lihattabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lihattabelActionPerformed(evt);
            }
        });
        panelTabelUtama.add(btn_lihattabel);
        btn_lihattabel.setBounds(960, 80, 190, 40);

        btn_logout.setBackground(new java.awt.Color(52, 171, 239));
        btn_logout.setForeground(new java.awt.Color(0, 0, 0));
        btn_logout.setText("Logout");
        btn_logout.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_logout.setColor(new java.awt.Color(52, 171, 239));
        btn_logout.setColorClick(new java.awt.Color(0, 102, 102));
        btn_logout.setColorOver(new java.awt.Color(51, 255, 255));
        btn_logout.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_logout.setRadius(20);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        panelTabelUtama.add(btn_logout);
        btn_logout.setBounds(1170, 80, 170, 40);

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

        btn_printNota.setBackground(new java.awt.Color(52, 171, 239));
        btn_printNota.setForeground(new java.awt.Color(0, 0, 0));
        btn_printNota.setText("Print Nota");
        btn_printNota.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_printNota.setColor(new java.awt.Color(52, 171, 239));
        btn_printNota.setColorClick(new java.awt.Color(0, 102, 102));
        btn_printNota.setColorOver(new java.awt.Color(51, 255, 255));
        btn_printNota.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_printNota.setRadius(20);
        btn_printNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printNotaActionPerformed(evt);
            }
        });
        panelTabelUtama.add(btn_printNota);
        btn_printNota.setBounds(740, 650, 200, 40);

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

    // METHOD KALKULASI TIPE ORDER
    public int calculateHargaTipeOrder(){
        // MENGAMBIL DATA TIPE PEMESANAN
        if (cbx_deliver.isSelected()) {
            return 5000;
        } else if (cbx_pickup.isSelected()) {
            return 0;
        }
        return 0;
    }
    
    // METHOD KALKULASI HARGA BERAT
    public int calculateHargaBerat(){
        int hargaBerat = 0;
        
        // MENGAMBIL JUMLAH BERAT DAN MENGHITUNG KE RUPIAH
        if ((int) spin_berat.getValue() == 1) { // -> JIKA BERATNYA 1 KG MAKA TIDAK AKAN MENAMBAH HARGA
            hargaBerat = 0;
        } else { // -> HARGA AKAN NAIK 5000 JIKA BERAT MULAI DARI 2KG
            hargaBerat = ((int)spin_berat.getValue() * PER_KG) - 5000;
        }
        
        return hargaBerat;
    }
    
    // METHOD KALKULASI JENIS LAYANAN
    public int calculateHargaJenisLayanan(){
        int hargaLayanan = 0;
        
        // MENGECEK JENIS LAYANAN
        for (int i = 0; i < jenisLayanan.length; i++) {
            if (cbx_layanan.getSelectedItem().toString().equals(jenisLayanan[i])) {
                hargaLayanan = hargaDasar[i];
            }
        }
        return hargaLayanan;
    }
        
    // METHOD KALKULASI JENIS PAKET
    public int calculateHargaJenisPaket(){
        int[] tambahanHarga = {10000, 5000, 0};
            // -> JIKA JENIS PAKET = PAKET KILAT MAKA TAMBAHAN HARGA ADALAH 10k
            // -> JIKA JENIS PAKET = PAKET EXPRES MAKA TAMBAHAN HARGA ADALAH 5k
            // -> JIKA JENIS PAKET = PAKET KILAT MAKA TAMBAHAN HARGA ADALAH 0k
        int hargaPaket = 0;
        
        // MENGECEK JENIS PAKET
        for (int i = 0; i < paketOrder.length; i++) {
            if (cbx_paket.getSelectedItem().toString().equals(paketOrder[i])) {
                hargaPaket = tambahanHarga[i];
            }
        }     
        return hargaPaket;
    }
    
    // METHOD KALKULASI HARGA TAMBAHAN
    public int calculateHargaTambahan(){
        int hargaBarangTambahan = 0;
        
        // MENGAMBIL HARGA UNTUK JENIS TAMBAHAN
        for (int i = 0; i < tambahan.length; i++) {
            if (cbx_tambahan.getSelectedItem().toString().equals(tambahan[i])) {                
                hargaBarangTambahan = hargaTambahan[i];
            }
        }
        return hargaBarangTambahan;
    }
    
    // METHOD KALKULASI TOTAL HARGA
    public int calculateHargaTotal() {       
        int hargaTotal = 0;
                
        // MENDAPATKAN HARGA TOTAL
        hargaTotal =  calculateHargaJenisPaket() + calculateHargaJenisLayanan() + calculateHargaBerat() + calculateHargaTambahan() + calculateHargaTipeOrder();        
        
        return hargaTotal;
    }
    
    // METHOD TULIS NOTA DI TEXT AREA
    public void writeNota(Pelanggan pelanggan){
        // MEMBUAT TEXT AREA TIDAK BISA DIEDIT DAN KOSONG PADA AWAL TOMBOL DITEKAN
        txt_nota.setEditable(false);
        txt_nota.setText("");
        
        // DATA LAUNDRY
        String namaToko = "WashyGo";
        String alamatToko = "Jalan Soekarno Hatta No. 10";
        String teleponToko = "(021) 123456";
        
        // DATA CUSTOMER LAUNDRY
        String paketOrder = cbx_paket.getSelectedItem().toString();
        String jenisPelayanan = cbx_layanan.getSelectedItem().toString();
        String tambahan = cbx_tambahan.getSelectedItem().toString();
        int berat = (int) spin_berat.getValue();
        int hargaPaketOrder = calculateHargaJenisPaket();
        int hargaLayanan = calculateHargaJenisLayanan();
        int hargaTambahan = calculateHargaJenisLayanan();        
        int hargaTotalPembayaran = calculateHargaTotal();
        
        
        // MENAMBAHKAN TANGGAL DAN WAKTU
        time = LocalDateTime.now();
        format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        
        // MEMBUAT NOTA
        StringBuilder nota = new StringBuilder();
        nota.append("===================================================\n")
            .append(String.format("  Nama Toko\t\t: %s\n", namaToko))
            .append(String.format("  Alamat Toko\t\t: %s\n", alamatToko))
            .append(String.format("  Telepon\t\t: %s\n", teleponToko))
            .append("===================================================\n");
        
         nota.append(String.format("  Tanggal\t\t: %s\n", time.format(format)))
            .append("-----------------------------------------------------------------------------------------\n")
            .append(String.format("  Nama\t\t: %s\n", pelanggan.getNama()))
            .append(String.format("  No Telepon\t: %s\n", pelanggan.getNoTelepon()))
            .append(String.format("  Alamat\t\t: %s\n", pelanggan.getAlamat()))
            .append(String.format("  Paket\t\t: %s\n", paketOrder))
            .append(String.format("  Jenis\t\t: %s\n", jenisPelayanan))
            .append(String.format("  Tipe Order\t\t: %s (Rp %,d)\n", pelanggan.getTipeOrder(), calculateHargaTipeOrder()))
            .append(String.format("  Berat\t\t: %d Kg (Rp %,d)\n", berat, (berat * PER_KG) - 5000))       
            .append(String.format("  Total Paket\t\t: Rp %,d + Rp %,d\n", hargaPaketOrder + hargaLayanan, (berat * PER_KG) - 5000 ))
            .append("-----------------------------------------------------------------------------------------\n")
            .append("  Tambahan/Lain-Lain:\n")
            .append(String.format("     -%s\t: Rp %,d\n", tambahan, hargaTambahan))
            .append("-----------------------------------------------------------------------------------------\n")
            .append(String.format("  Total Pembayaran\t: Rp %,d\n", hargaTotalPembayaran))
            .append("-----------------------------------------------------------------------------------------\n")
            .append("  Terima kasih atas kunjungan Anda!\n")
            .append("===================================================\n");
        
        txt_nota.setText(nota.toString());        
    }
    
    // METHOD UNTUK MENDAPATKAN HARGA TAMBAHAN
    private void cbx_tambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tambahanActionPerformed
        String imageTambahan = "";
        for (int i = 0; i < tambahan.length; i++) {
            if (cbx_tambahan.getSelectedItem().toString().equals(tambahan[i])) {
                txt_hargaTambahan.setText(rupiahFormat.format(hargaTambahan[i]));
            }
        }
        
        for (int i = 0; i <= tambahan.length; i++) {
            if (i <= 1) {
                // SET GAMBAR TAMBAHAN
                img_tambahan.setIcon(null);
            } else {
                if (cbx_tambahan.getSelectedIndex() == i) {
                    imageTambahan = imageTambahanPaths.get(i - 2);
                    System.out.println(i + " : " + (i-2));
                    // SET GAMBAR TAMBAHAN
                    img_tambahan.setIcon(new ImageIcon(getClass().getResource(imageTambahan)));
                }
            }
        }
    }//GEN-LAST:event_cbx_tambahanActionPerformed

    // METHOD UNTUK MENDAPATKAN BERAT AWAL
    private void cbx_layananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_layananActionPerformed
        if (cbx_layanan.getSelectedItem() != null) {
            spin_berat.setValue(1);
        }
    }//GEN-LAST:event_cbx_layananActionPerformed

    // METHOD UNTUK MENAMPILKAN GAMBAR DI PAKET PANEL
    private void cbx_paketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_paketActionPerformed
        String imagePaket = "";
        for (int i = 0; i <= paketOrder.length; i++) {
            if (i < 1) {
                // SET GAMBAR TAMBAHAN
                img_paket.setIcon(null);
            } else {
                if (cbx_paket.getSelectedIndex() == i) {
                    imagePaket = imagePaketPaths.get(i - 1);
                    System.out.println(i + " : " + (i-2));
                    // SET GAMBAR TAMBAHAN
                    img_paket.setIcon(new ImageIcon(getClass().getResource(imagePaket)));
                }
            }
        }
    }//GEN-LAST:event_cbx_paketActionPerformed

    private void btn_prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesActionPerformed
       // VARIABEL UNTUK MENYIMPAN TIPE PEMESANAN
        String tipeOrder = "";
        String status = "Proses";
        // MENAMBAHKAN TANGGAL DAN WAKTU
        time = LocalDateTime.now();
        format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        if (txt_nama.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silahkan isi nama!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (txt_notelepon.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silahkan isi nomor telepon!", "Warning", JOptionPane.WARNING_MESSAGE);            
        } else if (txt_alamat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silahkan isi alamat!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (cbx_paket.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih paket!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (cbx_layanan.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih layanan!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (btngrup_pengiriman.getSelection() == null){
            JOptionPane.showMessageDialog(this, "Silahkan pilih pickup atau delivered!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (spin_berat.getValue().equals(0)) {
            JOptionPane.showMessageDialog(this, "Silahkan naikan jumlah berat!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {   
            if (txt_notelepon.getText().matches("\\d{10,13}")) {
                int result = JOptionPane.showConfirmDialog(
                    null,
                    "Apakah yakin?",
                    "Konfirmasi Pesanan",
                    JOptionPane.YES_NO_OPTION
                );
                if (result == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(this, "Data pemesanan sudah tersimpan!", "Information", JOptionPane.INFORMATION_MESSAGE);                        

                    // MENGAMBIL DATA TIPE PEMESANAN
                    if (cbx_deliver.isSelected()) {
                        tipeOrder = "Delivered";
                    } else if (cbx_pickup.isSelected()) {
                        tipeOrder = "Pick up";
                    }

                    // MENAMBAHKAN KE REPOSITORY
                    RepositoryPelanggan repoPelanggan = new RepositoryPelanggan();

                    // MEMBUAT DATA PELANGGAN
                    Pelanggan pelanggan = new Pelanggan(
                        txt_nama.getText(), 
                        txt_notelepon.getText(), 
                        txt_alamat.getText(), 
                        cbx_paket.getSelectedItem().toString(), 
                        cbx_layanan.getSelectedItem().toString(), 
                        cbx_tambahan.getSelectedItem().toString(), 
                        calculateHargaTambahan(), 
                        Integer.parseInt(spin_berat.getValue().toString()),
                        tipeOrder, 
                        calculateHargaTotal(),
                        time.format(format),
                        status
                    );                    


                    repoPelanggan.addToRepo(pelanggan);
                    repoPelanggan.testData();

                    // MENAMPILKAN DATA PELANGGAN PADA OUTPUT 
                    System.out.println("==========DATA PELANGGAN=========");
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
                    System.out.println("==========DATA PELANGGAN=========");                      

                    // MENGKALKULASI TOTAL HARGA
                    System.out.println("=========KALKULASI HARGA=========");                
                    System.out.println("Harga Barang Tambahan\t: " + calculateHargaTambahan());
                    System.out.println("Harga Paket\t\t: " + calculateHargaJenisPaket());
                    System.out.println("Harga Berat Untuk " + (int) spin_berat.getValue() + "\t: " + calculateHargaBerat()); 
                    System.out.println("Harga Tipe Order\t: " + calculateHargaTipeOrder());
                    System.out.println("Harga Total\t\t: " + calculateHargaTotal());                
                    System.out.println("=========KALKULASI HARGA=========");

                    // MENG-SET TOTAL HARGA
                    txt_total.setText("Rp" + rupiahFormat.format(calculateHargaTotal()));

                    // MENULIS KE AREA NOTA
                    writeNota(pelanggan);

                    // MENGOSONGKAN TEXTFIELD
                    txt_nama.setText("");
                    txt_alamat.setText("");
                    txt_notelepon.setText("");
                    cbx_paket.setSelectedIndex(0);
                    cbx_layanan.setSelectedIndex(0);
                    cbx_tambahan.setSelectedIndex(0);
                    cbx_pickup.setSelected(false);
                    cbx_deliver.setSelected(false);
                    spin_berat.setValue(0);                
                    txt_hargaTambahan.setText("");
                } 
            } else {
                JOptionPane.showMessageDialog(this, "Pastikan nomor telepon sudah benar!", "Warning", JOptionPane.WARNING_MESSAGE);            
            }
            
        }
    }//GEN-LAST:event_btn_prosesActionPerformed

    private void btn_printNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printNotaActionPerformed
        if (txt_nota.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan lakukan pemesanan terlebih dahulu!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
             try {
                boolean printed = txt_nota.print(); // Mencetak isi JTextArea
                if (printed) {
                    JOptionPane.showMessageDialog(this, "Teks berhasil dicetak!");
                    txt_nota.setText("");
                    txt_total.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Pencetakan dibatalkan!");
                    txt_nota.setText("");
                    txt_total.setText("");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mencetak: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_printNotaActionPerformed

    private void btn_lihattabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lihattabelActionPerformed
        Main_f mainFrame = (Main_f) SwingUtilities.getWindowAncestor(this);
        if (mainFrame != null) {
            mainFrame.showTabelUtamaPanel();
        }
    }//GEN-LAST:event_btn_lihattabelActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Main_f mainFrame = (Main_f) SwingUtilities.getWindowAncestor(this);
        if (mainFrame != null) {
            mainFrame.showLoginPanel();
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

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
    private javax.swing.JLabel backgroundImage;
    private com.component.MyButton btn_close;
    private com.component.MyButton btn_lihattabel;
    private com.component.MyButton btn_logout;
    private com.component.MyButton btn_minimize;
    private com.component.MyButton btn_printNota;
    private com.component.MyButton btn_proses;
    private javax.swing.ButtonGroup btngrup_pengiriman;
    private javax.swing.JCheckBox cbx_deliver;
    private javax.swing.JComboBox<String> cbx_layanan;
    private javax.swing.JComboBox<String> cbx_paket;
    private javax.swing.JCheckBox cbx_pickup;
    private javax.swing.JComboBox<String> cbx_tambahan;
    private javax.swing.JLabel img_paket;
    private javax.swing.JLabel img_tambahan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_alamat;
    private javax.swing.JLabel lbl_berat;
    private javax.swing.JLabel lbl_hargatambahan;
    private javax.swing.JLabel lbl_kilogram;
    private javax.swing.JLabel lbl_layanan;
    private javax.swing.JLabel lbl_nama;
    private javax.swing.JLabel lbl_notelpon;
    private javax.swing.JLabel lbl_paket;
    private javax.swing.JLabel lbl_tambahan;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel logoLaundry;
    private javax.swing.JPanel panelTabelUtama;
    private javax.swing.JPanel sb_imgpaket;
    private javax.swing.JPanel sb_imgtambahan;
    private javax.swing.JSpinner spin_berat;
    private javax.swing.JLabel titlePesanan;
    private com.component.MyTextField txt_alamat;
    private com.component.MyTextField txt_hargaTambahan;
    private com.component.MyTextField txt_nama;
    private javax.swing.JTextArea txt_nota;
    private com.component.MyTextField txt_notelepon;
    private com.component.MyTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
