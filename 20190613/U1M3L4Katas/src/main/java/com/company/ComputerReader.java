package com.company;

import com.opencsv.bean.CsvToBeanBuilder;


import java.io.*;
import java.util.List;

public class ComputerReader {

    public static void main(String[] args) {


            try {
            List<Computers> computers = new CsvToBeanBuilder<Computers>(new FileReader("computers.csv")).withType(Computers.class).build().parse();


            for (Computers cpu : computers) {
             
                System.out.println(cpu.getBrand());
                System.out.println(cpu.getModel());
                System.out.println(cpu.getCPU());
                System.out.println(cpu.getRAM());
                System.out.println(cpu.getStorageSize());
            }


        } catch (FileNotFoundException e) {
            System.out.println("error: " + e.getMessage());

        }
    }
}





