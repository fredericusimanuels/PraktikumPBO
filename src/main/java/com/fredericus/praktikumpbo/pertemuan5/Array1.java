package com.fredericus.praktikumpbo.pertemuan5;

public class Array1 {
    public static void main(String[] args) {
        //Pembuatan array
        String[] names = new String[5];
        
        //cek panjang array
        System.out.println("Panjang array: " + names.length);
        
        //membuat nilai ke array
        names[0] = "Rain";
        names[1] = "Thunder";
        names[2] = "Storm";
       
        //menampilkan semua nilai array
        for(int i=0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
    }
    
}
