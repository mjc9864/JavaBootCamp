package com.company;
import java.util.Random;
import java.util.Scanner;
public class HiLo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Hi-Low!");
        System.out.println("What is your name?");
        String name = myScanner.nextLine();
        System.out.println("Ok, " + name + ", here are the rules:");
        System.out.println("The computer will come up with a number between 1 and 100 (inclusive).\n" +
                "The user will be prompted to guess the number.\n" +
                "If the user guesses the number correctly, the program displays:\n" +
                "“Congratulations, [name of user]! You win!”\n" +
                "\"It took you [number of guesses] guesses to find my number!\"\n" +
                "If the user does not guess the number correctly, the program will display “Too low!” if the guess is too low and “Too high!” if the guess is too high, and then will prompt the user for another guess. This goes on until the number is guessed correctly.");
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
        System.out.println("Congratulations, " + name + "! You win!");
        System.out.println("It took you " + guesses + " guesses to find my number!");

    }
}
