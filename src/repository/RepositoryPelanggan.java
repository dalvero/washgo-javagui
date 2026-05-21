package repository;

import java.util.ArrayList;
import objek.Pelanggan;

public class RepositoryPelanggan {
    // DECLARE ARRAYLIST
    private static ArrayList<Pelanggan> repoPelanggan = new ArrayList<>();
    private static ArrayList<Pelanggan> historyPelanggan = new ArrayList<>();
    public static ArrayList<Pelanggan> pelangganDummy = new ArrayList<>();
    
    
    // KONSTRUKTOR TANPA PARAMETER
    public RepositoryPelanggan(){        
    }
    
    // METHOD ADD TO REPOSITORY
    public static void addToRepo(Pelanggan pelanggan){
        System.out.println("\n===MENAMBAHKAN DATA PELANGGAN====");
        repoPelanggan.add(pelanggan);
    }
    
    // METHOD ADD TO REPOSITORY
    public static void addToPelangganDummyByName(String name){
        pelangganDummy.clear();
        System.out.println("\nMENAMBAHKAN DATA PELANGGAN YANG DIEDIT");
        for (Pelanggan pelanggan : repoPelanggan){
            if (name.equals(pelanggan.getNama())) {
                pelangganDummy.add(pelanggan);
                System.out.println("PELANGGAN YANG DIEDIT : " + pelanggan.getNama());
                return;
            }
        }
    }
    
    // METHOD UNTUK MEMINDAHKAN PELANGGAN YANG SUDAH SELESAI PEMESANANNYA KE ARRAYLIST RIWAYAT PESANAN
    public static void moveFromRepoPelangganToHistory(Pelanggan pelanggan){
        repoPelanggan.remove(pelanggan);
        historyPelanggan.add(pelanggan);
    }
    
    // METHOD UNTUK MENGAMBIL LIST PELANGGAN
    public static ArrayList<Pelanggan> getAllPelanggan(){
        return repoPelanggan;
    }        
    
    // METHOD UNTUK TEST APAKAH DATA PELANGGAN YANG SUDAH SELESAI STATUSNYA MUNCUL DI ARRAYLIST RIWAYAT PELANGGAN
    public static void testDataHistory(){       
        System.out.println("\n=========RIWAYAT PEMESANAN========");
        for (Pelanggan pelanggan : historyPelanggan){
            System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        }
        System.out.println("=========RIWAYAT PEMESANAN========\n");
    }
    
    // METHOD UNTUK MENGAMBIL LIST RIWAYAT PELANGGAN
    public static ArrayList<Pelanggan> getAllHistoryPelanggan(){
        return historyPelanggan;
    } 
    
    // METHOD UNTUK TEST APAKAH DATA PELANGGAN SUDAH TERSIMPAN
    public static void testData(){       
        for (Pelanggan pelanggan : repoPelanggan){
            System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        }
        System.out.println("===MENAMBAHKAN DATA PELANGGAN====");
    }
    
    // METHOD UNTUK CHECK KETERSEDIAAN DATA PELANGGAN
    public static void checkData(){       
        System.out.println("\n==KETERSEDIAAN DATA PELANGGAN====");
        for (Pelanggan pelanggan : repoPelanggan){
            System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        }
        System.out.println("==KETERSEDIAAN DATA PELANGGAN====\n");
    }
    
    
}
