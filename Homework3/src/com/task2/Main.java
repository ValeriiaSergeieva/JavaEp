package com.task2;

public class Main {
    public static void main(String[] args) {
        int size = 6;
        int s = size--;
        while(s >= 1) {
            int j = size;
            while(j >= s){
                j--;
                System.out.print("  ");
            }
            int b = s+1;
            while (b > 1) {
                b--;
                System.out.print(" " + "*");
            }
            s--;
            System.out.println();
        }
    }
}
