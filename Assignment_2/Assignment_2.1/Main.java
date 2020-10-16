package com.Assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sub1;
        int sub2;
        int sub3;
        int sub4;
        int sub5;
        float Percentage;

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the sub1 marks: ");
        sub1=sc.nextInt();
        System.out.print("Enter the sub2 marks: ");
        sub2=sc.nextInt();
        System.out.print("Enter the sub3 marks: ");
        sub3=sc.nextInt();
        System.out.print("Enter the sub4 marks: ");
        sub4=sc.nextInt();
        System.out.print("Enter the sub4 marks: ");
        sub5=sc.nextInt();

        if (sub1>100 || sub2>100 || sub3>100 || sub4>100 || sub5>100 ){
            System.out.println("Error!!!! "+" marks must be < or equal to 100");
        }

        else{
            Percentage=(sub1+sub2+sub3+sub4+sub5)*100/500;

            if(Percentage>=90 && Percentage<=100){
                System.out.println("Your Percentage is: "+Percentage+" You got S grade!!");
            }
            else if(Percentage>=75 && Percentage<=89){
                System.out.println("Your Percentage is: "+Percentage+" You got A grade");
            }
            else if(Percentage>=60 && Percentage<=75){
                System.out.println("Your Percentage is: "+Percentage+" You got B grade");
            }
            else if(Percentage>=50 && Percentage<=60){
                System.out.println("Your Percentage is: "+Percentage+" You got C grade");
            }
            else if(Percentage>=40 && Percentage<=50){
                System.out.println("Your Percentage is: "+Percentage+" You got D grade");
            }
            else if(Percentage>=35 && Percentage<=40){
                System.out.println("Your Percentage is: "+Percentage+" You got E grade");
            }
            else{
                System.out.println("Your Percentage is: "+Percentage+" You are Fail you got F grade!");
            }




        }
}}
