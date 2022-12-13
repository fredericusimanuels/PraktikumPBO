package com.fredericus.praktikumpbo.pertemuan4.kendaraan;

public class Kendaraan {
    
    // atribute (variable)
    String nama;
    int jmlRoda;
    
    //method (fungsi)
    public void nyalakanMesin() {
        System.out.println("Mesin" + nama + "telah dinyalakan!");
    }
    
    public void showInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("Jml roda: " + jmlRoda);
        extraInfo();
    }
    
    public void extraInfo() {
        
    }
}
