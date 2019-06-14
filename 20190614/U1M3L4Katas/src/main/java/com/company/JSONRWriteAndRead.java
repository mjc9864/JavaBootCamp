package com.company;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class JSONRWriteAndRead {
    public static void main(String[] args) {


        PrintWriter writer = null;

        List<Car> carList = new ArrayList<>();

        Car car1 = new Car(2012, "Toyota", "Camry", "Blue");
        Car car2 = new Car(2001, "Honda", "Civic", "Silver");
        Car car3 = new Car(2009, "Jeep", "Wrangler", "Rust");
        Car car4 = new Car(2018, "Tesla", "Roadster", "Black");
        Car car5 = new Car(1964, "Ford", "Mustang", "Red");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);


        try {

            ObjectMapper mapper = new ObjectMapper();
            String jsonCarList = mapper.writeValueAsString(carList);



            writer = new PrintWriter(new FileWriter("cars.json"));
            writer.println(jsonCarList);

            for(Car car: carList) {
                System.out.println("********************");
                System.out.println("********************");
                System.out.println(car.getYear());
                System.out.println(car.getMake());
                System.out.println(car.getModel());
                System.out.println(car.getColor());

            }

        } catch (JsonProcessingException e ){
            System.out.println("ERROR: Trouble converting object to JSON string: " + e.getMessage());
        } catch(IOException e){
            System.out.println("ERROR: COULD NOT WRITE TO FILE: " + e.getMessage());
        } finally{
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }

    }

}