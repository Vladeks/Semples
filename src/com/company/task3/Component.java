package com.company.task3;

import java.util.Objects;

public abstract class Component {
    public  enum Type {MOTHERBOARD, PROCESSOR, VIDEOCARD, POWERSYPPLY}

    private String name;
    private int price;
    private String manufacture;
    private Type type;

    public Component(String name, int price, String manufacture, Type type) {
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component that = (Component) o;
        return getPrice() == that.getPrice() &&
                Objects.equals(name, that.name) &&
                Objects.equals(getManufacture(), that.getManufacture());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getPrice(), getManufacture());
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price;
    }
}