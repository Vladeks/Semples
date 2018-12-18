package com.company.task3.comparators;

import com.company.task3.Component;

import java.util.Comparator;

public class PriceComparator implements Comparator<Component> {
    @Override
    public int compare(Component o1, Component o2) {
        if(o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if(o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
