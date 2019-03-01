package com.task5;

public class Main {
    private static final int MIDDLE = 5;

    public static void main(String[] args) {
    drawTriangle();
    drawTriangle();
    }
    public static void drawTriangle(){
        int a = 0;
        while(a < MIDDLE){
            int b = 0;
            while (b < MIDDLE - a) {
                System.out.print("  ");
                b++;
            }
            int c = 0;
            while (c < a*2 + 1) {
                System.out.print(" "+"*");
                c++;
            }
            System.out.println();
            a++;
        }
    }
}
