package com.company;
import java.util.Random;

public class Dice45 {
    public static void main(String[] args) {

        Random random = new Random();
        int Dice1 = random.nextInt(6)+1;
        int Dice2 = random.nextInt(6)+1;

        System.out.println("dice #1: " + Dice1);
        System.out.println("dice #2: " + Dice2);

        int total = Dice1 + Dice2;

        System.out.println(total + "!");

    }
}
