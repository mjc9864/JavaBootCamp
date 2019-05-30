package com.trilogyed;

import java.util.Scanner;

public class RegistrationForm {

    public static void main(String[] args) {
/*
    The program must prompt the user for the following information and then display it,
    nicely formatted, back to the user after all the information has been collected:

    First name
    Last name
    Email
    Twitter handle
    Age
    Country
    Profession
    Favorite operating system
    Favorite programming language
    Favorite computer scientist
    Favorite keyboard shortcut
    Have you ever built your own computer?
    If you could be any superhero, who would it be?
 */
        Scanner myScanner = new Scanner(System.in);
        Scanner mScanner = new Scanner(System.in);

        String firstName;
        String lastName;
        String email;
        String twitterHandle;
        int age;
        String country;
        String profession;
        String favsystem;
        String favlanguage;
        String favScientist;
        String favShortcut;
        String builtCPU;
        String superHero;

        System.out.println("Enter your first name");
        firstName = myScanner.next();

        System.out.println("Enter your last name");
        lastName = myScanner.next();

        System.out.println("Enter your email");
        email = myScanner.next();

        System.out.println("Enter your twitter handle");
        twitterHandle = myScanner.next();

        System.out.println("Enter your age");
        age = Integer.parseInt(mScanner.nextLine());

        System.out.println("Enter your country");
        country = myScanner.next();

        System.out.println("Enter your profession");
        profession = myScanner.next();

        System.out.println("Enter your favorite operating system");
        favsystem = myScanner.next();

        System.out.println("Enter your favorite programming language");
        favlanguage = myScanner.next();

        System.out.println("Enter your favorite computer scientist");
        favScientist = myScanner.next();

        System.out.println("Enter your favorite keyboard shortcut");
        favShortcut = myScanner.next();

        System.out.println("Have you ever built your own computer?");
        builtCPU = myScanner.next();

        System.out.println("If you could be any superhero, who would it be?");
        superHero = myScanner.next();


        System.out.println("Name: "+ firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Twitter: " + twitterHandle);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Profession: " + profession);
        System.out.println("Favorite operating system: " + favsystem);
        System.out.println("Favorite programming language: " + favlanguage);
        System.out.println("Favorite computer scientist: " + favScientist);
        System.out.println("Favorite keyboard shortcut: " + favShortcut);
        System.out.println("Built a CPU: " + builtCPU);
        System.out.println("Super hero of choice: " + superHero);
        System.out.println("Thank you for registering!");



    }
}
