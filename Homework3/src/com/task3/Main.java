package com.task3;

public class Main {
    public static void main(String[] args) {
        int size = 6;
        int i = 1;
        while(i <= size) {
            int j = size;
            while(j >= i){
                System.out.print("  ");
                j--;
            }
            int k = i;
            while (k > 0) {
                System.out.print(" " + "*");
                k--;

            }


            i++;
            System.out.println();

        }
    }
}
