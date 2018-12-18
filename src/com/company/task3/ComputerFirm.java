package com.company.task3;

import com.company.task3.components.Motherboard;
import com.company.task3.components.Processor;
import com.company.task3.components.VideoCard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComputerFirm {
    List<Component> componentList;

    public ComputerFirm(List<Component> componentList) {
        this.componentList = componentList;
        this.sort();
    }

    public Computer findComponentsToMakeCompWith(int totalPrice) {
        Computer computer = new Computer(totalPrice);
        for (Component component: componentList) {
            if(computer.canUseThisComponent(component)) {
                computer.addComponent(component);
            }
        }
        return computer;
    }

    public void sort() {
        componentList.sort(Comparator.comparing(Component::getPrice));
    }

    public void show() {
        this.sort();

        for (Component component: componentList) {
            System.out.println(component.toString());
        }
    }

    public static void main(String[] args) {
        List<Component> components = new ArrayList<>();
        components.add(new Processor("Core I9", 1000, "Intel"));
        components.add(new Processor("Ryzen", 100, "AMD"));
        components.add(new VideoCard("Radeon R9",200, "AMD"));
        components.add(new VideoCard("Geforce 2080",2000, "Nvidia"));
        components.add(new Motherboard("Zifirus9",500, "Asus"));
        components.add(new Motherboard("N9",190, "Lenovo"));
        components.add(new Processor("Celeron",70, "Intel"));

        ComputerFirm firm = new ComputerFirm(components);
        firm.findComponentsToMakeCompWith(500).show();

    }
}
