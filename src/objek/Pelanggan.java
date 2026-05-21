package objek;

public class Pelanggan {
    // ATRIBUTES        
    private String nama;
    private String noTelepon;
    private String alamat;
    private String paket;
    private String layanan;
    private String tambahan;
    private int hargaTambahan;
    private int berat;
    private String tipeOrder;
    private int totalHarga;
    private String tanggalMulai;
    private String status;
    
    // KONSTRUKTOR DENGAN PARAM
    public Pelanggan(String nama, String noTelepon, String alamat, String paket, String layanan, String tambahan, int hargaTambahan, int berat, String tipeOrder, int totalHarga, String tanggalMulai, String status) {        
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
        this.paket = paket;
        this.layanan = layanan;
        this.tambahan = tambahan;
        this.hargaTambahan = hargaTambahan;
        this.berat = berat;
        this.tipeOrder = tipeOrder;
        this.totalHarga = totalHarga;
        this.tanggalMulai = tanggalMulai;
        this.status = status;
    }

    // KONSTRUKTOR DENGAN PARAM
    public Pelanggan() {
    }

    // SETTER

//    public void setId(int id) {
//        this.id = id;
//    }    
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    public void setTambahan(String tambahan) {
        this.tambahan = tambahan;
    }

    public void setHargaTambahan(int hargaTambahan) {
        this.hargaTambahan = hargaTambahan;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public void setTipeOrder(String tipeOrder) {
        this.tipeOrder = tipeOrder;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void setTanggalMulai(String tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }
    
    

    // GETTER
    
//    public int getId() {
//        return id;
//    }

    public String getNama() {
        return nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPaket() {
        return paket;
    }

    public String getLayanan() {
        return layanan;
    }

    public String getTambahan() {
        return tambahan;
    }

    public int getHargaTambahan() {
        return hargaTambahan;
    }

    public int getBerat() {
        return berat;
    }

    public String getTipeOrder() {
        return tipeOrder;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public String getTanggalMulai() {
        return tanggalMulai;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    

}
