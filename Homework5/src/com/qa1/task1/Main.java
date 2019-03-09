package com.qa1.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int [] arrayOne = creteArray();
    printArray(arrayOne);

    }
    static int [] creteArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array and press ENTER");
        int size = sc.nextInt();
        int [] array = new int [size];
        if(size<=0){
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*30) - 5;
        }
        return array;
    }
    static void printArray (int[]array){
        System.out.println(Arrays.toString(array));
        for(int i = array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}
