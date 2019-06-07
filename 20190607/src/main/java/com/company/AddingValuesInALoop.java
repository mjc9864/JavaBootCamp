package com.company;

import java.util.Scanner;

public class AddingValuesInALoop {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        System.out.println("enter numbers to be added press 0 to stop ");

        System.out.println("enter here: ");

        int addTogether;


        int total = 0;

        addTogether = myScanner.nextInt();


        while(addTogether != 0) {


            total = total + addTogether;
            System.out.println("enter here: ");
            addTogether = myScanner.nextInt();
            System.out.println("added together " + (total + addTogether));
        }

            System.out.println("Your total is: " + addTogether);
            System.out.println("added together " + (total + addTogether));

        }
    }



