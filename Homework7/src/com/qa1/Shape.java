package com.qa1;

public abstract class Shape implements Drawable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "color= " + color;
    }

    public abstract double calcArea();

    @Override
    public void draw() {
        System.out.println(this + " -> area = " + this.calcArea());
    }
}
