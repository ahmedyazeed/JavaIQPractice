package javaIQ;

import java.util.Arrays;

public class JavaIQ12Anagram2Strings {
    // 12. Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
    // meaning they contain the same characters in a different order.
    // For example, “listen” and “silent” are anagrams

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        char[] strArr1 = str1.toCharArray();
        char[] strArr2 = str2.toCharArray();

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        // System.out.println(strArr1);
        // System.out.println(strArr2);
      /**************************************************************************************
         remember to use Arrays.equals builtin method not the String .equals builtin method
       **************************************************************************************/

        if (Arrays.equals(strArr1,strArr2)){
            System.out.println(str1+" and "+str2+" are Anagrams");
        }
        else System.out.println(str1+" and "+str2+" are Not Anagrams");

    }}






