package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {
//Double it and add 5: Double the number inputted by the user and then add 5. Print the result to the screen.
        Scanner myScanner = new Scanner(System.in);

        int num1;

        System.out.println("enter a number");
        num1 = Integer.parseInt(myScanner.nextLine());

        int multiply = (num1 * 2);

        int add = (multiply + 5);

        System.out.println("new number: " + add);
    }
}
