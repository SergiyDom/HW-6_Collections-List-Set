package com.homework_6.task_3;

import java.util.ArrayList;

public class TaskThree {
    public void ifContainsSimilarElement() {
        ArrayList<String> str1 = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();
        str1.add("q");
        str1.add("w");
        str1.add("e");

        str2.add("z");
        str2.add("w5");
        str2.add("c");

        int count = 0;
        for (String x : str1) {
            if (str2.contains(x)) {
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