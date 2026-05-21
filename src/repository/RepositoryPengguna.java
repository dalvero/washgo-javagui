package repository;

import java.util.ArrayList;
import objek.Pengguna;

public class RepositoryPengguna {
    public static ArrayList<Pengguna> dataPengguna = new ArrayList<>();
    
    public RepositoryPengguna(){
        
    }
    
    public static void addToRepo(Pengguna pengguna){
        dataPengguna.add(pengguna);
    }
    
    // METHOD VALIDASI USERNAME
    public static boolean isUsernameValid(String username){
        System.out.println("CEK AKUN USERNAME");
        for (int i = 0; i < dataPengguna.size(); i++) {
            if (username.equals(dataPengguna.get(i).getUsername())) {
                return true;
            }
        }
        return false;
    }
    
    // METHOD UNTUK MENGECEK/MEMVALIDASI AKUN
    public static boolean isUserValid(String username, String password){
        System.out.println("CEK AKUN PASSWORD");        
        for (int i = 0; i < dataPengguna.size(); i++) {
            if (isUsernameValid(username)) {
                System.out.println("username " + (i+1) + " : " + username + " dan " + dataPengguna.get(i).getUsername());                
                if (password.equals(dataPengguna.get(i).getPassword())) {
                    System.out.println("password " + (i+1) + " : " + password + " dan " + dataPengguna.get(i).getPassword());                
                    return true;
                }
            } 
        }
        return true;
    }
    
}
