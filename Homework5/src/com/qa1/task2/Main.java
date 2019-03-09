package com.qa1.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arrayOne = creteArray();
        System.out.println(Arrays.toString(arrayOne));
        System.out.println("Sum is " + sum(arrayOne) + "\n" + "Quantity is " + quantity(arrayOne));

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
    static int sum(int[]array){
        int sum = 0;
        for(int i =0;i<array.length;i++){
            if(array[i]%2==1){
                sum += array[i];
            }
        }
        return sum;
    }
    static int quantity(int[]array){
        int qauntity = 0;
        for(int i =0;i<array.length;i++){
            if(array[i]%2==1){
                qauntity++;
            }
        }
        return qauntity;
    }
}
