package com.homework_6;

import com.homework_6.comparator_for_treeset.TreeSetContainer;
import com.homework_6.remove_numbers.ArrayListWithValues;
import com.homework_6.replace_value.ListOfFruits;
import com.homework_6.similar_element.ArrayListWithData;

public class TaskManager {
    public void manage() {
        ArrayListWithValues valuesList = new ArrayListWithValues();
        valuesList.addValue(3, 9, 11, 18, 20, 22);
        valuesList.removeDivisible(3);
        valuesList.print();

        ListOfFruits fruitsList = new ListOfFruits();
        fruitsList.addValue("Mango", "Melon", "Orange", "Grape");
        fruitsList.replaceValue("Orange", "Grapefruit");
        fruitsList.print();

        ArrayListWithData dataList = new ArrayListWithData();
        dataList.ifContainsSimilarElement();

        TreeSetContainer<Integer> integerTreeSet = new TreeSetContainer<>();
        integerTreeSet.addValueToSet(1, 5, 2, 9, 6, 3);
        System.out.println(integerTreeSet);

        TreeSetContainer<String> stringTreeSet = new TreeSetContainer<>();
        stringTreeSet.addValueToSet("aa", "zz", "cc", "ff", "mm");
        System.out.println(stringTreeSet);
    }
}