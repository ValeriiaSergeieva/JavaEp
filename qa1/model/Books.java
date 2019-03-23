package com.qa1.model;


public class Books {
    private Book[] a;
    private int count = 0;

    public Books( int b) {
        Book [] c = new Book[b];
        this.a = c;
    }

    public boolean addBook(Book book){
        if(count>=a.length){
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
            books+=a[i].view();
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

}
