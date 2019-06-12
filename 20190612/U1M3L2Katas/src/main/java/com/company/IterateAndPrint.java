package com.company;

import java.util.*;

public class IterateAndPrint {

    public static void main(String[] args) {

        Map<String, String> baseballTeam = new HashMap<>();

        baseballTeam.put("Pitcher", "Mike Foltynewicz");
        baseballTeam.put("Catcher", "Brian McCann");
        baseballTeam.put("First Baseman", "Freddie Freeman");
        baseballTeam.put("Second Baseman", "Ozzie Albies");
        baseballTeam.put("Third Baseman", "Josh Donaldson");
        baseballTeam.put("Shortstop", "Dansby Swanson");
        baseballTeam.put("Left Fielder", "Ronald Acuna, Jr.");
        baseballTeam.put("Center Fielder", "Ender Inciarte");
        baseballTeam.put("Right Fielder", "Nick Markakis");


        Set<String> Keys = baseballTeam.keySet();
        for (String key : Keys) {
            System.out.println("keys: " + key);
        }
        Collection<String> value = baseballTeam.values();
        for (String values : value) {
            System.out.println("values: " + values);
        }
        Set<Map.Entry<String, String>> playerEntries = baseballTeam.entrySet();

        for (Map.Entry<String, String> entry : playerEntries) {
            System.out.println("Keys: " + entry.getKey() + "values "
                    + entry.getValue());
        }











    }

}