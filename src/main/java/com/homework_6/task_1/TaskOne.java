package com.homework_6.task_1;

import java.util.ArrayList;

public class TaskOne {
    ArrayList<Integer> arrayList;
    TaskOne(){
        //arrayList
    }
    public void addValue (int numb){
        arrayList.add(numb);
    }
    public void print(){
        for (int i : arrayList){
            System.out.println(i);
        }
    }
}
