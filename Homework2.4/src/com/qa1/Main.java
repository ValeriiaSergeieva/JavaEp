package com.qa1;

public class Main {

    public static void main(String[] args) {
	double sum=10000;
	double month=6.0;
	double percentage=12.0;
	double income=(sum*(percentage/100)*(month*30))/365;
	double roundIncome=(double)Math.round(income*100)/100;
	System.out.print("The income is "+roundIncome);
    }
}
