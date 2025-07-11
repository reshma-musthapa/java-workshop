package com.java.workshop.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {

        public static void main(String[] args) {
            List<String> names = new ArrayList<>();
            names.add("caleb");
            names.add("shahul");
            names.add("nowfiya");
            names.add("reshma");
            names.add("nitha");
            names.add("nowrin"); 
            
            names.forEach(System.out::println);
            names.sort(Comparator.reverseOrder());
            System.out.println(names);
            
      }
}

