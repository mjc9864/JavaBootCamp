package com.company;

import java.util.Scanner;

public class AddFiveAndDouble {

    public static void main(String[] args) {
        //Add 5 and double: Add 5 to the number inputted by the user and then double it. Print the result to the screen.

        Scanner myScanner = new Scanner(System.in);

        int num1;

        System.out.println("enter a number");
        num1 = Integer.parseInt(myScanner.nextLine());
        System.out.println("adding 5");
        int add = (num1 + 5);

        System.out.println(add);

        int multiply = (add * 2);
        System.out.println("doubling");
        System.out.println("doubled number is: " + multiply);

    }
}
