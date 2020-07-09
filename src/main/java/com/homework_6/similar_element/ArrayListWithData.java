package com.homework_6.similar_element;

import java.util.ArrayList;

public class ArrayListWithData {
    ArrayList<String> firstList;
    ArrayList<String> secondList;

    public ArrayListWithData() {
        this.firstList = new ArrayList<>();
        this.secondList = new ArrayList<>();
    }

    public void assignValues() {
        firstList.add("q");
        firstList.add("w");
        firstList.add("e");

        secondList.add("z");
        secondList.add("w5");
        secondList.add("c");
    }

    public void ifContainsSimilarElement() {
        int count = 0;
        for (String x : firstList) {
            if (secondList.contains(x)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("It is similar element");
        } else {
            System.out.println("similar element is absent");
        }
    }
}