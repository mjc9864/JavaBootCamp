package com.company;

import java.util.Random;
import java.util.Scanner;

public class HiLo54 {
    public static void main(String[] args) {

        Random num = new Random();
        int input = 1+num.nextInt(100);
        Scanner myScanner = new Scanner(System.in);
        int guesses=1;
        System.out.println("Pick a number between 1-100");
        int guess=0;
        while(input!=guess && guesses<=7){

            guess = myScanner.nextInt();

            if(input==guess){
                System.out.println("correct");
                break;
            }
            else if(input>guess && guesses<=7){
                System.out.println("too low.");
            }else if(input<guess && guesses<=7){
                System.out.println("too high.");
            }
        }if(guesses>=7 && input!=guess){
            System.out.println("Game Over");
        }
    }
}
