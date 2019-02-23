package com.qa1;

public class Main {

    public static void main(String[] args) {
	    int number=567;
	    int reverse;
	    
	    String a=String.valueOf(number);
	    String b=new StringBuffer(a).reverse().toString();
	    reverse=Integer.parseInt(b);

	    System.out.println(number-reverse);
    }
}
