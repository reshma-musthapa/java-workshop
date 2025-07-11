package com.java.workshop.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        
            // Adding students to the map
           students.put(101, "Caleb");
            students.put(102, "Shahul");
            students.put(103, "Nowfiya");
            students.put(104, "Reshma");
            students.put(105, "Nitha");
            students.put(106, "Nowrin");
            System.out.println(students);
            System.out.println(students.keySet());
            System.out.println(students.values());
            
        
    }

}
