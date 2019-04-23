package com.qa1.controller;

import com.qa1.model.Book;
import com.qa1.model.Books;
import com.qa1.view.ViewBook;

public class ContollerBooks {
    private Books books = new Books (10);
    private ViewBook viewBooks = new ViewBook();

    public void run (){

        books = new Books (Validator.checkInt());

        Book one = new Book( "City of Bones", "Cassandra Clare", "Mc Elderry Books", 2007, 486, 364);
        Book two = new Book( "The Magicians", "Lev Grossman", "Arrow Books", 2009, 488, 286);
        Book three = new Book( "American Gods", "Neil Gaiman", "Headline", 2002, 640, 286);

        books.addBook(one);
        books.addBook(two);
        books.addBook(three);

        FileStream fl = new FileStream();
        fl.readFile();

        viewBooks.print(books.printBooks());

        books.changePrice(Validator.checkPercenteg());
        viewBooks.print(books.printBooks());

        Books nBooks = books.searchWriter(Validator.checkName());
        viewBooks.print(nBooks.printBooks());

        Books booksTwo = books.searchPublishingYear(Validator.checkYear());
        viewBooks.print(booksTwo.printBooks());

        fl.writeFile(books);
    }
}
