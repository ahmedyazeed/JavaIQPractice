package javaIQ;

import java.util.*;

public class JavaIQ13FirstNonRepeatingCharacter {
    // 13. Find the First Non-Repeating Character in a String: Given a string,
    // find and return the first non-repeating character.
    // For example, in the string "abracadabra", the first non-repeating character is 'c'

    public static Character firstNonRepeatingChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        // Find the first character with a frequency of 1
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        // If no such character exists, return null
        return null;
    }

    public static void main(String[] args) {
        //the below line is just a trial for the upper code
        Character nonRepCharacter = firstNonRepeatingChar("abracadabra");
        // System.out.println(nonRepCharacter);


        //----------------------------------------------------

        // below is the same solution but directly without creating the method to return it
        Map<Character, Integer> characterList = new HashMap<>();
        String str = "abracadabra";
       
        for (char c : str.toCharArray()) {
            characterList.put(c, characterList.getOrDefault(c, 0) + 1);

        }
        for (char s : str.toCharArray()) {
            if(characterList.get(s)==1){
                System.out.println(s);
            }
        }

    }


    }
  












