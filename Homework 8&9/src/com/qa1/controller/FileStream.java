package com.qa1.controller;

import com.qa1.model.Books;

import java.io.*;

public class FileStream {
    private File file = new File("book.txt");

    public void setFile(File file) {
        this.file = file;
    }

    public void writeFile(Books books){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))){
            out.writeObject(books);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public Books readFile(){
            Books catalog = new Books();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){
            catalog = (Books)in.readObject();
        }catch(ClassNotFoundException exp){
            System.out.println("Class not found");
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return catalog;
    }
}
