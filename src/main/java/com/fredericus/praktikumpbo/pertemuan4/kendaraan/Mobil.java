package com.fredericus.praktikumpbo.pertemuan4.kendaraan;

public class Mobil extends Kendaraan {
    int maxGear;
    
    public void belok(String arah) {
        System.out.println("Mobil" + nama + "belok ke " + arah + "!");
    }

    public void belok() {
        System.out.println("Eror: Mohon masukkan arah!");
    }
    
    public void extraInfo(){
        System.out.println("Max gear : " + maxGear);
    }
}

