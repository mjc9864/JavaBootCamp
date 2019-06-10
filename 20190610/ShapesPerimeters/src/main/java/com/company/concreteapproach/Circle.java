package com.company.concreteapproach;

public class Circle extends Shape{

    private double radius;


    public Circle(String name, String color, int xCoordinate, int yCoordinate, double radius) {
        super(name, color, xCoordinate, yCoordinate);
        this.radius = radius;
    }


    public double area() {
        return super.area();
    }


    public double perimeter() {
        return super.perimeter();
    }
}







