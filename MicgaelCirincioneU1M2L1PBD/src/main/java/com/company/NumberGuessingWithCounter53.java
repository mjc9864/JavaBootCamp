 package com.company;
 import java.util.Random;
 import java.util.Scanner;

 public class NumberGuessingWithCounter53 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Random number = new Random();
        int randomNumber = number.nextInt(100) + 1;
        int userInt;
        int guesses = 0;
        do {
            System.out.println("Guess a number from 1 to 100.");
            userInt = Integer.parseInt(myScanner.nextLine());
            guesses ++;
            if (userInt < randomNumber) {
                System.out.println("Too low!");
            } else if (userInt > randomNumber) {
                System.out.println("Too high!");
            }
        } while (userInt != randomNumber);
        System.out.println("correct");
        System.out.println(guesses + " guesses");
    }
}


