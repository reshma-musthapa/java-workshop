package com.vetias.workshop.basics;

import com.java.workshop.basics.WordCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountTest {

    @Test
    public void testWordCount() {
        WordCount wordcount = new WordCount();
        int count= wordcount.count("This program shows how to count words in a string.");
        Assertions.assertEquals(10, count);
    }

    @Test
    public void testAnotherString() {
        WordCount wordcount = new WordCount();
        int count= wordcount.count("Java is a versatile programming language.");
        Assertions.assertEquals(6
        , count);
    }
}