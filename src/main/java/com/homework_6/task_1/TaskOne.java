package com.homework_6.task_1;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TaskOne {
    ArrayList<Integer> arrayList;

    public TaskOne() {
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
//        ArrayList<Integer> resultArr = new ArrayList<>();
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i) % 3 != 0) {
//                resultArr.add(arrayList.get(i));
//            }
//        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if ((int) iterator.next() % divisibleNumb == 0) {
            iterator.remove();
            }
        }
    }
}