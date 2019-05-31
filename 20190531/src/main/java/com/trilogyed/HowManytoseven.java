package com.bootcamp;
import java.util.Random;
public class HowManytoseven {
    public static void main(String[] args) {

        Random dice = new Random();
        int firstSeven = 0;
        int totalSeven = 0;

        for (int i = 1; i <= 100; i++) {
            int die1 = dice.nextInt(6) + 1;
            int die2 = dice.nextInt(6) + 1;
            int sum = die1 + die2;

            if (sum == 7) {
                totalSeven++;
                if (firstSeven == 0) {
                    firstSeven = i;
                }
            }
        }
        System.out.println("You rolled " + totalSeven +" sevens and it took you " + firstSeven + " rolls to get your first seven." );
    }
}

