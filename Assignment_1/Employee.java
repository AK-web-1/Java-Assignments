package com.employee;

import javax.xml.namespace.QName;

public class Employee {
    public String name;
    public int age;
    public String city;

    public void display(){
    System.out.println("name of the person is "+name);
    System.out.println("age of the person is "+age);
    System.out.println("city of the person is "+city);
    }
}
