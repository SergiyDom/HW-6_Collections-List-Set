package com.homework_6.replace_value;

import java.util.ArrayList;
import java.util.Collections;

public class ListOfFruits {
    private ArrayList<String> strList;

    public ListOfFruits() {
        this.strList = new ArrayList<>();
    }

    public void addValue(String... str) {
        Collections.addAll(strList, str);
    }

    public void replaceValue(String currentName, String newName) {
        if (!strList.contains(currentName)) {
            System.out.println("Value not present");
        } else {
            strList.set(strList.indexOf(currentName), newName);
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