package com.example.vivien.wordcounter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class WordCounter {
    public static final WordCounter ourInstance = new WordCounter();

    public static WordCounter getInstance() {
        return ourInstance;
    }

    String inputWords;
    String[] words;
    HashMap<String,Integer> display;

    public WordCounter() {

        this.display = new HashMap<>();
    }

    public void setWord(String word) {
        this.inputWords = word;
        this.words = inputWords.split(" ");
    }

    public String getinputWords() {
        return this.inputWords;
    }

    public int getStringCount() {
        return this.words.length;
    }

    public String output() {

        return String.format("%d words entered", this.words.length);
    }

    //
//
//
//
//
////
    public void saveWordAndNumber() {

        int count = 1;
        Set<String> set = new HashSet<>();

        for (String word : words) {
            if (set.add(word) == true) {
                display.put(word, 1);
            }else {
                display.put(word,++count);
            }
        }

//        for (int i = 0; i < words.length - 1; i++) {
//            for (int j = i + 1; j < words.length; j++) {
//                if ((words[i].equals(words[j])) && (i != j)) {
//                    display.put(words[j],words[i].);
//                } else {
//                    display.put(words[i],count);
//                    display.put(words[j],count);
//
//                }
//            }
//        }
    }

    //
    public String displayAnswer() {
        ArrayList<String> output = new ArrayList<>();
        String outputString = new String();
        Set set = display.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
              output.add(me.getKey().toString());
              output.add(me.getValue().toString());
//
           }

         StringBuilder sb = new StringBuilder();

        for (String s : output)
         {
           sb.append(s);
           sb.append("\t");
          }

          return sb.toString();
    }
}



