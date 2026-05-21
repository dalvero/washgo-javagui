# WashyGo - Sistem Pemesanan Laundry

Aplikasi desktop berbasis Java Swing untuk sistem pemesanan dan booking usaha laundry. Dikembangkan sebagai tugas UAS mata kuliah Pemrograman Dasar.

## Fitur

- **Autentikasi** - Login dan registrasi pengguna
- **Pemesanan Laundry** - Form pemesanan dengan pilihan paket (Kilat/Express/Reguler), jenis layanan, dan item tambahan
- **Kalkulasi Otomatis** - Perhitungan total harga berdasarkan berat, paket, layanan, dan tipe pengiriman
- **Manajemen Data** - Tabel data pelanggan, pesanan, dan riwayat pemesanan dengan fitur edit, update, dan delete
- **Nota & Cetak** - Generate dan print nota pesanan langsung dari aplikasi
- **Custom UI** - Komponen Swing custom dengan efek hover, rounded corner, dan focus animation

## Daftar Harga

| Layanan | Harga |
|---------|-------|
| Cuci Kering Lipat | Rp5.000/kg |
| Cuci Kering Setrika | Rp10.000/kg |
| Paket Kilat | +Rp10.000 |
| Paket Express | +Rp5.000 |
| Delivered | +Rp5.000 |

## Teknologi

- Java SE 20
- Java Swing (GUI)
- NetBeans IDE (project format)

## Cara Menjalankan

Lihat [DEMO.md](DEMO.md) untuk panduan lengkap menjalankan project ini.

## Struktur Project

```
src/
├── frame/          # Frame utama (Main_f.java)
├── panel/          # Panel UI (Login, Register, Tabel, Form Pesanan)
├── objek/          # Model data (Pelanggan, Pengguna)
├── repository/     # Penyimpanan data in-memory
└── com/component/  # Custom Swing components
```

## Kelompok 6 - Semester 1
