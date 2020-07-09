package com.homework_6.remove_numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListWithValues {
    ArrayList<Integer> arrayList;

    public ArrayListWithValues() {
        this.arrayList = new ArrayList<>();
    }

    public void addValue(Integer... numb) {
        Collections.addAll(arrayList, numb);
    }

    public void print() {
        System.out.print("My result arrayList is: ");
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void removeDivisible(int divisibleNumb) {
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if ((int) iterator.next() % divisibleNumb == 0) {
                iterator.remove();
            }
        }
    }
}