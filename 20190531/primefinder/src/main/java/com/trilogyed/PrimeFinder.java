package com.trilogyed;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        System.out.println("What number would you like to count to?");

        String userInput = myScanner.nextLine();
        int userNum = Integer.parseInt(userInput);

        int prime;
        boolean isPrime = false;
        for(int i = 1; i <= userNum; i++) {
            System.out.println(i);
        }

        for(int i=2;i<=userNum/2;i++)
        {

            prime=userNum%i;
            System.out.println(userNum+" Divided by "+ i + " gives a remainder "+prime);


            if(prime==0)
            {
                isPrime=false;
                break;
            }
        }

        if(isPrime)
            System.out.println(userNum + " is a Prime");
        else
            System.out.println(userNum + " is not a Prime");






    }
}
