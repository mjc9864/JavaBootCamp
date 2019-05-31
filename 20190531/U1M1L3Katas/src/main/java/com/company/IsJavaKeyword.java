package com.company;

import java.util.Scanner;

public class IsJavaKeyword {

    public static void main(String[] args) {

        /*
        IsJavaKeyword Write a program that get user input (a String) for while
        and print out whether or not it is a Java keyword. You will need to find a list of keywords for this kata.
         */

        Scanner myScanner = new Scanner(System.in);
        String userInput;

        System.out.println("enter a word");
        userInput = myScanner.nextLine();

        if (userInput.equals("for")) {
            System.out.println(userInput + " is a java keyword");
        } else if (userInput.equals("while")) {
            System.out.println(userInput + " is a java keyword");
        } else {
            System.out.println(userInput + " is not a java keyword");
        }













    }
}