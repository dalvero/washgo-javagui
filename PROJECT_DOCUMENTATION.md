# WashyGo - Sistem Pemesanan Laundry

## Deskripsi

WashyGo adalah aplikasi desktop berbasis Java Swing yang dibangun sebagai sistem pemesanan/booking untuk usaha laundry. Aplikasi ini memungkinkan pengguna untuk melakukan login, mendaftar akun baru, membuat pesanan laundry, dan mengelola data pelanggan melalui antarmuka grafis.

Proyek ini dikembangkan sebagai tugas UAS (Ujian Akhir Semester) mata kuliah Pemrograman Dasar - Semester 1.

## Arsitektur Aplikasi

```
Laundry/
├── src/
│   ├── frame/              # Frame utama aplikasi
│   │   └── Main_f.java     # JFrame utama dengan CardLayout
│   ├── panel/              # Panel-panel UI
│   │   ├── p_login.java    # Panel login
│   │   ├── p_register.java # Panel registrasi
│   │   ├── p_tabelutama.java    # Panel tabel data pelanggan & pesanan
│   │   └── p_tambahpesanan.java # Panel form tambah pesanan
│   ├── objek/              # Model/Entity
│   │   ├── Pelanggan.java  # Objek data pelanggan
│   │   └── Pengguna.java   # Objek data pengguna/akun
│   ├── repository/         # Data access layer (in-memory)
│   │   ├── RepositoryPelanggan.java # Penyimpanan data pelanggan
│   │   └── RepositoryPengguna.java  # Penyimpanan data pengguna
│   ├── com/component/      # Custom Swing components
│   │   ├── MyButton.java   # Tombol dengan efek hover & rounded
│   │   ├── MyLabel.java    # Label dengan efek hover
│   │   ├── MyPanel.java    # Panel dengan rounded corner
│   │   ├── MyTextField.java    # TextField dengan efek focus
│   │   └── MyPasswordField.java # PasswordField dengan efek focus
│   ├── gambar/             # Aset gambar (logo, ikon, background)
│   └── desain/             # Mockup/desain UI (JPEG)
├── nbproject/              # Konfigurasi NetBeans
├── build.xml               # Ant build script
└── manifest.mf             # Manifest file
```

## Alur Aplikasi

```
Login Panel
    │
    ├── (Berhasil Login) ──→ Tabel Utama Panel
    │                            │
    │                            ├── Data Pelanggan (tabel)
    │                            ├── Data Pesanan (tabel)
    │                            ├── Riwayat Pemesanan (tabel)
    │                            ├── Edit/Update/Delete data
    │                            └── Tambah Pesanan ──→ Form Pemesanan
    │                                                      │
    │                                                      ├── Input data pelanggan
    │                                                      ├── Pilih paket & layanan
    │                                                      ├── Hitung total harga
    │                                                      ├── Generate nota
    │                                                      └── Print nota
    │
    └── (Belum punya akun) ──→ Register Panel
                                    │
                                    └── (Berhasil Register) ──→ Kembali ke Login
```

## Fitur Utama

### 1. Autentikasi Pengguna
- **Login**: Validasi username dan password terhadap data di `RepositoryPengguna`
- **Register**: Pendaftaran akun baru dengan nama lengkap, username, dan password
- Akun default: username `daniel`, password `daniel123`

### 2. Manajemen Pesanan Laundry
- **Form Pemesanan**: Input data pelanggan (nama, no. telepon, alamat)
- **Pilih Paket**: Kilat (+Rp10.000), Express (+Rp5.000), Reguler
- **Jenis Layanan**: Cuci Kering Lipat (Rp5.000/kg), Cuci Kering Setrika (Rp10.000/kg)
- **Tambahan**: Sprei, Bedcover, Selimut (berbagai ukuran)
- **Tipe Pengiriman**: Pick Up (gratis) atau Delivered (+Rp5.000)
- **Kalkulasi Otomatis**: Total harga dihitung berdasarkan paket, layanan, berat, tambahan, dan tipe order

