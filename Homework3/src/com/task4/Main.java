package com.task4;

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
            int b = i;
            while (b > 0) {
                System.out.print(" " + "*");
                b--;

            }


            i++;
            System.out.println();

        }


        int s = size-1;
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
