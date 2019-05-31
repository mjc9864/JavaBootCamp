package com.company;

import java.util.Scanner;

public class YourAgeCan {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("what is your age");

        int age;

        age = Integer.parseInt(myScanner.nextLine());

        if (age > 100) {
            System.out.println("age " + age + "is eligible for");
            System.out.println("is more than a century old");
            System.out.println("Can retire");
            System.out.println("Is eligible for AARP");
            System.out.println("Be president");
            System.out.println("Drink alcohol");
            System.out.println("Vote");

        }
        else if(age >=80) {
            System.out.println("age " + age + "is eligible for");
            System.out.println("Is an octogenerian");
            System.out.println("Can retire");
            System.out.println("Is eligible for AARP");
            System.out.println("Be president");
            System.out.println("Drink alcohol");
            System.out.println("Vote");
        }else if(age >=65) {
            System.out.println("age " + age + "is eligible for");
            System.out.println("Can retire");
            System.out.println("Is eligible for AARP");
            System.out.println("Be president");
            System.out.println("Drink alcohol");
            System.out.println("Vote");
        }else if(age >=55) {
            System.out.println("age " + age + "is eligible for");
            System.out.println("Is eligible for AARP");
            System.out.println("Be president");
            System.out.println("Drink alcohol");
            System.out.println("Vote");
        }else if(age >=35) {
            System.out.println("age " + age + "is eligible for");
            System.out.println("Be president");
            System.out.println("Drink alcohol");
            System.out.println("Vote");
        }else if(age >= 21) {
            System.out.println("age " + age + "is eligible for");
            System.out.println("Drink alcohol");
            System.out.println("Vote");
        }else if(age >= 18) {
            System.out.println("age " + age + "is eligible for");
            System.out.println("Vote");
        }



    }





    }

