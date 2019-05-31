package com.company;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        /*
        Even or Odd: Write a program that gets user input (an integer) and prints whether it's even or odd.
         */

        Scanner myScanner = new Scanner(System.in);

        System.out.println("enter a number");

        int num;
        num = myScanner.nextInt();
        if(num % 2 == 0){
            System.out.println("you entered an even number");
        }
        else {
            System.out.println("You entered an odd number");
        }



    }
}

