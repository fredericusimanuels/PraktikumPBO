package com.fredericus.praktikumpbo.pertemuan3.challenge;

public class main {     
    public static void main(String[] args) {         
        challange Fredericus = new challange("Fredericus", 11, 2003);         
        challange Imanuel = new challange("Imanuel", 22, 2001);         
        challange Situmorang = new challange ("Situmorang", 21, 2002); 
         
        Fredericus.showProfile();         
        Imanuel.showProfile();         
        Situmorang.showProfile(); 
         
        System.out.println("Rakha name (before) : " + Fredericus.getName());         
        Fredericus.setName("Asshole"); 
        System.out.println("Rakha name (after) : " + Fredericus.getName()); 
         
    } 
} 

