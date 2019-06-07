package com.company;

import java.util.Scanner;
import java.util.Random;
public class ThreeCardMonty {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        Random num = new Random();
        System.out.print("pick a cup 1, 2, or 3.\n" + "##  ##  ##      \n" +
                "##  ##  ##\n" +        "1   2   3");
        String guessCard = myScanner.nextLine();
        int guess = Integer.parseInt(guessCard);


        int ball = num.nextInt(3) + 1;



        if (guess == ball) {
            System.out.println("you win");
        } else {
            System.out.println("you lose the ball was " + ball);
        }
    }
}
