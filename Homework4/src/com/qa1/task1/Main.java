package com.qa1.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number and press ENTER");
        int number = sc.nextInt();

        System.out.println("Number " + number + " = " +transformNumber(number));
    }

    public static String transformNumber(int number) {
        String n;
        if(number>=0){
            n = transformPositiveNumber(number);
        } else{
            n = transformNegativeNumber(number);
        }
        return n;
    }
    public static String transformPositiveNumber (int number){
        String n = " ";
        if (number == 0) {
            n = "0000";
        } else if (number == 1) {
            n = "0001";
        } else {
            int count = 0;
            while (number > 1) {
                int half = number / 2;
                int a = number % 2;
                String b = String.valueOf(a);
                n = n.concat(b);
                if (((half == 1) && (a == 0)) || ((half == 1) && (a == 1))) {
                    String one = "1";
                    n = n.concat(one);
                    number = 0;
                } else {
                    number = half;
                }
                count++;
            }
            if (count < 3) {

                switch (count) {
                    case 1:
                        String zeroTwo = "00";
                        n = n.concat(zeroTwo);
                        break;
                    case 2:
                        String zero = "0";
                        n = n.concat(zero);
                        break;
                }
            }
            String correct = new StringBuffer(n).reverse().toString();
            n = correct.trim();
        }
        return n;
    }
    public static String transformNegativeNumber(int number){
        String n = " ";
        if (number == -1) {
            n = "-0001";
        } else {
            int count = 0;
            while (number < -1) {
                int half = number / 2;
                int a = number % 2;
                String b;
                b = String.valueOf(a);
                n = n.concat(b);
                if (((half == -1) && (a == 0)) || ((half == -1) && (a == -1))) {
                    String one = "1";
                    n = n.concat(one);
                    number = 0;
                } else {
                    number = half;
                }
                count++;
            }
            if (count < 3) {

                switch (count) {
                    case 1:
                        String zeroTwo = "00";
                        n = n.concat(zeroTwo);
                        break;
                    case 2:
                        String zero = "0";
                        n = n.concat(zero);
                        break;
                }
            }
            n = n.replaceAll("-", "");
            String minus = "-";
            n = n.concat(minus);
            String correct = new StringBuffer(n).reverse().toString();
            n = correct.trim();
        }
        return n;
    }
}

