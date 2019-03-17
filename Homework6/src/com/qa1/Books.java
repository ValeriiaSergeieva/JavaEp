package com.qa1;

import java.util.Scanner;

public class Books {
    private Book [] a;

    public Books( int b) {
        Book [] c = new Book[b];
        this.a = c;
    }

    public Books(Book[] a) {
        this.a = a;
    }

    public void addBook(Book book){
        for(int i = 0; i < a.length; i++){
            if(a[i]==null){
                a[i]=book;
                break;
            }
        }
    }

    public void printBooks (){
        for(int i =0; i < a.length; i++){
            a[i].view();
        }
    }

    public void changePrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input percentage to increase price and press ENTER");
        double percent = sc.nextDouble();
        double persentRight = percent/100.0;
        for(int i =0; i < a.length; i++){
            a[i].setPrice((a[i].getPrice()*persentRight)+a[i].getPrice());
        }
    }
    public Books searchWriter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input writer`s name and surname and press ENTER");
        String writer = sc.nextLine();
        Book[] result;
        int count=0;
        for(int i = 0; i < a.length; i++){
            if(a[i].getWriter().equals(writer)){
                count++;
            }
        }

        result = new Book[count];
        for(int i = 0, j = 0; i < a.length; i++){
            if(a[i].getWriter().equals(writer)){
                result[j]=a[i];
                j++;
            }
        }

        if(count==0){
        System.out.println("Searched writer was not found");
        }
        Books finish = new Books(result);
        return finish;
    }
    public Books searchPublishingYear (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input publishing year and press ENTER");
        int year = sc.nextInt();
        Book [] result;
        int count=0;
        for(int i = 0; i < a.length; i++){
            if(a[i].getYearOfPublishing() > year){
                count++;
            }
        }
        if(count==0){
            System.out.println("Searched publishing year was not found");
        }
        result = new Book [count];
        for(int i = 0, j = 0; i < a.length; i++){
            if(a[i].getYearOfPublishing() > year){
                result[j]=a[i];
                j++;
            }
        }
        Books finish = new Books(result);
        return finish;
    }


}
