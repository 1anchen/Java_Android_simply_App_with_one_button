package com.example.vivien.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before(){
        this.wordCounter = new WordCounter();
    }

    @Test
    public void canGetString(){
        wordCounter.setWord("hello word");
        assertEquals("hello word", wordCounter.getinputWords());
    }

    @Test
    public void canCountString(){
        wordCounter.setWord("hello word");
        assertEquals(2, wordCounter.getStringCount());
    }
//
    @Test
    public void canOutputString(){
        wordCounter.setWord("hello word from android");
        assertEquals("4 words entered", wordCounter.output());
    }
//
    @Test
    public void canOutputWords(){
        wordCounter.setWord("hello hello world you");
        wordCounter.saveWordAndNumber();
        assertEquals(2, wordCounter.displayAnswer());
    }
//
//
//    @Test
//    public void canOutputMoreString(){
//        wordCounter.setWord("hello world");
//        wordCounter.splitWords();
//        wordCounter.saveWordAndNumber();
//        assertEquals(" 5 words entered", wordCounter.displayAnswer());
//    }



}
