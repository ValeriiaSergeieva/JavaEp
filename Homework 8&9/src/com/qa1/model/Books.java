package com.qa1.model;


import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class Books implements Serializable {
    private Book[] a;
    private int count = 0;

    public Books() {
    }

    public Books(int b) {
        Book [] c = new Book[b];
        this.a = c;
    }

    public boolean addBook(Book book) {
        if(count>=a.length){
            System.out.println("No books!");
            return false;
        }
        a[count++] = book;
        return true;
    }

    public String printBooks (){
        if(count == 0){
            return "No books!";
        }
        String books = "";
        for(int i =0; i < count; i++){
            books+=a[i];
            books +="\n";
        }
        return books;
    }

    public void changePrice(double percent){
        double persentRight = percent/100.0;
        for(int i =0; i < count; i++){
            a[i].changePrice(percent);
        }
    }
    public Books searchWriter(String writer){
        Books newBooks = new Books(count);

        for(int i = 0; i < count; i++){
            if(a[i].getWriter().equalsIgnoreCase(writer)){
                newBooks.addBook(a[i]);
            }
        }

        return newBooks;
    }
    public Books searchPublishingYear (int year){
        Books newBooks = new Books(count);

        for(int i = 0; i < count; i++){
            if(a[i].getYearOfPublishing() > year){
                newBooks.addBook(a[i]);
            }
        }

        return newBooks;
    }

    public String sortByAuthor(){
        Book [] newBook = Arrays.copyOf(a,count);
        Arrays.sort(newBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getWriter().compareTo(o2.getWriter());
            }
        });
        return Arrays.toString(newBook);
    }

    public String sortByPulishingHouse(){
        Book[] newBook = Arrays.copyOf(a,count);
        Arrays.sort(newBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublishingHouse().compareTo(o2.getPublishingHouse());
            }
        });
        return Arrays.toString(newBook);
    }

    public String sortByPrice(){
        Book[] newBook = Arrays.copyOf(a,count);
        Arrays.sort(newBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o1.getPrice(),o2.getPrice());
            }
        });
        return Arrays.toString(newBook);
    }

}
