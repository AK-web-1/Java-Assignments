package com.Assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++){
            System.out.println("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<5; i++){
            sum = sum + arr[i];

        }
        System.out.println("Sum of all elements in the array is: "+sum);

    }
}
