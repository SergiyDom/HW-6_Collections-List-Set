package com.homework_6.comparator_for_treeset;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetContainer<T> {
    private Set<T> set;

    public TreeSetContainer() {
        this.set = new TreeSet<>(new SortSet<>());
    }

    public void addValueToSet(T... value) {
        Collections.addAll(set, value);
    }

    @Override
    public String toString() {
        return "My DESC Sorted Set: " + set;
    }

    public static class SortSet<T> implements Comparator<T> {
        public int compare(T o1, T o2) {
            if (o1 instanceof Integer) {
                return (int) o2 - (int) o1;
            }
            if (o1 instanceof String) {
                return ((String) o2).compareTo((String) o1);
            } else {
                System.out.println("create a new comparator");
                return 0;
            }
        }
    }
}