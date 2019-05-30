package com.company;

import java.util.Scanner;

public class AddFive {

    public static void main(String[] args) {
//Add 5: Add 5 numbers inputted by the user
        Scanner myScanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        System.out.println("enter a number");
        num1 = Integer.parseInt(myScanner.nextLine());

        System.out.println("enter a second number");
        num2 = Integer.parseInt(myScanner.nextLine());

        System.out.println("enter a third number");
        num3 = Integer.parseInt(myScanner.nextLine());

        System.out.println("enter a fourth number");
        num4 = Integer.parseInt(myScanner.nextLine());

        System.out.println("enter a fifth number");
        num5 = Integer.parseInt(myScanner.nextLine());

        int sum = (num1 + num2 + num3 + num4 + num5);


        System.out.println("The sum of the numbers is " + sum + ".");

    }
}