package com.company;

import java.util.Scanner;

public class SubtractTwo {

    public static void main(String[] args) {
//Subtract 2: Subtract the second number from the first number inputted by the user.
        Scanner myScanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("enter a number");
        num1 = Integer.parseInt(myScanner.nextLine());

        System.out.println("enter a second number");
        num2 = Integer.parseInt(myScanner.nextLine());

        int total = (num1 - num2);

        System.out.println("new number is: " + total);






    }
}
