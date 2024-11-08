package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return countMap;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 6, 4, 9, 1, 4, 9);
        System.out.println(countElements(list));
    }


}

