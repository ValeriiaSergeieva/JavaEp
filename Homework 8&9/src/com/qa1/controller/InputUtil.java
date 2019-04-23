package com.qa1.controller;

import com.qa1.view.ViewBook;

import java.util.Scanner;

public class InputUtil {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(ViewBook viewBook)throws IntNumberException {
        viewBook.print(ViewBook.INPUT_INT);
        if(!sc.hasNextInt()){
            throw new IntNumberException();
        }
        return sc.nextInt();
    }
    public static int inputYear(ViewBook viewBook) throws YearNumberException{
        viewBook.print(ViewBook.INPUT_YEAR);
        while(!sc.hasNextInt()){
            throw new YearNumberException();
        }
        return sc.nextInt();
    }
    public static String inputString(ViewBook viewBook)throws StringNameException {
        viewBook.print(ViewBook.INPUT_STRING_DATA);
        while(!sc.hasNextLine()){
           throw new StringNameException();
        }
        return sc.nextLine();
    }
    public static double inputDouble(ViewBook viewBook) throws DoublePercentException{
        viewBook.print(ViewBook.INPUT_PERCENT);
        while (!sc.hasNextDouble()){
            throw new DoublePercentException();
        }
        return sc.nextDouble();
    }
}
