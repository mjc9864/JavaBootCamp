package com.company;

import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {



        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a number to be rooted: ");

        String userSquare = myScanner.nextLine();
        int root =Integer.parseInt(userSquare);


        while(root < 0) {
            System.out.println("this not a positive number, try again ");
            root = Integer.parseInt(myScanner.nextLine());
        }
        double x = Math.sqrt(root);
        System.out.println("Square root of " + root + " is " + x +".");



    }
}
