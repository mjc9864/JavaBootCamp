package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Television {

    private String brand;
    private String model;
    private int price;
    private int screenSize;


    public Television(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screensize) {
        this.screenSize = screensize;
    }

    public Television(String brand, String model, int price, int screensize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.screenSize = screensize;



    }
}