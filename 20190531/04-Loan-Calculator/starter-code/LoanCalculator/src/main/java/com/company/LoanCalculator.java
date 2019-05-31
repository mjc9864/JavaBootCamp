package com.company;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");

        double principal = myScanner.nextDouble();


        System.out.print("Enter Yearly Interest Rate: ");
        double rate = myScanner.nextDouble();


        rate = rate/100/12;


        System.out.print("Enter Term (years): ");
        int term = myScanner.nextInt();


        term = term * 12;

        double payment = (principal * rate) / (1 - Math.pow(1 + rate, -term));


        payment = (double)Math.round(payment * 100) / 100;

        System.out.println("Payment: " + payment);
    }
}
