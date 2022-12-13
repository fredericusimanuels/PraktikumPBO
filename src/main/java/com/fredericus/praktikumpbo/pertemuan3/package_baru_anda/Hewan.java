package com.fredericus.praktikumpbo.pertemuan3.package_baru_anda;

public class Hewan {
 
    // Properti 
    double tinggi = 20;
    double berat = 4;
 
    // Inisialisasi properti melalui konstruktor
    int umur;
 
    // Konstruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
    }
 
    void lari() {
        System.out.println("Berlari dengan sangat cepat..");
    }
 
    void jalan() {
        System.out.println("Berjalan sambil melompat.");
    }
 
    void makan() {
        System.out.println("Makan wortel dengan menggunakan mulutnya");
    }
 
    int getUmur() {
        return umur;
    }
 
    double getBerat() {
        return berat;
    }
 
    double getTinggi() {
        return tinggi;
    }
 
}


