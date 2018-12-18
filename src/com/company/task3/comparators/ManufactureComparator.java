package com.company.task3.comparators;

import com.company.task3.Component;

import java.util.Comparator;

public class ManufactureComparator implements Comparator<Component> {
    @Override
    public int compare(Component o1, Component o2) {
        return o1.getManufacture().compareToIgnoreCase(o2.getManufacture());
    }

}
