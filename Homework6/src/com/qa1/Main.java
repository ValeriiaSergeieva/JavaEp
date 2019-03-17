package com.qa1;


public class Main {

    public static void main(String[] args) {
        Books fantasy = new Books( 3);
        Book one = new Book(1, "City of Bones", "Cassandra Clare", "Mc Elderry Books", 2007, 486, 364);
        Book two = new Book(2, "The Magicians", "Lev Grossman", "Arrow Books", 2009, 488, 286);
        Book three = new Book(3, "American Gods", "Neil Gaiman", "Headline", 2002, 640, 286);

        fantasy.addBook(one);
        fantasy.addBook(two);
        fantasy.addBook(three);

        fantasy.printBooks();

        fantasy.changePrice();
        fantasy.printBooks();

        Books foundWriter = fantasy.searchWriter();
        foundWriter.printBooks();

        Books foundYear = fantasy.searchPublishingYear();
        foundYear.printBooks();



    }
}
