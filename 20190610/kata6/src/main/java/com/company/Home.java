package com.company;

public class Home {

    private String kitchen;
    private String basement;
    private String bathroom;
    private String patio;


    public Home(String basement, String bathroom, String kitchen, String patio) {

        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.patio = patio;
        this.basement = basement;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getBasement() {
        return basement;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }
}
