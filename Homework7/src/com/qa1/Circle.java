package com.qa1;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + super.toString()+
                "} ";
    }

    @Override
    public double calcArea() {
        return Math.PI*(radius*radius);
    }

}
