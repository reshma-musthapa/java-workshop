package com.java.workshop.basics;

public class WordCount {
    
    public int  count(String inputsString) {
        int count = 0;
        String[] words = inputsString.split(" ");
        count = words.length; 
        return count;
    }
}
