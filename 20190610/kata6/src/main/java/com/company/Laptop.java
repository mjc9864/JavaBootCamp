package com.company;

public class Laptop {

    private String processor;
    private String memory;
    private String opticalDrive;


    public Laptop(String processor, String memory,String opticalDrive){

        this.memory = memory;
        this.opticalDrive = opticalDrive;
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public void setOpticalDrive(String opticalDrive) {
        this.opticalDrive = opticalDrive;
    }
}
