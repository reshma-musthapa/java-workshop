package com.java.workshop.collection;

import java.util.HashSet;
import java.util.Set;

public class StudentsSet {

    public static void main(String[] args) {
        Set<Integer> rollNos = new HashSet<>();
        rollNos.add(101);
        rollNos.add(102);
        rollNos.add(103);
        rollNos.add(104);
        rollNos.add(105);
        rollNos.add(106);
        System.out.println(rollNos);
    }

}
