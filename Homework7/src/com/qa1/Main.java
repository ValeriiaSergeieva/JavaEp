package com.qa1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Shape [] a = new Shape[9];
    a[0] = new Rectangle("Red",5,3);
    a[1] = new Rectangle("Blue",2,2);
    a[2] = new Rectangle("White",2,6);
    a[3] = new Rectangle("Green",1,2);
    a[4] = new Circle("Black",5);
    a[5] = new Circle("Purple",2);
    a[6] = new Circle("Orange",3);
    a[7] = new Triangle("Pink", 4,5,6);
    a[8] = new Triangle("Coral", 1,3,3);

    printShapes(a);
    System.out.println();
    Arrays.sort(a,new CompareShapeByArea());
    printShapes(a);
    System.out.println();
    Arrays.sort(a, new CompareByColor());
    printShapes(a);

    double totalArea = calculateTotalArea(a);
    double [] areaOfType = calculateTotalAreaOfType(a);


    }
    public static void printShapes(Shape[]a){
        for(Shape b:a){
            b.draw();
        }
    }
    public static double calculateTotalArea(Shape[]a){
        double sum = 0;
        for (Shape b:a){
            double area = b.calcArea();
            sum += area;
        }
        return sum;
    }
    public static double []calculateTotalAreaOfType(Shape[]a){
        double sumTriangle = 0;
        double sumCircle = 0;
        double sumRectangle = 0;
        double[]sum = new double[3];
        for(Shape b:a){
            if(b instanceof Triangle){
                double area = b.calcArea();
                sumTriangle+=area;
            }else if(b instanceof Circle){
                double area = b.calcArea();
                sumCircle+=area;
            }else if(b instanceof Rectangle){
                double area = b.calcArea();
                sumRectangle+=area;
            }
        }
        sum[0]=sumTriangle;
        sum[1]=sumCircle;
        sum[2]=sumRectangle;

        return sum;
    }

}
