package com.company;

public class App {
    public static void main(String[] args) {

    }

    public static int total(int[] a) {
        int sum = 0;

        for (int element : a) {
            sum += element;
        }
        return sum;
    }

    public static int totalOdd(int[] a) {

        int sum = 0;
        int i = 0;

        while (i < a.length) {
            if (i % 2 == 1) {
                sum += a[i];
            }
            i++;
        }
        return sum;
    }

    public static int totalEven(int[] a) {

        int sum = 0;
        int i = 0;

        while (i < a.length) {
            if (i % 2 == 0) {
                sum += a[i];
            }
            i++;
        }
        return sum;
    }

    public static int[] reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int j = a[a.length - 1 - i];

            int k = a[i];
            a[i] = j;
            a[a.length - 1 - i] = k;

        }
        return a;
    }

    public static int secondLargestNumber(int[] a) {
        int num = a[0];
        int secondNum = a[1];
        if (num < secondNum) {
            num = a[1];
            secondNum = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if (a[i] > num) {
                secondNum = num;
                num = a[i];
            } else if (a[i] > secondNum) {
                secondNum = a[i];
            }
        }
        return secondNum;
    }


    public static int[] everyThird(int[] a) {
        if (a.length < 3) {
            return null;
        }
        int num = 0;
        int[] num2 = new int[a.length / 3];
        for (int i = 2; i < a.length; i += 3) {
            num2[num] = a[i];
            num++;
        }
        return num2;
    }


    public static String[] swapFirstAndLast(String[] a) {
        String num = a[a.length - 1];
        String num2 = a[0];

        a[0] = num;
        a[a.length - 1] = num2;
        return a;
    }


    public static int[] lessThanFive(int[] a) {

        if (a.length < 5) {
            return null;
        }
        int num = 0;
        int[] num2 = new int[a.length / 5];
        for (int i = 5; i < a.length; i += 5) {
            num2[num] = a[i];
            num++;
        }
        return num2;
    }

        public static String[] concatenateString(String[] a){

            String num = a[a.length - 1];
            String num2 = a[0];

            a[0] = num;
            a[a.length - 1] = num2;
            return a;
        }


    public static int[] lessThanFive(int[] a){
        int num = 0;
        int[] arrayLessThanFive;

        for (int element : a) {
            if (element < 5) {
                num2 ++;
            }
        }

        if (num2     == 0) {
            num = null;
        } else {
            num = new int[num2];
            int y = 0;
            for (int x = 0; x < a.length; x++) {
                if (a[x] < 5) {
                    num2  [y] = a[x];
                    y++;
                }
            }
        }
        return num;
    }



}




























