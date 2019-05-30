package com.trilogyed;

import java.util.Scanner;

public class RectangularPavingCompany {

    public static void main(String[] args) {
 /*
 The purpose of the program is to calculate the total cost to pave a driveway. Here are the requirements:

It must prompt the user for the width of the driveway (in feet).
It must prompt the user for the length of the driveway (in feet).
It must calculate and display the area of the driveway.
It must calculate and display the perimeter of the driveway.
Based on the area and perimeter, it must calculate the total cost of the driveway:
The cement for the driveway cost $12.50/square foot.
The framing/footers for the driveway cost $8.25/linear foot.
The program must calculate and display the subtotal cost of the cement.
The program must calculate and display the subtotal cost of the framing/footers.

  */

        Scanner myScanner = new Scanner(System.in);

        int width;
        int length;

        System.out.println("enter the width of the driveway in feet");
        width = Integer.parseInt(myScanner.nextLine());

        System.out.println("enter the length of the driveway in feet");
        length = Integer.parseInt(myScanner.nextLine());


        int area = (width * length);
        System.out.println("The area: " + area);

        int perimeter = (width + width + length + length);
        System.out.println("The perimeter: " + perimeter);

        float cementCost = (area * 12.50f);
        System.out.printf("cost of cement: %.2f \n", cementCost);

        float frameCost = (perimeter * 8.25f);
        System.out.printf("cost of framing/footers: %.2f \n", frameCost);

        float totalCost = (cementCost + frameCost);
        System.out.printf("cost of framing/footers: %.2f \n", totalCost);


/*
Version 2
Modify the program so that it does the following:

Prompts the user for the cost of cement
Prompts the user for the cost of the framing/footers
Displays both the cost of cement and framing/footers
 */


        float newCementCost;
        float newFrameCost;

        System.out.println("enter the cost of cement");
        newCementCost =(myScanner.nextFloat());

        System.out.println("enter the cost of frame/footers");
        newFrameCost =(myScanner.nextFloat());

        float newTotalCost = (newCementCost + newFrameCost);

        System.out.printf("cost of cement and framing/footers: %.2f \n", newTotalCost);

    }
}
