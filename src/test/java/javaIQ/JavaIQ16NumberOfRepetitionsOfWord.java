package javaIQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JavaIQ16NumberOfRepetitionsOfWord {

    // 16. Count the number of repetitions of words in an ArrayList
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("apple");
        words.add("banana");
        words.add("apple");

      Map<String,Integer> wordsCounts=new HashMap<>();
        for (String word : words) {
            if (wordsCounts.containsKey(word)){
                int count=wordsCounts.get(word);
                wordsCounts.put(word,count+1);
            }
            else {
                wordsCounts.put(word,1);
            }
        }
       // System.out.println(wordsCounts);

        for(Map.Entry<String,Integer> entry:wordsCounts.entrySet()){
            String key= entry.getKey();
            int value= entry.getValue();
            System.out.println(key+" "+value);
        }



    }
    }













