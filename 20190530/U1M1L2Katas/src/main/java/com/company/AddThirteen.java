package com.company;

import java.util.Scanner;

public class AddThirteen {

    public static void main(String[] args) {
//Add 13: Add 13 to the value inputted by the user and print the result to the screen.

        Scanner myScanner = new Scanner(System.in);

        int num1;

        System.out.println("enter a number");
        num1 = Integer.parseInt(myScanner.nextLine());

        int sum = (num1 + 13);



        System.out.println("new number is: " + sum);





    }
}
