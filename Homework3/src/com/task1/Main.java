package com.task1;

public class Main {

    public static void main(String[] args) {
        int row = 1;
        while(row < 6){
            int a = row;
            while(a > 0){
                System.out.print(" "+"*");
                a--;
            }
            row++;
            System.out.println();
        }
        int b = row;
        int c = 1;
        while(b>=1){
            while(c<=b){
                System.out.print(" "+"*");
                c++;
            }
            System.out.println();
            c = 1;
            b--;
        }

    }
}
