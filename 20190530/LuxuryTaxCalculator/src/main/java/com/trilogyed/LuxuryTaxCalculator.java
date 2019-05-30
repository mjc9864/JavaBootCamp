package com.trilogyed;

import java.util.Scanner;

public class LuxuryTaxCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int salary1;
        int salary2;
        int salary3;

        System.out.println("Enter player 1's salary:");
        salary1 = Integer.parseInt(myScanner.nextLine());
        System.out.println("Enter player 2's salary:");
        salary2 = Integer.parseInt(myScanner.nextLine());
        System.out.println("Enter player 3's salary:");
        salary3 = Integer.parseInt((myScanner.nextLine()));

        int salaryTotal = salary1 + salary2 + salary3;

        System.out.println("Total salary cost: $" + salaryTotal);

        if (salaryTotal > 40000000) {
            float tax = salaryTotal / 18f;
            System.out.println(tax);
            float totalAmount = salaryTotal + tax;
            System.out.printf("Cost with tax: $%.2f", totalAmount);
        }

    }
}
