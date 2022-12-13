package com.fredericus.praktikumpbo.pertemuan6;

public class Basic {
    public static void main(String[] args) {
        //membuat array isi 3
        int[] myNumbers = {1, 2, 3};
        
        //uji coba print array index ke-10
        try {
            System.out.println(myNumbers[10]);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array gk sebesar itu!");
        }
           System.out.println("proses selesai!");

    }
}
