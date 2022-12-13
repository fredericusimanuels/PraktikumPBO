package com.fredericus.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        //Pembuatan object
        //class object = new class()
        Mobil mb = new Mobil();
        Motor mt = new Motor();
        Kendaraan kn = new Kendaraan();
        
        
        //memasukkan nilai atribute
        mb.nama = "Koasi";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        mt.nama = "motor harley";
        mt.jmlRoda = 4;
        mt.maxGear = 6;
        
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 3;
        
        //uji coba pemanggilan method
        mb.showInfo();
        mb.belok("kanan");
        mb.belok();
        
        mt.belok("kedepan");
        kn.showInfo();
        
    }
    
}
