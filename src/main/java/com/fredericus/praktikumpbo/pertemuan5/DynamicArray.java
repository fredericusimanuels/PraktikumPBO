package com.fredericus.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        //deklarasi scanner utk user input nanti
        Scanner input = new Scanner(System.in);
        
        //membuat agar panjang array ditentukan input user
        System.out.println("-- Program Input Nilai--");
        System.out.print("Masukkan jumlah matkul:");
        int jml = input.nextInt();
        float rata, total=0;
        System.out.println();
        
        //membuat array baru dengan panjang sesuai input user
        int[] nilai = new int[100];
        
        //masukkan nilai ke array
        for (int i = 0; i < jml; i++) {
            System.out.print("masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
            total = total + nilai[i];

        }
        rata = total/jml;
        System.out.println();
    
    //menampilkan semua nilai array
        System.out.println("-- Daftar Nilai --");
        for (int i = 0; i < jml; i++) {
            System.out.println(i + ": " + nilai[i]);
            
        }
    System.out.println("Hasil rata-rata adalah : " + rata);
    }
}
