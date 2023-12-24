package javaIQ;

import java.util.ArrayList;
import java.util.HashSet;

// 5. How can you remove all duplicates from ArrayList?
public class JavaIQ5RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        HashSet<String> distinctList = new HashSet<>(aList);
        System.out.println(distinctList);
        System.out.println("----------------another way below---------------");
        
        //----------------another way below------------------------------
        
        HashSet<String> newList = new HashSet<>();
        for (String name : aList) {
            newList.add(name);
        }
        System.out.println(newList);

    }

    }



