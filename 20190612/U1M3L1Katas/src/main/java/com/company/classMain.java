package com.company;

import java.util.ArrayList;
import java.util.List;

public class classMain {

    public static void main(String[] args) {

        List<Classmate> classmates = new ArrayList<>();

        Classmate hanSolo = new Classmate("Han Solo","Black");
        Classmate burat = new Classmate("Burat","Blonde");
        Classmate perriWinkle = new Classmate("PerriWinkle","Periwinkle");
        Classmate mrT = new Classmate("Mr. T","grey");
        Classmate amorita = new Classmate("Amorita","Black");

        classmates.add(hanSolo);
        classmates.add(burat);
        classmates.add(perriWinkle);
        classmates.add(mrT);
        classmates.add(amorita);



        for (Classmate element : classmates) {
            System.out.println("Name:" + element.getName() + "/ Hair Color: " + element.getHairColor());
        }


    }


}
