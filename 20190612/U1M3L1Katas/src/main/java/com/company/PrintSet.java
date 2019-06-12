package com.company;

import java.util.HashSet;

public class PrintSet {

    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>();



        myHashSet.add(5);
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(1);
        myHashSet.add(4);
        myHashSet.add(1);
        myHashSet.add(5);


        for (Integer Hset : myHashSet){
            System.out.println(Hset);
        }


    }


}
