package com.company;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LargestCity {

    public static void main(String[] args) {

        City newYork = new City("New York", 8654321);
        City losAngeles = new City("Los Angeles", 4563218);
        City chicago = new City( "Chicago", 2716520);
        City denver = new City("Denver", 704621);
        City desMoines = new City("Des Moines", 217521);
        City atlanta = new City("Atlanta", 486213);
                                                            //creating maps & lists
        Map<String, City> State = new HashMap<>();        //
                                                        //putting keys "states" into the object
        State.put("New York", newYork);
        State.put("California", losAngeles);
        State.put("Illinois", chicago);
        State.put("Colorado", denver);
        State.put("Iowa", desMoines);
        State.put("Georgia", atlanta);

        Scanner scan = new Scanner(System.in);

        System.out.print("enter the population: ");       // user input for population/question
        int population = Integer.parseInt(scan.nextLine());

        System.out.println("population above limit " + population);

        Set<String> keys = State.keySet();

        for(String key : keys) {                        // loop through and prints
            if(State.get(key).getPopulation() > population) {
                System.out.println(key +" - " + State.get(key).getName());
            }
        }
    }
}








