package com.company;

import java.util.*;

public class CarLists {

    public static void main(String[] args) {

        Car camry = new Car("Toyota", "Camry");
        Car corolla = new Car("Toyota", "Corolla");
        Car highlander = new Car("Toyota", "Highlander");

        Car mustang = new Car("Ford", "Mustang");
        Car fusion = new Car("Ford", "Fusion");
        Car taurus = new Car("Ford", "Taurus");

        Car accord = new Car("Honda", "Accord");
        Car civic = new Car("Honda", "Civic");
        Car fit = new Car("Honda", "Fit");


        Map<String, String> car = new HashMap<>();

        car.put("Toyota", "Camry");
        car.put("Toyota", "Corolla");
        car.put("Toyota", "Highlander");

        car.put("Ford", "Fusion");
        car.put("Ford", "Mustang");
        car.put("Ford", "Taurus");

        car.put("Honda", "Accord");
        car.put("Honda", "Civic");
        car.put("Honda", "Fit");


        System.out.println(car);





    }


}
