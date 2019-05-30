package com.company;

import java.util.Scanner;

public class AverageThree {

    public static void main(String[] args) {
//Average 3: Find the average of 3 numbers inputted by the user.
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

        float average = (num1 + num2 + num3) / 3.0f;
        System.out.printf("The average of your numbers is: %.2f \n", average);

    }
}
