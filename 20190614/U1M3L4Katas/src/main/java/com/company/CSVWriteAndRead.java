package com.company;


import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVWriteAndRead {


    public static void main(String[] args) {

        try {
            List<Car> carList = new ArrayList<>();

            carList.add(new Car(2012, "Toyota", "Camry", "Blue"));
            carList.add(new Car(2001, "Honda", "Civic", "Silver"));
            carList.add(new Car(2009, "Jeep", "Wrangler", "Rust"));
            carList.add(new Car(2018, "Tesla", "Roadster", "Black"));
            carList.add(new Car(1964, "Ford", "Mustang", "Red"));

            for (Car perri : carList) {
                System.out.println(perri.getYear());
                System.out.println(perri.getMake());
                System.out.println(perri.getModel());
                System.out.println(perri.getColor());

                Writer writer = new FileWriter("new_car_file.csv");
                StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
                beanToCsv.write(carList);
                writer.close();

            }


        } catch (FileNotFoundException e) {
            System.out.println("could not find CSV file : " + e.getMessage());

        }catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
            System.out.println("get message : " + e.getMessage());
        }













    }

}
