package com.fredericus.praktikumpbo.pertemuan6.tugas;

import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mohon Masukan Angka: ");
        String strInput = input.nextLine();
        int intInput = 5;
        
        try{
        intInput = Integer.parseInt(strInput);
        System.out.println(strInput);
        System.out.println("Berhasil!");
        }catch(NumberFormatException e){
        System.out.println("Tidak dapat memproses, mohon masukan angka");
    }
  }
}