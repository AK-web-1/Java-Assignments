package com.Assignment;

import java.util.Scanner;

public class avengers {

    public String name;
    public int age;
    public String power;
    public String weapon;
    public String planet;

    Scanner sc= new Scanner(System.in);

    public void getDetails(){

        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the power: ");
        power = sc.nextLine();
        System.out.println("Enter the weapon: ");
        weapon = sc.nextLine();
        System.out.println("Enter the planet: ");
        planet = sc.nextLine();


    }

    public void  displayDetails(){

        System.out.println("Name of the avenger  "+name+" he is "+age+" old and his power is "+power+" his weapon "+weapon+" and he belongs to planet "+planet);


    }


}
