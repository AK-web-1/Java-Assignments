package com.Assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void StringToDate(String dob) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
        Date date= formatter.parse(dob);
        System.out.println("date object value: "+date);
    }


    public static void main(String[] args) throws ParseException {

        String name;
        String dob;
        int salary;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your name: ");
        name=sc.nextLine();
        System.out.println("Enter your date of birth: ");
        dob=sc.nextLine();
        System.out.println("Enter your monthly salary in INR: ");
        salary=sc.nextInt();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
        Date date = formatter.parse(dob);

        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();

        Period period = Period.between(givenDate,LocalDate.now());
        System.out.println("your name: "+name);
        System.out.print("your age: ");
        System.out.println(period.getYears()-1+" years "+ period.getMonths()+" months "+ period.getDays()+" days ");

    int annual_salary = salary*12;

        System.out.println("Your annual income is: "+ annual_salary);
    if(annual_salary >= 500000){
        System.out.println("you need to pay "+annual_salary*20/100+" amount of tax");
    }

    else if (annual_salary>=400000 && annual_salary<500000){
        System.out.println("you need to pay "+annual_salary*15/100+" amount of tax");

    }
    else if (annual_salary>=300000 && annual_salary<400000){
        System.out.println("you need to pay "+annual_salary*10/100+" amount of tax");

    }
    else if (annual_salary>=200000 && annual_salary<300000){
        System.out.println("you need to pay "+annual_salary*5/100+" amount of tax");

    }
    else{
        System.out.println("There is no tax for below 2L annual income");
    }

    }
}
