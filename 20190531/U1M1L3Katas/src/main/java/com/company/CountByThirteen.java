package com.company;

import java.util.Scanner;

public class CountByThirteen {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter a number to count to");

        String userInput = myScanner.nextLine();
        int userNum = Integer.parseInt(userInput);



        for(int i = 0; i <= userNum; i+=13) {
            System.out.println(i);
        }

    }
}