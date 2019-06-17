package com.company;

import java.util.Scanner;

public class ConverterApplication {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        ConverterIf cIf = new ConverterIf();
        ConverterSwitch cSwitch = new ConverterSwitch();

        System.out.println("Enter a number 1-7 for a day: ");
        int userNum = myScanner.nextInt();

        System.out.println("Enter a number 1-12 for a month: ");
        int userNum2 = myScanner.nextInt();


        System.out.println("Day: " + cIf.convertDay(userNum));
        System.out.println("Month: " + cIf.convertMonth(userNum2));

        System.out.println("Day: " + cSwitch.convertDay(userNum));
        System.out.println("Month: " + cSwitch.convertMonth(userNum2));

    }




}