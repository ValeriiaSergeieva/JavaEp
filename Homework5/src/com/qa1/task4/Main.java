package com.qa1.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int[] array = creteArray();
       int[] arrayTwo = positiveElement(array);
       int[] arrayThree = negativeElement(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));


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
            array[i] = (int) (Math.random()*30) - 6;
        }
        return array;
    }
    static int []positiveElement(int[]array){
        int count = 0;
        for (int i=0; i<array.length; i++){
            if (array[i] > 0)
                count++;
        }
        int [] positive = new int[count];
        for (int i=0, j=0; i<array.length; i++){
            if (array[i] > 0) {
                positive[j] = array[i];
                j++;
            }
        }
        return positive;
    }
    static int []negativeElement(int[]array){
        int count = 0;
        for(int i : array){
            if(i < 0){
                count++;
            }
        }
        int[]negative = new int[count];
        for(int i = 0, j = 0; i < array.length;i++){
            if(array[i] <0){
                negative[j] = array [i];
                j++;
            }
        }
        return negative;
    }
}
