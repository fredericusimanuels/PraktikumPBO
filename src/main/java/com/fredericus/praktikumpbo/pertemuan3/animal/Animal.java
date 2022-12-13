/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fredericus.praktikumpbo.pertemuan3.animal;

/**
 *
 * @author seann
 */
public class Animal {
  // Attributes
  String name;
  int age;
  String color;

  public Animal() {}

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
  
    
    
  //ALT+INSERT
  public void showProfile() {
    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
    System.out.println("Color: " + color);
    System.out.println();
  }
}
