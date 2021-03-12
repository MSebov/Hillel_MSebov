package com.hillel.homework13;

import java.util.List;

/**
 * Имеется коллекция из Integers, использую стримы посчитать среденее значения всех чисел
 * Throwable Exception I\O Exception -> DataFind
 */

public class Average {

    public double findAverage(List<Integer> list) throws NullPointerException {
        if (list == null) {
            throw new NullPointerException("Array not initialized");
        }
        double result = 0;

        if (!list.isEmpty()) {
            // writes value in result
            result = list.stream()
                    .mapToDouble(u -> u)//map peek
                    // summarize all elements in array and then divide by array length
                    .sum() / list.size();//min max count collect
            //System.out.println(result);
            return result;
        } else {
            //System.out.println("Array is empty");
            return result;
        }
    }

}