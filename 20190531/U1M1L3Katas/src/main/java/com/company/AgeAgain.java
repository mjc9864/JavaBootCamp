package com.company;

import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {



        Scanner myScanner = new Scanner(System.in);


        System.out.println("what is your age");

        int age;

        age = Integer.parseInt(myScanner.nextLine());

        System.out.println("your age is " + age);

        if (age < 14) {
            System.out.println("what grade are you in?");
            int grade = Integer.parseInt(myScanner.nextLine());

            System.out.println("Wow!" + grade + "th - that sounds exciting!");

        } else if (age > 18) {
            System.out.println("what is your job?");
            String job = myScanner.nextLine();
            System.out.println(job + " sounds like a great job");
        }
        else if (age >= 14 && age <= 18) {
            System.out.println("are you planning on going to college? (yes/no)");
            String answer = myScanner.nextLine();

            if (answer.equals("yes")) {
                System.out.println("what college?");
                String college = myScanner.nextLine();
                System.out.println(college + " is a great school!");
            } else if (answer.equals("no")) {
                System.out.println("what do you want to do after high school?");
                String after = myScanner.nextLine();
                System.out.println("wow sounds like a plan");
            }



            }
        }
    }


