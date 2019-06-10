package com.company.concreteapproach;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, String color, int xCoordinate, int yCoordinate, double sideA, double sideB, double sideC) {
        super(name, color, xCoordinate, yCoordinate);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double area() {
        return super.area();
    }


    public double perimeter() {
        return super.perimeter();
    }







}

