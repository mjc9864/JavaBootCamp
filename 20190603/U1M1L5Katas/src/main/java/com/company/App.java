package com.company;

public class App {

    public static int subtract(int a, int b) {

        return  a - b;

    }


    public static int subtractOrZero(int a, int b){
        int c = a - b;

        if (c < 0)
            return 0;
        else
            return c;
    }

    public static int max(int a, int b, int c){

        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    public static int min(int a, int b, int c){

        if (a < b && a < c)
            return a;
        else if (b < a && b < c)
            return b;
        else
            return c;
    }

    public static boolean isLarger(int first,int second){
        if (first > second) {
            return true;
        } else
            return false;
    }


    public static void main(String[] args) {


    }
}
