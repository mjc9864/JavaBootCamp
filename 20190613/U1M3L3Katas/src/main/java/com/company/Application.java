package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

       try {
           int petIndex = Pets.choosePet();

           String chosenPet = Pets.retrievePet(petIndex);

           Pets.readPetsFromFile();

           Pets.writePetToFile(chosenPet);
       } catch (NumberFormatException e){
           System.out.println("Please enter a valid number.");

       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("ArrayIndexOutOfBoundsException");
       }catch (FileNotFoundException e){
           System.out.println("File does not exist");
       }catch (IOException e){
           System.out.println("Trouble writing file");
       }finally {
           System.out.println("Have a nice day!");
       }
    }
}
