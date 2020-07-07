package com.homework_6.task_2;

import java.util.ArrayList;
import java.util.Collections;

public class TaskTwo {
    private ArrayList<String> strList;

    public TaskTwo() {
        this.strList = new ArrayList<>();
    }

    public void addValue(String... str) {
        Collections.addAll(strList, str);
    }

    public void replaceValue(String name1, String name2) {
        if (!strList.contains(name1)) {
            System.out.println("Value not present");
        }
        for (int i = 0; i < strList.size(); i++) {
            if (strList.get(i).equals(name1)) {
                strList.set(i, name2);
            }
        }
    }

    public void print() {
        System.out.print("My result arrayList is: ");
        for (String str : strList) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
