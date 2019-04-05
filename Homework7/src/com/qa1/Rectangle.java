package com.qa1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height+ super.toString() +
                "} " ;
    }

    @Override
    public double calcArea() {
        return width*height;
    }
}
