package com.qa1.controller;

import com.qa1.view.ViewBook;

import java.util.Scanner;

public class InputUtil {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(ViewBook viewBook){
        viewBook.print(ViewBook.INPUT_INT);
        while(!sc.hasNextInt()){
            viewBook.print(ViewBook.INPUT_WRONG_DATA + viewBook.INPUT_INT);
            sc.next();
        }
        return sc.nextInt();
    }
    public static int inputYear(ViewBook viewBook){
        viewBook.print(ViewBook.INPUT_YEAR);
        while(!sc.hasNextInt()){
            viewBook.print(ViewBook.INPUT_WRONG_DATA + viewBook.INPUT_YEAR);
            sc.next();
        }
        return sc.nextInt();
    }
    public static String inputString(ViewBook viewBook){
        viewBook.print(ViewBook.INPUT_STRING_DATA);
        while(!sc.hasNextLine()){
            viewBook.print(viewBook.INPUT_WRONG_DATA + viewBook.INPUT_STRING_DATA);
            sc.next();
        }
        return sc.nextLine();
    }
    public static double inputDouble(ViewBook viewBook){
        viewBook.print(ViewBook.INPUT_PERCENT);
        while (!sc.hasNextDouble()){
            viewBook.print(viewBook.INPUT_WRONG_DATA + viewBook.INPUT_PERCENT);
            sc.next();
        }
        return sc.nextDouble();
    }
}
