package com.qa1.model;

public class Book {
    private int ID;
    private static int nextId = 1;
    private String name;
    private String writer;
    private String publishingHouse;
    private int yearOfPublishing;
    private int amountOfPages;
    private double price;

    public Book( String name, String writer, String publishingHouse, int yearOfPublishing, int amountOfPages, double price) {
        this();
        this.name = name;
        this.writer = writer;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.amountOfPages = amountOfPages;
        this.price = price;
    }

    public Book() {
        this.ID = nextId++;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void changePrice(double percent){
        this.price = price + price*(percent/100);
    }

    public String view() {
        return "Book{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", amountOfPages=" + amountOfPages +
                ", price=" + price +
                '}';
    }


}
