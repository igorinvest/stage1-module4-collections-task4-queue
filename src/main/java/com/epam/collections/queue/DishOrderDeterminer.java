package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            temp.add(i);
        }
        int counter = 1;
        while (result.size() < numberOfDishes) {
            for (int i = 0; i < temp.size(); i++) {
                if(counter%everyDishNumberToEat == 0) {
                    result.add(temp.get(i));
                    temp.remove(i);
                    i--;
                }
                counter++;
            }
        }
        return result;
    }
}
