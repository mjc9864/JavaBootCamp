package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {
//Multiply 3: Multiply 3 numbers inputted by the user.
        Scanner myScanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;


        System.out.println("enter a number");
        num1 = Integer.parseInt(myScanner.nextLine());

        System.out.println("enter a second number");
        num2 = Integer.parseInt(myScanner.nextLine());

        System.out.println("enter a third number");
        num3 = Integer.parseInt(myScanner.nextLine());

        int total = (num1 * num2 * num3);

        System.out.println("The total of the numbers are " + total + ".");








    }
}