package com.company;

import java.util.Scanner;

public class SpaceBoxing26 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your earth weight?");
        String userInput = myScanner.nextLine();
        float userNum = Float.parseFloat(userInput);

        System.out.println("What number planet you want to fight on? 1. Venus 2. Mars 3. Jupiter 4. Saturn 5. Uranus 6. Neptune");
        String userInput2 = myScanner.nextLine();
        int usernum2 = Integer.parseInt(userInput2);

        if (usernum2 == 1) {
            System.out.printf("your weight would be %.2f " , userNum * 0.78);
        } else if (usernum2 == 2) {
            System.out.printf("your weight would be %.2f " , userNum * 0.39);
        } else if (usernum2 == 3) {
            System.out.printf("your weight would be %.2f " , userNum * 2.65);
        } else if (usernum2 == 4) {
            System.out.printf("your weight would be %.2f " , userNum * 1.17);
        }else if (usernum2 == 5) {
            System.out.printf("your weight would be %.2f " , userNum * 1.05);
        }else if (usernum2 == 6) {
            System.out.printf("your weight would be %.2f " , userNum * 1.23);
        }



    }



























}
