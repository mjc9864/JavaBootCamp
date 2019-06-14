package com.company;

import com.opencsv.bean.CsvBindByName;

public class Computers {

    @CsvBindByName(column = "Brand")
    private String brand;
    @CsvBindByName(column = "Model")
    private String model;
    @CsvBindByName(column = "CPU")
    private String CPU;
    @CsvBindByName(column = "Ram")
    private int RAM;
    @CsvBindByName(column = "Storage Size")
    private int storageSize;


    public Computers(String brand, String model, String CPU, int RAM, int storageSize) {
        this.brand = brand;
        this.model = model;
        this.CPU = CPU;
        this.RAM = RAM;
        this.storageSize = storageSize;

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

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }


}