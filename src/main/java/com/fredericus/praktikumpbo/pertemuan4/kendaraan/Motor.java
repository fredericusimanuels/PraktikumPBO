package com.fredericus.praktikumpbo.pertemuan4.kendaraan;

public class Motor extends Kendaraan {
    int maxGear;
    
    public void belok(String arah) {
        System.out.println("Motor" + nama + "Maju ke " + arah + "!");
    }

    public void maju(String arah) {
        System.out.println("Motor" + nama + "belok ke " + arah + "!");
    }
    
    public void belok() {
        System.out.println("Eror: Mohon masukkan arah!");
    }
    
    public void extraInfo(){
        System.out.println("Max gear : " + maxGear);
    }
}    
