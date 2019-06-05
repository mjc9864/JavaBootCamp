package com.company;

import java.util.Scanner;
import java.util.Random;

public class ANumberGuessingGame43 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Random num = new Random();
        int input = 1 + num.nextInt(10);
        System.out.print("pick a number 1 to 10.");

        int input1 = myScanner.nextInt();
        System.out.println();
        if (input1 == input) {
            System.out.print("Right the number was " + input);
        } else {
            System.out.println("Wrong the number was " + input);


        }
    }

}
