package com.company;

import java.util.Scanner;

public class ALittleQuiz27 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int track= 0; // tracks the input


            System.out.println("what is 1+2?");
            System.out.println("1?");
            System.out.println("2?");
            System.out.println("3?");
            int input = myScanner.nextInt();
            if(input==3){
                track++;
            }

            System.out.println("what is 2+2?");
            System.out.println("2?");
            System.out.println("3?");
            System.out.println("4?");


            int input1 = myScanner.nextInt();
            if(input1==4){
                track++;

            }

            System.out.println("what is 3+2");
            System.out.println("5?");
            System.out.println("2?");
            System.out.println("3?");

            int input2=myScanner.nextInt();
            if(input2==5){
                track++;
            }

            System.out.println();
            if(track==3){
                System.out.println("score of 3, 0 wrong");
            }else if (track==2){

                System.out.println("score of 2, 1 wrong");
            }else if (track==1){
                System.out.println("score of 1, 2 wrong");
            }else {
                System.out.println("score of 0, 3 wrong");
            }













   }
}