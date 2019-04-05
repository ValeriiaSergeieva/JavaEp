package com.qa1;

import java.util.Comparator;

public class CompareByColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape one = (Shape)o1;
        Shape two = (Shape)o2;
        return one.getColor().compareTo(two.getColor());
    }
}
