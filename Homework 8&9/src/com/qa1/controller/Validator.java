package com.qa1.controller;

import com.qa1.view.ViewBook;

public class Validator {
   public static ViewBook viewBook = new ViewBook();

    public static int checkInt(){
        int a = 0;
        try{
            a = Integer.valueOf(InputUtil.inputInt(viewBook));
        }catch (IntNumberException e){
            System.out.println(e.getMessage());
        }
        return a;
    }

    public static int checkYear(){
        int a = 0;
        try{
            a = Integer.valueOf(InputUtil.inputYear(viewBook));
        }catch (YearNumberException e){
            System.out.println(e.getMessage());
        }
        return a;
    }

    public static String checkName(){
        String a = "";
        try{
            a = String.valueOf(InputUtil.inputString(viewBook));
        }catch (StringNameException e){
            System.out.println(e.getMessage());
        }
        return a;
    }

    public static double checkPercenteg(){
        double a = 0.0;
        try{
            a = Double.valueOf(InputUtil.inputDouble(viewBook));
        }catch (DoublePercentException e){
            System.out.println(e.getMessage());
        }
        return a;
    }
}
