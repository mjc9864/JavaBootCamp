package com.company;

import java.util.Scanner;

public class CountByTwo {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter a number to count to");

        String userInput = myScanner.nextLine();
        int userNum = Integer.parseInt(userInput);



        for(int i = 0; i <= userNum; i+=2) {
            System.out.println(i);
        }

    }
}
