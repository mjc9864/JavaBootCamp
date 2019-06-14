package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TelevisionReader {

    public static void main(String[] args) {

        try {

            //Declaring an object mapper
            ObjectMapper mapper = new ObjectMapper();

            //Creating an automated List using Jackson
            List<Television> tvList = mapper.readValue(new File("televisions.json"), new TypeReference<List<Television>>() {
            });

            //1.
            tvList
                    .stream()
                    .filter(b -> b.getScreenSize() > 60)
                    .forEach(b -> {

                        System.out.println("================");
                        System.out.println("Brand: " + b.getBrand());
                        System.out.println("Model: " + b.getModel());
                        System.out.println("Screen Size: " + b.getScreenSize());
                        System.out.println("Price: " + b.getPrice());
                    });

            //2.
            Map<String, List<Television>> groupedTvs =
                    tvList
                            .stream()
                            .collect(Collectors.groupingBy(b -> b.getBrand()));

            Set<String> keys = groupedTvs.keySet();
            for (String key : keys) {
                System.out.println("Brand: " + key);
            }

            //3.
            double avgScreenSize =
                    tvList
                            .stream()
                            .mapToDouble(b -> b.getScreenSize())
                            .average()
                            .getAsDouble();

            System.out.println("Average Screen Size is: " + avgScreenSize);

            //4.
            int maxScreen =
                    tvList
                            .stream()
                            .mapToInt(b -> b.getScreenSize())
                            .max()
                            .getAsInt();

            System.out.println("Maximum Screen size: " + maxScreen);

            //5.
            Map<Integer, List<Television>> screenSizes =
                    tvList
                            .stream()
                            .collect(Collectors.groupingBy(b -> b.getScreenSize()));

            Set<Integer> keyset2 = screenSizes.keySet();


            Integer[] arr = keyset2.toArray(new Integer[0]);
            Arrays.sort(arr);

            for (Integer element : arr) {
                System.out.println(element);
            }

        } catch (IOException e) {
            System.out.println("ERROR: Problem encountered reading JSON file - " + e.getMessage());
        }


    }
}