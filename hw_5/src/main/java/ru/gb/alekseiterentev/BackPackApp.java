package ru.gb.alekseiterentev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackPackApp {

    private static int weightLimit = 8;
    private static int maxValue = 0;
    private static List<Item> selectedItems = null;

    public static void main(String[] args) {

        Item[] items = {
                new Item("notebook", 3, 40000),
                new Item("silver statuette", 1, 500),
                new Item("candelabrum", 4, 29),
                new Item("powerbank", 2, 100),
                new Item("gun", 2, 20000)
        };

        select(Arrays.asList(items));

        System.out.println(selectedItems);
    }

    public static void select(List<Item> items) {
        if (items.size() == 0) {
            return;
        }

        int currentWeight = items.stream().mapToInt(Item::getWeight).sum();
        int currentValue = items.stream().mapToInt(Item::getValue).sum();
        if (currentWeight <= weightLimit && currentValue > maxValue) {
            maxValue = currentValue;
            selectedItems = items;
        }

        for (int i = 0; i < items.size(); i++) {
            List<Item> newItems = new ArrayList<>();
            newItems.addAll(items);
            newItems.remove(i);
            select(newItems);
        }
    }
}
