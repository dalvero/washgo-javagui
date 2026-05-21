# Demo - WashyGo

Panduan lengkap untuk menjalankan project WashyGo (Sistem Pemesanan Laundry).

## Teknologi & Versi

| Teknologi | Versi |
|-----------|-------|
| Java (JDK) | 20 atau lebih baru |
| Java Swing | Built-in (bundled dengan JDK) |
| NetBeans IDE | 17+ (rekomendasi) |
| VSCode | Versi terbaru + Extension Pack for Java |

## Prerequisites

Sebelum menjalankan project, pastikan hal-hal berikut sudah terpenuhi:

### 1. Java Development Kit (JDK)
- Install **JDK 20** atau lebih baru
- Download dari: [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) atau [OpenJDK](https://openjdk.org/)
- Pastikan `JAVA_HOME` sudah di-set dan `java -version` berjalan di terminal

### 2. IDE
Pilih salah satu:
- **NetBeans IDE 17+** (rekomendasi untuk project ini)
- **VSCode** dengan extension Java

### 3. Cek Instalasi
```bash
# Cek Java version
java -version

# Cek JDK version
javac -version
```

---

## Cara Menjalankan

### Opsi 1: NetBeans IDE (Rekomendasi)

1. **Buka NetBeans IDE**

2. **Import Project**
   - Klik menu `File` > `Open Project`
   - Navigasi ke folder `Laundry`
   - Klik `Open Project`

3. **Perbaiki Main Class** (PENTING!)
   - Klik kanan pada project `Laundry` > `Properties`
   - Pada tab `Run`, pastikan **Main Class** diubah dari `laundry.Laundry` menjadi:
     ```
     frame.Main_f
     ```
   - Klik `OK`

4. **Build Project**
   - Klik kanan pada project > `Build` (atau tekan `F11`)

5. **Run Project**
   - Klik kanan pada project > `Run` (atau tekan `F6`)
   - Aplikasi akan tampil dalam fullscreen

### Opsi 2: VSCode

1. **Install Extension**
   - Buka VSCode
   - Install extension berikut:
     - `Extension Pack for Java` (oleh Microsoft)
     - `Language Support for Java(TM) by Red Hat`

2. **Buka Project**
   - Klik `File` > `Open Folder`
   - Pilih folder `Laundry`

3. **Perbaiki Main Class** (PENTING!)
   - Buka file `.vscode/launch.json` (jika belum ada, buat baru)
   - Tambahkan konfigurasi berikut:
     ```json
     {
         "version": "0.2.0",
         "configurations": [
             {
                 "type": "java",
                 "name": "Run WashyGo",
                 "request": "launch",
                 "mainClass": "frame.Main_f",
                 "projectName": "Laundry"
             }
         ]
     }
     ```

4. **Compile & Run**
   - Buka file `src/frame/Main_f.java`
   - Klik tombol `Run` (▶) di pojok kanan atas editor
   - Atau tekan `F5`

5. **Alternatif: Command Line**
   ```bash
   # Compile
   javac -d bin src/objek/*.java src/repository/*.java src/com/component/*.java src/panel/*.java src/frame/*.java

   # Run
   java -cp bin frame.Main_f
   ```

---

## Catatan Penting

### Issue: Main Class Salah
File `nbproject/project.properties` memiliki konfigurasi `main.class=laundry.Laundry`, namun file tersebut **tidak ada**. Main class yang benar adalah `frame.Main_f`. Ini perlu diperbaiki agar project bisa dijalankan.

**Solusi di NetBeans:**
- Klik kanan project > `Properties` > tab `Run` > ubah Main Class ke `frame.Main_f`

**Solusi di VSCode:**
- Buat/edit `.vscode/launch.json` dengan `mainClass: "frame.Main_f"`

### Data In-Memory
Aplikasi ini menyimpan data di memory (ArrayList), bukan di database. Artinya:
- Data akan **hilang** ketika aplikasi ditutup
- Akun default: username `daniel`, password `daniel123`
- Untuk testing, buat pesanan baru setiap kali menjalankan aplikasi

### Resolusi Layar
Aplikasi dirancang untuk resolusi **1366x768** (fullscreen). Jika resolusi layar berbeda, tampilan mungkin tidak optimal.

---

## Troubleshooting

| Masalah | Solusi |
|---------|--------|
| `Error: Could not find or load main class laundry.Laundry` | Ubah Main Class ke `frame.Main_f` (lihat panduan di atas) |
| Gambar tidak muncul | Pastikan folder `src/gambar/` tidak dipindah atau dihapus |
| Font berbeda | Font yang digunakan (Book Antiqua, Bookman Old Style) mungkin tidak tersedia di semua OS, tapi tidak mempengaruhi fungsionalitas |
| Resolusi tidak pas | Aplikasi menggunakan `Toolkit.getDefaultToolkit().getScreenSize()` untuk menyesuaikan ukuran window |

---

## Akun Default

| Field | Nilai |
|-------|-------|
| Username | `daniel` |
| Password | `daniel123` |
