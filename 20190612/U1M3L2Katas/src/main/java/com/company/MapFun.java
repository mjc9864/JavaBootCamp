package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapFun {
    public static void main(String[] args) {

        HashMap<String, Integer> cars = new HashMap<>();

        cars.put("Toyota Camry", 2012);
        cars.put("Chevy Camero", 1969);
        cars.put("Hyundai Genesis", 2015);
        cars.put("Jeep Wrangler", 2006);
        cars.put("Honda Civic", 2018);
        cars.put("Toyota Supra", 1995);
        cars.put("Pontiac GTO", 1964);

        Set<Map.Entry<String, Integer>> entries = cars.entrySet();

        for(Map.Entry<String, Integer> entry : entries){
            System.out.println("Key - " + entry.getKey() + " - Value " + entry.getValue());
        }

        cars.put("Ford Explorer", 2012);
        cars.put("Smart ForTwo", 2013);

        for(Map.Entry<String, Integer> entry : entries){
            System.out.println("Key after  - " + entry.getKey() + " - Value " + entry.getValue());
        }

        cars.remove("Jeep Wrangler");

        for(Map.Entry<String, Integer> entry : entries){
            System.out.println("Key after remove - " + entry.getKey() + " - Value " + entry.getValue());
        }



    }
}