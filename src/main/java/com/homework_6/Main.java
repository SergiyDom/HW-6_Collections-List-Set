package com.homework_6;

import com.homework_6.task_1.TaskOne;
import com.homework_6.task_2.TaskTwo;
import com.homework_6.task_3.TaskThree;

public class Main {
    public static void main(String[] args) {
        TaskOne arrTaskOne = new TaskOne();
        arrTaskOne.addValue(3, 9, 11, 18, 20, 22);
        arrTaskOne.removeDivisible(3);
        arrTaskOne.print();

        TaskTwo arrTaskTwo = new TaskTwo();
        arrTaskTwo.addValue("q", "w", "Orange", "e");
        arrTaskTwo.replaceValue("Orange", "Grapefruit");
        arrTaskTwo.print();

        TaskThree taskThree = new TaskThree();
        taskThree.ifContainsSimilarElement();
    }
}