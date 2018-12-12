package com.company.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BabyStore {

    private List<Goods> goodsList;

    public BabyStore() {
        goodsList = new ArrayList<>();
    }

    public boolean addGoods(Goods goods) {
        return goodsList.add(goods);
    }

    private void sort() {
        Collections.sort(goodsList);
    }

    public void showGoods() {
        sort();
        for (Goods goods :goodsList) {
            System.out.println(goods);
        }
    }

    public void findGoodsForCatrgory(int fromAge) {
        this.sort();
        for (Goods goods:goodsList) {
            if (goods.getAgeCategory() >= fromAge) {
                System.out.println(goods);
            }
        }
    }

    public static void main(String[] args) {
        BabyStore store = new BabyStore();
        store.addGoods(new Toy("Toy", Integer.MAX_VALUE, 36));
        store.addGoods(new Dish("Porridge", 12, 24));
        store.addGoods(new Dish("Candy", 3, 24));
        store.addGoods(new Toy("Bear", 120, 1));
        store.addGoods(new Dish("Porridge", 24, 12));

        store.findGoodsForCatrgory(1);
    }
}
