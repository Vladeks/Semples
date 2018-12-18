package com.company.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Computer {

    private List<Component> components;
    private int totalPrice;
    private int price;

    public Computer(int totalPrice) {
        this.totalPrice = totalPrice;
        this.price = 0;
        components = new ArrayList<>();
    }

    public boolean canUseThisComponent(Component component) {
        return canUsePrice(component.getPrice()) && !hasComponent(component.getType());
    }

    public boolean canUsePrice(int componentPrice) {
        return (this.price + componentPrice) <= this.totalPrice;
    }

    public void addComponent(Component component) {
        components.add(component);
        price+= component.getPrice();
    }

    public boolean hasComponent(Component.Type type) {
        for (Component item : components) {
            if(type.equals(item.getType())) {
                return true;
            }
        }
        return false;
    }

    private void checkAllComponent() {

//        if(components.size() < Component.Type.values().length) {
//            System.out.println("You need add all computer components");
//        }

        for (Component.Type type : Component.Type.values()) {
            if(!hasComponent(type)) {
                System.out.println("You need add " + type + " to your Computer");
            }
        }
    }

    private void sort() {
        components.sort(Comparator.
                comparing(Component::getManufacture).
                thenComparing(Component::getPrice));
    }

    public void show() {
        this.sort();

        for (Component component: components) {
            System.out.println(component.toString());
        }

        this.checkAllComponent();
        System.out.println("\nComputer price = " + price);
    }
}
