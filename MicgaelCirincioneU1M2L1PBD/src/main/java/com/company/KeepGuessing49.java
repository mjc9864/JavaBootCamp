package com.company;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing49 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Random input = new Random();
        int num=1+input.nextInt(10);
        System.out.println("I'm thinking of a number from 1 to 10.");
        int guess=0;
        while(guess!=num){
            guess = myScanner.nextInt();
            if(guess==num){
                System.out.print("correct");
            }else{
                System.out.println("keep guessing");
            }
        }
    }
}
