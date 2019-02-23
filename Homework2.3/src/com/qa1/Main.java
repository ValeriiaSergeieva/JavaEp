package com.qa1;

public class Main {

    public static void main(String[] args) {
	    double weightPound = 4.0;
	    double weightGramm=weightPound*453.6;
	    double weightKilo =weightGramm/1000;
	    double restGramm=(((weightGramm*10)%10000)-(((weightGramm*10)%10000)%10))/10;
	    double restKilo=((weightGramm*10)-((weightGramm*10)%10000))/10000;
	    int kilo=(int)restKilo;
	    int gramm=(int)restGramm;
	    System.out.println("Weight is "+kilo+"kg "+gramm+"gr"+"\n"+"or");
	    System.out.println(weightKilo+"kg"+"\n"+"or"+"\n"+weightGramm+"gr");
    }
}
