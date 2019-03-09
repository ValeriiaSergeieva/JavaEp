package com.qa1.task3;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = size();
        int[] arrayOne = creteArray(size);
        int[] arrayTwo = creteArray(size);
        int[] arrayThree = sumOfArrays(arrayOne,arrayTwo,size);
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));


    }
    static int [] creteArray(int size){
        if(size<=0){
            return null;
        }
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*30) - 10;
        }
        return array;
    }
    static int size(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array size and press ENTER");
        int size = sc.nextInt();
        return size;
    }
    static int[]sumOfArrays(int[]a, int[]b,int size){
        int[] sum = new int[size];
        for(int i = 0;i < sum.length;i++){
            sum[i] = a[i] + b[i];
        }
        return sum;
    }
}
