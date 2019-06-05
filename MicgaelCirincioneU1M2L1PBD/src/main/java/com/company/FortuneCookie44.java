package com.company;
import java.util.Random;
public class FortuneCookie44 {
    public static void main(String[] args) {

        Random num = new Random();
        int num1 = 1+num.nextInt(6);

        System.out.print("Fortune: ");
        if(num1==1){
            System.out.println("fortune 1");

        }else if(num1==2){
            System.out.println("fortune 2");

        }else if(num1==3){
            System.out.println("fortune 3");

        }else if(num1==4){
            System.out.println("fortune 4");

        }else if(num1==5){
            System.out.println("fortune 5");

        }else if(num1==6){
            System.out.println("fortune 6");

        }
    }
}