### 3. Manajemen Data
- **Tabel Pelanggan**: Menampilkan ID, nama, no. telepon, alamat, total pembayaran
- **Tabel Pesanan**: Menampilkan ID, nama, paket, tambahan, total harga, tanggal, status
- **Riwayat Pemesanan**: Menampilkan pesanan yang sudah selesai (status "Selesai")
- **CRUD**: Edit, Update, dan Delete data pada tabel

### 4. Nota & Cetak
- **Generate Nota**: Otomatis membuat nota dengan detail pesanan lengkap
- **Print Nota**: Mencetak nota langsung dari aplikasi

## Struktur Data

### Pelanggan
| Field | Tipe | Keterangan |
|-------|------|------------|
| nama | String | Nama pelanggan |
| noTelepon | String | Nomor telepon (10-13 digit) |
| alamat | String | Alamat pelanggan |
| paket | String | Jenis paket (Kilat/Express/Reguler) |
| layanan | String | Jenis layanan |
| tambahan | String | Item tambahan |
| hargaTambahan | int | Harga item tambahan |
| berat | int | Berat laundry (kg) |
| tipeOrder | String | Pick up / Delivered |
| totalHarga | int | Total harga keseluruhan |
| tanggalMulai | String | Tanggal pemesanan |
| status | String | Status pesanan (Proses/Selesai) |

### Pengguna
| Field | Tipe | Keterangan |
|-------|------|------------|
| fullname | String | Nama lengkap |
| username | String | Username untuk login |
| password | String | Password untuk login |

## Daftar Harga

### Paket
| Paket | Harga Tambahan |
|-------|---------------|
| Kilat | +Rp10.000 |
| Express | +Rp5.000 |
| Reguler | Rp0 |

### Jenis Layanan (per kg)
| Layanan | Harga Dasar |
|---------|------------|
| Cuci Kering Lipat | Rp5.000 |
| Cuci Kering Setrika | Rp10.000 |

### Tambahan
| Item | Harga |
|------|-------|
| Tidak Ada | Rp0 |
| Sprei 2 Set | Rp20.000 |
| Sprei 1 Set | Rp14.000 |
| Bedcover Besar | Rp33.000 |
| Bedcover Sedang | Rp28.000 |
| Bedcover Kecil | Rp21.000 |
| Selimut Besar | Rp23.000 |
| Selimut Sedang | Rp18.000 |
| Selimut Kecil | Rp14.000 |

### Lainnya
| Item | Harga |
|------|-------|
| Berat (per kg, mulai dari 2kg) | Rp5.000/kg |
| Delivered | +Rp5.000 |
| Pick Up | Gratis |

## Custom Components

Aplikasi ini menggunakan custom Swing components yang dibuat sendiri:

- **MyButton**: JButton dengan efek hover (warna berubah saat cursor masuk/keluar), efek klik, dan border rounded
- **MyLabel**: JLabel dengan efek hover pada teks (warna foreground berubah)
- **MyPanel**: JPanel dengan background rounded corner dan border customizable
- **MyTextField**: JTextField dengan efek focus (warna background berubah saat aktif) dan padding kiri
- **MyPasswordField**: JPasswordField dengan efek focus dan padding kiri

## Penyimpanan Data

Aplikasi ini menggunakan penyimpanan data **in-memory** (ArrayList). Data tidak disimpan ke database atau file, sehingga:
- Data akan hilang ketika aplikasi ditutup
- Cocok untuk demonstrasi dan tujuan pembelajaran
- Tidak ada dependency eksternal (database, file I/O)

## Catatan Teknis

- **Look and Feel**: Menggunakan Nimbus Look and Feel
- **Layout**: Menggunakan CardLayout untuk navigasi antar panel
- **Resolusi**: Dirancang untuk resolusi 1366x768 (fullscreen)
- **Window**: Undecorated (tanpa title bar default), menggunakan custom close/minimize button
- **Encoding**: UTF-8

## Kontributor

- Kelompok 6 - Semester 1
