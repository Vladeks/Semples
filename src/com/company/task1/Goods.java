package com.company.task1;

import java.util.Objects;

public class Goods implements Comparable<Goods>{
    private String name;
    private int expirationDate;
    private int ageCategory;

    public Goods(String name, int expirationDate, int ageCategory) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.ageCategory = ageCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(int ageCategory) {
        this.ageCategory = ageCategory;
    }

    @Override
    public int compareTo(Goods o) {
        if (o instanceof Goods) {
            if(this.expirationDate < o.expirationDate) {
                return -1;
            } else if(this.expirationDate > o.expirationDate) {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods babyGoods = (Goods) o;
        return getExpirationDate() == babyGoods.getExpirationDate() &&
                getAgeCategory() == babyGoods.getAgeCategory() &&
                Objects.equals(getName(), babyGoods.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getExpirationDate(), getAgeCategory());
    }

    private String monthFormat(int month) {
        if(month < 12) {
            return month + " month";
        } else if (month == Integer.MAX_VALUE) {
            return "forever";
        } else {
            return (int)month/12 + " year "  + month%12 + "month";
        }
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", expiration Date= " + monthFormat(expirationDate) +
                ", for children from: " + monthFormat(ageCategory) +
                '}';
    }
}
